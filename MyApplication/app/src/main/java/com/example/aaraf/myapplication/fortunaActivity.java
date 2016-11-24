package com.example.aaraf.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class fortunaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fortuna);
    }

    public void fshoePressed(View view){
        Intent intent=new Intent(fortunaActivity.this,shoeActivity.class);
        startActivity(intent);
    }
    public void flocPressed(View view){
        Intent intent=new Intent(this,MapActivity.class);
        intent.putExtra("lat",23.822258);
        intent.putExtra("lon",90.423446);

        startActivity(intent);
    }
}
