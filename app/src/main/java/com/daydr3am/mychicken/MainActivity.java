package com.daydr3am.mychicken;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    // Explicit

    private ListView trafficListView;
    private Button aboutmeButton;
    private static final String uriAboutme = "http://7topup.com";




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Bind Widget
        trafficListView = (ListView) findViewById(R.id.listview);
        aboutmeButton = (Button) findViewById(R.id.button);

        // Controller
        aboutmeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //sound effect
                MediaPlayer mediaPlayer = MediaPlayer.create(getBaseContext(),
                        R.raw.effect_btn_shut);
                mediaPlayer.start();

                // Intent to webview
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(uriAboutme));
                startActivity(intent);
                
            }  //on click
        });

    }  // Main Method
}  //Main Class
