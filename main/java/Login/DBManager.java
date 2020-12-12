package Login;


import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

public class DBManager   {
    private String TAG = "DBManager";
    SQLiteDatabase database;
    public DBManager(Context context){
        CreateDatabase createDatabase = new CreateDatabase(context);
        database = createDatabase.open();
        Log.d(TAG, "DBManager: thanhcong");
    }

    public void addAccount(Account account) {
        ContentValues values = new ContentValues();
        values.put(CreateDatabase.NAME, account.getName());

        values.put(CreateDatabase.EMAIL, account.getEmail());
        values.put(CreateDatabase.PASS, account.getPass());

        database.insert(CreateDatabase.TABLE_NAME, null, values);
        database.close();
    }
//        long kiemtra = database.insert(CreateDatabase.TABLE_NAME,null,values);
//        return kiemtra;



    public boolean KiemTraDangNhap(String ten, String matkhau){
        String truyvan = "SELECT * FROM " + CreateDatabase.TABLE_NAME + " WHERE " + CreateDatabase.EMAIL + " = '" + ten
                + "' AND " + CreateDatabase.PASS + " = '" + matkhau +"'";

        Cursor cursor = database.rawQuery(truyvan, null);
        if (cursor.getCount() !=0 ){
            return  true;
        }
        else{
            return false;
        }
    }

}

