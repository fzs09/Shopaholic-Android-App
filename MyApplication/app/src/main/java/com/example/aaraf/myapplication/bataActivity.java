package com.example.aaraf.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class bataActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bata);
    }

    public void bshoePressed(View view){
        Intent intent=new Intent(bataActivity.this,shoeActivity.class);
        startActivity(intent);
    }
    public void blocPressed(View view){
        Intent intent=new Intent(this,MapActivity.class);
        intent.putExtra("lat",23.739002);
        intent.putExtra("lon",90.386796);

        startActivity(intent);
    }
}
