package com.example.power.databasetest;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private MyDatabaseHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dbHelper = new MyDatabaseHelper(this, "BookStore.db", null, 2);

        Button creatbutton = (Button)findViewById(R.id.button_create);
        creatbutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                dbHelper.getWritableDatabase();
            }
        });

        Button addbutton = (Button)findViewById(R.id.button_add);
        addbutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                SQLiteDatabase db = dbHelper.getWritableDatabase();
                ContentValues values = new ContentValues();
                values.put("name", "the da vinci code");
                values.put("author", "dan browm");
                values.put("pages", 456);
                values.put("price", 16.25);
                db.insert("Book", null, values);
                values.clear();
                values.put("name", "the lost symbol");
                values.put("author", "dan browm");
                values.put("pages", 562);
                values.put("price", 19.25);
                db.insert("Book", null, values);
            }
        });

        Button updatabutton = (Button)findViewById(R.id.button_updata);
        updatabutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                SQLiteDatabase db = dbHelper.getWritableDatabase();
                ContentValues values = new ContentValues();
                values.put("price", 10.99);
                db.update("Book", values, "name = ?", new String[]{"the da vinci code"});
            }
        });

        Button deletebutton = (Button)findViewById(R.id.button_delete);
        deletebutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                SQLiteDatabase db = dbHelper.getWritableDatabase();
                db.delete("Book", "pages > ?", new String[]{"500"});
            }
        });

        Button querybutton = (Button)findViewById(R.id.button_query);
        querybutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                SQLiteDatabase db = dbHelper.getWritableDatabase();
                Cursor cursor = db.query("Book", null, null, null, null, null, null);
                if (cursor.moveToNext()) {
                    do{
                        // 遍历cursor对象，取出数据并打印
                        String name = cursor.getString(cursor.getColumnIndex("name"));
                        String author = cursor.getString(cursor.getColumnIndex("author"));
                        int pages = cursor.getInt(cursor.getColumnIndex("pages"));
                        double price = cursor.getDouble(cursor.getColumnIndex("price"));
                        Log.d("MainActivity", "book name is \""+name+
                                "\" book author is \""+author+
                                "\" book pages is \""+pages+
                                "\" book price is \""+price);

                    }while(cursor.moveToNext());
                }
                cursor.close();
            }
        });

    }
}
