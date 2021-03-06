package com.example.android.monymusic;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    // Recent menu
    public static int menu = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //remove title bar
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);

        //remove notifiaction bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);

        final Typeface typeface=Typeface.createFromAsset(getAssets(),"fonts/Montserrat-Regular.ttf");

        // setup the onclick to the textviews
        LinearLayout menu1 = (LinearLayout) findViewById(R.id.menu1);
        TextView menu1_textview = (TextView) findViewById(R.id.menu1_textview);
        menu1_textview.setTypeface(typeface);

        LinearLayout menu2 = (LinearLayout) findViewById(R.id.menu2);
        TextView menu2_textview = (TextView) findViewById(R.id.menu2_textview);
        menu2_textview.setTypeface(typeface);

        LinearLayout menu3 = (LinearLayout) findViewById(R.id.menu3);
        TextView menu3_textview = (TextView) findViewById(R.id.menu3_textview);
        menu3_textview.setTypeface(typeface);

        LinearLayout menu4 = (LinearLayout) findViewById(R.id.menu4);
        TextView menu4_textview = (TextView) findViewById(R.id.menu4_textview);
        menu4_textview.setTypeface(typeface);

        LinearLayout menu5 = (LinearLayout) findViewById(R.id.menu5);
        TextView menu5_textview = (TextView) findViewById(R.id.menu5_textview);
        menu5_textview.setTypeface(typeface);

        LinearLayout menu6 = (LinearLayout) findViewById(R.id.menu6);
        TextView menu6_textview = (TextView) findViewById(R.id.menu6_textview);
        menu6_textview.setTypeface(typeface);

        menu1.setOnClickListener(this);
        menu2.setOnClickListener(this);
        menu3.setOnClickListener(this);
        menu4.setOnClickListener(this);
        menu5.setOnClickListener(this);
        menu6.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent MonyMusic;
        // each click starts the proper intent
        switch (v.getId()) {
            case R.id.menu1:
                MonyMusic = new Intent(this, NowPlaying.class);
                startActivity(MonyMusic);
                break;
            case R.id.menu2:
                MonyMusic = new Intent(this, PlayList.class);
                startActivity(MonyMusic);
                break;
            case R.id.menu3:
                MonyMusic = new Intent(this, Albums.class);
                startActivity(MonyMusic);
                break;
            case R.id.menu4:
                MonyMusic = new Intent(this, Songs.class);
                startActivity(MonyMusic);
                break;
            case R.id.menu5:
                MonyMusic = new Intent(this, Artists.class);
                startActivity(MonyMusic);
                break;
            case R.id.menu6:
                startActivity(new Intent(MainActivity.this, PopActivity.class));
                break;
            default:
                break;
        }
    }

    public void onResume() {

        super.onResume();
        MainActivity.menu = 0;
    }

}
