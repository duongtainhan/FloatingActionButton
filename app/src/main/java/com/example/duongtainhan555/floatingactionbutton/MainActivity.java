package com.example.duongtainhan555.floatingactionbutton;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private FloatingActionButton fab_app, fab_facebook, fab_instagram, fab_twitch;
    private boolean status=true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Anh xa
        Init();
        //
        fab_app.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(status)
                {
                    ShowAll();
                    status = false;
                }
                else
                {
                    HideAll();
                    status = true;
                }
            }
        });
        //EventClickFacebook
        fab_facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Ban da chon Facebook!",Toast.LENGTH_SHORT).show();
            }
        });
        //EventClickInstagram
        fab_instagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Ban da chon Instagram!",Toast.LENGTH_SHORT).show();
            }
        });
        //EventClickTwitch
        fab_twitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Ban da chon Twitch!",Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void Init()
    {
        fab_app = findViewById(R.id.fap_app);
        fab_facebook = findViewById(R.id.fabFacebook);
        fab_instagram = findViewById(R.id.fabInstagram);
        fab_twitch = findViewById(R.id.fabTwitch);
    }
    private void ShowAll()
    {
        fab_facebook.show();
        fab_instagram.show();
        fab_twitch.show();
    }
    private void HideAll()
    {
        fab_facebook.hide();
        fab_instagram.hide();
        fab_twitch.hide();
    }
}
