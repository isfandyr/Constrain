package com.example.sampleconstrainlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //deklarasi variabel
    Button btnLogin;

    EditText edemail, edpassword;

    String nama, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //menghubungkan variabel
        btnLogin=findViewById(R.id.btSignin);

        edemail=findViewById(R.id.edEmail);

        edpassword=findViewById(R.id.edPassword);

        //membuat fungsi onclick pada button
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //menyimpan input user
                nama = edemail.getText().toString();

                password = edpassword.getText().toString();

                String email = "isfan.diar123@gmail.com";
                String pass = "777";

                if (nama.equals(email) && password.equals(pass))
                {
                    //membuat variabel toast dan menampilkan pesan
                    Toast t = Toast.makeText(getApplicationContext(),
                            "Login Sukses", Toast.LENGTH_LONG);
                    //menampilkan toast
                    t.show();
                }
                else if (!nama.equals(email) && password.equals(pass))
                {
                    Toast t = Toast.makeText(getApplicationContext(),
                            "Email Salah", Toast.LENGTH_LONG);
                    t.show();
                }
                else if (nama.equals(email) && !password.equals(pass))
                {
                    Toast t = Toast.makeText(getApplicationContext(),
                            "Password Salah", Toast.LENGTH_LONG);
                    t.show();
                }
                else
                {
                    Toast t = Toast.makeText(getApplicationContext(),
                            "Email dan Password Salah", Toast.LENGTH_LONG);
                    t.show();
                }
            }
        });
    }
}