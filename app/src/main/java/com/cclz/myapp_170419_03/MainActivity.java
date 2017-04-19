package com.cclz.myapp_170419_03;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPreferences sp=getSharedPreferences("mydata", MODE_PRIVATE);
        SharedPreferences.Editor editor=sp.edit();
        editor.putString("username", "Peter");
        editor.commit();

    }
    public void clickRead(View v){
        SharedPreferences sp=getSharedPreferences("mydata", MODE_PRIVATE);
        String str=sp.getString("username", "");
        Toast.makeText(MainActivity.this, str, Toast.LENGTH_SHORT).show();
    }
}
