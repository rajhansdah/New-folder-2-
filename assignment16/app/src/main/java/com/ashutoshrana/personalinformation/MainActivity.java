package com.ashutoshrana.personalinformation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=findViewById(R.id.editText2);
        editText=findViewById(R.id.editText3);
        editText=findViewById(R.id.editText4);
        editText=findViewById(R.id.editText5);
        editText=findViewById(R.id.editText6);
        editText=findViewById(R.id.editText8);
        editText=findViewById(R.id.editText9);
        editText=findViewById(R.id.editText10);
        button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);
            }
        });




    }
}
