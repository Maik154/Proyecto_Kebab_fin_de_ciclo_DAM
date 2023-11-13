package com.example.myapplication.Principales;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.example.myapplication.R;

public class PantallaDeInicio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_de_inicio);
    }

    public void btnPantInicioToPantMenus(View view){
        Intent i = new Intent(this, PantallaDeMenusActivity.class);
        i.putExtra("goBackTo", "PantInicio");
        startActivity(i);
    }

    public void btnPantInicioToPantCarrito(View view){
        Intent i = new Intent(this, CarritoActivity.class);
        i.putExtra("goBackTo", "PantInicio");
        startActivity(i);
    }

    public void btnPantInicioToPantAjustesUsuario(View view){
        Intent i = new Intent(this, AjustesUsuarioActivity.class);
        i.putExtra("goBackTo", "PantInicio");
        startActivity(i);
    }

    public void btnPantInicioToPantProducto(View view){
        Intent i = new Intent(this, ProductoActivity.class);
        i.putExtra("goBackTo", "PantInicio");
        startActivity(i);
    }


    public void btnMaps(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:42.23834579553559, -8.72776091534261"));
        i.putExtra("goBackTo", "PantInicio");
        startActivity(i);

    }

}