package com.example.android.monymusic;

/**
 * Created by Csontos Mónika on 2017. 04. 29..
 */

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
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
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.sql.RowId;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

import static android.os.Build.ID;
import static com.example.android.monymusic.R.id.listview;

public class PlayList extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.v("PlayList", "click");
        MainActivity.menu = 2;

        setContentView(R.layout.playlist_list);

        ArrayList<String> words = new ArrayList<String>();

        words.add("Latin Pop Mix\n" + "14 Songs");
        words.add("Cyberpunk - Art Remixes\n" + "10 Songs");
        words.add("Vivaldi Best of Seasons\n" + "4 Songs");
        words.add("Startrek Voyager - Themes\n"+ "7 Songs");
        words.add("Ambient" + "9 Songs\n" + "23 Songs");
        words.add("Motivating MusicMix\n" + "32 Songs");
        words.add("Enrique Iglesias Best Dance\n" + "48 Songs");
        words.add("Random Cool Song List 2016 - 2017\n" + "17 Songs");

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
                Toast.makeText(PlayList.this, "Ohhoho, your list is on the road..." + (position+1), Toast.LENGTH_SHORT).show();
            }

        });
//EditText user_name_et = (EditText) findViewById(R.id.user_name);
        //user_name = user_name_et.getText().toString();

    }

    public void onResume() {

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

        MainActivity.menu = 2;
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
                MonyMusic = new Intent(this, Artist.class);
                startActivity(MonyMusic);
                menu5_textview.setTextColor(Color.parseColor("#000000"));
                break;
            case R.id.scroll_menu6:
                startActivity(new Intent(PlayList.this, Pop.class));
                break;
            default:
                break;
        }
    }

    public void addList(View v) {

        Button addButton = (Button) findViewById(R.id.button_add);
        addButton.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            ButtonAnimation(v);
                                            Toast.makeText(PlayList.this, "Ohhoho, you clicked on add button!", Toast.LENGTH_LONG).show();
                                        }
                                    });

    }


    //** Button animations
    public void ButtonAnimation(View v) {

        final Animation animTranslate = AnimationUtils.loadAnimation(this, R.anim.anim_translate);
        final Animation animAlpha = AnimationUtils.loadAnimation(this, R.anim.anim_alpha);
        final Animation animScale = AnimationUtils.loadAnimation(this, R.anim.anim_scale);
        final Animation animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);

        AnimationSet sets = new AnimationSet(false);
        //sets.addAnimation(animTranslate);
        //sets.addAnimation(animAlpha);
        sets.addAnimation(animRotate);
        //sets.addAnimation(animScale);
        v.startAnimation(sets);
    }
}