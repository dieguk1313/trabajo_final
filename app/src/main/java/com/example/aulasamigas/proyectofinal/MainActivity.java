package com.example.aulasamigas.proyectofinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button entrar;
    EditText correo;
    EditText password;

    String usuario, contrasena;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        correo = (EditText)findViewById(R.id.correo);
        password=(EditText)findViewById(R.id.password);

        entrar  = (Button)findViewById(R.id.entrar);
        entrar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        usuario = correo.getText().toString();
        contrasena = password.getText().toString();

        switch (v.getId()){

            case R.id.entrar:

                if ("diego@gmail.com".equals(usuario)&& "12345".equals(contrasena)){

                    Intent intent = new Intent(this, Plataforma.class);
                    startActivity(intent);
                }else {

                    Toast.makeText(MainActivity.this, String.valueOf("Correo - Password Invalido"), Toast.LENGTH_SHORT).show();
                }
            break;
        }
    }
}
