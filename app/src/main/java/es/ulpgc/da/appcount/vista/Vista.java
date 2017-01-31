package es.ulpgc.da.appcount.vista;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import es.ulpgc.da.appcount.MainActivity;
import es.ulpgc.da.appcount.R;
import es.ulpgc.da.appcount.presentador.IPresentador;

/**
 * Created by Carlos Espacios on 30/01/2017.
 */

public class Vista extends Activity implements IVista {


    private TextView display;
    private Button botonSumar, botonRestar;
    private Integer counter;
    private IPresentador presentador;

    class MyButtonListener implements View.OnClickListener{

        @Override
        public void onClick(View arg0) {
            switch (arg0.getId()){
                case R.id.button1:
                    presentador.tratarBotonSuma();
                    presentador.actualizarBoton();
                    break;

                case R.id.button2:
                    presentador.tratarBotonResta();
                    presentador.actualizarBoton();
                    break;
            }

        }


    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botonSumar = (Button) findViewById(R.id.button1);

        botonSumar.setOnClickListener(new Vista.MyButtonListener());
        botonRestar = (Button) findViewById(R.id.button2);
        botonRestar.setOnClickListener(new Vista.MyButtonListener());
    }

    @Override
    public void setResultado(int numero) {
        TextView display = (TextView)findViewById(R.id.display);
        display.setText(numero);

    }
}



