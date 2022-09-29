package com.MBP.baseapp;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class actionbarActivity extends AppCompatActivity implements ActionBar.TabListener {
    ActionBar.Tab tabSong,tabArtist,tabAlbum;

    tabFragment myFrags[]= new tabFragment[3];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActionBar bar= getSupportActionBar();
        bar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

        tabSong=bar.newTab();
        tabSong.setText("음악별");
        tabSong.setTabListener(this);
        bar.addTab(tabSong);

        tabArtist=bar.newTab();
        tabArtist.setText("가수별");
        tabArtist.setTabListener(this);
        bar.addTab(tabArtist);

        tabAlbum=bar.newTab();
        tabAlbum.setText("앨범별");
        tabAlbum.setTabListener(this);
        bar.addTab(tabAlbum);

    }

    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {
        tabFragment myTabFrag=null;

        if(myFrags[tab.getPosition()]==null){
            myTabFrag = new tabFragment();
            Bundle data= new Bundle();
            data.putString("tabName",tab.getText().toString());
            myTabFrag.setArguments(data);
           myFrags[tab.getPosition()] =myTabFrag;
        }else{
            myTabFrag= myFrags[tab.getPosition()];
            ft.replace(android.R.id.content,myTabFrag);
        }
        
    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {

    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {

    }

}