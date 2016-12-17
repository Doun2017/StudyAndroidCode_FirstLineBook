package com.example.power.activetytest;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends BaseActivity {
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        String temData = "okOKOK!!!!!!";
        outState.putString("data_key", temData);
        Log.d("MainActivity", "onSaveInstanceState run");
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        switch (requestCode){
            case 1:
                if (resultCode == RESULT_OK)
                {
                    String returndata = data.getStringExtra("data_return");
                    Log.d("MainActivity", "onActivityResult: "+returndata);
                }
                break;
            default:
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.add_item:
                Toast.makeText(this, "You clicked add", Toast.LENGTH_SHORT).show();
            case R.id.remove_item:
                Toast.makeText(this, "You clicked remove", Toast.LENGTH_SHORT).show();

        }
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_layout);
        Log.d("MainActivity", "onCreate run");
        if(savedInstanceState != null){
            String temdata = savedInstanceState.getString("data_key");
            Log.d("MainActivity", temdata);
        }

        Button button1 = (Button)findViewById(R.id.butron_1);
        button1.setOnClickListener(new View.OnClickListener(){
                                       @Override
                                       public void onClick(View v) {
//                                            Toast.makeText(MainActivity.this, "You clicked Button 1",
//                                                    Toast.LENGTH_SHORT).show();
//                                           finish();
                                           String data = "Hello SecondActivity!";
                                           Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                                           intent.putExtra("extra_data", data);
                                           //Intent intent = new Intent("com.example.activitytest.ACTION_START");
                                           //intent.addCategory("com.example.activitytest.MY_CATEGORY");
//                                           Intent intent = new Intent(Intent.ACTION_VIEW);
//                                           intent.setData(Uri.parse("http://www.baidu.com"));
                                           //startActivity(intent);
                                           startActivityForResult(intent, 1);
                                       }
                                   });
    }
}
