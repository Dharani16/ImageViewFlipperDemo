package com.ocean.imageviewflipperdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {
    ViewFlipper viewFlipper;
     int images[] = {R.drawable.img1,R.drawable.img2,R.drawable.img3,R.drawable.pic1,R.drawable.pic2};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewFlipper = (ViewFlipper)findViewById(R.id.viewFlipper);
        for (int i = 0; i < images.length;i++){
            setFlipperImage(images[i]);
        }
    }

    private void setFlipperImage(int image) {
        ImageView img = new ImageView(getApplicationContext());
        img.setBackgroundResource(image);
        viewFlipper.addView(img);
        viewFlipper.setAutoStart(true);
        viewFlipper.setFlipInterval(1000);
    }
}
