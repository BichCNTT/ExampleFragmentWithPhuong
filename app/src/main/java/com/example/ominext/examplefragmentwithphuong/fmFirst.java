package com.example.ominext.examplefragmentwithphuong;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import org.greenrobot.eventbus.EventBus;

import static android.R.attr.value;


public class fmFirst extends Fragment {
    EditText edtName;
    EditText edtAge;
    Button buttonApply;

    public fmFirst() {

    }

    public static fmFirst newInstance() {
        fmFirst fragment = new fmFirst();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_first, container, false);
        edtName=(EditText)view.findViewById(R.id.edt_name);
        edtAge=(EditText)view.findViewById(R.id.edt_age);
        buttonApply=(Button)view.findViewById(R.id.button_apply);
        buttonApply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=edtName.getText().toString();
                String age=edtAge.getText().toString();

                Bundle bundle=new Bundle();
                bundle.putString("name",name);
                bundle.putString("age",age);

                FragmentManager fragmentManager=getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();

                fmDefault Default=new fmDefault();
                Default.setArguments(bundle);
                fragmentTransaction.replace(R.id.frame_layout,Default);
                fragmentTransaction.commit();

            }
        });
        return view;
    }


}
