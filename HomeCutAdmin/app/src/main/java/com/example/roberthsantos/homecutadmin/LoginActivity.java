package com.example.roberthsantos.homecutadmin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void cadastrar(View view){
        startActivity(new Intent(this, CadastroActivity.class));
    }

    public void inicio(View view){
        startActivity(new Intent(this, AddServiceActivity.class));
    }
}
