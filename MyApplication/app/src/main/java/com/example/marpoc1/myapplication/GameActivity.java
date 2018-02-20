package com.example.marpoc1.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class GameActivity extends Activity {

    public int rnNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_Game);

        Random rnd = new Random();
        rnNumber = rnd.nextInt(100);
    }

    public void Speti(View view)
    {
        TextView t = findViewById(R.id.editText);
        int spejimas = Integer.parseInt(t.getText().toString());
        String tekstas ="";
        if (spejimas==rnNumber)
        {
            tekstas ="laimejai";
        } else if (rnNumber>spejimas)
        {
            tekstas ="daugiau";
        }
        else if (rnNumber<spejimas)
        {
            tekstas ="maziau";
        }

        TextView ats = findViewById(R.id.textView2);
        ats.setText(tekstas);

    }

}
