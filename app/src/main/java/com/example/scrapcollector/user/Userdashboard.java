package com.example.scrapcollector.user;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.scrapcollector.R;

public class Userdashboard extends AppCompatActivity {
    Button registercomplain,mycomplain,myprofile;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userdashboard);
        registercomplain=findViewById(R.id.registercomplain);
        mycomplain=findViewById(R.id.mycomplain);
        myprofile=findViewById(R.id.myprofile);
        registercomplain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Userdashboard.this,Registercomplain.class);
                startActivity(intent);
            }
        });
        mycomplain.setOnClickListener(new  View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Userdashboard.this,Mycomplain.class);
                startActivity(intent);
            }
        });
        myprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Userdashboard.this,Myprofile.class);
                startActivity(intent);
            }
        });
    }
}
