package com.example.myapplication.Principales;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.myapplication.R;

public class PedidosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pedidos);
    }
    public void btnPantPedidosToPantAjustesUsuario(View view){
        Intent i = new Intent(this, AjustesUsuarioActivity.class);
        startActivity(i);
    }

    public void btnPantPedidosToPantPedido(View view){
        Intent i = new Intent(this, PedidoActivity.class);
        startActivity(i);
    }

}