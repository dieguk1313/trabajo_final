package com.example.aulasamigas.proyectofinal;

import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;

public class Admisiones extends AppCompatActivity {

    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admisiones);

        final Intent intent = new Intent(this, Vistas.class);

        radioGroup=(RadioGroup)findViewById(R.id.admisiones);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {

                if (checkedId == R.id.Prerequisitos){

                    intent.putExtra("link", "https://www.q10academico.com/preinscripcion?aplentId=a2e25504-9d7b-4e4e-861a-5f015f373d8f");
                    startActivity(intent);
                }

                if (checkedId == R.id.Requisitos){

                    intent.putExtra("link", "http://www.uniremington.edu.co/manizales/778-requisitos-de-inscripcion.html");
                    startActivity(intent);
                }

                if (checkedId == R.id.Homologacion){

                    intent.putExtra("link", "http://www.uniremington.edu.co/manizales/782-homologaciones.html");
                    startActivity(intent);
                }

                if (checkedId == R.id.Pagos){

                    intent.putExtra("link", "http://www.uniremington.edu.co/manizales/779-formas-de-pago.html");
                    startActivity(intent);
                }

                if (checkedId == R.id.Convenios){

                    intent.putExtra("link", "http://www.uniremington.edu.co/manizales/781-convenios-y-descuentos.html");
                    startActivity(intent);
                }


            }
        });
    }
}
