package com.example.dd.layout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.dd.R;
import com.example.dd.races.HalflingLightfoot;
import com.example.dd.races.HalflingStout;
import com.example.dd.races.Human;
import com.example.dd.races.Race;

public class RaceSelection extends AppCompatActivity implements View.OnClickListener{
    Button btnHuman;
    Button btnHalfling;
    RadioGroup rgHalflingSubraces;
    RadioButton rbtLightfootHalfling ;
    RadioButton rbtStoutHalfling;
    Button btnBack;
    Button btnConfirmRace;
    Race selectedRace;
    Bundle characterInfo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.race_selection);

        btnHuman = findViewById(R.id.btnHuman);
        btnHalfling = findViewById(R.id.btnHalfling);
        rbtLightfootHalfling = findViewById(R.id.rbtLightfootHalfling);
        rbtStoutHalfling = findViewById(R.id.rbtStoutHalfling);
        btnBack = findViewById(R.id.btnBacktoClass);
        rgHalflingSubraces = findViewById(R.id.rgHalflingSubraces);
        btnConfirmRace = findViewById(R.id.confirmRace);


        btnHuman.setOnClickListener(this);
        btnHalfling.setOnClickListener(this);
        rbtLightfootHalfling.setOnClickListener(this);
        btnBack.setOnClickListener(this);
        rbtStoutHalfling.setOnClickListener(this);
        btnConfirmRace.setOnClickListener(this);
        characterInfo = new Bundle();
        characterInfo = getIntent().getExtras();
        //characterInfo.putString("SelectedClass", getIntent().getExtras().getString("SelectedClass"));


    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.btnHuman:
                Toast.makeText(this, "You have selected Human", Toast.LENGTH_SHORT).show();
                selectedRace = new Human();
                characterInfo.putString("Race", selectedRace.getName());
                rgHalflingSubraces.setVisibility(View.GONE);
                rbtLightfootHalfling.setChecked(false);
                rbtStoutHalfling.setChecked(false);
                break;
            case R.id.btnHalfling:
                rgHalflingSubraces.setVisibility(View.VISIBLE);
                rbtLightfootHalfling.setChecked(false);
                rbtStoutHalfling.setChecked(false);
                break;
            case R.id.rbtLightfootHalfling:
                Toast.makeText(this, "You have selected Lightfoot Halfling", Toast.LENGTH_SHORT).show();
                selectedRace = new HalflingLightfoot();
                characterInfo.putString("Race", selectedRace.getName());
                break;
            case R.id.rbtStoutHalfling:
                Toast.makeText(this, "You have selected Stout Halfling", Toast.LENGTH_SHORT).show();
                selectedRace = new HalflingStout();
                characterInfo.putString("Race", selectedRace.getName());
                break;
            case R.id.btnBacktoClass:
                launchMainMenuActivity();
                break;
            case R.id.confirmRace:
                launchStatScreen();
        }
    }

    private void launchStatScreen() {
        Intent statSelectionIntent = new Intent(this, StatSelection.class);
        statSelectionIntent.putExtras(characterInfo);
        startActivity(statSelectionIntent);
    }

    private void launchMainMenuActivity() {
        Intent classSelectionIntent = new Intent(this, ClassSelection.class);
        startActivity(classSelectionIntent);
    }
}
