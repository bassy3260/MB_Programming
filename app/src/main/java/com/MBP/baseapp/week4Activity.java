package com.MBP.baseapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class week4Activity extends AppCompatActivity {

    TextView tvName,tvEmail;
    Button button1;
    EditText dlgEdtName,dlgEdtEmail;
    TextView toastText;
    View dialogView,toastView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_week4);

        setTitle("사용자 정보 입력");

        tvName=(TextView) findViewById(R.id.tvName);
        tvEmail=(TextView) findViewById(R.id.tvEmail);
        button1=(Button) findViewById(R.id.herebtn);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialogView=(View) View.inflate(week4Activity.this,R.layout.dialog1,null);

                AlertDialog.Builder dlg= new AlertDialog.Builder(week4Activity.this);
                dlg.setTitle("사용자 정보 입력");
                dlg.setIcon(R.drawable.ic_launcher_foreground);

                dlg.setView(dialogView);

                dlg.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dlgEdtName=(EditText) dialogView.findViewById(R.id.dlgEdt1);
                        dlgEdtEmail=(EditText) dialogView.findViewById(R.id.dlgEdt2);

                        tvName.setText(dlgEdtName.getText().toString());
                        tvEmail.setText(dlgEdtEmail.getText().toString());
                    }
                });

                dlg.setNegativeButton("취소", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast toast = new Toast(week4Activity.this);
                        toastView=(View) View.inflate(week4Activity.this,R.layout.toast1,null);
                        toastText = (TextView) toastView.findViewById(R.id.toastText1);
                        toastText.setText("취소했습니다.");
                        toast.setView(toastView);
                        toast.show();
                    }
                });
                dlg.show();

            }
        });
    }
}