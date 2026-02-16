package com.example.mauryafood;

import android.content.Intent;
import android.os.Bundle;
import android.telephony.SignalStrengthUpdateRequest;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SinupActivity extends AppCompatActivity {
   TextView gotologin,tvFacebook,tvGoogle;
   EditText name, phone, pass,email;
   Button register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sinup);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.LinearLayout), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        name=findViewById(R.id.username);
        phone=findViewById(R.id.etphone);
        pass=findViewById(R.id.etPassword);
        email=findViewById(R.id.etmail);


        gotologin=findViewById(R.id.gotologin);
        gotologin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                //Toast.makeText(SinupActivity.this,"clicked",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SinupActivity.this,activity_sinin.class);
                startActivity(intent);
            }
        });
        tvFacebook=findViewById(R.id.tvFacebook);
        tvFacebook.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View view){
               Toast.makeText(SinupActivity.this,"Unable",Toast.LENGTH_SHORT).show();
           }
        });
        tvGoogle=findViewById(R.id.tvGoogle);
        tvGoogle.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(SinupActivity.this,"Unable",Toast.LENGTH_SHORT).show();
            }
        });
        register=findViewById(R.id.register);
        register.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View view){
               String tname,tphone,tmail,tpass;
               tname=name.getText().toString();
               tphone=phone.getText().toString();
               tmail=email.getText().toString();
               tpass=pass.getText().toString();

               if(tname.isEmpty()){
                   name.setError("Enter the name!");
                   return;
               } else if (tphone.isEmpty()) {
                   phone.setError("Enter your mobile number!");
                   return;
               } else if (tpass.isEmpty()){
                   pass.setError("Enter the password!");
                   return;
               }else if(tmail.isEmpty()){
                   email.setError("Enter your gmail id");
                   return;
               }

               Toast.makeText(SinupActivity.this,"Registered",Toast.LENGTH_SHORT).show();
           }
        });
    }
}