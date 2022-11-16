package hinos.vicdron.com.hinosdetimesdefutebol;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.airbnb.lottie.LottieAnimationView;


public class SplashScreenActivity extends AppCompatActivity {

    ImageView logo;
    LottieAnimationView lottieAnimationView;
    TextView textv;
    float v = 0;
    private static int SPLASH_TIME_OUT=2500;

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_splash_screen);
    //    getSupportActionBar().hide();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                SplashScreenActivity.this.TelaInicial();
            }
        },SPLASH_TIME_OUT);

        logo = findViewById(R.id.logo);
        lottieAnimationView = findViewById(R.id.lottie);
        textv=findViewById(R.id.tv);

        logo.animate().translationX(-1400).setDuration(1000).setStartDelay(4000);
        lottieAnimationView.animate().translationX(-1400).setDuration(1000).setStartDelay(4000);
        textv.animate().translationX(-1400).setDuration(1000).setStartDelay(4000);

        int unicode=0x26bd;
        String emoji = getEmoji(unicode);

        String text="Criado por  "+emoji+"  by  VICDRON";
        textv.setText(text);


    }

    public String getEmoji(int uni) {
        return new String(Character.toChars(uni));
    }

    private void TelaInicial() {
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }

}