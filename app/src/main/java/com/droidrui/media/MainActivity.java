package com.droidrui.media;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void encodeAndMuxTest(View view) {
        startActivity(new Intent(this, EncodeAndMuxActivity.class));
    }

    public void cameraToMpegTest(View view) {
        startActivity(new Intent(this, CameraToMpegActivity.class));
    }

    public void gameRecorderTest(View view) {
        startActivity(new Intent(this, GameRecorderActivity.class));
    }

}
