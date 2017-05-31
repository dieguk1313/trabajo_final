package com.example.aulasamigas.proyectofinal;

import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;

public class Sedes extends AppCompatActivity {

    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sedes);

        final Intent intent = new Intent(this, Vistas.class);

        radioGroup=(RadioGroup)findViewById(R.id.sedes);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {

                if (checkedId == R.id.Armenia){

                    intent.putExtra("link", "http://www.uniremington.edu.co/armenia/");
                    startActivity(intent);
                }

                if (checkedId == R.id.Pereira){

                    intent.putExtra("link", "http://www.uniremington.edu.co/pereira/");
                    startActivity(intent);
                }

                if (checkedId == R.id.Manizales){

                    intent.putExtra("link", "http://www.uniremington.edu.co/manizales/");
                    startActivity(intent);
                }


            }
        });
    }
}
