package com.example.power.databasetest;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
    }
}
