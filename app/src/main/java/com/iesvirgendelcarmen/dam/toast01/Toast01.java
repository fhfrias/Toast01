package com.iesvirgendelcarmen.dam.toast01;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Toast01 extends AppCompatActivity {

    Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast01);

        boton = findViewById(R.id.boton);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context contexto = getApplicationContext();
                CharSequence texto = "EJEMPLO TOAST";
                int duracion = Toast.LENGTH_SHORT;
                int posx = 200;
                int posy = 325;


                Toast toast = Toast.makeText(contexto, texto, duracion);
                toast.setGravity(Gravity.RIGHT | Gravity.TOP, posx, posy);
                toast.show();
            }
        });


    }

}
