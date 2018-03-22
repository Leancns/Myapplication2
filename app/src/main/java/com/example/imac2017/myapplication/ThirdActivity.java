package com.example.imac2017.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ThirdActivity extends AppCompatActivity {
public ListView myListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);


        myListView=(ListView)findViewById(R.id.myListView);

//                final ArrayAdapter<String>adapter = new ArrayAdapter<> ('activity_third.this');

    }
}
