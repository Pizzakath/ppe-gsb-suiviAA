package com.example.emilien.suiviaa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText login;
    EditText password;
    Button connexion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login = (EditText) findViewById(R.id.main_login);
        password = (EditText) findViewById(R.id.main_password);
        connexion = (Button) findViewById(R.id.main_connexion);

    }
}
