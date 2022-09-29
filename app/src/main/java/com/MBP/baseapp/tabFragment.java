package com.MBP.baseapp;

import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public class tabFragment extends androidx.fragment.app.Fragment {

   String tabName;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle data=getArguments();
        tabName=data.getString("tabName");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.MATCH_PARENT);
        LinearLayout baseLayout=new LinearLayout(super.getActivity());
        baseLayout.setOrientation(LinearLayout.VERTICAL);
        baseLayout.setLayoutParams(params);

        if(tabName=="음악별") baseLayout.setBackgroundColor(Color.RED);
        if(tabName=="가수별") baseLayout.setBackgroundColor(Color.BLUE);
        if(tabName=="앨범별") baseLayout.setBackgroundColor(Color.GREEN);
        return baseLayout;
    }
}