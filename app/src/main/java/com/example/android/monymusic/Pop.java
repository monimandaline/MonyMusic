package com.example.android.monymusic;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Csontos Mónika on 2017. 04. 30.
 */
public class Pop extends Activity {

    @Override
    protected void onCreate (Bundle savedInstanceState)
    { super.onCreate(savedInstanceState);

        setContentView(R.layout.popupwindow);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int)(width*.8),(int)(height*.8));

        String ResultTxt = "";

        TextView  popup_label = (TextView) findViewById(R.id.popup_label);
        TextView  popup_menu_text = (TextView) findViewById(R.id.popup_menu_text);

        String v_popup_label = "";
        String v_popup_menu_text = "";

        if (MainActivity.menu == 0) {
            v_popup_label = getResources().getString(R.string.menu0);
            v_popup_menu_text = getResources().getString(R.string.popup_menu_text0);

        }

        if (MainActivity.menu == 1) {
            v_popup_label = getResources().getString(R.string.menu1);
            v_popup_menu_text = getResources().getString(R.string.popup_menu_text1);
        }

        if (MainActivity.menu == 2) {

            v_popup_label = getResources().getString(R.string.menu2);
            v_popup_menu_text = getResources().getString(R.string.popup_menu_text2);
        }

        if (MainActivity.menu == 3) {

            v_popup_label = getResources().getString(R.string.menu3);
            v_popup_menu_text = getResources().getString(R.string.popup_menu_text3);
        }

        if (MainActivity.menu == 4) {

            v_popup_label = getResources().getString(R.string.menu4);
            v_popup_menu_text = getResources().getString(R.string.popup_menu_text4);
        }

        if (MainActivity.menu == 5) {

            v_popup_label = getResources().getString(R.string.menu5);
            v_popup_menu_text = getResources().getString(R.string.popup_menu_text5);
        }

        popup_label.setText(v_popup_label);
        popup_menu_text.setText(v_popup_menu_text);

    }

    public void CloseWindow (View v) {
        finish();
    }
}
