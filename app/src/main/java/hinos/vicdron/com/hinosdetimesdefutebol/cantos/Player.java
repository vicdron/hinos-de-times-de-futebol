package hinos.vicdron.com.hinosdetimesdefutebol.cantos;


import android.app.AlertDialog;
import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.media.MediaScannerConnection;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.provider.MediaStore;
import android.provider.Settings;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.FileProvider;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import hinos.vicdron.com.hinosdetimesdefutebol.R;

public class Player extends AppCompatActivity {
    public String interstitial = "ca-app-pub-4782720719921842/4371354386";
    public ImageView imageView;
    private ImageView btshare;
    private ImageView diminuirFonte;
    private MediaPlayer mp;
    private ImageView grupoBotao, notificacao;
    private Handler handler;
    private Runnable runnable;
    private SeekBar seekBar;
    private float tamanhoTexto;
    private TextView textoCantico;
    private Toolbar toolbar;
    private TextView toolbarText;
    private InterstitialAd mInterstitialAd;

    private static final int REQUEST_CODE_WRITE_SETTINGS = 1001;

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_player);


        //ad google--------------------------------------------------------------------------------
        AdRequest adRequest = new AdRequest.Builder().build();
        ((AdView) findViewById(R.id.adView)).loadAd(new AdRequest.Builder().build());

        //initializeViews--------------------------------------------------------------------------
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        btshare = findViewById(R.id.btshare);
        notificacao = findViewById(R.id.notificacao);
        grupoBotao = findViewById(R.id.botao_play);
        seekBar = findViewById(R.id.seekBar);
        textoCantico = findViewById(R.id.letra);
        ImageView aumentarFonte = findViewById(R.id.aumentarFonte);
        diminuirFonte = findViewById(R.id.diminuirFonte);
        tamanhoTexto = 15.0f;


        //toobar-----------------------------------------------------------------------------------

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbarText = (TextView) findViewById(R.id.toolbar_title);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("");
        toolbarText.setText(getIntent().getStringExtra("titulo"));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        int i = getIntent().getExtras().getInt("cover");
        ImageView imageView2 = (ImageView) findViewById(R.id.cover);
        this.imageView = imageView2;
        imageView2.setImageResource(i);


        //botões de aumentar e diminuir fonte da letra----------------------------------------------
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

        // Dados da intent---------- --------------------------------------------------------------
        textoCantico.setText(getIntent().getStringExtra("letra"));
        String audioFileName = getIntent().getStringExtra("ringtone");
        int resourceId = getIntent().getIntExtra("completo", 0);
        mp = MediaPlayer.create(this, resourceId);

        // this.textoCantico.setText(getIntent().getExtras().getString("letra"));
        // String recebeToque = getIntent().getExtras().getString("ringtone");
        // final int i = getIntent().getExtras().getInt("completo");
        // this.mp = MediaPlayer.create(this, i);

        // Botão share ------------------------------------------------------------------------------
        btshare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Receba o nome do arquivo
                String audioFileName = getIntent().getExtras().getString("ringtone");

                // Verifique se o nome do arquivo é válido
                if (audioFileName == null || audioFileName.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Nome do arquivo inválido", Toast.LENGTH_SHORT).show();
                    return;
                }

                // Obtém o ID do recurso
                int resourceId = getResources().getIdentifier(audioFileName, "raw", getPackageName());

                // Verifique se o ID do recurso é válido
                if (resourceId == 0) {
                    Toast.makeText(getApplicationContext(), "ID do recurso inválido", Toast.LENGTH_SHORT).show();
                    return;
                }

                // Cria um objeto Intent para compartilhar o arquivo de áudio.
                Intent shareIntent = new Intent(Intent.ACTION_SEND);

                // Obtém o URI correto para o recurso de áudio.
                Uri audioUri = Uri.parse("android.resource://" + getPackageName() + "/raw/" + audioFileName);

                // Cria um arquivo temporário no cache
                File tempFile = new File(getCacheDir(), "temp_audio.mp3");

                try {
                    // Copia os dados do recurso para o arquivo temporário
                    InputStream in = getResources().openRawResource(resourceId);
                    OutputStream out = new FileOutputStream(tempFile);
                    byte[] buffer = new byte[1024];
                    int length;
                    while ((length = in.read(buffer)) > 0) {
                        out.write(buffer, 0, length);
                    }
                    in.close();
                    out.close();

                    // Obtém a URI de conteúdo usando o FileProvider
                    Uri contentUri = FileProvider.getUriForFile(
                            getApplicationContext(),
                            getPackageName() + ".fileprovider",
                            tempFile);

                    // Adiciona o arquivo de áudio ao Intent.
                    shareIntent.putExtra(Intent.EXTRA_STREAM, contentUri);

                    // Define o tipo de mídia para o compartilhamento.
                    shareIntent.setType("audio/*");

                    // Concede permissão de leitura ao destinatário
                    shareIntent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);

                    // Inicia o Intent.
                    startActivity(Intent.createChooser(shareIntent, "Compartilhar áudio"));
                } catch (IOException e) {
                    e.printStackTrace();
                    Toast.makeText(getApplicationContext(), "Erro ao criar arquivo temporário", Toast.LENGTH_SHORT).show();
                }
            }
        });

        // botao notificacao -------- --------------------------------------------------------------
        notificacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                showRingtoneAlarmOptions();

            }
        });

        this.handler = new Handler();
        grupoBotao.setOnClickListener(new View.OnClickListener() {
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
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                if (b) {
                    mp.seekTo(i);
                    seekBar.setProgress(i);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });


        // interstitial google-------------------------------------------------------------------------
        InterstitialAd.load(this,interstitial, adRequest,
                new InterstitialAdLoadCallback() {
                    @Override
                    public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                        mInterstitialAd = interstitialAd;
                        // Log.i(TAG, "onAdLoaded");
                    }
                    @Override
                    public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                        // Handle the error
                        //  Log.i(TAG, loadAdError.getMessage());
                        mInterstitialAd = null;
                    }
                });

    } //onCreate------------------------------------------------------------------------------------

    public void displayInterstitial() {
        if (mInterstitialAd != null) {
            mInterstitialAd.show(Player.this);
        } else {
            Log.d("TAG", "The interstitial ad wasn't ready yet.");
        }
    }
    @Override
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            displayInterstitial();
        }
        return super.onKeyDown(i, keyEvent);
    }

    //métodos do botao do play/stop-----------------------------------------------------------------
    private void playGrupo() {
        this.seekBar.setProgress(this.mp.getCurrentPosition());
        if (this.mp.isPlaying()) {
            runnable= new Runnable() {

                public void run() {
                    Player.this.playGrupo();
                }
            };
            this.runnable = runnable;
            this.handler.postDelayed(runnable, 100);
        }
    }
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            this.mp.stop();
            finish();
        }
        return super.onOptionsItemSelected(menuItem);
    }
    @Override
    public void onDestroy() {
        this.mp.stop();
        this.mp.release();
        this.mp = null;
        super.onDestroy();
    }

    // Métodos para configurar o áudio como Ringtone e Alarme permanecem os mesmos------------------

    private void showRingtoneAlarmOptions() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Definir como ringtone do celular?")
                .setItems(new CharSequence[]{"Sim", "Fechar"}, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        switch (which) {
                            case 0:

                                checkAndRequestWriteSettingsPermission();

                                break;
                            case 1:
                                //String audioFileName = getIntent().getExtras().getString("ringtone");
                                //int audioResourcePath = getIntent().getExtras().getInt("completo");
                                // setAudioAsAlarm(audioFileName, audioResourcePath);
                                break;
                            case 2:
                                closeContextMenu();
                                break;
                        }
                    }
                });
        builder.create().show();
    }

    private void setAudioAsRingtone(String audioFileName, int audioResourcePath) {
        // Obtém o ID do recurso
        int resourceId = audioResourcePath;

        // Verifica se o ID do recurso é válido
        if (resourceId == 0) {
            Toast.makeText(getApplicationContext(), "ID do recurso inválido", Toast.LENGTH_SHORT).show();
            return;
        }

        // Obtém o contexto de aplicativo para acessar o sistema de arquivos
        Context appContext = getApplicationContext();

        // Define o completo de destino do arquivo de ringtone
       // File ringtoneFile = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_RINGTONES), "temp_ringtone.mp3");
        File ringtoneFile = new File(getExternalFilesDir(Environment.DIRECTORY_RINGTONES), "temp_ringtone.mp3");
        try {

            // Copia os dados do recurso para o arquivo de toque
            InputStream in = appContext.getResources().openRawResource(resourceId);
            OutputStream out = new FileOutputStream(ringtoneFile);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = in.read(buffer)) > 0) {
                out.write(buffer, 0, length);
            }
            in.close();
            out.close();

            // Atualiza o banco de dados de mídia para que o novo toque seja reconhecido
            MediaScannerConnection.scanFile(
                    appContext,
                    new String[]{ringtoneFile.getAbsolutePath()},
                    new String[]{"audio/*"},
                    null);

            // Configura o arquivo de toque
            ContentValues values = new ContentValues();
            values.put(MediaStore.MediaColumns.DATA, ringtoneFile.getAbsolutePath());
            //  values.put(MediaStore.MediaColumns.TITLE, "TempRingtone");
            values.put(MediaStore.MediaColumns.TITLE, audioFileName);
            values.put(MediaStore.MediaColumns.MIME_TYPE, "audio/mpeg");
            values.put(MediaStore.Audio.Media.IS_RINGTONE, true);
            values.put(MediaStore.Audio.Media.IS_NOTIFICATION, false);
            values.put(MediaStore.Audio.Media.IS_ALARM, false);
            values.put(MediaStore.Audio.Media.IS_MUSIC, false);

            Uri uri = MediaStore.Audio.Media.getContentUriForPath(ringtoneFile.getAbsolutePath());
            Uri newUri = getContentResolver().insert(uri, values);

            RingtoneManager.setActualDefaultRingtoneUri(
                    appContext,
                    RingtoneManager.TYPE_RINGTONE,
                    newUri
            );

            Toast.makeText(appContext, "Ringtone definido com sucesso", Toast.LENGTH_SHORT).show();
        } catch (IOException e) {
            e.printStackTrace();
            Toast.makeText(appContext, "Erro ao definir o Ringtone", Toast.LENGTH_SHORT).show();
        }
    }


    //metodos de permissao-------------------------------------------------------------------------
    private void checkAndRequestWriteSettingsPermission() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M && !Settings.System.canWrite(getApplicationContext())) {
            Intent intent = new Intent(Settings.ACTION_MANAGE_WRITE_SETTINGS);
            intent.setData(Uri.parse("package:" + getPackageName()));
            startActivityForResult(intent, REQUEST_CODE_WRITE_SETTINGS);
        } else {
            String audioFileName = getIntent().getExtras().getString("ringtone");
            int audioResourcePath = getIntent().getExtras().getInt("completo");
            setAudioAsRingtone(audioFileName, audioResourcePath);
        }
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_CODE_WRITE_SETTINGS) {
            // Verifique novamente se a permissão foi concedida após a solicitação
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M && Settings.System.canWrite(getApplicationContext())) {
                String audioFileName = getIntent().getExtras().getString("ringtone");
                int audioResourcePath = getIntent().getExtras().getInt("completo");
                setAudioAsRingtone(audioFileName, audioResourcePath);
            } else {
                // A permissão ainda não foi concedida, você pode lidar com isso aqui
                Toast.makeText(getApplicationContext(), "Permissão não concedida para alterar configurações", Toast.LENGTH_SHORT).show();
            }
        }
    }

}