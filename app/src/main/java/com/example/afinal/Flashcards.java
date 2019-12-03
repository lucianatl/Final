package com.example.afinal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Flashcards extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //setContentView(R.layout.activity_main);

        final Button Flashcard = findViewById(R.id.Flashcard);
        final Button Previous = findViewById(R.id.Previous);
        final Button Next = findViewById(R.id.Next);
        final Button menu = findViewById(R.id.menu);

        Flashcard.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Flashcard.setText("changed");
            }
        });
        Previous.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Previous.setText("changed");
            }
        });
        menu.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                menu.setText("changed");
            }
        });
        Next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Next.setText("changed");
            }
        });
    }
}
