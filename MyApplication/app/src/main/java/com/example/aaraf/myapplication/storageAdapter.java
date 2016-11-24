package com.example.aaraf.myapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.sql.SQLException;

/**
 * Created by A.Araf on 3/25/2016.
 */
public class storageAdapter  {
    storage strg;
    public storageAdapter(Context context){
        strg=new storage(context);
    }
    public long insertData(String name,String type,String size,String color,String des,String price,String brand,String path){
        SQLiteDatabase db=strg.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(storage.NAME,name);
        contentValues.put(storage.TYPE,type);
        contentValues.put(storage.SIZE,size);
        contentValues.put(storage.COLOR,color);
        contentValues.put(storage.DESCRIPTION,des);
        contentValues.put(storage.PRICE,price);
        contentValues.put(storage.BRAND,brand);
        contentValues.put(storage.PICPATH,path);
        long id=db.insert(storage.TABLE_NAME,null,contentValues);
        return id;

    }

    static class storage extends SQLiteOpenHelper{
        private static final String DATABASE_NAME = "shopaholic.db";
        private static final String TABLE_NAME = "product";
        private static final String UID = "_id";
        private static final String NAME = "name";
        private static final String TYPE = "type";
        private static final String SIZE = "size";
        private static final String COLOR = "color";
        private static final String DESCRIPTION = "description";
        private static final String PRICE = "price";
        private static final String BRAND = "brand";
        private static final String PICPATH = "picpath";
        private static final int DATABASE_VERSION = 1;
        private Context context;
        private static final String CREATE_TABLE="CREATE TABLE "+TABLE_NAME+" ("+UID+" INTEGER PRIMARY KEY AUTOINCREMENT,"+NAME+" VARCHAR(25),"+TYPE+" VARCHAR(25),"+SIZE+" VARCHAR(10),"+COLOR+" VARCHAR(25),"+DESCRIPTION+" VARCHAR(255),"+PRICE+" INTEGER,"+BRAND+" VARCHAR(25),"+PICPATH+" VARCHAR(255));";
        public storage(Context context){

            super(context, DATABASE_NAME, null, DATABASE_VERSION );
            this.context=context;
            //Message.message(context,"constructor was called");
        }

        public void onCreate(SQLiteDatabase db){


            db.execSQL(CREATE_TABLE);
            Message.message(context, "onCreate was called");

        }
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){

        }
    }
}
