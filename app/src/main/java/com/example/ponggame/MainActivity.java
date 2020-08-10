package com.example.ponggame;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Point;
import android.os.Bundle;
import android.view.Display;

public class MainActivity extends AppCompatActivity {
    //attribute
    private ponggame mponggame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);

        mponggame = new ponggame(this, size.x, size.y);
        setContentView(mponggame);
    }
    @Override
    protected void onResume() {
        super.onResume();
        mponggame.resume();

    }
    @Override
    protected void onPause() {
        super.onPause();
        mponggame.pause();
    }
}