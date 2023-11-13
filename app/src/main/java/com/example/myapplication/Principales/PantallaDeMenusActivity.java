package com.example.myapplication.Principales;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.Principales.Clases.Producto;
import com.example.myapplication.R;

public class PantallaDeMenusActivity extends AppCompatActivity {
    private ImageView imgKebab;
    private ImageView imgBebidas;
    private ImageView imgGuarnicion;
    private ImageView imgPizza;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_de_menus);
        Toast.makeText(PantallaDeMenusActivity.this, "Solo carne", Toast.LENGTH_SHORT).show();
        imgKebab = findViewById(R.id.imgKebab);
        imgBebidas = findViewById(R.id.imgBebidas);
        imgGuarnicion = findViewById(R.id.imgGuarnicion);
        imgPizza = findViewById(R.id.imgPizza);
       // imgKebab.setOnClickListener(this::onClickImagenes/*, ""*/);



    }

//para diferenciar los productos y que en la pantalla de Producto sepa qué productos has elegido
    //quiero enviarle un parametro al méotodo onClickImagenes, no he sido capaz.
    public void onClickImagenes(View view/*, String producto*/) {
        Intent i = new Intent(this, Producto.class);
        i.putExtra("prod", 1);
        startActivity(i);
    }





    public void btnPantMenusToPantCarrito(View view) {
        Intent i = new Intent(this, CarritoActivity.class);
        startActivity(i);
    }

    public void btnPantMenusToPantProducto(View view) {
        Intent i = new Intent(this, ProductoActivity.class);
        startActivity(i);
    }

    public void btnPantMenusToPantGuarnicionBebidas(View view) {
        Intent i = new Intent(this, GuarnicionBebidasActivity.class);
        startActivity(i);
    }
    public void btnPantMenusToPantInicio(View view) {
        finish();
    }

}