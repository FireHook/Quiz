package com.firehook.quiz;

import android.content.ContentResolver;
import android.content.Context;
import android.support.v4.content.CursorLoader;

import com.firehook.database.DBHelper;

/**
 * Created by Vladyslav on 18.03.2018.
 */

public class MyCursorLoader extends CursorLoader {

    ContentResolver contentResolver;
    String[] projection;

    public MyCursorLoader(Context context, ContentResolver cr) {
        super(context);
        contentResolver = cr;
        projection = new String[] { "rowid " + DBHelper.ID_COLUMN, DBHelper.TITLE_COLUMN,
                DBHelper.IMG_URL_COLUMN, DBHelper.QUEST_COUNT_COLUMN, };
    }
}
