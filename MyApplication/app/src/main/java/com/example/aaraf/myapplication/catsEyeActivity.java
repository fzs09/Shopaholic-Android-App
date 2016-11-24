package com.example.aaraf.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class catsEyeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cats_eye);
    }

    public void cshirtPressed(View view){
        Intent intent=new Intent(catsEyeActivity.this,shirtActivity.class);
        startActivity(intent);
    }

    public void cpantPressed(View view){
        Intent intent=new Intent(catsEyeActivity.this,pantActivity.class);
        startActivity(intent);
    }

    public void cpunjabiPressed(View view){
        Intent intent=new Intent(catsEyeActivity.this,punjabiActivity.class);
        startActivity(intent);
    }

    public void cshoePressed(View view){
        Intent intent=new Intent(catsEyeActivity.this,shoeActivity.class);
        startActivity(intent);
    }
    public void clocPressed(View view){
        Intent intent=new Intent(this,MapActivity.class);
        intent.putExtra("lat",23.739002);
        intent.putExtra("lon",90.386796);

        startActivity(intent);
    }
}
