package com.example.actividad_eval_andriod_3;

import android.graphics.drawable.Drawable;

public class Datos {

    private String texto;

    private int imagen;

    public Datos( int imagen, String texto) {
        this.texto = texto;
        this.imagen = imagen;
    }

    public String getTexto() {
        return texto;
    }

    public int getImagen() {
        return imagen;
    }
}
