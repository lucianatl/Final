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
                }
                if (selectedId == R.id.PinyinSide1) {
                    //method translate eng-> characters
                    // method translate characters -> Pinyin
                }

                if (selectedId2 == R.id.CharactersSide2) {
                    //method translate eng->characters
                }
                if (selectedId2 == R.id.PinyinSide2) {
                    //method translate eng->Pinyin
                }


                intent.putExtra("englishArray", englishArray);


                //go to flashcards class
                startActivity(intent);








            }

        });

    }
}
