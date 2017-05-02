package com.example.android.monymusic;

/**
 * Created by Csontos Mónika on 2017. 04. 29..
 */
import android.content.Intent;
import android.graphics.Color;
import android.media.Image;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.android.monymusic.R.id.menu1_textview;
import static com.example.android.monymusic.R.id.menu2_textview;
import static com.example.android.monymusic.R.id.menu3_textview;
import static com.example.android.monymusic.R.id.menu4_textview;
import static com.example.android.monymusic.R.id.menu5_textview;
import static com.example.android.monymusic.R.id.menu6_textview;


public class NowPlaying extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.v("NowPlaying", "click");

        // Global variable for Help popup window, where you can find a description for actual screen
        // The menu number allows for Pop.java code to select the correct text
        MainActivity.menu = 1;

        setContentView(R.layout.nowplaying);
   }

    @Override
    public void onResume ()
    { // This code handle the local menu on the top of screen
        super.onResume();
        TextView menu1_textview = (TextView) findViewById(R.id.scroll_menu1);
        TextView menu2_textview = (TextView) findViewById(R.id.scroll_menu2);
        TextView menu3_textview = (TextView) findViewById(R.id.scroll_menu3);
        TextView menu4_textview = (TextView) findViewById(R.id.scroll_menu4);
        TextView menu5_textview = (TextView) findViewById(R.id.scroll_menu5);
        TextView menu6_textview = (TextView) findViewById(R.id.scroll_menu6);

        menu1_textview.setTextColor(Color.parseColor("#FFFFFF"));
        menu2_textview.setTextColor(Color.parseColor("#FFFFFF"));
        menu3_textview.setTextColor(Color.parseColor("#FFFFFF"));
        menu4_textview.setTextColor(Color.parseColor("#FFFFFF"));
        menu5_textview.setTextColor(Color.parseColor("#FFFFFF"));
        menu6_textview.setTextColor(Color.parseColor("#FFFFFF"));

        // Global variable for Help popup window, where you can find a description for actual screen
        // The menu number allows for Pop.java code to select the correct text
        MainActivity.menu = 1;
    }

    // Header menu heandler
    public void ScrollMenu(View v) {
        MyMenu NewMyMenu = new MyMenu();
        NewMyMenu.MenuHandler(v);
    }


    public void PlayerButtons(View v)
    {
        int getid = v.getId();

        // each click starts the proper intent
        switch (getid) {
            case R.id.player_button1:
                ImageView stopImageView = (ImageView) findViewById(R.id.player_button1);
                stopImageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ButtonAnimation(v);
                        Toast.makeText(NowPlaying.this, "Stop!", Toast.LENGTH_SHORT).show();}
                });
                break;
            case R.id.player_button2:
                ImageView stopImageView2 = (ImageView) findViewById(R.id.player_button2);
                stopImageView2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ButtonAnimation(v);
                        Toast.makeText(NowPlaying.this, "Back!", Toast.LENGTH_SHORT).show();}
                });
                break;
            case R.id.player_button3:
                ImageView stopImageView3 = (ImageView) findViewById(R.id.player_button3);
                stopImageView3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ButtonAnimation(v);
                        Toast.makeText(NowPlaying.this, "Play!", Toast.LENGTH_SHORT).show();}
                });
                break;
            case R.id.player_button4:
                ImageView stopImageView4 = (ImageView) findViewById(R.id.player_button4);
                stopImageView4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ButtonAnimation(v);
                        Toast.makeText(NowPlaying.this, "Forward!", Toast.LENGTH_SHORT).show();}
                });
                break;
            default:
                break;
        }


    }


    // Button animations
    public void ButtonAnimation(View v) {

        final Animation animTranslate = AnimationUtils.loadAnimation(this, R.anim.anim_translate);

        AnimationSet sets = new AnimationSet(false);
        sets.addAnimation(animTranslate);
        v.startAnimation(sets);
    }


}

