package com.MBP.baseapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class msgboxActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_msgbox);

        final Button button1=(Button) findViewById(R.id.msgbutton);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String[] versionArray = new String[] {"Q(10)","R(11)","S(12)"};
                final boolean[] checkArray = new boolean[]{true,false,false};
                AlertDialog.Builder dlg= new AlertDialog.Builder(msgboxActivity.this);
                dlg.setTitle("좋아하는 버전은?");
                dlg.setIcon(R.mipmap.ic_launcher);
                dlg.setMultiChoiceItems(versionArray, checkArray, new DialogInterface.OnMultiChoiceClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i, boolean b) {
                        button1.setText(versionArray[i]);
                    }
                });
                dlg.setPositiveButton("닫기",null);
                dlg.show();
            }
        });
    }
}