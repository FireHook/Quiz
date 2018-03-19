package com.firehook.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {

    public static final int DATABSE_VERSION = 1;
    public static final String DATABASE_NAME = "Quiz.db";

    public static final String TABLE_NAME = "t_Categories";
    public static final String ID_COLUMN = "_id";
    public static final String TITLE_COLUMN = "c_Title";
    public static final String IMG_URL_COLUMN = "c_ImgUrl";
    public static final String PROGRESS_COLUMN = "c_Progress";
    public static final String LAST_RES_COLUMN = "c_LastRes";
    public static final String QUEST_COUNT_COLUMN = "c_Ques_count";



    private String columnNames[] = { "ID_COLUMN",  "TITLE_COLUMN", "IMG_URL_COLUMN",
                                    "PROGRESS_COLUMN", "LAST_RES_COLUMN", "QUEST_COUNT_COLUMN"};

    public DBHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("CREATE TABLE " + TABLE_NAME  + " (_id INTEGER PRIMARY KEY AUTOINCREMENT, "
                + TITLE_COLUMN + " TEXT, " + IMG_URL_COLUMN + " TEXT, "  + PROGRESS_COLUMN + " INTEGER, "
                + LAST_RES_COLUMN + " INTEGER, " + QUEST_COUNT_COLUMN + " INTEGER);".toString());
        
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS ".toString() + TABLE_NAME );
        onCreate(sqLiteDatabase);
    }

    public void closeDB() {
        SQLiteDatabase db = this.getReadableDatabase();
        if (db != null && db.isOpen())
            db.close();
    }

}
