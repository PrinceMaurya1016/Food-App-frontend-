package com.example.mauryafood;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button login;
    Button register;
    TextView skip;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.RelativeLayout), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });



        login=findViewById(R.id.login);
        register=findViewById(R.id.register);
        skip=findViewById(R.id.skip);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(MainActivity.this, "Login clicked", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this,activity_sinin.class);
                startActivity(intent);

            }
        });
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // Toast.makeText(MainActivity.this, "Register button clicked", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this,SinupActivity.class);
                startActivity(intent);
            }
        });
        skip.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Bottom_Sheet_Fragment bottomSheetFragment=new Bottom_Sheet_Fragment();
                bottomSheetFragment.show(getSupportFragmentManager(),bottomSheetFragment.getTag());
            }
        });
    }
}