package com.eisusquiza.appusuarios;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.util.Printer;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ConfirmarDatos extends AppCompatActivity {

    TextView tvNombre2;
    TextView tvTelefono2;
    TextView tvEmail2;
    TextView tvDescripcion2;

    public Button btnBotonBack;


    public void init2 (){
        Button btnBotonBack = (Button) findViewById(R.id.btnBotonBack);
        btnBotonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();

            }
        });


      }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmar_datos);
        init2();


        Intent thisform = getIntent();
        Bundle recibirParametro = thisform.getExtras();
        String nombreusu  = (String) recibirParametro.get("Nombre");
        String telefusu  = (String) recibirParametro.get("Telefono");
        String emailusu = (String) recibirParametro.get("Email");
        String descripusu = (String) recibirParametro.get("Descripcion");
        tvNombre2 = (TextView) findViewById(R.id.tvNombre2);
        tvTelefono2 = (TextView) findViewById(R.id.tvTelefono2);
        tvEmail2 = (TextView) findViewById(R.id.tvEmail2);
        tvDescripcion2 = (TextView) findViewById(R.id.tvDescripcion2);

        tvNombre2.setText(nombreusu);
        tvTelefono2.setText(telefusu);
        tvEmail2.setText(emailusu);
        tvDescripcion2.setText(descripusu);

        }



}
