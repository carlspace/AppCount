package es.ulpgc.da.appcount.presentador;

import es.ulpgc.da.appcount.vista.IVista;
import es.ulpgc.da.appcount.vista.Vista;

/**
 * Created by Carlos Espacios on 30/01/2017.
 */

public interface IPresentador {
    void tratarBotonResta();
    void tratarBotonSuma();
    void actualizarBoton();
    IVista getMiVista();
     void setMiVista(Vista miVista);

}
