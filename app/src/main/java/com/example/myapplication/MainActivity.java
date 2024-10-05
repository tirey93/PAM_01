package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private Button mButton;
    private TextView vText;
    private int numbers = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButton =  findViewById(R.id.button);//przypisanie przycisku z view
        vText =  findViewById(R.id.text);

        if (savedInstanceState != null){
           numbers = savedInstanceState.getInt("text");
        }
        mButton.setOnClickListener(v -> {
            vText.setText("Clicked " + numbers + " times");
            numbers++;
        });

    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        outState.putInt("text", numbers);
        super.onSaveInstanceState(outState);
    }
}