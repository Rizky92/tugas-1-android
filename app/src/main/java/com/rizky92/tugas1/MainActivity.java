package com.rizky92.tugas1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnPlus;
    Button btnMinus;
    Button btnMultiply;
    Button btnDivide;
    TextInputEditText etValOne;
    TextInputEditText etValTwo;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvResult = findViewById(R.id.result);

        btnPlus = findViewById(R.id.plus);
        btnPlus.setOnClickListener(this);

        btnMinus = findViewById(R.id.minus);
        btnMinus.setOnClickListener(this);

        btnMultiply = findViewById(R.id.multiply);
        btnMultiply.setOnClickListener(this);

        btnDivide = findViewById(R.id.divide);
        btnDivide.setOnClickListener(this);

        etValOne = findViewById(R.id.value_one);
        etValTwo = findViewById(R.id.value_two);
    }

    @Override
    public void onClick(View view) {
        float valOne = Float.parseFloat(etValOne.getText().toString());
        float valTwo = Float.parseFloat(etValTwo.getText().toString());

        switch (view.getId()) {
            case R.id.plus:
                tvResult.setText(String.valueOf(plus(valOne, valTwo)));
                break;

            case R.id.minus:
                tvResult.setText(String.valueOf(minus(valOne, valTwo)));
                break;

            case R.id.multiply:
                tvResult.setText(String.valueOf(multiply(valOne, valTwo)));
                break;

            case R.id.divide:
                tvResult.setText(String.valueOf(divide(valOne, valTwo)));
                break;
        }
    }

    private float plus(float one, float two) {
        return one + two;
    }

    private float minus(float one, float two) {
        return one - two;
    }

    private float multiply(float one, float two) {
        return one * two;
    }

    private float divide(float one, float two) {
        return one / two;
    }
}
