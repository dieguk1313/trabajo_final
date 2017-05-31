package com.example.aulasamigas.proyectofinal;

import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;

public class Comunidad extends AppCompatActivity {

    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comunidad);

        final Intent intent = new Intent(this, Vistas.class);

        radioGroup=(RadioGroup)findViewById(R.id.comunidad);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {

                if (checkedId == R.id.Calendario){

                    intent.putExtra("link", "http://www.uniremington.edu.co/manizales/general/comunidad/calendario-eventos.html");
                    startActivity(intent);
                }

                if (checkedId == R.id.Encuesta){

                    intent.putExtra("link", "http://www.uniremington.edu.co/manizales/1460-encuesta-bienestar-universitario-y-egresados.html");
                    startActivity(intent);
                }


            }
        });
    }
}
