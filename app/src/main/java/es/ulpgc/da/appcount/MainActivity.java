package es.ulpgc.da.appcount;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {


    private TextView display;
    private Button boton;
    private Integer counter;

    class MyButtonListener implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            counter++;
            display.setText(counter.toString());
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        counter =0;
        boton = (Button) findViewById(R.id.button1);
        display = (TextView)findViewById(R.id.display);
        boton.setOnClickListener(new MyButtonListener());
    }
}
