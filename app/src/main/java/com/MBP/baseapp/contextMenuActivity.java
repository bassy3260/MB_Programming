package com.MBP.baseapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class contextMenuActivity extends AppCompatActivity {

    LinearLayout baseLayout1;
    Button menubtn2,menubtn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_context_menu);

        setTitle("배경색 바꾸기(컨텍스트 메뉴)");
        baseLayout1 =(LinearLayout) findViewById(R.id.baseLayout1);
        menubtn2=(Button) findViewById(R.id.menubtn2);
        registerForContextMenu(menubtn2);
        menubtn3=(Button) findViewById(R.id.menubtn3);
        registerForContextMenu(menubtn3);

    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        MenuInflater menuInflater=getMenuInflater();
        if(v==menubtn2) {
            menu.setHeaderTitle("배경색 변경");

            menuInflater.inflate(R.menu.contextmenu1, menu);
        }
        if(v==menubtn3){
            menuInflater.inflate(R.menu.contextmenu2,menu);
        }
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId())
        {
            case R.id.itemRed:
                baseLayout1.setBackgroundColor(Color.RED);
                return true;

            case R.id.itemBlue:
                baseLayout1.setBackgroundColor(Color.BLUE);
                return true;

            case R.id.itemGreen:
                baseLayout1.setBackgroundColor(Color.GREEN);
                return true;

            case R.id.subRotate1:
                menubtn3.setRotation(45);
                return true;
            case R.id.subSize1:
                menubtn3.setScaleX(2);
                return true;

        }
        return false;
    }
}