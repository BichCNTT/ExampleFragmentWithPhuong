package com.example.ominext.examplefragmentwithphuong;

import android.app.usage.UsageEvents;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.greenrobot.eventbus.EventBus;

public class fmDefault extends Fragment {
    TextView textViewName;
    TextView textViewAge;
    public fmDefault() {
    }

    public static fmDefault newInstance() {
        fmDefault fragment = new fmDefault();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_default, container, false);
        Bundle bundle=getArguments();
        String name=bundle.getString("name");
        String age=bundle.getString("age");
        textViewName=(TextView)view.findViewById(R.id.text_top);
        textViewAge=(TextView)view.findViewById(R.id.text_bottom);
        textViewName.setText(name);
        textViewAge.setText(age);
        return view;
    }

}
