package com.example.aaraf.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class wristBandActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wrist_band);
    }
    public void wlocPressed(View view){
        Intent intent=new Intent(this,MapActivity.class);
        intent.putExtra("lat",23.790110);
        intent.putExtra("lon",90.410508);

        startActivity(intent);
    }
}
