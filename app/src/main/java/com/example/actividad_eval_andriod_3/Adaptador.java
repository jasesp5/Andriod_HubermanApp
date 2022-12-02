package com.example.actividad_eval_andriod_3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

public class Adaptador extends ArrayAdapter<Datos> {

    private Datos[] datos;

    public Adaptador(@NonNull Context context, Datos[] datos) {
        super(context,R.layout.elemento,datos);
        this.datos = datos;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater mostrado = LayoutInflater.from(getContext());
        View elemento = mostrado.inflate(R.layout.elemento, null, false);
        ImageView imagen = elemento.findViewById(R.id.imageView);
        imagen.setImageResource(datos[position].getImagen());
        TextView texto2 = (TextView) elemento.findViewById(R.id.textView);
        texto2.setText(datos[position].getTexto());
        return elemento;
        }
    }