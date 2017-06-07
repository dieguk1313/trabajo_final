package com.example.aulasamigas.proyectofinal;

import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class Comunidad extends AppCompatActivity implements View.OnClickListener{

    RadioGroup radioGroup;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comunidad);

        btn = (Button)findViewById(R.id.buttoncomunidad);
        btn.setOnClickListener(this);

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

    @Override
    public void onClick(View v) {

        if(v.getId() == R.id.buttoncomunidad){
            super.onBackPressed();
        }

    }
}
