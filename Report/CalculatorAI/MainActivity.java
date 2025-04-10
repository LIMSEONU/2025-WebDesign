package com.example.calai;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView display;
    private String current = "";
    private String operator = "";
    private double result = 0;
    private boolean isOperatorPressed = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = findViewById(R.id.display);
    }

    public void onDigitClick(View view) {
        Button button = (Button) view;
        String digit = button.getText().toString();

        if (isOperatorPressed) {
            current = "";
            isOperatorPressed = false;
        }

        current += digit;
        display.setText(current);
    }

    public void onOperatorClick(View view) {
        Button button = (Button) view;
        operator = button.getText().toString();
        result = Double.parseDouble(current);
        isOperatorPressed = true;
    }

    public void onEqualClick(View view) {
        double secondOperand = Double.parseDouble(current);

        switch (operator) {
            case "+":
                result += secondOperand;
                break;
            case "-":
                result -= secondOperand;
                break;
            case "*":
                result *= secondOperand;
                break;
            case "/":
                if (secondOperand != 0) {
                    result /= secondOperand;
                } else {
                    display.setText("오류");
                    return;
                }
                break;
        }

        display.setText(String.valueOf(result));
        current = String.valueOf(result);
    }

    public void onClear(View view) {
        current = "";
        operator = "";
        result = 0;
        display.setText("0");
    }
}
