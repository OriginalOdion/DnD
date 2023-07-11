package com.example.dd.layout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.dd.R;


public class MainMenuActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnNewCharacter;
    Button btnCharacterSheets;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu);

        btnNewCharacter = findViewById(R.id.btnNewCharacter);
        btnCharacterSheets = findViewById(R.id.btnCharacterSheets);


        btnCharacterSheets.setOnClickListener(this);
        btnNewCharacter.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.btnCharacterSheets:
                Toast.makeText(this, "These are your characters", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnNewCharacter:
                //Toast.makeText(this, "Creating a new character...", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(this, ClassSelection.class);
                startActivity(intent);
                break;
        }
    }


}
