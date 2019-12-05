package com.example.afinal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

public class Options extends AppCompatActivity {
    final private String c = "Characters";
    final private String p = "Pinyin";
    final private String e = "English";
    private String[] pinyinArray;
    private String[] charactersArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Button Start = findViewById(R.id.Start);
        addListenerOnButton();
        //Start.setOnClickListener(unused -> startActivity(new Intent(this, Flashcards.class)));
    }
    public void addListenerOnButton() {

        RadioGroup side1Options = findViewById(R.id.side1Options);
        RadioGroup side2Options = findViewById(R.id.side2Options);
        Button Start = findViewById(R.id.Start);
        Intent received = getIntent();
        String[] englishArray = received.getStringArrayExtra("englishArray");
        Intent intent = new Intent(this, Flashcards.class);

        Start.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                // get selected radio button from radioGroup
                int selectedId = side1Options.getCheckedRadioButtonId();
                int selectedId2 = side2Options.getCheckedRadioButtonId();

                if (selectedId == R.id.CharactersSide1) {
                    //method translate eng->characters
                    charactersArray = new String[5];
                    //set side1 intent to Characters

                    intent.putExtra("side1", c);
                }
                if (selectedId == R.id.PinyinSide1) {
                    //method translate eng-> characters
                    // method translate characters -> Pinyin
                    pinyinArray = new String[5];
                    //set side1 intent to Pinyin
                    intent.putExtra("side1", p);
                }
                if (selectedId == R.id.Englishside1) {
                    //set side1 intent to English
                    intent.putExtra("side1", e);
                    intent.putExtra("englishArray", englishArray);
                }

                if (selectedId2 == R.id.CharactersSide2) {
                    //method translate eng->characters
                    charactersArray = new String[5];
                    //set side2 intent to Characters
                    intent.putExtra("side2", c);
                }
                if (selectedId2 == R.id.PinyinSide2) {
                    //method translate eng->Pinyin
                    pinyinArray = new String[5];
                    //set side2 intent to Pinyin
                    intent.putExtra("side2", p);
                }
                if (selectedId2 == R.id.EnglishSide2) {
                    //set side2 intent to English
                    intent.putExtra("side2", e);
                    intent.putExtra("englishArray", englishArray);
                }





                //go to flashcards class
                startActivity(intent);








            }

        });

    }
}
