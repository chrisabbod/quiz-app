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

    /**
     * Display toast with user's score after pressing the submit button
     *
     * @param v is the submit_button
     */
    public void getScore(View v){
        userScore += questionOne();

        Toast.makeText(this, "Your score is " + userScore + " points!", Toast.LENGTH_LONG).show();
    }

    /**
     *
     * @return 0 or 1 depending on if the user chose the correct answer or not
     */
    public int questionOne(){
        RadioButton trueRadioButton = (RadioButton)findViewById(R.id.q1_true_radio_button);

        if(trueRadioButton.isChecked()){
            //Toast.makeText(this, "TRUE", Toast.LENGTH_LONG).show();
            return 1;
        }
        return 0;
    }

    /**
     *
     * @return 0 or 1 depending on if the user chose the correct answer or not
     */
    public int questionTwo(){
        RadioButton atlanticRadioButton = (RadioButton)findViewById(R.id.atlantic_radio_button);

        if(atlanticRadioButton.isChecked()){
            return 1;
        }
        return 0;
    }

    /**
     *
     * @return 0 or 1 depending on if the user chose the correct answer or not
     */
    public int questionThree(){
        RadioButton everestRadioButton = (RadioButton)findViewById(R.id.everest_radio_button);

        if(everestRadioButton.isChecked()){
            return 1;
        }
        return 0;
    }
}
