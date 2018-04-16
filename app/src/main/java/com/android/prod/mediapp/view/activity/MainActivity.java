package com.android.prod.mediapp.view.activity;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;

import com.android.prod.mediapp.R;
import com.github.jhonnyx2012.horizontalpicker.DatePickerListener;
import com.github.jhonnyx2012.horizontalpicker.HorizontalPicker;

import org.joda.time.DateTime;

public class MainActivity extends AppCompatActivity implements DatePickerListener {

    FloatingActionButton fab;
    FloatingActionButton fab_add_medication;
    FloatingActionButton fab_edit_medication;
    LinearLayout LL_add_medication;
    LinearLayout LL_edit_medication;
    boolean isFABOpen=false;
    View fabBGLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HorizontalPicker picker = findViewById(R.id.datePicker);

        picker
                .setListener(this)
                .init();


    }


    private void INIT(){

    }


    @Override
    public void onDateSelected(DateTime dateSelected) {
        Log.i("Horizontal picker", "selected date is " + dateSelected.toString());
    }
}
