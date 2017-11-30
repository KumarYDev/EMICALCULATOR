package com.usermindarchive.h.emicalculator.View;


import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;

import com.usermindarchive.h.emicalculator.R;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EmiView frag=new EmiView();
//        ButterKnifeTestFragment frag=new ButterKnifeTestFragment();
        FragmentTransaction transction=getSupportFragmentManager().beginTransaction();
        transction.add(R.id.lay,frag,"Emi");
        transction.commit();


    }
}
