package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button button;
    EditText edit;
    TextView view;

    int random = (int)(Math.random()*100)+1;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.btn);
        edit = findViewById(R.id.edit);
        view = findViewById(R.id.text);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputText = edit.getText().toString();
                if (inputText.isEmpty()) {
                    view.setText("숫자 입력해주세요!");
                    return;
                }

                int guess = Integer.parseInt(inputText);
                if (random > guess) {
                    view.setText("Low!!");
                } else if (random < guess) {
                    view.setText("High!!");
                } else {
                    view.setText("Good!!");
                }
            }
        });
    }
}