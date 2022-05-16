package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnPlus, btnMinus, btnMult, btnDivide, btnCLR, btnDecimal, btnEqual;

    TextView display;

    double val1, val2;

    boolean add, sub, mul, div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnPlus = findViewById(R.id.btnPlus);
        btnMinus = findViewById(R.id.btnMinus);
        btnMult = findViewById(R.id.btnMult);
        btnDivide = findViewById(R.id.btnDivide);
        btnCLR = findViewById(R.id.btnCLR);
        btnDecimal = findViewById(R.id.btnDecimal);
        btnEqual = findViewById(R.id.btnEqual);

        display = new TextView(this);
        display = findViewById(R.id.displayScreen);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { display.setText(display.getText() + "0"); }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "9");
            }
        });

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (display == null) {
                    display.setText("");
                }
                else {
                    add = true;
                    val1 = Double.parseDouble(display.getText() + "");
                    display.setText(null);
                }
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (display == null) {
                    display.setText("");
                }
                else {
                    sub = true;
                    val1 = Double.parseDouble(display.getText() + "");
                    display.setText(null);
                }
            }
        });

        btnMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (display == null) {
                    display.setText("");
                }
                else {
                    mul = true;
                    val1 = Double.parseDouble(display.getText() + "");
                    display.setText(null);
                }
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (display == null) {
                    display.setText("");
                }
                else {
                    div = true;
                    val1 = Double.parseDouble(display.getText() + "");
                    display.setText(null);
                }
            }
        });

        btnCLR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText("");
            }
        });

        btnDecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + ".");
            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val2 = Double.parseDouble(display.getText() + "");

                if (add == true) {
                    display.setText(val1 + val2 + "");
                    add = false;
                }
                else if (sub = true) {
                    display.setText(val1 - val2 + "");
                    sub = false;
                }
                else if (mul = true) {
                    display.setText(val1 * val2 + "");
                    mul = false;
                }
                else if (div = true) {
                    display.setText(val1 / val2 + "");
                    div = false;
                }
            }
        });
    }
}
