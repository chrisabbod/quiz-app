package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
    }

    /**
     * Display toast with user's score after pressing the submit button
     *
     * @param v is the submit_button view in activity_main
     */
    public void getScore(View v){
        int userScore = 0;
        userScore += questionOne();
        userScore += questionTwo();
        userScore += questionThree();
        userScore += questionFour();
        userScore += questionFive();
        userScore += questionSix();
        userScore += questionSeven();
        userScore += questionEight();
        userScore += questionNine();
        userScore += questionTen();

        if(userScore == 10){
            Toast.makeText(this, "You got a perfect score! 10/10! Great job!", Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(this, "Your score is " + userScore + " points!", Toast.LENGTH_LONG).show();
        }
    }

    /**
     *
     * @return 0 or 1 depending on if the user chose the correct answer or not
     */
    public int questionOne(){
        RadioButton trueRadioButton = (RadioButton)findViewById(R.id.q1_true_radio_button);

        if(trueRadioButton.isChecked()){
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

    /**
     *
     * @return 0 or 1 depending on if the user chose the correct answer or not
     */
    public int questionFour(){
        EditText q4EditText = (EditText)findViewById(R.id.q4_edit_text);
        String answer = q4EditText.getText().toString().toLowerCase();    //Extracts string and sets to lower case to make sure user gets credit for answer if there are upper case letters

        if(answer.equals("huron") || answer.equals("ontario") || answer.equals("michigan") || answer.equals("erie") || answer.equals("superior")){
            return 1;
        }
        return 0;
    }

    /**
     *
     * @return 0 or 1 depending on if the user chose the correct answer or not
     */
    public int questionFive(){
        CheckBox reykjavikCheckBox = (CheckBox)findViewById(R.id.reykjavik_checkbox);
        CheckBox barcelonaCheckBox = (CheckBox)findViewById(R.id.barcelona_checkbox);
        CheckBox pragueCheckBox = (CheckBox)findViewById(R.id.prague_checkbox);
        CheckBox moscowCheckBox = (CheckBox)findViewById(R.id.moscow_checkbox);

        if(reykjavikCheckBox.isChecked() && barcelonaCheckBox.isChecked() && pragueCheckBox.isChecked() && !moscowCheckBox.isChecked()){
            return 1;
        }
        return 0;
    }

    /**
     *
     * @return 0 or 1 depending on if the user chose the correct answer or not
     */
    public int questionSix(){
        RadioButton fourRadioButton = (RadioButton)findViewById(R.id.four_radio_button);

        if(fourRadioButton.isChecked()){
            return 1;
        }
        return 0;
    }

    /**
     *
     * @return 0 or 1 depending on if the user chose the correct answer or not
     */
    public int questionSeven(){
        CheckBox italyCheckBox = (CheckBox)findViewById(R.id.italy_checkbox);
        CheckBox germanyCheckBox = (CheckBox)findViewById(R.id.germany_checkbox);
        CheckBox spainCheckBox = (CheckBox)findViewById(R.id.spain_checkbox);
        CheckBox netherlandsCheckBox = (CheckBox)findViewById(R.id.netherlands_checkbox);

        if(italyCheckBox.isChecked() && germanyCheckBox.isChecked() && spainCheckBox.isChecked() && !netherlandsCheckBox.isChecked()){
            return 1;
        }
        return 0;
    }

    /**
     *
     * @return 0 or 1 depending on if the user chose the correct answer or not
     */
    public int questionEight(){
        RadioButton michiganRadioButton = (RadioButton)findViewById(R.id.michigan_radio_button);

        if(michiganRadioButton.isChecked()){
            return 1;
        }
        return 0;
    }

    /**
     *
     * @return 0 or 1 depending on if the user chose the correct answer or not
     */
    public int questionNine(){
        EditText q9EditText = (EditText)findViewById(R.id.q9_edit_text);
        String answer = q9EditText.getText().toString().toLowerCase();    //Extracts string and sets to lower case to make sure user gets credit for answer if there are upper case letters

        if(answer.equals("arizona")){
            return 1;
        }
        return 0;
    }

    /**
     *
     * @return 0 or 1 depending on if the user chose the correct answer or not
     */
    public int questionTen(){
        RadioButton nileRadioButton = (RadioButton)findViewById(R.id.nile_radio_button);

        if(nileRadioButton.isChecked()){
            return 1;
        }
        return 0;
    }
}
