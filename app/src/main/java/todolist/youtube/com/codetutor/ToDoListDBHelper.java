/*
package todolist.youtube.com.codetutor;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import todolist.youtube.com.codetutor.db.ToDoListDBAdapter;

public class ToDoListDBHelper extends SQLiteOpenHelper {
    private static final String TAG=ToDoListDBHelper.class.getSimpleName();

    public static final String TABLE_TODO="table_todo";
    public static final String COLUMN_TODO_ID="task_id";
    public static final String COLUMN_TODO="todo";
    public static final String COLUMN_PLACE="place";

    //create table table_todo(task_id integer primary key, todo text not null);

    public static String CREATE_TABLE_TODO="CREATE TABLE "+TABLE_TODO+"("+COLUMN_TODO_ID+" INTEGER PRIMARY KEY, "+COLUMN_TODO+" TEXT NOT NULL, "+
            COLUMN_PLACE+ " TEXT )";

    public ToDoListDBHelper(Context context, String databaseName, SQLiteDatabase.CursorFactory factory, int dbVersion){
        super(context,databaseName,factory,dbVersion);
    }

    @Override
    public void onConfigure(SQLiteDatabase db) {
        super.onConfigure(db);
        db.setForeignKeyConstraintsEnabled(true);
        Log.i(TAG,"Inside onConfigure");
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(CREATE_TABLE_TODO);
        Log.i(TAG,"Inside onCreate");

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase,
                          int oldVersion, int newVersion) {
        //Not implemented now

        switch (oldVersion){
            case 1: sqLiteDatabase.execSQL("ALTER TABLE "+TABLE_TODO+ " ADD COLUMN "+COLUMN_PLACE+" TEXT");break;
            default: break;
        }
        Log.i(TAG,"Inside onUpgrade");
    }


}
*/
