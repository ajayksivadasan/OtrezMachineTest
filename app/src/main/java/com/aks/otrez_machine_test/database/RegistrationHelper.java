package com.aks.otrez_machine_test.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.aks.otrez_machine_test.registration.ModelRegistration;

public class RegistrationHelper {

    private static final String TABLE_NAME_USERS = "TABLE_USERS";
    public static final String DROP_TABLE_USERS = "DROP TABLE IF EXISTS " + TABLE_NAME_USERS;
    private static final String COL_ID = "id_";
    private static final String COL_NAME = "name";
    private static final String COL_EMAIL = "email";
    private static final String COL_PHONE = "phone";
    private static final String COL_U_NAME = "user_name";
    private static final String COL_PASSWORD = "password";
    public static final String CREATE_TABLE_USERS = "CREATE TABLE IF NOT EXISTS " + TABLE_NAME_USERS + " ( " + COL_ID + " INTEGER AUTOINCREMENT PRIMARY KEY, " + COL_NAME + " TEXT," + COL_EMAIL + " TEXT,"
            + COL_PHONE + " TEXT," + COL_U_NAME + " " + "TEXT, " + COL_PASSWORD + " TEXT)";
    private final DatabaseHelper helper;
    private final SQLiteDatabase sq;

    public RegistrationHelper(Context context) {
        helper = new DatabaseHelper(context);
        sq = helper.getWritableDatabase();
    }

    public void insertIntoUsers(ModelRegistration model) {
        ContentValues values = new ContentValues();
        values.put(COL_EMAIL, model.getEmail());
        values.put(COL_NAME, model.getName());
        values.put(COL_PASSWORD, model.getPassWord());
        values.put(COL_PHONE, model.getPhone());
        values.put(COL_U_NAME, model.getuName());
        sq.insert(TABLE_NAME_USERS, null, values);
    }
}
