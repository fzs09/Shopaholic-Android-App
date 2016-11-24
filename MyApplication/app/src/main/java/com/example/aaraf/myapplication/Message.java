package com.example.aaraf.myapplication;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by A.Araf on 3/26/2016.
 */
public class Message {
    public static void message(Context context, String message){
        Toast.makeText(context,message,Toast.LENGTH_LONG).show();
    }
}
