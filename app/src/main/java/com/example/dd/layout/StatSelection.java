package com.example.dd.layout;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.dd.R;
import com.example.dd.races.HalflingLightfoot;
import com.example.dd.races.HalflingStout;
import com.example.dd.races.Human;
import com.example.dd.races.Race;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class StatSelection extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemSelectedListener {

    RadioGroup rgSelectionMethod;
    RadioButton rbtManual;
    RadioButton rbtStandard;
    RadioButton rbtPoints;
    Spinner spnSTR;
    TextView baseSTRNumber;
    TextView racialSTRNumber;
    TextView totalSTRNumber;
    TextView modSTRNumber;
    Spinner spnDEX;
    TextView baseDEXNumber;
    TextView racialDEXNumber;
    TextView totalDEXNumber;
    TextView modDEXNumber;
    Spinner spnCON;
    TextView baseCONNumber;
    TextView racialCONNumber;
    TextView totalCONNumber;
    TextView modCONNumber;
    Spinner spnINT;
    TextView baseINTNumber;
    TextView racialINTNumber;
    TextView totalINTNumber;
    TextView modINTNumber;
    Spinner spnWIS;
    TextView baseWISNumber;
    TextView racialWISNumber;
    TextView totalWISNumber;
    TextView modWISNumber;
    Spinner spnCHA;
    TextView baseCHANumber;
    TextView racialCHANumber;
    TextView totalCHANumber;
    TextView modCHANumber;
    List<String> standardArray;
    ArrayAdapter<String> adapter;
    Bundle characterInfo;
    Race selectedRace;
    HashMap<String, Integer> racialStats;


    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.standard_array_selection);


        rgSelectionMethod = findViewById(R.id.rgSelectionMethod);
        rbtManual = findViewById(R.id.manual);
        rbtStandard = findViewById(R.id.standardArray);
        rbtPoints = findViewById(R.id.pointBuy);

        spnSTR = findViewById(R.id.spnSTR);
        baseSTRNumber = findViewById(R.id.baseSTRNumber);
        racialSTRNumber = findViewById(R.id.racialSTRNumber);
        totalSTRNumber = findViewById(R.id.totalSTRNumber);
        modSTRNumber = findViewById(R.id.modifierSTRNumber);

        spnDEX = findViewById(R.id.spnDEX);
        baseDEXNumber = findViewById(R.id.baseDEXNumber);
        racialDEXNumber = findViewById(R.id.racialDEXNumber);
        totalDEXNumber = findViewById(R.id.totalDEXNumber);
        modDEXNumber = findViewById(R.id.modifierDEXNumber);

        spnCON = findViewById(R.id.spnCON);
        baseCONNumber = findViewById(R.id.baseCONNumber);
        racialCONNumber = findViewById(R.id.racialCONNumber);
        totalCONNumber = findViewById(R.id.totalCONNumber);
        modCONNumber = findViewById(R.id.modifierCONNumber);

        spnINT = findViewById(R.id.spnINT);
        baseINTNumber = findViewById(R.id.baseINTNumber);
        racialINTNumber = findViewById(R.id.racialINTNumber);
        totalINTNumber = findViewById(R.id.totalINTNumber);
        modINTNumber = findViewById(R.id.modifierINTNumber);

        spnWIS = findViewById(R.id.spnWIS);
        baseWISNumber = findViewById(R.id.baseWISNumber);
        racialWISNumber = findViewById(R.id.racialWISNumber);
        totalWISNumber = findViewById(R.id.totalWISNumber);
        modWISNumber = findViewById(R.id.modifierWISNumber);

        spnCHA = findViewById(R.id.spnCHA);
        baseCHANumber = findViewById(R.id.baseCHANumber);
        racialCHANumber = findViewById(R.id.racialCHANumber);
        totalCHANumber = findViewById(R.id.totalCHANumber);
        modCHANumber = findViewById(R.id.modifierCHANumber);

        standardArray = new ArrayList<String>(Arrays.asList("--", "15", "14", "13", "12", "10", "8"));

        adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, standardArray);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spnSTR.setAdapter(adapter);
        spnDEX.setAdapter(adapter);
        spnCON.setAdapter(adapter);
        spnINT.setAdapter(adapter);
        spnWIS.setAdapter(adapter);
        spnCHA.setAdapter(adapter);

        spnSTR.setOnItemSelectedListener(this);
        spnDEX.setOnItemSelectedListener(this);
        spnCON.setOnItemSelectedListener(this);
        spnINT.setOnItemSelectedListener(this);
        spnWIS.setOnItemSelectedListener(this);
        spnCHA.setOnItemSelectedListener(this);

        characterInfo = new Bundle();
        characterInfo = getIntent().getExtras();
        switch(characterInfo.get("Race").toString()){
            case "Human":
                selectedRace = new Human();
                racialStats = selectedRace.getRacialStats();
                fillRacialStats(racialStats);
                break;
            case "Lightfoot Halfling":
                selectedRace = new HalflingLightfoot();
                racialStats = selectedRace.getRacialStats();
                fillRacialStats(racialStats);
                break;
            case "Stout Halfling":
                selectedRace = new HalflingStout();
                racialStats = selectedRace.getRacialStats();
                fillRacialStats(racialStats);
                break;
        }
    }




    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.manual:

        }
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        //Toast.makeText(this, "Item Selected.", Toast.LENGTH_SHORT).show();
        if(adapterView.getSelectedItem().toString() != "--"){
            int id =  adapterView.getId();
            switch(id){
                case R.id.spnSTR:
                    setSTR();
                    setModSTR();
                   break;
                case R.id.spnDEX:
                    setDEX();
                    setModDEX();
                    break;
                case R.id.spnCON:
                    setCON();
                    setModCON();
                    break;
                case R.id.spnINT:
                    setINT();
                    setModINT();
                    break;
                case R.id.spnWIS:
                    setWIS();
                    setModWIS();
                    break;
                case R.id.spnCHA:
                    setCHA();
                    setModCHA();
                    break;
            }
            }else
            return;


    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    public void fillRacialStats(HashMap<String, Integer> racialStats){
        if(racialStats.containsKey("STR")){
            Integer str = racialStats.get("STR");
            racialSTRNumber.setText("+" + str);
        }
        if(racialStats.containsKey("DEX")){
            Integer dex = racialStats.get("DEX");
            racialDEXNumber.setText("+" + dex);
        }
        if(racialStats.containsKey("CON")){
            Integer con = racialStats.get("CON");
            racialCONNumber.setText("+" + con);
        }
        if(racialStats.containsKey("INT")){
            Integer inte = racialStats.get("INT");
            racialINTNumber.setText("+" + inte);
        }
        if(racialStats.containsKey("WIS")){
            Integer wis = racialStats.get("WIS");
            racialWISNumber.setText("+" + wis);
        }
        if(racialStats.containsKey("CHA")){
            Integer cha = racialStats.get("CHA");
            racialCHANumber.setText("+" + cha);
        }
    }

    public void setSTR(){
        baseSTRNumber.setText(spnSTR.getSelectedItem().toString());
        //Toast.makeText(this, "Selected Value is: " + spnDEX.getSelectedItem().toString(), Toast.LENGTH_LONG).show();
        totalSTRNumber.setText(String.valueOf(Integer.parseInt(String.valueOf(baseSTRNumber.getText())) + Integer.parseInt(String.valueOf(racialSTRNumber.getText()))));
    }

    public void setDEX(){
        baseDEXNumber.setText(spnDEX.getSelectedItem().toString());
        //Toast.makeText(this, "Selected Value is: " + spnDEX.getSelectedItem().toString(), Toast.LENGTH_LONG).show();
        totalDEXNumber.setText(String.valueOf(Integer.parseInt(String.valueOf(baseDEXNumber.getText())) + Integer.parseInt(String.valueOf(racialDEXNumber.getText()))));

    }

    public void setCON(){
        baseCONNumber.setText(spnCON.getSelectedItem().toString());
        //Toast.makeText(this, "Selected Value is: " + spnDEX.getSelectedItem().toString(), Toast.LENGTH_LONG).show();
        totalCONNumber.setText(String.valueOf(Integer.parseInt(String.valueOf(baseCONNumber.getText())) + Integer.parseInt(String.valueOf(racialCONNumber.getText()))));

    }

    public void setINT(){
        baseINTNumber.setText(spnINT.getSelectedItem().toString());
        //Toast.makeText(this, "Selected Value is: " + spnDEX.getSelectedItem().toString(), Toast.LENGTH_LONG).show();
        totalINTNumber.setText(String.valueOf(Integer.parseInt(String.valueOf(baseINTNumber.getText())) + Integer.parseInt(String.valueOf(racialINTNumber.getText()))));

    }

    public void setWIS(){
        baseWISNumber.setText(spnWIS.getSelectedItem().toString());
        //Toast.makeText(this, "Selected Value is: " + spnDEX.getSelectedItem().toString(), Toast.LENGTH_LONG).show();
        totalWISNumber.setText(String.valueOf(Integer.parseInt(String.valueOf(baseWISNumber.getText())) + Integer.parseInt(String.valueOf(racialWISNumber.getText()))));

    }

    public void setCHA(){
        baseCHANumber.setText(spnCHA.getSelectedItem().toString());
        //Toast.makeText(this, "Selected Value is: " + spnDEX.getSelectedItem().toString(), Toast.LENGTH_LONG).show();
        totalCHANumber.setText(String.valueOf(Integer.parseInt(String.valueOf(baseCHANumber.getText())) + Integer.parseInt(String.valueOf(racialCHANumber.getText()))));
    }

    private void setModSTR() {
        double number = (Double.parseDouble(String.valueOf(totalSTRNumber.getText())) - 10) / 2;
        if(number > 0){
            int mod = (int) Math.floor(number);
            String text = "+" + mod;
            modSTRNumber.setText(text);
        }else if(number < 0){
            int mod = (int) Math.floor(number);
            String text = "-" + mod;
            modSTRNumber.setText(text);
        }else{
            int mod = 0;
            modSTRNumber.setText(String.valueOf(mod));
        }
    }
    private void setModDEX() {
        double number = (Double.parseDouble(String.valueOf(totalDEXNumber.getText())) - 10) / 2;
        if(number > 0){
            int mod = (int) Math.floor(number);
            String text = "+" + mod;
            modDEXNumber.setText(text);
        }else if(number < 0){
            int mod = (int) Math.floor(number);
            String text = "-" + mod;
            modDEXNumber.setText(text);
        }else{
            int mod = 0;
            modDEXNumber.setText(String.valueOf(mod));
        }
    }
    private void setModCON() {
        double number = (Double.parseDouble(String.valueOf(totalCONNumber.getText())) - 10) / 2;
        if(number > 0){
            int mod = (int) Math.floor(number);
            String text = "+" + mod;
            modCONNumber.setText(text);
        }else if(number < 0){
            int mod = (int) Math.floor(number);
            String text = "-" + mod;
            modCONNumber.setText(text);
        }else{
            int mod = 0;
            modCONNumber.setText(String.valueOf(mod));
        }
    }
    private void setModINT() {
        double number = (Double.parseDouble(String.valueOf(totalINTNumber.getText())) - 10) / 2;
        if(number > 0){
            int mod = (int) Math.floor(number);
            String text = "+" + mod;
            modINTNumber.setText(text);
        }else if(number < 0){
            int mod = (int) Math.floor(number);
            String text = "-" + mod;
            modINTNumber.setText(text);
        }else{
            int mod = 0;
            modINTNumber.setText(String.valueOf(mod));
        }
    }
    private void setModWIS() {
        double number = (Double.parseDouble(String.valueOf(totalWISNumber.getText())) - 10) / 2;
        if(number > 0){
            int mod = (int) Math.floor(number);
            String text = "+" + mod;
            modWISNumber.setText(text);
        }else if(number < 0){
            int mod = (int) Math.floor(number);
            String text = "-" + mod;
            modWISNumber.setText(text);
        }else{
            int mod = 0;
            modWISNumber.setText(String.valueOf(mod));
        }
    }
    private void setModCHA() {
        double number = (Double.parseDouble(String.valueOf(totalCHANumber.getText())) - 10) / 2;
        if(number > 0){
            int mod = (int) Math.floor(number);
            String text = "+" + mod;
            modCHANumber.setText(text);
        }else if(number < 0){
            int mod = (int) Math.floor(number);
            String text = "-" + mod;
            modCHANumber.setText(text);
        }else {
            int mod = 0;
            modCHANumber.setText(String.valueOf(mod));
        }
    }
}
