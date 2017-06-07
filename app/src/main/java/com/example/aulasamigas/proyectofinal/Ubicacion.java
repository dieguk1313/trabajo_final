package com.example.aulasamigas.proyectofinal;

import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class Ubicacion extends AppCompatActivity implements View.OnClickListener{

    RadioGroup radioGroup;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ubicacion);

        btn = (Button)findViewById(R.id.buttonubicacion);
        btn.setOnClickListener(this);


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

    @Override
    public void onClick(View v) {

        if(v.getId() == R.id.buttonubicacion){
            super.onBackPressed();
        }

    }
}
