package com.eisusquiza.appusuarios;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class EdicionFinal extends AppCompatActivity {

    EditText edtNombre, edtTelefono, edtEmail, edtDescripcion;
    public Button btnBotonSig3;


    public void init3() {
        btnBotonSig3 = (Button) findViewById(R.id.btnBotonSig);
        btnBotonSig3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombreusu = edtNombre.getText().toString();
                String telefusu = edtTelefono.getText().toString();
                String emailusu = edtEmail.getText().toString();
                String descripusu= edtDescripcion.getText().toString();
                Intent starNewActivity = new Intent(EdicionFinal.this, ConfirmarDatos.class);
                Bundle parametros = new Bundle();
                parametros.putString("Nombre", nombreusu);
                starNewActivity.putExtra("Nombre", nombreusu);
                starNewActivity.putExtra("Telefono", telefusu);
                starNewActivity.putExtra("Email",emailusu);
                starNewActivity.putExtra("Descripcion", descripusu);
                startActivity(starNewActivity);
            }
        });

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edicion_final);
        init3();


        edtNombre = (EditText) findViewById(R.id.edtNombre);
        edtTelefono = (EditText) findViewById(R.id.edtTelefono);
        edtEmail= (EditText) findViewById(R.id.edtEmail);
        edtDescripcion = (EditText) findViewById(R.id.edtDescripcion);
    }
}
