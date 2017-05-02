package com.example.android.monymusic;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Csontos Mónika on 2017. 05. 01..
 */

// here is the problem.....................................
public class Menu  extends AppCompatActivity {
        // This code manages the local menu on top of the screen
        Intent MonyMusic;
        TextView menu1_textview = (TextView) findViewById(R.id.scroll_menu1);
        TextView menu2_textview = (TextView) findViewById(R.id.scroll_menu2);
        TextView menu3_textview = (TextView) findViewById(R.id.scroll_menu3);
        TextView menu4_textview = (TextView) findViewById(R.id.scroll_menu4);
        TextView menu5_textview = (TextView) findViewById(R.id.scroll_menu5);
        TextView menu6_textview = (TextView) findViewById(R.id.scroll_menu6);
        // each click starts the proper intent
        switch (v.getId()) {
            case R.id.scroll_menu0:
                Log.v("NowPlaying", "click 0");
                menu1_textview.setTextColor(Color.parseColor("#66000000"));
                MonyMusic = new Intent(this, MainActivity.class);
                startActivity(MonyMusic);
                menu1_textview.setTextColor(Color.parseColor("#000000"));
                break;
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
                MonyMusic = new Intent(this, Artists.class);
                startActivity(MonyMusic);
                menu5_textview.setTextColor(Color.parseColor("#000000"));
                break;
            case R.id.scroll_menu6:
                Log.v("NowPlaying", "click 6");
                menu6_textview.setTextColor(Color.parseColor("#66000000"));
                startActivity(new Intent(Menu.this, Pop.class));
                menu6_textview.setTextColor(Color.parseColor("#000000"));

                break;
            default:
                break;
        }

    }
