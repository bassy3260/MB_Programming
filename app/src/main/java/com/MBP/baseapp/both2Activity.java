package com.MBP.baseapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class both2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_both2);
        setTitle("Second 액티비티");

        Intent inintent =getIntent();
        final int hapValue=inintent.getIntExtra("Num1",0)+inintent.getIntExtra("Num2",0);

        Button btnReturn = (Button) findViewById(R.id.btnReturn2);

        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent outIntent=new Intent(getApplicationContext(),bothActivity.class);
                outIntent.putExtra("Hap",hapValue);
                setResult(RESULT_OK,outIntent);
                finish();
            }
        });
    }
}