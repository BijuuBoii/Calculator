package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText edtA, edtB, edtRS;
    Button btnAdd, btnSub, btnMul, btnDivide;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAdd = findViewById(R.id.btnAdd);
        btnSub = findViewById(R.id.btnSub);
        btnMul  = findViewById(R.id.btnMulti);
        btnDivide = findViewById(R.id.btnDivide);
        edtA = findViewById(R.id.txtA);
        edtB = findViewById(R.id.txtB);
        edtRS = findViewById(R.id.txtResult);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt("0" + edtA.getText());
                int b = Integer.parseInt("0" + edtB.getText());
                edtRS.setText(a+b);
            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt("0" + edtA.getText());
                int b = Integer.parseInt("0" + edtB.getText());
                edtRS.setText(a-b);
            }
        });
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt("0" + edtA.getText());
                int b = Integer.parseInt("0" + edtB.getText());
                edtRS.setText(a*b);
            }
        });
        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt("0" + edtA.getText());
                int b = Integer.parseInt("0" + edtB.getText());
                if(b == 0)
                    edtRS.setText("B phải != 0");
                else
                    edtRS.setText(a*b);
            }
        });
    }
}