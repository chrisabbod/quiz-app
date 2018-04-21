package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public int userScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void getScore(View v){
        userScore += questionOne();

        Toast.makeText(this, "Your score is " + userScore + " points!", Toast.LENGTH_LONG).show();
    }

    public int questionOne(){
        RadioButton trueButton = (RadioButton)findViewById(R.id.q1_true_radio_button);

        if(trueButton.isChecked()){
            //Toast.makeText(this, "TRUE", Toast.LENGTH_LONG).show();
            return 1;
        }
        return 0;
    }

    public int questionTwo(){
        RadioButton atlanticButton = (RadioButton)findViewById(R.id.atlantic_radio_button);

        if(atlanticButton.isChecked()){
            return 1;
        }
        return 0;
    }
}
