package com.example.program1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText ed;
    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed=findViewById(R.id.edittext);
        btn=findViewById(R.id.button1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str=ed.getText().toString();
                Intent a=new Intent(MainActivity.this,MainActivity2.class);
                a.putExtra("name",str);
                startActivity(a);
            }
        });
    }
}