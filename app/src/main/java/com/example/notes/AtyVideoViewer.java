package com.example.notes;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class AtyVideoViewer extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        vv = new VideoView(this);
        vv.setMediaController(new MediaController(this));
        setContentView(vv);

        String path = getIntent().getStringExtra(EXTRA_PATH);
        if (path!=null){
            vv.setVideoPath(path);
        }else{
            finish();
        }
    }

    private VideoView vv;
    public static final String EXTRA_PATH="path";
}
