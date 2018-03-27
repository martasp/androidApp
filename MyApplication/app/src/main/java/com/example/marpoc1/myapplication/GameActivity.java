package com.example.marpoc1.myapplication;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Button;
import java.util.Random;
import com.example.marpoc1.myapplication.GameLogic.Game;

public class GameActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_game);


        ListView list= (ListView)findViewById(R.id.simpleListView);


        Button button= (Button)findViewById(R.id.button);
        final Game firstGame = new Game(0,100);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                TextView t = findViewById(R.id.editText);
                int spejimas = Integer.parseInt(t.getText().toString());
                String tekstas = firstGame.DoGuess(spejimas);
                TextView ats = findViewById(R.id.textView2);
                ats.setText(tekstas);
                if (tekstas == "▲")
                {
                    ats.setTextColor(Color.GREEN);
                } else{
                    ats.setTextColor(Color.RED);
                }



               // list.getAdapter().
            }
        });




    }




}
