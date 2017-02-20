package ru.cyberblogs.as_salam.gallereya;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.davemorrissey.labs.subscaleview.ImageSource;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;

import ru.cyberblogs.as_salam.R;
import uk.co.senab.photoview.PhotoViewAttacher;

/**
 * Created by O2B3K on 20.02.2017.
 */

public class Rasm extends AppCompatActivity{
    ImageView mImageView;
    ImageView rasm3;
    PhotoViewAttacher mAttacher;
    PhotoViewAttacher mAttacher2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rasm);

        mImageView = (ImageView) findViewById(R.id.rasm2);
        Drawable bitmap = getResources().getDrawable(R.drawable.masjidonboshibir);
        mImageView.setImageDrawable(bitmap);

        rasm3 = (ImageView) findViewById(R.id.rasm3);
        Drawable bitmap2 = getResources().getDrawable(R.drawable.masjidonboshiikki);
        rasm3.setImageDrawable(bitmap2);

        mAttacher = new PhotoViewAttacher(mImageView);
        mAttacher2 = new PhotoViewAttacher(rasm3);
        mAttacher.update();
        mAttacher2.update();
    }
}
