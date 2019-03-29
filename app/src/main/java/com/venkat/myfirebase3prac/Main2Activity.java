package com.venkat.myfirebase3prac;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.firebase.client.Firebase;

public class Main2Activity extends AppCompatActivity {
    private EditText mValueField;
    private Button mAddBtn;
   private Firebase mRootRef;
   private EditText mKeyValue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Firebase.setAndroidContext(this);
        setContentView(R.layout.activity_main2);

        mRootRef=new Firebase("https://fir-prac3-b198b.firebaseio.com/Users");
        mValueField=(EditText)findViewById(R.id.et);
        mAddBtn=(Button)findViewById(R.id.bt);
        mKeyValue=(EditText)findViewById(R.id.et2);

       mAddBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value=mValueField.getText().toString();
                String key=mKeyValue.getText().toString();
                Firebase childRef=mRootRef.child(key);
                childRef.setValue(value);

            }
        });

    }
}
