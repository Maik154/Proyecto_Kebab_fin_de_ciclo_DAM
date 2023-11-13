package com.example.myapplication.Principales;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.myapplication.R;

public class CarritoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carrito);
    }

    public void btnPantCarritoToPantMenus(View view){
        Intent i = new Intent(this, PantallaDeMenusActivity.class);
        startActivity(i);
    }

    public void btnPantCarritoToPantInicio(View view){
        Intent i = new Intent(this, PantallaDeInicio.class);
        startActivity(i);
    }
    public void btnPantCarritoToPantProcesoPago(View view){
        Intent i = new Intent(this, PagoActivity.class);
        startActivity(i);
    }
}