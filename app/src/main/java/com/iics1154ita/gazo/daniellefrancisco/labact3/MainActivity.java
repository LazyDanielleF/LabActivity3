package com.iics1154ita.gazo.daniellefrancisco.labact3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.FileOutputStream;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("UAAP Schools");
    }

    public void Autofill(){
        ((TextView)findViewById(R.id.t1)).setText("UST");
        ((TextView)findViewById(R.id.t2)).setText("UP");
        ((TextView)findViewById(R.id.t3)).setText("NU");
        ((TextView)findViewById(R.id.t4)).setText("DLSU");
        ((TextView)findViewById(R.id.t5)).setText("ADMU");
        ((TextView)findViewById(R.id.t6)).setText("UE");
        ((TextView)findViewById(R.id.t7)).setText("FEU");
        ((TextView)findViewById(R.id.t8)).setText("ADU");
    }

    public void Save(View view) throws Exception{
        String FILENAME = "test.txt";
        FileOutputStream fos = openFileOutput(FILENAME, Context.MODE_PRIVATE);
        String string = "";
        string += ((TextView)findViewById(R.id.t1)).getText().toString() + ",";
        string += ((TextView)findViewById(R.id.t2)).getText().toString() + ",";
        string += ((TextView)findViewById(R.id.t3)).getText().toString() + ",";
        string += ((TextView)findViewById(R.id.t4)).getText().toString() + ",";
        string += ((TextView)findViewById(R.id.t5)).getText().toString() + ",";
        string += ((TextView)findViewById(R.id.t6)).getText().toString() + ",";
        string += ((TextView)findViewById(R.id.t7)).getText().toString() + ",";
        string += ((TextView)findViewById(R.id.t8)).getText().toString();

        byte[] buf = string.getBytes();
        fos.write(buf);
        fos.close();
        Toast.makeText(this, "Saved", Toast.LENGTH_LONG).show();
    }

    public void Next(View view){
        Intent i = new Intent(this, Main2Activity.class);
        startActivity(i);
    }
}
