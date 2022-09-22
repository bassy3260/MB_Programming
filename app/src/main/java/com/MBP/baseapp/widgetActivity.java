package com.MBP.baseapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.Chronometer;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.TimePicker;

import java.sql.Time;

public class widgetActivity extends AppCompatActivity {
    Chronometer chrono;
    Button btnStart,btnEnd;
    RadioButton rdoCal, rdoTime;
    CalendarView calView;
    TimePicker tPicker;
    TextView tvYear,tvMonth,tvDay,tvHour,tvMinute;
    int selectYear,selectMonth, selectDay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        setContentView(R.layout.activity_widget);

        super.onCreate(savedInstanceState);

        setTitle("시간 예약");

        btnStart=(Button) findViewById(R.id.btnStart);
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chrono.setBase(SystemClock.elapsedRealtime());
                chrono.start();
                chrono.setTextColor(Color.RED);
            }
        });
        btnEnd=(Button) findViewById(R.id.btnEnd);

        btnEnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chrono.stop();
                chrono.setTextColor(Color.BLUE);
            }
        });
        tvYear=(TextView) findViewById(R.id.tvYear);
        tvDay=(TextView) findViewById(R.id.tvDay);
        tvMonth=(TextView) findViewById(R.id.tvMonth);
        tPicker=(TimePicker) findViewById(R.id.timePicker1);
        calView=(CalendarView)findViewById(R.id.calendarView1);
        tPicker.setVisibility(View.INVISIBLE);
        calView.setVisibility(View.INVISIBLE);

        rdoCal = (RadioButton)findViewById(R.id.rdoCal);
        rdoCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tPicker.setVisibility(View.INVISIBLE);
                calView.setVisibility(View.VISIBLE);
            }
        });
        rdoTime=(RadioButton) findViewById(R.id.rdoTime);
        rdoTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calView.setVisibility(View.INVISIBLE);
                tPicker.setVisibility(View.VISIBLE);
            }
        });

        calView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int year, int month, int dayOfMonth) {
                selectYear=year;
                selectMonth= month+1;
                selectDay=dayOfMonth;
            }
        });

        chrono=(Chronometer) findViewById(R.id.chronometer1);


        tvYear.setText(Integer.toString(selectYear));
        tvMonth.setText(Integer.toString(selectMonth));

        tvDay.setText(Integer.toString(selectDay));
        tvHour=(TextView) findViewById(R.id.tvHour);
        tvHour.setText(Integer.toString(tPicker.getCurrentHour()));
        tvMinute=(TextView) findViewById(R.id.tvMinute);
        tvMinute.setText(Integer.toString(tPicker.getCurrentMinute()));



    }
}