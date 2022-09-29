package com.MBP.baseapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.LinearLayout;

public class menuActivity extends AppCompatActivity {

    LinearLayout baseLayout;
    Button menubtn1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        setTitle("배경색 바꾸기");
        baseLayout =(LinearLayout) findViewById(R.id.baseLayout);
        menubtn1=(Button) findViewById(R.id.menubtn1);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater menuInflater =getMenuInflater();
        menuInflater.inflate(R.menu.menu1,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId())
        {
            case R.id.itemRed:
                baseLayout.setBackgroundColor(Color.RED);
                return true;

            case R.id.itemBlue:
                baseLayout.setBackgroundColor(Color.BLUE);
                return true;

            case R.id.itemGreen:
                baseLayout.setBackgroundColor(Color.GREEN);
                return true;

            case R.id.subRotate:
                menubtn1.setRotation(45);
                return true;
            case R.id.subSize:
                menubtn1.setScaleX(2);
                return true;

        }
        return false;
    }
}