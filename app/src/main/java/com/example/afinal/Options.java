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
    public void onNextClicked(View view) {


    }
}
