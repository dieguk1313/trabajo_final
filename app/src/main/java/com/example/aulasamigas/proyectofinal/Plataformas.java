package com.example.aulasamigas.proyectofinal;

import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class Plataformas extends AppCompatActivity implements View.OnClickListener {

    RadioGroup radioGroup;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plataformas);

        btn = (Button)findViewById(R.id.buttonplataformas);
        btn.setOnClickListener(this);

        final Intent intent = new Intent(this, Vistas.class);

        radioGroup=(RadioGroup)findViewById(R.id.plataformas);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {

                if (checkedId == R.id.Moodle){

                    intent.putExtra("link", "http://virtual.uniremingtonmanizales.edu.co/moodle/login/index.php");
                    startActivity(intent);
                }

                if (checkedId == R.id.Q10){

                    intent.putExtra("link", "https://www.q10academico.com/login?ReturnUrl=/&aplentId=a2e25504-9d7b-4e4e-861a-5f015f373d8f");
                    startActivity(intent);
                }

                if (checkedId == R.id.Recibo){

                    intent.putExtra("link", "http://www.uniremington.edu.co/manizales/843-recibo-de-matricula.html");
                    startActivity(intent);
                }

                if (checkedId == R.id.Documentos){

                    intent.putExtra("link", "http://www.uniremington.edu.co/manizales/844-documentos-nuevos.html");
                    startActivity(intent);
                }

                if (checkedId == R.id.Reserva){

                    intent.putExtra("link", "http://reservas.uniremingtonmanizales.edu.co/login.php");
                    startActivity(intent);
                }

                if (checkedId == R.id.Biblioteca){

                    intent.putExtra("link", "http://biblioteca.uniremington.edu.co/index.php/login");
                    startActivity(intent);
                }

                if (checkedId == R.id.Pqrs){

                    intent.putExtra("link", "http://sim.uniremington.edu.co/formrem/pqrs/");
                    startActivity(intent);
                }

            }
        });
    }

    @Override
    public void onClick(View v) {

        if(v.getId() == R.id.buttonplataformas){
            super.onBackPressed();
        }

    }
}
