package com.MBP.baseapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button1,button2,button3,button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1= (Button) findViewById(R.id.button1);
        button1.setBackgroundColor(Color.GRAY);
        button1.setTextColor(Color.BLACK);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mintent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.nate.com"));
                startActivity(mintent);
                Toast.makeText(getApplicationContext(),"네이트로 이동합니다.",Toast.LENGTH_SHORT).show();
            }
        });

        button2= (Button) findViewById(R.id.button2);
        button2.setBackgroundColor(Color.GREEN);
        button2.setTextColor(Color.BLACK);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mintent = new Intent(Intent.ACTION_VIEW,Uri.parse("tel:/911"));
                startActivity(mintent);
                Toast.makeText(getApplicationContext(),"911로 연결합니다.",Toast.LENGTH_SHORT).show();
            }
        });
        button3= (Button) findViewById(R.id.button3);
        button3.setBackgroundColor(Color.RED);
        button3.setTextColor(Color.BLACK);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mintent = new Intent(Intent.ACTION_VIEW,Uri.parse("content://media/internal/images/media"));
                startActivity(mintent);
                Toast.makeText(getApplicationContext(),"갤러리로 이동합니다.",Toast.LENGTH_SHORT).show();
            }
        });
        button4= (Button) findViewById(R.id.button4);
        button4.setBackgroundColor(Color.YELLOW);
        button4.setTextColor(Color.BLACK);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                Toast.makeText(getApplicationContext(),"종료합니다.",Toast.LENGTH_SHORT).show();
            }
        });
    }



}