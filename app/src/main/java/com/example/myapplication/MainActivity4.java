package com.example.myapplication;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.ViewModelProvider;

import com.example.myapplication.viewmodels.ViewModel1;

public class MainActivity4 extends AppCompatActivity {

    private Button bButton;
    private TextView vText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main4);
        bButton = findViewById(R.id.buttonViewModel1);
        vText = findViewById(R.id.textViewViewModel1);
        ViewModel1 vm = new ViewModelProvider(this).get(ViewModel1.class);
        vText.setText(String.valueOf(vm.counter));

        if(bButton != null)
            bButton.setOnClickListener(v -> {
                vm.counter++;
                vText.setText(String.valueOf(vm.counter));
            });

    }
}