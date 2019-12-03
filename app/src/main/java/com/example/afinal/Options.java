package com.example.afinal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import androidx.appcompat.app.AppCompatActivity;

public class Options extends AppCompatActivity {

    private int numberOfCheckboxesChecked = 0;
}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final Button Start = findViewById(R.id.Start);
        Start.setOnClickListener(unused -> startActivity(new Intent(this, Flashcards.class)));
    }
    public void onCheckboxClicked(View view) {

        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();
        final CheckBox Pinyin = findViewById(R.id.Pinyin);
        if (checked && numberOfCheckboxesChecked >= 2) {
            Pinyin.setChecked(false);
        } else {
            if (checked) {
                numberOfCheckboxesChecked++;
            } else {
                numberOfCheckboxesChecked--;
            }
        }


        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.English:
                if (checked) {

                }
                // Put some meat on the sandwich
            else {

                }
                // Remove the meat
                break;
            case R.id.Characters:
                if (checked) {

                }
                // Cheese me
            else
                // I'm lactose intolerant
                break;
            case R.id.Pinyin:
                if (checked) {

                }
                // Cheese me
            else {

                }
                // I'm lactose intolerant
                break;
            // TODO: Veggie sandwich
        }
    }
}
