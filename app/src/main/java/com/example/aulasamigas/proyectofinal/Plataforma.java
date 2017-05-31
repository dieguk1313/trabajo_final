package com.example.aulasamigas.proyectofinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.Spinner;
import android.widget.ToggleButton;

import java.util.ArrayList;
import java.util.List;

public class Plataforma extends AppCompatActivity {

    Spinner spinner;
    Intent intent= new Intent();
    ToggleButton toggleButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plataforma);

        toggleButton=(ToggleButton)findViewById(R.id.cerrar);
        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked==false){

                    Intent main = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(main);
                }
            }
        });

        spinner = (Spinner)findViewById(R.id.spinner);

        List list =  new ArrayList();
        list.add("Seleccione");
        list.add("Uniremington");
        list.add("Sedes");
        list.add("Programas");
        list.add("Admisiones");
        list.add("Plataformas");
        list.add("Bienestar y Egresados");
        list.add("Comunidad");
        list.add("Ubicación");

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, list);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(arrayAdapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if("Uniremington".equals(spinner.getSelectedItem().toString())){
                    intent.setClass(getApplicationContext(),Uniremington.class);
                    startActivity(intent);
                }
                if("Sedes".equals(spinner.getSelectedItem().toString())){
                    intent.setClass(getApplicationContext(),Sedes.class);
                    startActivity(intent);
                }
                if("Programas".equals(spinner.getSelectedItem().toString())){
                    intent.setClass(getApplicationContext(),Programas.class);
                    startActivity(intent);
                }
                if("Admisiones".equals(spinner.getSelectedItem().toString())){
                    intent.setClass(getApplicationContext(),Admisiones.class);
                    startActivity(intent);
                }
                if("Plataformas".equals(spinner.getSelectedItem().toString())){
                    intent.setClass(getApplicationContext(),Plataformas.class);
                    startActivity(intent);
                }
                if("Bienestar y Egresados".equals(spinner.getSelectedItem().toString())){
                    intent.setClass(getApplicationContext(),BienestarEgres.class);
                    startActivity(intent);
                }
                if("Comunidad".equals(spinner.getSelectedItem().toString())){
                    intent.setClass(getApplicationContext(),Comunidad.class);
                    startActivity(intent);
                }
                if("Ubicación".equals(spinner.getSelectedItem().toString())){
                    intent.setClass(getApplicationContext(),Ubicacion.class);
                    startActivity(intent);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
