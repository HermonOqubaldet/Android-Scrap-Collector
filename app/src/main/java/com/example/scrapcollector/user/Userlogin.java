package com.example.scrapcollector.user;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.scrapcollector.R;

public class Userlogin extends AppCompatActivity {
    EditText email,password;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userlogin);
        email=findViewById(R.id.ulogin);
        password=findViewById(R.id.upassword);
        login=findViewById(R.id.uslogin);
        login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Userlogin.this,Userdashboard.class);
                startActivity(intent);
                userlogin();
            }
        });
    }
    private void userlogin(){
        String ue = email.getText().toString();
        String up = password.getText().toString();
        auth.signInWithEmailAndPassword(ue,up).addOnCompleteListener(new OnCompleteListener<AuthResult>)
                @Override
                        public void onComplete(@NonNull Task<AuthResult> task){
                            if(task.isSuccessful()){
                                String uid = task.getReference().child("User").child(uid).child("usertype").addListenerForSingleValueEvent(new ValueEventListener(){
                                    @Override
                                    public void onDataChange(@NonNull DataSnapshot snapshot){
                                        int usertype = snapshot.getValue(Integer.class);
                                        if (usertype==0){

                                        }

                                    }
                                    @Override
                                    public void onCancelled(@NonNull DatabaseError error){

                                    }
                                })
                            }

        }
    }
}