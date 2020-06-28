package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s);
    }


    public void secondclickHandler(View source) {

        Toast.makeText(SecondActivity.this,"This is the second view",Toast.LENGTH_SHORT).show();


    }

    public void secondjumpHandler(View source) {

        Intent jumptomain=new Intent(this,MainActivity.class);
        startActivity(jumptomain);


    }



}
