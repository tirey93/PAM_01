package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button bCounter;
    private Button bActivity2;
    private Button bFinish;
    private TextView vText;
    private int numbers = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bCounter =  findViewById(R.id.button);//przypisanie przycisku z view
        bActivity2 =  findViewById(R.id.button2);
        bFinish =  findViewById(R.id.buttonFinish);
        vText =  findViewById(R.id.text);

        if (savedInstanceState != null){
           numbers = savedInstanceState.getInt("text");
        }
        bCounter.setOnClickListener(v -> {
            vText.setText("Clicked " + numbers + " times");
            numbers++;
        });

        bActivity2.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            startActivity(intent);
//            finish();
        });

        bFinish.setOnClickListener(v -> {
            finish();
        });

    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        outState.putInt("text", numbers);
        super.onSaveInstanceState(outState);
    }
}