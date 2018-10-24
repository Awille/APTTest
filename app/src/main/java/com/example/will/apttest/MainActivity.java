package com.example.will.apttest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.will.apt_library.BindingViewTools;
import com.example.will.apt_nnotation.BindView;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.button)
    TextView mTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BindingViewTools.bind(this);

        mTextView.setText("wwwwwww");
    }
}
