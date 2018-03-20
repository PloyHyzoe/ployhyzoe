package com.example.administrator.ployhyzoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.administrator.ployhyzoe.fregment.MainFregment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//          Add fragment to Activity
        if (savedInstanceState == null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .add (R.id.contentmainfragment,new MainFregment())
                    .commit();



        }



    } // main medthod






} // main class
