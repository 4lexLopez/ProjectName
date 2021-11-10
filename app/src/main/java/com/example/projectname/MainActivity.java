package com.example.projectname;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et1, et2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        et1 = (EditText) findViewById(R.id.editTextTextPersonName);
        et2 = (EditText) findViewById(R.id.editTextTextPassword);
    }

    public void login(View view) {
        String user = et1.getText().toString();
        String password = et2.getText().toString();

        if(!user.equals("") && !password.equals("")) {
            if(user.equals("admin") && password.equals("admin")) {
                Intent intent = new Intent(this, ChooseOriginAddress.class);
                startActivity(intent);
            }
            else {
                Toast.makeText(this, "datos incorrectos", Toast.LENGTH_SHORT).show();
                et1.requestFocus();
            }
        }
        else {
            if(user.equals("")) {
                Toast.makeText(this, "por favor, ingrese el usuario", Toast.LENGTH_SHORT).show();
                et1.requestFocus();
            } else if(password.equals("")) {
                Toast.makeText(this, "por favor, ingrese la contraseña", Toast.LENGTH_SHORT).show();
                et2.requestFocus();
            }
        }
    }
}