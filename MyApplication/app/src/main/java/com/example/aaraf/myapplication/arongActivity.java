package com.example.aaraf.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class arongActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arong);
    }

    public void aashirtPressed(View view){
        Intent intent=new Intent(arongActivity.this,shirtActivity.class);
        startActivity(intent);
    }

    public void aapantPressed(View view){
        Intent intent=new Intent(arongActivity.this,pantActivity.class);
        startActivity(intent);
    }

    public void aapunjabiPressed(View view){
        Intent intent=new Intent(arongActivity.this,punjabiActivity.class);
        startActivity(intent);
    }

    public void aashoePressed(View view){
        Intent intent=new Intent(arongActivity.this,shoeActivity.class);
        startActivity(intent);
    }
    public void aalocPressed(View view){
        Intent intent=new Intent(this,MapActivity.class);
        intent.putExtra("lat",23.790110);
        intent.putExtra("lon",90.410508);

        startActivity(intent);
    }
}
