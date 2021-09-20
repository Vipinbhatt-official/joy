package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void button(View view) {

        Intent intent=new Intent(this,MainActivity3.class);
        startActivity(intent);
    }

    public void button4(View view) {
        Intent intent=new Intent(this,MainActivity3.class);
        startActivity(intent);
    }

    public void button5(View view) {
        Intent intent=new Intent(this,MainActivity3.class);
        startActivity(intent);
    }

    public void button6(View view) {
        Intent intent=new Intent(this,MainActivity3.class);
        startActivity(intent);
    }

    public void button8(View view) {
        Intent intent=new Intent(this,MainActivity3.class);
        startActivity(intent);
    }

    public void button9(View view) {
        Intent intent=new Intent(this,MainActivity3.class);
        startActivity(intent);
    }

    public void button11(View view) {
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}