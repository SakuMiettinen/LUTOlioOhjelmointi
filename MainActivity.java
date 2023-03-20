package com.example.week8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText number1;
    private EditText number2;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1 = findViewById(R.id.Number1);
        number2 = findViewById(R.id.Number2);
        result = findViewById(R.id.Result);
    }

    public void doAddition(View view) {
        result.setText(Integer.toString(Integer.parseInt(String.valueOf(number1.getText())) + Integer.parseInt(String.valueOf(number2.getText()))));
    }

    public void doSubtraction(View view) {
        result.setText(Integer.toString(Integer.parseInt(String.valueOf(number1.getText())) - Integer.parseInt(String.valueOf(number2.getText()))));
    }

    public void doMultiplication(View view) {
        result.setText(Integer.toString(Integer.parseInt(String.valueOf(number1.getText())) * Integer.parseInt(String.valueOf(number2.getText()))));
    }

    public void doDivision(View view) {
        result.setText(Float.toString(Float.parseFloat(String.valueOf(number1.getText())) / Float.parseFloat(String.valueOf(number2.getText()))));
    }
}