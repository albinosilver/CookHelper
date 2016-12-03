package com.seg2105a.esther.cookhelper;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Esther on 2016-12-02.
 */

public class SQLiteHelper extends SQLiteOpenHelper {
    // We are creating a java file called SQLiteHelper and extending SQLiteOpenHelper class and It is used to create a bridge between android and SQLite.
    //  To perform basic SQL operations we need to extend SQLiteOpenHelper class.

    private static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "SQLiteDatabase.db";

    public SQLiteHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //db.execSQL("create table " + TABLE_NAME + " ( " + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT," + COLUMN_FIRST_NAME + " VARCHAR, " + COLUMN_LAST_NAME + " VARCHAR);");
        db.execSQL("create table RECIPE ( ID INTEGER PRIMARY KEY AUTOINCREMENT, NAME VARCHAR, DESCRIPTION VARCHAR, DESCRIPTION VARCHAR, COOKINGTIME VARCHAR, SERVING VARCHAR, IMAGE VARCHAR, RECIPESTEP VARCHAR);");
        db.execSQL("create table CATEGORY ( ID INTEGER PRIMARY KEY AUTOINCREMENT, NAME VARCHAR);");
        db.execSQL("create table TYPE ( ID INTEGER PRIMARY KEY AUTOINCREMENT, NAME VARCHAR);");
        db.execSQL("create table RELATIONSHIP ( ID INTEGER PRIMARY KEY AUTOINCREMENT, ID_1 INTEGER, ID_2 INTEGER);");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS RECIPE");
        db.execSQL("DROP TABLE IF EXISTS CATEGORY");
        db.execSQL("DROP TABLE IF EXISTS TYPE");
        db.execSQL("DROP TABLE IF EXISTS RELATIONSHIP");

        onCreate(db);
    }

    private SQLiteDatabase database;
    public void insertRecord(ContactModel contact) {
        database = this.getReadableDatabase();
        ContentValues contentValues = new ContentValues();
        //contentValues.put(COLUMN_FIRST_NAME, contact.getFirstName());
        //contentValues.put(COLUMN_LAST_NAME, contact.getLastName());
        database.insert("RECIPE", null, contentValues);
        database.close();
    }
}