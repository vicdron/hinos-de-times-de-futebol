package hinos.vicdron.com.hinosdetimesdefutebol.cantos;

import android.Manifest;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.media.MediaPlayer;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.provider.Settings;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

import hinos.vicdron.com.hinosdetimesdefutebol.R;
import static android.Manifest.permission.WRITE_EXTERNAL_STORAGE;



public class Teste extends AppCompatActivity {

    private Toolbar toolbar;
    private TextView toolbarText, textoCantico;
    ImageView imageView;
    private MediaPlayer mp;
    private Handler handler;
    private Runnable runnable;
    private SeekBar seekBar;
    private ImageView aumentarFonte, diminuirFonte, notificacao;
    private float tamanhoTexto;
    private ImageView grupoBotao;
    private ImageButton btshare;
    @RequiresApi(api = Build.VERSION_CODES.M)
    private InterstitialAd mInterstitialAd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_teste);



        AdRequest adRequest = new AdRequest.Builder().build();
        AdView mAdView = (AdView) findViewById(R.id.adView);
        mAdView.loadAd(adRequest);
        btshare = (ImageButton) findViewById(R.id.btshare);
        notificacao = (ImageView) findViewById(R.id.notificacao);
        grupoBotao = (ImageView) findViewById(R.id.grupo);
        seekBar = (SeekBar) findViewById(R.id.seekBar);
        textoCantico = (TextView) findViewById(R.id.letra);
        aumentarFonte = (ImageView) findViewById(R.id.aumentarFonte);
        diminuirFonte = (ImageView) findViewById(R.id.diminuirFonte);
        tamanhoTexto = 15;

        //------------------- TOOLBAR-------------------------------------------------------------------
        toolbar = (Toolbar) findViewById(R.id.toolbar_hino);
        toolbarText = (TextView) findViewById(R.id.titulo);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("");
        String recebeTitulo = getIntent().getExtras().getString("titulo");
        toolbarText.setText(recebeTitulo);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        //--------------------- (RECEBENDO POR INTENT)--------------------------------------------------
        String recebeLetra = getIntent().getExtras().getString("letra");
        textoCantico.setText(recebeLetra);
        String recebeToque = getIntent().getExtras().getString("nome_ringtone");
        int recebeCompleto = getIntent().getExtras().getInt("completo");
        mp = MediaPlayer.create(this, recebeCompleto);
        int i = getIntent().getExtras().getInt("cover");
        ImageView imageView2 = (ImageView) findViewById(R.id.cover);
        this.imageView = imageView2;
        imageView2.setImageResource(i);

        //-----------------Botões para alterar tamanho da fonte.----------------------------------------
        aumentarFonte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textoCantico.setTextSize(tamanhoTexto++);
            }
        });
        diminuirFonte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textoCantico.setTextSize(tamanhoTexto--);
            }
        });

        //-----------------------fUNCAO PARA COMPARTILHAR-----------------------------------------------
        btshare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Se não possui permissão
                if (!hasWritePermissions()){

                    AlertDialog.Builder builderSingle1 = new AlertDialog.Builder(Teste.this);
                    builderSingle1.setIcon(R.mipmap.ic_launcher);
                    builderSingle1.setTitle("Permissão");
                    builderSingle1.setMessage("Permitir que o aplicativo acesse as configurações do celular para usar as funções do app");
                    builderSingle1.setPositiveButton("Permitir", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            requestAppPermissions();
                            requestsettingpermission();
                        }
                    });
                    builderSingle1.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            return;
                        }
                    });
                    builderSingle1.show();
                } else {
                    try {
                        String mediaPath = copyFiletoExternalStorage(recebeCompleto, "hino.mp3");
                        Intent shareMedia = new Intent(Intent.ACTION_SEND);
                        shareMedia.putExtra(Intent.EXTRA_STREAM, Uri.parse(mediaPath));
                        shareMedia.setType("audio/*");
                        startActivity(Intent.createChooser(shareMedia, "Compartilhado!"));
                        shareMedia.addFlags(Intent.FLAG_ACTIVITY_CLEAR_WHEN_TASK_RESET);
                        shareMedia.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
                    } catch (Exception e) {
                        Toast.makeText(getApplicationContext(), "Aplicativo de mensagem não se encontra instalado", Toast.LENGTH_LONG).show();
                    }
                }
            }
            private String copyFiletoExternalStorage(int resourceId, String resourceName) {
                String pathSDCard = Environment.getExternalStorageDirectory() + "/Android/data/" + resourceName;
                try {
                    InputStream in = getResources().openRawResource(resourceId);
                    FileOutputStream out = null;
                    out = new FileOutputStream(pathSDCard);
                    byte[] buff = new byte[1024];
                    int read = 0;
                    try {
                        while ((read = in.read(buff)) > 0) {
                            out.write(buff, 0, read);
                        }
                    } finally {
                        in.close();
                        out.close();
                    }
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return pathSDCard;
            }
        });
        notificacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(!hassettingPermissions() && !hasReadPermissions() && !hasWritePermissions()) {


                    AlertDialog.Builder builderSingle1 = new AlertDialog.Builder(Teste.this);
                    builderSingle1.setIcon(R.mipmap.ic_launcher);
                    builderSingle1.setTitle("Permissão");
                    builderSingle1.setMessage("Permitir que o aplicativo defina o toque do celular");
                    builderSingle1.setPositiveButton("Permitir", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            requestAppPermissions();
                            requestsettingpermission();
                        }
                    });
                    builderSingle1.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            return;
                        }
                    });
                    builderSingle1.show();

                } else {
                    AlertDialog.Builder builderSingle = new AlertDialog.Builder(Teste.this);
                    builderSingle.setIcon(R.mipmap.ic_launcher);
                    builderSingle.setTitle("Definir como...");

                    final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(Teste.this, android.R.layout.select_dialog_item);
                    arrayAdapter.add("Ringtone");
                    arrayAdapter.add("Notification");
                    arrayAdapter.add("Alarm");
                    builderSingle.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    });
                    builderSingle.setAdapter(arrayAdapter, new DialogInterface.OnClickListener() {


                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            String strName = arrayAdapter.getItem(which);

                            if (Objects.equals(strName, "Ringtone")) {

                                String hino =  "/raw/" + recebeToque;
                                Uri uri = Uri.parse("android.resource://" + getPackageName() + hino);
                                RingtoneManager.setActualDefaultRingtoneUri(Teste.this, RingtoneManager.TYPE_RINGTONE, uri);
                                Toast.makeText(Teste.this, "Hino Definido Como Toque Do Celular   ", Toast.LENGTH_LONG).show();

                            } else if (Objects.equals(strName, "Notification")) {
                                String hino =  "/raw/" + recebeToque;
                                Uri uri = Uri.parse("android.resource://" + getPackageName() + hino);
                                RingtoneManager.setActualDefaultRingtoneUri(Teste.this, RingtoneManager.TYPE_NOTIFICATION, uri);
                                Toast.makeText(Teste.this, "Hino Definido Como Toque De Notificação   ", Toast.LENGTH_LONG).show();

                            } else if (Objects.equals(strName, "Alarm")) {
                                String hino =  "/raw/" + recebeToque;
                                Uri uri = Uri.parse("android.resource://" + getPackageName() + hino);
                                RingtoneManager.setActualDefaultRingtoneUri(Teste.this, RingtoneManager.TYPE_ALARM, uri);
                                Toast.makeText(Teste.this, "Hino Definido Como Alarme Do Celular   ", Toast.LENGTH_LONG).show();
                            }

                        }
                    });
                    builderSingle.show();
                    //

                }
            }
        });

        //------------------------------BOTOES PARA ESCUTAR AUDIOS-------------------------------------
        handler = new Handler();

        grupoBotao.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View view) {
                seekBar.setVisibility(View.VISIBLE);
                grupoBotao.setAlpha(50);

                if (mp.isPlaying()) {
                    mp.pause();
                    grupoBotao.setAlpha(1000);
                } else {
                    mp.start();
                    seekBar.setMax(mp.getDuration());
                    mp.seekTo(seekBar.getProgress());
                    mp.setLooping(true);
                    playGrupo();
                }
            }
        });

        //-------------------------------CONFIGURANDO SEEKBAR-------------------------------------------
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar sb, int progress, boolean input) {
                if (input) {
                    mp.seekTo(progress);
                    sb.setProgress(progress);
                }
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });


        InterstitialAd.load(this,"ca-app-pub-4782720719921842/4371354386", adRequest,
                new InterstitialAdLoadCallback() {
                    @RequiresApi(api = Build.VERSION_CODES.M)
                    @Override
                    public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                        mInterstitialAd = interstitialAd;
                        // Log.i(TAG, "onAdLoaded");
                    }

                    @RequiresApi(api = Build.VERSION_CODES.M)
                    @Override
                    public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                        // Handle the error
                        //  Log.i(TAG, loadAdError.getMessage());
                        mInterstitialAd = null;
                    }
                });
    }


    @RequiresApi(api = Build.VERSION_CODES.M)

    //-----------------------------FUNCOES PARA TOCAR AUDIOS---------------------------------------
    private void playGrupo(){
        seekBar.setProgress(mp.getCurrentPosition());
        if(mp.isPlaying()){
            runnable = new Runnable() {
                @Override
                public void run() {
                    playGrupo();
                }
            };
            handler.postDelayed(runnable, 100);
        }
    }
    public boolean onOptionsItemSelected(MenuItem item){
        if (item.getItemId() == android.R.id.home){
            mp.stop();
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    protected void onDestroy() {
        mp.stop();
        mp.release();
        mp = null;
        super.onDestroy();
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    public void displayInterstitial() {
        if (mInterstitialAd != null) {
            mInterstitialAd.show(Teste.this);
        } else {
            Log.d("TAG", "The interstitial ad wasn't ready yet.");
        }
    }
    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override // androidx.appcompat.app.AppCompatActivity
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            displayInterstitial();
        }
        return super.onKeyDown(i, keyEvent);
    }

    // VERIFICAção de Permissoes -------------------------------------------------------------------
    private void requestAppPermissions() {
        if (android.os.Build.VERSION.SDK_INT < Build.VERSION_CODES.LOLLIPOP) {
            return;
        }

        if (hasReadPermissions() && hasWritePermissions()) {
            return;
        }

        ActivityCompat.requestPermissions(this,
                new String[] {
                        Manifest.permission.READ_EXTERNAL_STORAGE,
                        Manifest.permission.WRITE_EXTERNAL_STORAGE
                } , MODE_ENABLE_WRITE_AHEAD_LOGGING); // your request code
    }
    private boolean hasReadPermissions() {
        return (ContextCompat.checkSelfPermission(getBaseContext(), Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED);
    }
    private boolean hasWritePermissions() {
        return (ContextCompat.checkSelfPermission(getBaseContext(), Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED);
    }
    private void requestsettingpermission() {
        if (android.os.Build.VERSION.SDK_INT < Build.VERSION_CODES.LOLLIPOP) {
            return;
        }
        if (hassettingPermissions()) {
            return;
        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            if (!Settings.System.canWrite(getApplicationContext())) {
                Intent intent = new Intent(Settings.ACTION_MANAGE_WRITE_SETTINGS, Uri.parse("package:" + getPackageName()));
                startActivityForResult(intent, 200);
            }
        }
    }

    private boolean hassettingPermissions() {
        return (ContextCompat.checkSelfPermission(getBaseContext(), Manifest.permission.WRITE_APN_SETTINGS) == PackageManager.PERMISSION_GRANTED);
    }

}