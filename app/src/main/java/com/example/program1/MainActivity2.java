package com.example.program1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView tw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tw=findViewById(R.id.textView);
        Intent a=getIntent();
        String s=a.getStringExtra("name");
        tw.setText(s);
    }
}