package com.example.aaraf.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class yellowActivity extends AppCompatActivity {

    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yellow);

    }
    public void shirtPressed(View view){
        Intent intent=new Intent(yellowActivity.this,shirtActivity.class);
        startActivity(intent);
    }

    public void pantPressed(View view){
        Intent intent=new Intent(yellowActivity.this,pantActivity.class);
        startActivity(intent);
    }

    public void punjabiPressed(View view){
        Intent intent=new Intent(yellowActivity.this,punjabiActivity.class);
        startActivity(intent);
    }

    public void shoePressed(View view){
        Intent intent=new Intent(yellowActivity.this,shoeActivity.class);
        startActivity(intent);
    }
    public void ylocPressed(View view){
        Intent intent=new Intent(this,MapActivity.class);
        intent.putExtra("lat",23.751258);
        intent.putExtra("lon",90.381560);

        startActivity(intent);
    }
}
