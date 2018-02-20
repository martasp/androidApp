package com.example.marpoc1.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import java.util.Random;
import com.example.marpoc1.myapplication.GameLogic.Game;

public class GameActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        Button button= (Button)findViewById(R.id.button);
        final Game firstGame = new Game();
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                TextView t = findViewById(R.id.editText);
                int spejimas = Integer.parseInt(t.getText().toString());
                String tekstas = firstGame.DoGuess(spejimas);
                TextView ats = findViewById(R.id.textView2);
                ats.setText(tekstas);
            }
        });




    }




}
