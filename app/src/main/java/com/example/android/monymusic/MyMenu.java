package com.example.android.monymusic;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import static android.R.attr.id;

/**
 * Created by Csontos Mónika on 2017. 05. 01..
 */

public class MyMenu extends AppCompatActivity  {

   public void MenuHandler (View v) {
        // This code manages the local menu on top of the screen
        Intent MonyMusic;
        TextView menu0_textview = (TextView) v.findViewById(R.id.scroll_menu0);
        TextView menu1_textview = (TextView) v.findViewById(R.id.scroll_menu1);
        TextView menu2_textview = (TextView) v.findViewById(R.id.scroll_menu2);
        TextView menu3_textview = (TextView) v.findViewById(R.id.scroll_menu3);
        TextView menu4_textview = (TextView) v.findViewById(R.id.scroll_menu4);
        TextView menu5_textview = (TextView) v.findViewById(R.id.scroll_menu5);
        TextView menu6_textview = (TextView) v.findViewById(R.id.scroll_menu6);

        int getid = v.getId();


        // each click starts the proper intent
        switch (getid) {
            case R.id.scroll_menu0:
                menu0_textview.setTextColor(Color.parseColor("#66000000"));
                MonyMusic = new Intent(v.getContext(), MainActivity.class);
                v.getContext().startActivity(MonyMusic);
                menu0_textview.setTextColor(Color.parseColor("#000000"));
                break;
            case R.id.scroll_menu1:
                menu1_textview.setTextColor(Color.parseColor("#66000000"));
                MonyMusic = new Intent(v.getContext(), NowPlaying.class);
                v.getContext().startActivity(MonyMusic);
                menu1_textview.setTextColor(Color.parseColor("#000000"));
                break;
            case R.id.scroll_menu2:
                menu2_textview.setTextColor(Color.parseColor("#66000000"));
                MonyMusic = new Intent(v.getContext(), PlayList.class);
                v.getContext().startActivity(MonyMusic);
                menu2_textview.setTextColor(Color.parseColor("#000000"));
                break;
            case R.id.scroll_menu3:
                menu3_textview.setTextColor(Color.parseColor("#66000000"));
                MonyMusic = new Intent(v.getContext(), Albums.class);
                v.getContext().startActivity(MonyMusic);
                menu3_textview.setTextColor(Color.parseColor("#000000"));
                break;
            case R.id.scroll_menu4:
                menu4_textview.setTextColor(Color.parseColor("#66000000"));
                MonyMusic = new Intent(v.getContext(), Songs.class);
                v.getContext().startActivity(MonyMusic);
                menu4_textview.setTextColor(Color.parseColor("#000000"));
                break;
            case R.id.scroll_menu5:
                menu5_textview.setTextColor(Color.parseColor("#66000000"));
                MonyMusic = new Intent(v.getContext(), Artists.class);
                v.getContext().startActivity(MonyMusic);
                menu5_textview.setTextColor(Color.parseColor("#000000"));
                break;
            case R.id.scroll_menu6:
                menu6_textview.setTextColor(Color.parseColor("#66000000"));
                MonyMusic = new Intent(v.getContext(), PopActivity.class);
                v.getContext().startActivity(MonyMusic);
                menu6_textview.setTextColor(Color.parseColor("#000000"));
                break;
            default:
                break;
        }

    }
    }
