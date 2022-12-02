package com.example.actividad_eval_andriod_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Datos[] datos = new Datos[]{
                new Datos(R.drawable.cardio,"Long Endurance\n" +
                        "Workout\n" +
                        "Day 1 (Sunday)"),
                new Datos(R.drawable.legday,"Legs Resistance\n" +
                        "Training\n" +
                        "Day 2 (Monday)"),
                new Datos(R.drawable.iceheat,"Heat & Cold\n" +
                        "Exposure/Recovery\n" +
                        "Day 3 (Tuesday)"),
                new Datos(R.drawable.torso,"Torso & Neck\n" +
                        "Resistance Training\n" +
                        "Day 4 (Wednesday)"),
                new Datos(R.drawable.cardio2,"Cardiovascular\n" +
                        "Training\n" +
                        "Day 5 (Thursday"),
                new Datos(R.drawable.hit,"High Intensity\n" +
                        "Interval Training\n" +
                        "(HIIT)\n" +
                        "Day 6 (Friday)"),
                new Datos(R.drawable.arms,"Arms, Neck & Calves\n" +
                        "Training\n" +
                        "Day 7 (Saturday)"),
                new Datos(R.drawable.sleeo,"Improve your " +
                        "\nSleep"),
                new Datos(R.drawable.food,"Control your \n nutrition"),
                new Datos(R.drawable.meditation,"Meditate every  \n  day")

        };
        ListView lista = (ListView) findViewById(R.id.lista);
        Adaptador miAdaptador = new Adaptador(this,datos);
        lista.setAdapter(miAdaptador);
        View cabecera = getLayoutInflater().inflate(R.layout.cabecera,null);
        lista.addHeaderView(cabecera);
        View footer = getLayoutInflater().inflate(R.layout.footer,null);
        lista.addFooterView(footer);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent main2 = new Intent(getApplicationContext(),MainActivity2.class);
                startActivity(main2);
            }
        });
    }
}