package com.example.myapplication.Principales;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.myapplication.R;

public class PrivacidadYSeguridadActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_privacidad_y_seguridad);
    }

    public void btnPantPrivacidadToPantAjustesUsuario(View view){
        Intent i = new Intent(this, AjustesUsuarioActivity.class);
        startActivity(i);
    }
}