package com.iics1154ita.gazo.daniellefrancisco.labact3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.io.FileInputStream;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setTitle("School Website");
        try{
            Generate();
        } catch (Exception e){
            Toast.makeText(this,e.getMessage(),Toast.LENGTH_LONG).show();
        }
    }

    public void Generate() throws Exception{
        String FILENAME = "test.txt";
        FileInputStream fin = openFileInput(FILENAME);
        int c;
        String temp = "";
        while( (c = fin.read()) != -1) {
            temp += Character.toString((char)c);
        }
        fin.close();
        if(temp.length() > 0){
            String[] test = temp.split(",");
            ((Button)(findViewById(R.id.b1))).setText(test[0]);
            ((Button)(findViewById(R.id.b2))).setText(test[1]);
            ((Button)(findViewById(R.id.b3))).setText(test[2]);
            ((Button)(findViewById(R.id.b4))).setText(test[3]);
            ((Button)(findViewById(R.id.b5))).setText(test[4]);
            ((Button)(findViewById(R.id.b6))).setText(test[5]);
            ((Button)(findViewById(R.id.b7))).setText(test[6]);
            ((Button)(findViewById(R.id.b8))).setText(test[7]);
        } else {
            Toast.makeText(this, "no content", Toast.LENGTH_LONG).show();
        }
    }

    private String GetSite(String string){
        String website = "";
        switch (string){
            case "UST":
            case "ust":
                website = "http://www.ust.edu.ph";
                break;
            case "UP":
            case "up":
                website = "https://www.up.edu.ph";
                break;
            case "NU":
            case "nu":
                website = "https://www.national-u.edu.ph";
                break;
            case "DLSU":
            case "dlsu":
                website = "https://www.dlsu.edu.ph";
                break;
            case "ADMU":
            case "admu":
                website = "http://www.ateneo.edu";
                break;
            case "UE":
            case "ue":
                website = "https://www.ue.edu.ph";
                break;
            case "FEU":
            case "feu":
                website = "https://www.feu.edu.ph";
                break;
            case "ADU":
            case "adu":
                website = "https://www.adamson.edu.ph";
                break;
            default:
                website = "https://www.google.com/search?q=" + string;
                break;
        }
        return website;
    }

    public void B1(View v){
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(GetSite(((Button)(findViewById(R.id.b1))).getText().toString())));
        startActivity(i);
    }

    public void B2(View v){
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(GetSite(((Button)(findViewById(R.id.b2))).getText().toString())));
        startActivity(i);
    }

    public void B3(View v){
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(GetSite(((Button)(findViewById(R.id.b3))).getText().toString())));
        startActivity(i);
    }

    public void B4(View v){
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(GetSite(((Button)(findViewById(R.id.b4))).getText().toString())));
        startActivity(i);
    }

    public void B5(View v){
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(GetSite(((Button)(findViewById(R.id.b5))).getText().toString())));
        startActivity(i);
    }

    public void B6(View v){
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(GetSite(((Button)(findViewById(R.id.b6))).getText().toString())));
        startActivity(i);
    }

    public void B7(View v){
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(GetSite(((Button)(findViewById(R.id.b7))).getText().toString())));
        startActivity(i);
    }

    public void B8(View v){
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(GetSite(((Button)(findViewById(R.id.b8))).getText().toString())));
        startActivity(i);
    }

    public void Previous(View v){
        finish();
    }
}
