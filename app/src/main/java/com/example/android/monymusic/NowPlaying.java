package com.example.android.monymusic;

/**
 * Created by Csontos Mónika on 2017. 04. 29..
 */
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;


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

}

