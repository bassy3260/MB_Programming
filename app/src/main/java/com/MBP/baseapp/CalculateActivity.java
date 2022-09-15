package com.MBP.baseapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalculateActivity extends AppCompatActivity {

    EditText edit1,edit2;
    Button btnAdd,btnSub,btnMul,btnDiv;
    TextView textResult;
    String num1,num2;
    Integer result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate);

        setTitle("초간단 계산기");

        edit1=(EditText) findViewById(R.id.Edit1);
        edit2=(EditText) findViewById(R.id.Edit2);
        textResult=(TextView)findViewById(R.id.TextResult);

        btnAdd=(Button) findViewById(R.id.BtnAdd);
        btnAdd.setBackgroundColor(Color.GRAY);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1= edit1.getText().toString();
                num2= edit2.getText().toString();
                result=Integer.parseInt(num1) +Integer.parseInt(num2);
                textResult.setText("계산결과: "+ result.toString());
            }
        });

        btnSub=(Button) findViewById(R.id.BtnSub);
        btnSub.setBackgroundColor(Color.GRAY);
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1= edit1.getText().toString();
                num2= edit2.getText().toString();
                result=Integer.parseInt(num1) -Integer.parseInt(num2);
                textResult.setText("계산결과: "+ result.toString());
            }
        });

        btnMul=(Button) findViewById(R.id.BtnMul);
        btnMul.setBackgroundColor(Color.GRAY);
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1= edit1.getText().toString();
                num2= edit2.getText().toString();
                result=Integer.parseInt(num1) * Integer.parseInt(num2);
                textResult.setText("계산결과: "+ result.toString());
            }
        });
        btnDiv=(Button) findViewById(R.id.BtnDiv);
        btnDiv.setBackgroundColor(Color.GRAY);
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1= edit1.getText().toString();
                num2= edit2.getText().toString();
                result=Integer.parseInt(num1) /Integer.parseInt(num2);
                textResult.setText("계산결과: "+ result.toString());
            }
        });
    }
}