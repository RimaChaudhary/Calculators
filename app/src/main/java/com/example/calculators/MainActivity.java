package com.example.calculators;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    TextView textbox;
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnzero,btnadd,btnsub,btnmultiply,btndivide,btnpoint,btnequalsto;
    String displayNum ="";
    int num1, num2;
    int result;
    String op;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textbox = findViewById(R.id.textbox);
        btnzero =findViewById(R.id.btnzero);
        btn1 =findViewById(R.id.btn1);
        btn2 =findViewById(R.id.btn2);
        btn3 =findViewById(R.id.btn3);
        btn4 =findViewById(R.id.btn4);
        btn5 =findViewById(R.id.btn5);
        btn6 =findViewById(R.id.btn6);
        btn7 =findViewById(R.id.btn7);
        btn8 =findViewById(R.id.btn8);
        btn9 =findViewById(R.id.btn9);
        btnpoint =findViewById(R.id.btnpoint);
        btnadd =findViewById(R.id.btnadd);
        btnsub =findViewById(R.id.btnsub);
        btnmultiply =findViewById(R.id.btnmultiply);
        btndivide =findViewById(R.id.btndivide);
        btnequalsto =findViewById(R.id.btnequallsto);


        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btnzero.setOnClickListener(this);
        btnpoint.setOnClickListener(this);
        btnadd.setOnClickListener(this);
        btnsub.setOnClickListener(this);
        btnmultiply.setOnClickListener(this);
        btndivide.setOnClickListener(this);
        btnequalsto.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn1:
                displayNum += 1;
                textbox.setText(displayNum);
                break;
            case R.id.btn2:
                displayNum += 2;
                textbox.setText(displayNum);
                break;

            case R.id.btn3:
                displayNum += 3;
                textbox.setText(displayNum);
                break;
            case R.id.btn4:
                displayNum += 4;
                textbox.setText(displayNum);
                break;
            case R.id.btn5:
                displayNum += 5;
                textbox.setText(displayNum);
                break;
            case R.id.btn6:
                displayNum += 6;
                textbox.setText(displayNum);
                break;
                case R.id.btn7:
                displayNum += 7;
                textbox.setText(displayNum);
                break;
            case R.id.btn8:
                displayNum += 8;
                textbox.setText(displayNum);
                break;

            case R.id.btn9:
                displayNum += 9;
                textbox.setText(displayNum);
                break;
            case R.id.btnzero:
                displayNum += 0;
                textbox.setText(displayNum);
                break;
            case R.id.btnadd:
                num1 = Integer.parseInt(displayNum);
                displayNum = "";
                op = "+";
                break;

            case R.id.btnsub:
                num1 = Integer.parseInt(displayNum);
                displayNum = "";
                op = "-";
                break;

            case R.id.btnmultiply:
                num1 = Integer.parseInt(displayNum);
                displayNum = "";
                op = "*";
                break;
            case R.id.btndivide:
                num1 = Integer.parseInt(displayNum);
                displayNum = "";
                op = "/";
                break;
            case R.id.btnequallsto:
                num2 = Integer.parseInt(displayNum);
                result = getResult(op,num1,num2);
                textbox.setText(String.valueOf(result));
                break;



        }

    }

    private int getResult(String op, int num1,int num2)
    {
        switch (op)
        {
            case "+":
            return num1+num2;

            case "-":
                return num1-num2;

            case "*":
                return num1*num2;
            case "/":
                return num1/num2;
                default:return 0;

        }
    }
}
