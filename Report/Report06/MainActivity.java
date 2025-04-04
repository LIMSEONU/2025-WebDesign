package com.example.counter;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private int counter = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        TextView textCounter = findViewById(R.id.TextView1);
        Button btnUp = findViewById(R.id.Button01);
        Button btnDown = findViewById(R.id.Button02);

        textCounter.setText("카운터 : " + counter);

        btnUp.setOnClickListener(v -> {
            counter++;
            textCounter.setText("카운터 : " + counter);
        });

        btnDown.setOnClickListener(v -> {
            if (counter > 0) {
                counter--;
                textCounter.setText("카운터 : " + counter);
            }
        });
    }
}