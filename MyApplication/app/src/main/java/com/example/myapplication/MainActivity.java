package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }




    public void clickHandler(View source) {

        TextView tv = (TextView) findViewById(R.id.show);
        tv.setText("Hello world -" + new java.util.Date());


        Uri callUri = Uri.parse("tel:1008611");
        Intent calls = new Intent(Intent.ACTION_CALL, callUri);
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) == PackageManager.PERMISSION_GRANTED) {

            startActivity(calls);

        }else if (ActivityCompat.shouldShowRequestPermissionRationale(MainActivity.this,Manifest.permission.CALL_PHONE)) {
            // In an educational UI, explain to the user why your app requires this
            // permission for a specific feature to behave as expected. In this UI,
            // include a "cancel" or "no thanks" button that allows the user to
            // continue using your app without granting the permission.
            tv.setText("Hello a what");
            Toast.makeText(MainActivity.this,"You need CALL_PHONE",Toast.LENGTH_SHORT).show();

        }else {
            // You can directly ask for the permission.
            ActivityCompat.requestPermissions(this,new String[] { Manifest.permission.CALL_PHONE },0);
            tv.setText("Hello a what fffffff");
        }



/*
        Uri www=Uri.parse("https://www.baidu.com");
        Intent web=new Intent(Intent.ACTION_VIEW,www);
        startActivity(web);*/


    }


    public void jumpHandler(View source) {

     Intent jumptosecond=new Intent(this, SecondActivity.class);
        startActivity(jumptosecond);


    }
}
