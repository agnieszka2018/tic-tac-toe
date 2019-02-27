package com.example.tic_tac_toe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button[][] buttons = new Button[3][3];
    private boolean playerOneTurn = true;
    private int roundCount;
    private int playerOnePoints;
    private int playerTwoPoints;
    private TextView textViewPlayerOne;
    private TextView textViewPlayerTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewPlayerOne = findViewById(R. id. text_view_p1);
        textViewPlayerTwo = findViewById(R. id. text_view_p2);

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                String buttonID = "button_" + i + j;
                int resID = getResources().getIdentifier(buttonID,"id", getPackageName());
                buttons[i][j] = findViewById(resID);
                buttons[i][j].setOnClickListener(this);
            }
        }

    }

    @Override
    public void onClick(View v) {

    }
}
