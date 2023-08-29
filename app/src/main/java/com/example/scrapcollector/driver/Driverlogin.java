package com.example.scrapcollector.driver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.scrapcollector.R;
import com.example.scrapcollector.admin.Adindashboard;

public class Driverlogin extends AppCompatActivity {
EditText email,password;
Button driverlogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driverlogin);
        email=findViewById(R.id.driverloginemail);
        password=findViewById(R.id.driverloginpasswrod);
        driverlogin=findViewById(R.id.driverloginbtn);
        driverlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Driverlogin.this, Driverdashboard.class);
                startActivity(intent);
            }
        });
    }
}