package com.example.kibsoft.MyFragment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        init();
    }

//    private void init() {
//        Button b_one =findViewById(R.id.button1);
//        b_one.setOnClickListener(this);
//        Button b_two =findViewById(R.id.button2);
//        b_two.setOnClickListener(this);
//        android.support.v4.app.Fragment fragment =findViewById(R.id.fragment_place);
//    }

//    @Override
//    public void onClick(View view) {
//        android.support.v4.app.Fragment fragment;
//        android.support.v4.app.FragmentManager fm =getSupportFragmentManager();
//        android.support.v4.app.FragmentTransaction ft =fm.beginTransaction();
//        switch (view.getId()){
//            case R.id.button1:
//                fragment= new FragmentOne();
//                ft.replace(R.id.fragment_place, fragment);
////                FragmentManager fm =getFragmentManager();
////                FragmentTransaction ft =fm.beginTransaction();
////                ft.replace(R.id.fragment_place, fragment);
//                ft.commit();
//                break;
//            case R.id.button2:
//                fragment= new FragmentTwo();
//                ft.replace(R.id.fragment_place, fragment);
//                break;
//        }
//    }

    public void ChangeFragment(View view){
        android.support.v4.app.Fragment fragment;
        if(view ==findViewById(R.id.button1)){
            fragment= new FragmentOne();
            android.support.v4.app.FragmentManager fm =getSupportFragmentManager();
            android.support.v4.app.FragmentTransaction ft =fm.beginTransaction();
            ft.replace(R.id.fragment_place, fragment);
            ft.commit();
        }else if(view ==findViewById(R.id.button2)){
            fragment= new FragmentTwo();
            android.support.v4.app.FragmentManager fm =getSupportFragmentManager();
            android.support.v4.app.FragmentTransaction ft =fm.beginTransaction();
            ft.replace(R.id.fragment_place, fragment);
            ft.commit();

        }
    }

}
