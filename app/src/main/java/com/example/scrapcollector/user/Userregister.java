package com.example.scrapcollector.user;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.scrapcollector.R;

public class Userregister extends AppCompatActivity {
EditText username,useremail,userlocation,usernumber;
Button uregister;
FirebaseAuth auth;
FirebaseDatabase firebaseDatabase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userregister);
        username=findViewById(R.id.username);
        useremail=findViewById(R.id.useremail);
        userlocation=findViewById(R.id.userlocation);
        usernumber=findViewById(R.id.usernumber);
        uregister=findViewById(R.id.userregisterbtn);
        auth=FirebaseAuth.getInstance();
        firebaseDatabase=FirebaseDatabase.getInstance();
        uregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                userregister();

            }
        });
    }

    private void userregister() {
        String up = userpass.getText().toString();
        String un = username.getText().toString();
        String  ue = useremail.getText().toString();
        String ul = userlocation.getText().toString();
        String unum = usernumber.getText().toString();
        auth.createUserWithEmailAndPassword(ue,up).addOnCompleteListener(new OnCompleteListener<AuthResult>{
            @Override
                    public void onComplete(@NoNull Task<AuthResult> task){
                Usermodel usermodel = new Usermodel(up,un,ue,ul,unum);
                String uid = task.getResult().getUser().getUid();
                FirebaseDatabase.getReference().child("User").child(uid).setValue(usermodel);
                Toast.makeText(Userregister.this, "Sucessful", Toast.LENGTH_SHORT).show();oast
            }
        }).addOnFailureListener(new OnFailureListener(){
            @Override
            public void onFailure(@NonNull Exception e){
                Toast.makeText(Userregister.this, "Failure", Toast.LENGTH_SHORT).show();

            }
        }).addOnFailureListener(new OnFailureListener(){
            @Override
            public void OnFailure(@NonNull Exception e){
                Toast.makeText(Userregister.this, "Failure", Toast.LENGTH_SHORT).show();
            }
        })

    }
}