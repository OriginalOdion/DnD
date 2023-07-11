package com.example.dd.layout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.dd.classes.CharacterClass;
import com.example.dd.classes.Fighter;
import com.example.dd.classes.Rogue;
import com.example.dd.R;

public class ClassSelection extends AppCompatActivity implements View.OnClickListener{

    Button btnFighter;
    Button btnRogue ;
    Bundle characterInfo;
    CharacterClass selectedClass;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.class_selection);

        btnFighter = findViewById(R.id.btnFighter);
        btnRogue = findViewById(R.id.btnRogue);
        characterInfo = new Bundle();


        btnFighter.setOnClickListener(this);
        btnRogue.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.btnFighter:
                selectedClass = new Fighter();
                characterInfo.putString("SelectedClass", selectedClass.getName());
                //Toast.makeText(this, "You have selected Fighter", Toast.LENGTH_SHORT).show();
                launchRaceSelection();
                break;
            case R.id.btnRogue:
                selectedClass = new Rogue();
                characterInfo.putString("SelectedClass", selectedClass.getName());
                launchRaceSelection();
                //Toast.makeText(this, "You have selected Rogue", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    private void launchRaceSelection() {
        Intent raceSelectionIntent = new Intent(this, RaceSelection.class);
        raceSelectionIntent.putExtras(characterInfo);
        startActivity(raceSelectionIntent);
    }

}
