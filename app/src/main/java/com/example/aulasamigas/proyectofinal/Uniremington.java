package com.example.aulasamigas.proyectofinal;

import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;

public class Uniremington extends AppCompatActivity {

    RadioGroup radioGroup;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uniremington);

        final Intent intent = new Intent(this, Vistas.class);

        radioGroup=(RadioGroup)findViewById(R.id.uniremington);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {

                if (checkedId == R.id.Mision){

                    intent.putExtra("link", "http://www.uniremington.edu.co/manizales/general/uniremington/mision-vision.html");
                    startActivity(intent);
                }

                if (checkedId == R.id.Valores){

                    intent.putExtra("link", "http://www.uniremington.edu.co/manizales/general/uniremington/valores-institucionales.html");
                    startActivity(intent);
                }

                if (checkedId == R.id.Lineamientos){

                    intent.putExtra("link", "http://www.uniremington.edu.co/manizales/general/uniremington/2016-02-10-22-02-36.html");
                    startActivity(intent);
                }

                if (checkedId == R.id.Academico){

                    intent.putExtra("link", "http://www.uniremington.edu.co/manizales/general/uniremington/2016-02-10-22-02-37.html");
                    startActivity(intent);
                }

                if (checkedId == R.id.Reglamento){

                    intent.putExtra("link", "http://www.uniremington.edu.co/manizales/general/uniremington/reglamento-estudiantil.html");
                    startActivity(intent);
                }

                if (checkedId == R.id.Directorio){

                    intent.putExtra("link", "http://www.uniremington.edu.co/manizales/1445-directorio-administrativo.html");
                    startActivity(intent);
                }

                if (checkedId == R.id.Donde){

                    intent.putExtra("link", "http://www.uniremington.edu.co/uniremington/donde-estamos.html");
                    startActivity(intent);
                }

            }
        });


    }
}
