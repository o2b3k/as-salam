package ru.cyberblogs.as_salam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import ru.cyberblogs.as_salam.gallereya.Rasm;

public class MainActivity extends AppCompatActivity {
    Button bmenu1;
    Button bmenu2;
    Button bmenu3;
    Button bmenu4;
    Button bmenu5;
    Button bmenu6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bmenu1 = (Button) findViewById(R.id.bmenu1);
        bmenu2 = (Button) findViewById(R.id.bmenu2);
        bmenu3 = (Button) findViewById(R.id.bmenu3);
        bmenu4 = (Button) findViewById(R.id.bmenu4);
        bmenu5 = (Button) findViewById(R.id.bmenu5);
        bmenu6 = (Button) findViewById(R.id.bmenu6);

        final Intent category = new Intent(this,Category.class);
        final Intent rasm = new Intent(this, Rasm.class);

        View.OnClickListener onClickListener = new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.bmenu1:
                        startActivity(category);
                        break;
                    case R.id.bmenu2:

                        break;
                    case R.id.bmenu3:

                        break;
                    case R.id.bmenu4:

                        break;
                    case R.id.bmenu5:

                        break;
                    case R.id.bmenu6:
                        startActivity(rasm);
                        break;
                }
            }
        };

        bmenu1.setOnClickListener(onClickListener);
        bmenu2.setOnClickListener(onClickListener);
        bmenu3.setOnClickListener(onClickListener);
        bmenu4.setOnClickListener(onClickListener);
        bmenu5.setOnClickListener(onClickListener);
        bmenu6.setOnClickListener(onClickListener);

    }
}
