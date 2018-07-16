package com.sonukumar.ragistionform;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText fstname,lastname,phno,gen,email,pwd;
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fstname = findViewById(R.id.editText);
        lastname = findViewById(R.id.editText2);
        phno = findViewById(R.id.editText3);
        gen = findViewById(R.id.editText4);
        email = findViewById(R.id.editText5);
        pwd=findViewById(R.id.editText6);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sp= getApplicationContext().getSharedPreferences("my ref",0);
                SharedPreferences.Editor editor=sp.edit();
                editor.putString("First Name",fstname.getText().toString());
                editor.putString("Last Name",lastname.getText().toString());
                editor.putString("Phone num",phno.getText().toString());
                editor.putString("Gender",gen.getText().toString());
                editor.putString("Email",email.getText().toString());
                editor.putString("pwd",pwd.getText().toString());
                editor.commit();
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                Toast.makeText(MainActivity.this,"register succesfully",Toast.LENGTH_LONG).show();
startActivity(intent);
            }
        });


    }
}
