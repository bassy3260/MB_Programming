package com.MBP.baseapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.FileInputStream;
import java.io.IOException;

public class sdCardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sd_card);
        Button btnRead;
        final EditText edtSD;

        btnRead=(Button) findViewById(R.id.btnRead1);
        edtSD=(EditText) findViewById(R.id.edtSD);

        ActivityCompat.requestPermissions(this,new String[]{android.Manifest.permission.WRITE_EXTERNAL_STORAGE},MODE_PRIVATE);
        btnRead.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    FileInputStream inFs= new FileInputStream("/storage/emulated/0/sd_test.txt");
                    byte[] txt= new byte[inFs.available()];
                    inFs.read(txt);
                    edtSD.setText(new String(txt));
                    inFs.close();
                }catch (IOException e){

                }
            }
        });
    }
}