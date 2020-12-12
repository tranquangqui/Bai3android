package Login;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class CreateDatabase extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "account_list";
    public static String TABLE_NAME = "account";
    public static  String ID = "id";
    public static  String NAME = "name";
    public static final String EMAIL = "email";
    public static final String PASS = "pass";
    public static final int VERSION = 1;
    public Context context;

    public CreateDatabase(Context context) {

        super(context, DATABASE_NAME, null, 1);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        String sqlQuery = "CREATE TABLE " + TABLE_NAME + " (" +
                ID + " integer, " +
                NAME + " TEXT, " +
                EMAIL + " TEXT primary key, " +
                PASS + " TEXT)";
        db.execSQL(sqlQuery);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public SQLiteDatabase open() {
        return this.getWritableDatabase();
    }
}