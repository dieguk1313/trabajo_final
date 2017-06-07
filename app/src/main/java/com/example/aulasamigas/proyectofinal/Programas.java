package com.example.aulasamigas.proyectofinal;

import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class Programas extends AppCompatActivity implements View.OnClickListener {

    RadioGroup radioGroup;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_programas);

        btn = (Button)findViewById(R.id.buttonprogramas);
        btn.setOnClickListener(this);

        final Intent intent = new Intent(this, Vistas.class);

        radioGroup=(RadioGroup)findViewById(R.id.programas);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {

                if (checkedId == R.id.Especializaciones){

                    intent.putExtra("link", "http://www.uniremington.edu.co/manizales/buscador.html?isc=1&category_id=&xf_1=4&xf_2=33&programa=si");
                    startActivity(intent);
                }

                if (checkedId == R.id.Pregrados){

                    intent.putExtra("link", "http://www.uniremington.edu.co/manizales/buscador.html?isc=1&category_id=&xf_1=3&xf_2=33&programa=si");
                    startActivity(intent);
                }

                if (checkedId == R.id.Tecnologia){

                    intent.putExtra("link", "http://www.uniremington.edu.co/manizales/buscador.html?isc=1&category_id=&xf_1=2&xf_2=33&programa=si");
                    startActivity(intent);
                }

                if (checkedId == R.id.Extencion){

                    intent.putExtra("link", "http://www.uniremington.edu.co/manizales/753-extension.html");
                    startActivity(intent);
                }

                if (checkedId == R.id.GrupoEstudio){

                    intent.putExtra("link", "http://www.uniremington.edu.co/manizales/general/programas/semilleros.html");
                    startActivity(intent);
                }


            }
        });
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.buttonprogramas){
            super.onBackPressed();
        }


    }
}
