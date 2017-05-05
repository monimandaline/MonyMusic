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
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static com.example.android.monymusic.R.id.listview;


public class Artists extends AppCompatActivity  implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Global variable for Help popup window, where you can find a description for actual screen
        // The menu number allows for PopActivity.java code to select the correct text
        MainActivity.menu = 5;

        setContentView(R.layout.artists);

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

    public void onResume() {
// This code handle the local menu on the top of screen
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
        MainActivity.menu = 5;
    }

    @Override
    public void onClick(View v) {
        // Header menu heandler
        MyMenu NewMyMenu = new MyMenu();
        NewMyMenu.MenuHandler(v);
    }
}