package com.example.linearlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import  android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnLogin;
    EditText edemail, edpassword;
    String nama, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin=findViewById(R.id.btSignin);
        edemail=findViewById(R.id.edEmail);
        edpassword=findViewById(R.id.edPassword);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nama = edemail.getText().toString();
                password = edpassword.getText().toString();

                if (nama.trim().equals("david@mail.com") && password.trim().equals("666"))
                {
                    Toast t = Toast.makeText(getApplicationContext(), "Login Sukses", Toast.LENGTH_LONG);
                    t.show();
                }
                else if (nama.trim().equals("david@mail.com") || password.trim().equals("666"))
                {
                    Toast t = Toast.makeText(getApplicationContext(), "Password Salah", Toast.LENGTH_LONG);
                    t.show();
                }
                else if (nama.trim().equals("david@mail.com") || password.trim().equals("666"))
                {
                    Toast t = Toast.makeText(getApplicationContext(), "Email Salah", Toast.LENGTH_LONG);
                    t.show();
                }
                else
                {
                    Toast t = Toast.makeText(getApplicationContext(), "email dan Password Salah", Toast.LENGTH_LONG);
                    t.show();
                }

            }
        });
    }

}