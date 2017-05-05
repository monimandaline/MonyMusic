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
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.android.monymusic.R.id.menu1_textview;
import static com.example.android.monymusic.R.id.menu2_textview;
import static com.example.android.monymusic.R.id.menu3_textview;
import static com.example.android.monymusic.R.id.menu4_textview;
import static com.example.android.monymusic.R.id.menu5_textview;
import static com.example.android.monymusic.R.id.menu6_textview;


public class NowPlaying extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.v("NowPlaying", "click");

        // Global variable for Help popup window, where you can find a description for actual screen
        // The menu number allows for PopActivity.java code to select the correct text
        MainActivity.menu = 1;

        setContentView(R.layout.nowplaying);

        ImageButton ImageButton1 = (ImageButton) findViewById(R.id.player_button1);
        ImageButton ImageButton2 = (ImageButton) findViewById(R.id.player_button2);
        ImageButton ImageButton3 = (ImageButton) findViewById(R.id.player_button3);
        ImageButton ImageButton4 = (ImageButton) findViewById(R.id.player_button4);

        ImageButton1.setOnClickListener(this);
        ImageButton2.setOnClickListener(this);
        ImageButton3.setOnClickListener(this);
        ImageButton4.setOnClickListener(this);

        TextView menu0_textview = (TextView) findViewById(R.id.scroll_menu0);
        TextView menu1_textview = (TextView) findViewById(R.id.scroll_menu1);
        TextView menu2_textview = (TextView) findViewById(R.id.scroll_menu2);
        TextView menu3_textview = (TextView) findViewById(R.id.scroll_menu3);
        TextView menu4_textview = (TextView) findViewById(R.id.scroll_menu4);
        TextView menu5_textview = (TextView) findViewById(R.id.scroll_menu5);
        TextView menu6_textview = (TextView) findViewById(R.id.scroll_menu6);

        menu0_textview.setOnClickListener(this);
        menu1_textview.setOnClickListener(this);
        menu2_textview.setOnClickListener(this);
        menu3_textview.setOnClickListener(this);
        menu4_textview.setOnClickListener(this);
        menu5_textview.setOnClickListener(this);
        menu6_textview.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        int getid = v.getId();
        Log.v("NowPlaying", "onClick");
        // each click starts the proper intent
        ImageButton ImageButton1 = (ImageButton) findViewById(R.id.player_button1);
        ImageButton ImageButton2 = (ImageButton) findViewById(R.id.player_button2);
        ImageButton ImageButton3 = (ImageButton) findViewById(R.id.player_button3);
        ImageButton ImageButton4 = (ImageButton) findViewById(R.id.player_button4);
        ButtonAnimation(v);
        switch (getid) {
            case R.id.player_button1:
                Toast.makeText(NowPlaying.this, "Stop!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.player_button2:
                Toast.makeText(NowPlaying.this, "Back!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.player_button3:
                Toast.makeText(NowPlaying.this, "Play!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.player_button4:
                Toast.makeText(NowPlaying.this, "Forward!", Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
        // Header menu heandler
        MyMenu NewMyMenu = new MyMenu();
        NewMyMenu.MenuHandler(v);

    }

    @Override
    public void onResume() { // This code handle the local menu on the top of screen
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
        // The menu number allows for PopActivity.java code to select the correct text
        MainActivity.menu = 1;
    }

    // Button animations
    public void ButtonAnimation(View v) {

        final Animation animTranslate = AnimationUtils.loadAnimation(this, R.anim.anim_translate);

        AnimationSet sets = new AnimationSet(false);
        sets.addAnimation(animTranslate);
        v.startAnimation(sets);
    }


}

