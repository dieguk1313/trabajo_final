package com.example.aulasamigas.proyectofinal;

import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;

public class Ubicacion extends AppCompatActivity {

    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ubicacion);

        final Intent intent = new Intent(this, Vistas.class);

        radioGroup=(RadioGroup)findViewById(R.id.ubicacion);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {

                if (checkedId == R.id.Cable) {

                    intent.putExtra("link", "http://www.uniremington.edu.co/manizales/792-sede-cable.html");
                    startActivity(intent);
                }

                if (checkedId == R.id.Centro) {

                    intent.putExtra("link", "http://www.uniremington.edu.co/manizales/776-sedes-centro.html");
                    startActivity(intent);
                }

            }
        });
    }
}
