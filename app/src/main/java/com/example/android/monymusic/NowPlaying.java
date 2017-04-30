package com.example.android.monymusic;

/**
 * Created by Csontos Mónika on 2017. 04. 29..
 */
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;

import static com.example.android.monymusic.R.id.menu1_textview;
import static com.example.android.monymusic.R.id.menu2_textview;
import static com.example.android.monymusic.R.id.menu3_textview;
import static com.example.android.monymusic.R.id.menu4_textview;
import static com.example.android.monymusic.R.id.menu5_textview;


public class NowPlaying extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.v("NowPlaying", "click");
        MainActivity.menu = 1;
        setContentView(R.layout.nowplaying);
        startActivity(new Intent(NowPlaying.this, Pop.class));
   }

    @Override

    public void onResume ()
    {

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
    }

    public void ScrollMenu(View v) {

        Intent MonyMusic;
        TextView menu1_textview = (TextView) findViewById(R.id.scroll_menu1);
        TextView menu2_textview = (TextView) findViewById(R.id.scroll_menu2);
        TextView menu3_textview = (TextView) findViewById(R.id.scroll_menu3);
        TextView menu4_textview = (TextView) findViewById(R.id.scroll_menu4);
        TextView menu5_textview = (TextView) findViewById(R.id.scroll_menu5);
        TextView menu6_textview = (TextView) findViewById(R.id.scroll_menu6);
        // each click starts the proper intent
        switch (v.getId()) {
            case R.id.scroll_menu1:
                Log.v("NowPlaying", "click 1");
                menu1_textview.setTextColor(Color.parseColor("#66000000"));
                MonyMusic = new Intent(this, NowPlaying.class);
                startActivity(MonyMusic);
                menu1_textview.setTextColor(Color.parseColor("#000000"));
                break;
            case R.id.scroll_menu2:
                Log.v("NowPlaying", "click 2");
                menu2_textview.setTextColor(Color.parseColor("#66000000"));
                MonyMusic = new Intent(this, PlayList.class);
                startActivity(MonyMusic);
                menu2_textview.setTextColor(Color.parseColor("#000000"));
                break;
            case R.id.scroll_menu3:
                Log.v("NowPlaying", "click 3");
                menu3_textview.setTextColor(Color.parseColor("#66000000"));
                MonyMusic = new Intent(this, Albums.class);
                startActivity(MonyMusic);
                menu3_textview.setTextColor(Color.parseColor("#000000"));
                break;
            case R.id.scroll_menu4:
                Log.v("NowPlaying", "click 4");
                menu4_textview.setTextColor(Color.parseColor("#66000000"));
                MonyMusic = new Intent(this, Songs.class);
                startActivity(MonyMusic);
                menu4_textview.setTextColor(Color.parseColor("#000000"));
                break;
            case R.id.scroll_menu5:
                Log.v("NowPlaying", "click 5");
                menu5_textview.setTextColor(Color.parseColor("#66000000"));
                MonyMusic = new Intent(this, Artist.class);
                startActivity(MonyMusic);
                menu5_textview.setTextColor(Color.parseColor("#000000"));
                break;
            case R.id.scroll_menu6:
                startActivity(new Intent(NowPlaying.this, Pop.class));
                break;
            default:
                break;
        }



    }



}

