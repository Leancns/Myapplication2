package com.example.imac2017.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {
    public Button mybutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        mybutton= (Button) findViewById(R.id.valider);
        mybutton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        SecondActivity.this.startActivity(new Intent(SecondActivity.this,ThirdActivity.class));
                    }
                }
        );

    }




}
