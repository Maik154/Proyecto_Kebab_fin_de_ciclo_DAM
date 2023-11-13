package com.example.myapplication.Principales;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.example.myapplication.R;

public class PagoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pago);
        Spinner spinner_tiempo_de_espera = (Spinner) findViewById(R.id.spTiempoDeEspera);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.tiempo_de_espera, android.R.layout.simple_spinner_dropdown_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_tiempo_de_espera.setAdapter(adapter);
    }

    public void btnPantProcesoPagoToPantCarrito(View view){
        Intent i = new Intent(this, PantallaDeInicio.class);
        startActivity(i);
    }

    public void btnPantProcesoPagoToPantTerminos(View view){
        Intent i = new Intent(this, PrivacidadYSeguridadActivity.class);
        startActivity(i);
    }
}