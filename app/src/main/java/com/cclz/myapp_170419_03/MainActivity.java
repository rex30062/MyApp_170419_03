package com.cclz.myapp_170419_03;

import android.content.SharedPreferences;
import android.opengl.ETC1;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPreferences sp=getSharedPreferences("mydata", MODE_PRIVATE);
        String str=sp.getString("username", "");
        EditText ed=(EditText)findViewById(R.id.editText);
        ed.setText(str);

    }
    public void clickRead(View v){
        SharedPreferences sp=getSharedPreferences("mydata", MODE_PRIVATE);
        String str=sp.getString("username", "");
        TextView tv=(TextView)findViewById(R.id.textView);
        tv.setText(str);
    }

    public void clickWrite(View v){
        SharedPreferences sp=getSharedPreferences("mydata",MODE_PRIVATE);
        SharedPreferences.Editor editor=sp.edit();
        EditText ed=(EditText)findViewById(R.id.editText);
        editor.putString("username", ed.getText().toString());
        editor.commit();
    }
}
