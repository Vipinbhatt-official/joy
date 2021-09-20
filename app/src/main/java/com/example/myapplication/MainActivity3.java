package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    public void button7(View view) {
        Intent intent =new Intent(this,MainActivity4.class);
        startActivity(intent);
    }

    public void imageButton(View view) {
    Intent intent =new Intent(this,MainActivity2.class);
    startActivity(intent);

    }
}