package es.ulpgc.da.appcount.modelo;

import android.os.Bundle;

/**
 * Created by Carlos Espacios on 24/01/2017.
 */

public class Modelo implements IModelo {
    public int contador;
    public Modelo (){
        contador = 0;
    }

    @Override
    public void sumar() {

        contador=contador+1;
    }

    @Override
    public void restar() {
        contador=contador-1;
    }

    @Override
    public int getContador() {

        return contador;
    }
}
