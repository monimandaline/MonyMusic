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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import android.widget.TextView;
import android.widget.Toast;

import static com.example.android.monymusic.R.id.listview;

public class Songs extends AppCompatActivity implements View.OnClickListener  {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.v("Songs", "click");

        // Global variable for Help popup window, where you can find a description for actual screen
        // The menu number allows for PopActivity.java code to select the correct text
        MainActivity.menu = 4;

        setContentView(R.layout.songs);

        // This array contains data for Listview
        ArrayList<String> words = new ArrayList<String>();

        words.add("Enrique Iglesias\n" + "Wish I was your lover\n" + "3:45");
        words.add("Enrique Iglesias\n" + "Somebody's Me\n" + "5:05");
        words.add("Enrique Iglesias\n" + "I Like It\n" + "4:04");
        words.add("Enrique Iglesias\n" + "Addicted\n" + "4:04");
        words.add("Enrique Iglesias\n" + "Why not me\n" + "3:51");
        words.add("Enrique Iglesias\n" + "So you know?\n" + "5:02");
        words.add("Enrique Iglesias\n" + "Don't you forget about me\n" + "3:40");
        words.add("Enrique Iglesias, Usher\n" + "Dirty Dancer ft. Lil Wayne\n" + "4:17");
        words.add("Enrique Iglesias\n" + "Finally Found You ft. Sammy Adams\n" + "3:58");
        words.add("Enrique Iglesias\n" + "Heartbreaker\n" + "4:21");
        words.add("Enrique Iglesias, Lionel Richie\n" + "To Love a Woman\n" + "3:57");

        final ListView lv = (ListView) findViewById(listview);

        // create the grid item mapping
        String[] from = new String[]{"rowid", "col_1"};
        int[] to = new int[]{R.id.item1, R.id.item2};

        // prepare the list of all records
        List<HashMap<String, String>> fillMaps = new ArrayList<HashMap<String, String>>();
        for (int i = 0; i < words.size(); i++) {
            HashMap<String, String> map = new HashMap<String, String>();
            map.put("rowid", "" + (i+1));
            map.put("col_1", words.get(i));
            fillMaps.add(map);
        }

        // fill in the grid_item layout
        SimpleAdapter adapter = new SimpleAdapter(this, fillMaps, R.layout.playlist_list_item, from, to);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                HashMap<String, String> map = (HashMap<String, String>) lv.getItemAtPosition(position);
                Toast.makeText(Songs.this, "Ohhoho, your song is on the road..." + (position+1), Toast.LENGTH_SHORT).show();
            }

        });

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

        Button addButton = (Button) findViewById(R.id.button_add);
        addButton.setOnClickListener(this);

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
        MainActivity.menu = 4;
    }

    @Override
    public void onClick(View v) {
        // Header menu heandler
        MyMenu NewMyMenu = new MyMenu();
        NewMyMenu.MenuHandler(v);

        // This code works, when the user push the add button
        int getid = v.getId();
        if (getid == R.id.button_add)
        {  ButtonAnimation(v);
            Toast.makeText(Songs.this, "Ohhoho, you clicked on add button!", Toast.LENGTH_LONG).show();
        }

    }

    public void addList(View v) {
        // This code runs, when the user push the add button
        Button addButton = (Button) findViewById(R.id.button_add);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ButtonAnimation(v);
                Toast.makeText(Songs.this, "Ohhoho, you clicked on add button!", Toast.LENGTH_LONG).show();
            }
        });

    }


    //** Submit and Reset button animations
    public void ButtonAnimation(View v) {

        final Animation animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);

        AnimationSet sets = new AnimationSet(false);
        sets.addAnimation(animRotate);
        v.startAnimation(sets);
    }
}