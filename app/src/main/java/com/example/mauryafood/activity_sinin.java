package com.example.mauryafood;

import android.content.Intent;
import android.os.Bundle;
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

public class activity_sinin extends AppCompatActivity {

    TextView tvFacebook,tvGoogle;
    EditText email,pass;
    Button sinin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sinin);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        email=findViewById(R.id.etmail);
        pass=findViewById(R.id.etPassword);

        tvFacebook=findViewById(R.id.tvFacebook);
        tvFacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(activity_sinin.this, "Unable", Toast.LENGTH_SHORT).show();
            }
        });
        tvGoogle=findViewById(R.id.tvGoogle);
        tvGoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Toast.makeText(activity_sinin.this,"Unable",Toast.LENGTH_SHORT).show();
            }
        });
        sinin=findViewById(R.id.sinin);
        sinin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String mail=email.getText().toString();
                String password=pass.getText().toString();
                if(mail.isEmpty()){
                    email.setError("Please enter the email!");
                    return;
                }else if(password.isEmpty()){
                    pass.setError("Please enter the password!");
                    return;
                }
                Intent intent=new Intent(activity_sinin.this,FoodActivity.class);
                startActivity(intent);
            }
        });
    }
}