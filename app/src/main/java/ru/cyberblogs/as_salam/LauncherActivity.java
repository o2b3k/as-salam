package ru.cyberblogs.as_salam;

/**
 * Created by O2B3K on 20.02.2017.
 */

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

/**
 * Created by O2B3K on 08.02.2017.
 */

public class LauncherActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.kirish);

        ImageView logoImageView = (ImageView) findViewById(R.id.kirish);

        Bitmap logoImage = BitmapFactory.decodeResource(
                getResources(),
                R.drawable.kirish
        );

        logoImageView.setImageBitmap(logoImage);
    }

    @Override
    protected void onStart() {
        super.onStart();

        new Thread(new Runnable() {

            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                finish();
            }

        }).start();
    }
}
