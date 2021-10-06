package com.tataadin.basicmvp.main;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.tataadin.basicmvp.R;

public class MainActivity extends AppCompatActivity implements MainView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onAttachVIew() {

    }

    @Override
    public void onDetachView() {

    }
}