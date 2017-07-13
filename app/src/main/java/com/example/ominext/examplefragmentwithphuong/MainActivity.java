package com.example.ominext.examplefragmentwithphuong;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button buttonNext;
    Button buttonBack;
    Button buttonApply;


    EditText edtName;
    EditText edtAge;

    Fragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonNext = (Button) findViewById(R.id.button_next);
        buttonBack = (Button) findViewById(R.id.button_back);

        FragmentManager fragmentManager = getSupportFragmentManager();
        final FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.frame_layout, fmFirst.newInstance());
        fragmentTransaction.commit();
        fragment = null;

        buttonNext.setOnClickListener(this);
        buttonBack.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_next:
                FragmentManager fragmentManager1 = getSupportFragmentManager();
                final FragmentTransaction fragmentTransaction1 = fragmentManager1.beginTransaction();
                fragmentTransaction1.add(R.id.frame_layout, fmDefault.newInstance());
                fragmentTransaction1.commit();
                break;
            case R.id.button_back:
                FragmentManager fragmentManager2 = getSupportFragmentManager();
                final FragmentTransaction fragmentTransaction2 = fragmentManager2.beginTransaction();
                fragmentTransaction2.add(R.id.frame_layout, fmFirst.newInstance());
                fragmentTransaction2.commit();
                break;
            default:
                break;
        }
    }
}
