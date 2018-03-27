package com.example.marpoc1.myapplication;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

import com.example.marpoc1.myapplication.GameLogic.Game;

public class MySettingsActivity extends Activity {

    public int from = 1;
    public int to = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_settings);
//
//        Button button= (Button)findViewById(R.id.SaveBtn);
//
//        button.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View view) {
//                TextView t = findViewById(R.id.from);
//                from = Integer.parseInt(t.getText().toString());
//
//                TextView tt = findViewById(R.id.to);
//                to = Integer.parseInt(t.getText().toString());
//
//            }
//       });

    }
//    public void saveSettings()
//    {
//        //SharedPreferences nuostatos = getSharedPreferences("settings",MODE_PRIVATE);
////        shared
//    }




}
