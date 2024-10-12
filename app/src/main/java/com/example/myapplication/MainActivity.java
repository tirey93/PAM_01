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
    private Button bEqual;
    private Button bViewModel;
    private Button bFragment;
    private TextView vText;
    private int numbers = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bCounter =  findViewById(R.id.button);//przypisanie przycisku z view
        bActivity2 =  findViewById(R.id.button2);
        bFinish =  findViewById(R.id.buttonFinish);
        bEqual =  findViewById(R.id.buttonEqual);
        bViewModel =  findViewById(R.id.buttonViewModel);
        bFragment =  findViewById(R.id.buttonFragment);
        vText =  findViewById(R.id.text);

        if (savedInstanceState != null){
           numbers = savedInstanceState.getInt("text");
        }
        if(bCounter != null)
            bCounter.setOnClickListener(v -> {
                vText.setText("Clicked " + numbers + " times");
                numbers++;
            });

        if(bActivity2 != null)
            bActivity2.setOnClickListener(v -> {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
    //            finish();
            });

        if(bEqual != null)
            bEqual.setOnClickListener(v -> {
                Intent intent = new Intent(MainActivity.this, MainActivity3.class);
                startActivity(intent);
            });

        if(bFinish != null)
            bFinish.setOnClickListener(v -> {
                finish();
            });

        if(bViewModel != null)
            bViewModel.setOnClickListener(v -> {
                Intent intent = new Intent(MainActivity.this, MainActivity4.class);
                startActivity(intent);
            });

        if(bFragment != null)
            bFragment.setOnClickListener(v -> {
                Intent intent = new Intent(MainActivity.this, MainActivity5.class);
                startActivity(intent);
            });

    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        outState.putInt("text", numbers);
        super.onSaveInstanceState(outState);
    }
}