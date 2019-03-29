package com.venkat.myfirebase3prac;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
private Button btt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btt1=(Button)findViewById(R.id.bt);
    }

    public void btonclick(View view) {

        Intent intent1=new Intent(this,Main2Activity.class);
        startActivity(intent1);
    }

    public void bt2onclick(View view) {
        Intent intent2=new Intent(this,Main3Activity.class);
        startActivity(intent2);
    }
}
