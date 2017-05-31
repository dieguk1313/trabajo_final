package com.example.aulasamigas.proyectofinal;

import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;

public class BienestarEgres extends AppCompatActivity {

    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bienestar_egres);

        final Intent intent = new Intent(this, Vistas.class);

        radioGroup=(RadioGroup)findViewById(R.id.bienestar);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {

                if (checkedId == R.id.Internacionalizacion){

                    intent.putExtra("link", "http://www.uniremington.edu.co/internacionalizacion.html");
                    startActivity(intent);
                }

                if (checkedId == R.id.Convenios){

                    intent.putExtra("link", "http://www.uniremington.edu.co/manizales/1459-convenios-bienestar.html");
                    startActivity(intent);
                }


            }
        });
    }
}
