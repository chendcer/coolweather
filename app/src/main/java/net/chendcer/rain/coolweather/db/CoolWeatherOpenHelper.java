package net.chendcer.rain.coolweather.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by chend on 2016/2/21.
 */

public class CoolWeatherOpenHelper extends SQLiteOpenHelper {

    public CoolWeatherOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    public static final String CREATE_PROVINCE = "create table Province("
            + "id inteager primary key autoincrement,"
            + "province_name text,"
            + "province_code text)";
    public static final String CREATE_CITY = "create table City("
            + "id inteager primary key autoincrement,"
            + "city_name text,"
            + "city_code text,"
            + "province_id integer)";
    public static final String CREATE_COUNTY = "create table County("
            + "id inteager primary key autoincrement,"
            + "county_name text,"
            + "county_code text,"
            + "county_id integer,)";

    @Override
    public void onCreate(SQLiteDatabase db) {
    db.execSQL(CREATE_PROVINCE);
        db.execSQL(CREATE_CITY);
        db.execSQL(CREATE_COUNTY);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
