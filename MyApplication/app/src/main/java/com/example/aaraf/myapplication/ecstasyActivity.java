package com.example.aaraf.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ecstasyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ecstasy);
    }

    public void eshirtPressed(View view){
        Intent intent=new Intent(ecstasyActivity.this,shirtActivity.class);
        startActivity(intent);
    }

    public void epantPressed(View view){
        Intent intent=new Intent(ecstasyActivity.this,pantActivity.class);
        startActivity(intent);
    }

    public void epunjabiPressed(View view){
        Intent intent=new Intent(ecstasyActivity.this,punjabiActivity.class);
        startActivity(intent);
    }

    public void eshoePressed(View view){
        Intent intent=new Intent(ecstasyActivity.this,shoeActivity.class);
        startActivity(intent);
    }
    public void elocPressed(View view){
        Intent intent=new Intent(this,MapActivity.class);
        intent.putExtra("lat",23.822258);
        intent.putExtra("lon",90.423446);

        startActivity(intent);
    }
}
