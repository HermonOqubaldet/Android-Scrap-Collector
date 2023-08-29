package com.example.scrapcollector.admin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.example.scrapcollector.R;

public class Createbin extends AppCompatActivity {
EditText ar,lo,ci,drim,ro;
Spinner lt,cp;
Button sumbit,update;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_createbin);
        ar=findViewById(R.id.area);
        ci=findViewById(R.id.city);
        drim=findViewById(R.id.driveremail);
        ro=findViewById(R.id.route);
        sumbit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}