package com.android.prod.mediapp.view.activity;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

import com.android.prod.mediapp.R;

public class MainActivity extends AppCompatActivity {

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

        INIT();
    }


    private void INIT(){

        fabBGLayout=findViewById(R.id.fabBGLayout);
        fab = findViewById(R.id.fab);
        fab_add_medication = findViewById(R.id.fab_Add_Reminder);
        fab_edit_medication = findViewById(R.id.fab_Edit_Reminder);

        LL_add_medication = findViewById(R.id.fabLayout1);
        LL_edit_medication = findViewById(R.id.fabLayout2);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!isFABOpen){
                    showFabMenu();
                }
            }
        });

    }

    public void showFabMenu(){
        isFABOpen = true;
        fabBGLayout.setVisibility(View.VISIBLE);

        LL_add_medication.setVisibility(View.VISIBLE);
        LL_edit_medication.setVisibility(View.VISIBLE);

        fab.animate().rotationBy(180);
        fab_add_medication.animate().translationY(-55);
        fab_edit_medication.animate().translationY(-100);

    }
}
