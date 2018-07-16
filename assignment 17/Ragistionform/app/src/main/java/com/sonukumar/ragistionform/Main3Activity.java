package com.sonukumar.ragistionform;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {
    TextView fst_name,last_name,phno,gen,mail,pwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        SharedPreferences sp= getApplicationContext().getSharedPreferences("my ref",0);
        fst_name=findViewById(R.id.textView10);
        last_name=findViewById(R.id.textView11);
        phno=findViewById(R.id.textView12);
        gen=findViewById(R.id.textView13);
        mail=findViewById(R.id.textView14);
        pwd=findViewById(R.id.textView15);
        String fstname_f = sp.getString("First Name","");
        String lastname_f = sp.getString("Last Name","");

        String phno_f = sp.getString("Phone num","");

        String mail_f = sp.getString("Email","");
        String gen_f = sp.getString("Gender","");
        String pwd_f = sp.getString("Pwd","");

        fst_name.setText(fstname_f);
        last_name.setText(lastname_f);
        phno.setText(phno_f);
        gen.setText(gen_f);
        mail.setText(mail_f);
        pwd.setText(pwd_f);
    }
}
