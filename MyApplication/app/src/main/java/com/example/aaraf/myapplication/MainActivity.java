package com.example.aaraf.myapplication;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton btnYellow;


    storageAdapter storage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        storage=new storageAdapter(this);


        btnYellow = (ImageButton) findViewById(R.id.btnYellow);
        btnYellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(MainActivity.this, yellowActivity.class);
                startActivity(intent);
            }
        });

        //long id=storage.insertData("shirt","polo","small","red","100% cotton shirt","1690","yellow","android:src=\"@drawable/ychkshirt\"");
        //if(id<0){
        //    Message.message(this,"unsuccessful");
        //}
        //else {
       //     Message.message(this,"one row inserted successfully");
       // }

    }

    public void artistiPressed(View view){

       // Message.message(this, "artisti was clicked");
        Intent intent=new Intent(MainActivity.this,artistiActivity.class);
        startActivity(intent);
    }
    public void catsEyePressed(View view){

        //Message.message(this, "catseye was clicked");
        Intent intent=new Intent(MainActivity.this,catsEyeActivity.class);
        startActivity(intent);
    }
    public void orionPressed(View view){

        //Message.message(this, "orion was clicked");
        Intent intent=new Intent(MainActivity.this,orionActivity.class);
        startActivity(intent);

    }
    public void bataPressed(View view){

        //Message.message(this, "bata was clicked");
        Intent intent=new Intent(MainActivity.this,bataActivity.class);
        startActivity(intent);
    }
    public void fortunaPressed(View view){

        //Message.message(this, "fortuna was clicked");
        Intent intent=new Intent(MainActivity.this,fortunaActivity.class);
        startActivity(intent);
    }
    public void wristBandPressed(View view){

        //Message.message(this, "wristband was clicked");
        Intent intent=new Intent(MainActivity.this,wristBandActivity.class);
        startActivity(intent);
    }
    public void arongPressed(View view){

        //Message.message(this, "arong was clicked");
        Intent intent=new Intent(MainActivity.this,arongActivity.class);
        startActivity(intent);
    }
    public void ecstasyPressed(View view){

        //Message.message(this, "ecstasy was clicked");
        Intent intent=new Intent(MainActivity.this,ecstasyActivity.class);
        startActivity(intent);
    }


}
