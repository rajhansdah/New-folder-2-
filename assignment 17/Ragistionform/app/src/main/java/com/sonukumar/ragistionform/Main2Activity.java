package com.sonukumar.ragistionform;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    EditText username, pwd;
    Button login;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        username = findViewById(R.id.editText8);
        pwd = findViewById(R.id.editText9);
        login = findViewById(R.id.button4);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sp = getApplicationContext().getSharedPreferences("my ref", 0);
                String username_r = sp.getString("Email", "");
                String pwd_r = sp.getString("pwd", "");
                if (username.getText().toString().equals(username_r) && pwd.getText().toString().equals(pwd_r))

                {
                    Intent intent = new Intent(Main2Activity.this, Main3Activity.class);
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(Main2Activity.this, "wrong username or passwod", Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}
