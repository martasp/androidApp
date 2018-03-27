package com.example.marpoc1.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Debug;
import android.util.Log;
import android.view.View;
import android.view.Window;

public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_pagr);
    }

    public void onClick(View v) {
        if (v.getId() == R.id.playBtn)
        {
            Intent intent = new Intent(this, GameActivity.class);
            startActivity(intent);
        }
        else if (v.getId() == R.id.GoToSettingsBtn)
        {
            Log.i("GoToSettingsBtn","GoToSettingsBtn");
            Intent intent = new Intent(this, MySettingsActivity.class);
            startActivity(intent);
        }
        else if (v.getId() == R.id.aboutBtn)
        {
            Intent intent = new Intent(this, AboutActivity.class);
            startActivity(intent);
        }
    }


//    public void GoToMenu()
//    {
//        Intent intent = new Intent(this, GameActivity.class);
//        startActivity(intent);
//    }
//
//    public void GoToSettings()
//    {
//        Intent intent = new Intent(this, MySettingsActivity.class);
//        startActivity(intent);
//    }
//
//    public void GoToAbout()
//    {
//        try {
//            throw new Exception("not implemented");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        Intent intent = new Intent(this, MySettingsActivity.class);
//        startActivity(intent);
//    }
}
