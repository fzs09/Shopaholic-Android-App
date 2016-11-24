package com.example.aaraf.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class artistiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artisti);
    }

    public void ashirtPressed(View view){
        Intent intent=new Intent(artistiActivity.this,shirtActivity.class);
        startActivity(intent);
    }

    public void apantPressed(View view){
        Intent intent=new Intent(artistiActivity.this,pantActivity.class);
        startActivity(intent);
    }

    public void apunjabiPressed(View view){
        Intent intent=new Intent(artistiActivity.this,punjabiActivity.class);
        startActivity(intent);
    }

    public void ashoePressed(View view){
        Intent intent=new Intent(artistiActivity.this,shoeActivity.class);
        startActivity(intent);
    }


    public void locPressed(View view){
        Intent intent=new Intent(this,MapActivity.class);
        intent.putExtra("lat",23.792849);
        intent.putExtra("lon",90.405027);

        startActivity(intent);
    }
}
