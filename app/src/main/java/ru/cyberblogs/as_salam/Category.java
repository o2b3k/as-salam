package ru.cyberblogs.as_salam;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by O2B3K on 20.02.2017.
 */

public class Category extends AppCompatActivity{
    Button catmenu1;
    Button catmenu2;
    Button catmenu3;
    Button catmenu4;
    Button catmenu5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.category);

        catmenu1 = (Button) findViewById(R.id.cmenu1);
        catmenu2 = (Button) findViewById(R.id.cmenu2);
        catmenu3 = (Button) findViewById(R.id.cmenu3);
        catmenu4 = (Button) findViewById(R.id.cmenu4);
        catmenu5 = (Button) findViewById(R.id.cmenu5);

        final Intent masjid = new Intent(this,Masjid.class);
        final Intent centerqoran = new Intent(this,CenterQoran.class);
        final Intent fab = new Intent(this,Fab.class);
        final Intent suv = new Intent(this,Suv.class);
        final Intent cow = new Intent(this,Cow.class);

        View.OnClickListener onClickListener = new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.cmenu1:
                        startActivity(masjid);
                        break;
                    case R.id.cmenu2:
                        startActivity(centerqoran);
                        break;
                    case R.id.cmenu3:
                        startActivity(fab);
                        break;
                    case R.id.cmenu4:
                        startActivity(suv);
                        break;
                    case R.id.cmenu5:
                        startActivity(cow);
                        break;
                }
            }
        };
        catmenu1.setOnClickListener(onClickListener);
        catmenu2.setOnClickListener(onClickListener);
        catmenu3.setOnClickListener(onClickListener);
        catmenu4.setOnClickListener(onClickListener);
        catmenu5.setOnClickListener(onClickListener);
    }
}
