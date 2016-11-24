package com.eisusquiza.appusuarios;

import android.app.DialogFragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.support.v4.app.Fragment;
import android.app.FragmentTransaction;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.w3c.dom.Text;


public class MainActivity extends AppCompatActivity {

    EditText edtNombre, edtTelefono, edtEmail, edtDescripcion;
    public Button btnBotonSig;


    public void init() {
        btnBotonSig = (Button) findViewById(R.id.btnBotonSig);
        btnBotonSig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombreusu = edtNombre.getText().toString();
                String telefusu = edtTelefono.getText().toString();
                String emailusu = edtEmail.getText().toString();
                String descripusu= edtDescripcion.getText().toString();
                Intent starNewActivity = new Intent(MainActivity.this, ConfirmarDatos.class);
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
        setContentView(R.layout.activity_main);
        init();

        edtNombre = (EditText) findViewById(R.id.edtNombre);
        edtTelefono = (EditText) findViewById(R.id.edtTelefono);
        edtEmail= (EditText) findViewById(R.id.edtEmail);
        edtDescripcion = (EditText) findViewById(R.id.edtDescripcion);
    }



    public void showDatePickerDialog(View v) {
        DialogFragment newFragment = new DatePickerFragment();
        newFragment.show(getFragmentManager(),"datePicker");
    }

}
