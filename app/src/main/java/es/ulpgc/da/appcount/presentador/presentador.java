package es.ulpgc.da.appcount.presentador;

import es.ulpgc.da.appcount.modelo.IModelo;

import es.ulpgc.da.appcount.modelo.Modelo;
import es.ulpgc.da.appcount.vista.IVista;
import es.ulpgc.da.appcount.vista.Vista;


/**
 * Created by Carlos Espacios on 30/01/2017.
 */

public class Presentador implements IPresentador{
    private IModelo modelo;
    private IVista  miVista;

    public Presentador(){
        super();
        this.modelo = new Modelo();
    }

    @Override
    public void tratarBotonResta() {
        modelo.restar();
    }

    @Override
    public void tratarBotonSuma() {

        modelo.sumar();
    }

    @Override
    public void actualizarBoton() {
        miVista.setResultado(modelo.getContador());
    }

    @Override
    public IVista getMiVista() {
        return miVista;
    }

    @Override
    public void setMiVista(Vista miVista) {
        this.miVista=miVista;
    }
}
