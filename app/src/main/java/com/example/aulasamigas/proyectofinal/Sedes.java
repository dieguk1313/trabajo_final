package com.example.aulasamigas.proyectofinal;

import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class Sedes extends AppCompatActivity implements View.OnClickListener{

    RadioGroup radioGroup;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sedes);

        btn = (Button)findViewById(R.id.buttonsedes);
        btn.setOnClickListener(this);


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

    @Override
    public void onClick(View v) {

        if(v.getId() == R.id.buttonsedes){
            super.onBackPressed();
        }

    }
}
