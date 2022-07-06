package hinos.vicdron.com.hinosdetimesdefutebol;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_splash_screen);
        new Handler().postDelayed(new Runnable() {

            public void run() {
                SplashScreenActivity.this.TelaInicial();
            }
        }, 1500);
    }

    private void TelaInicial() {
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }
}
