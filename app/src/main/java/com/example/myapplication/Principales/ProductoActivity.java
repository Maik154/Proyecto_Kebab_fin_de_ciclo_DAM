package com.example.myapplication.Principales;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

public class ProductoActivity extends AppCompatActivity {
    private Spinner spContenido;
    private Spinner spCarnes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_producto);
        spCarnes = findViewById(R.id.spCarnes);
        spContenido = findViewById(R.id.spContenido);
        spContenido.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.contenido)));
        spCarnes.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.carnes)));
        spContenido.getResources().getStringArray(R.array.contenido);

        spContenido.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                switch (position) {
                    case /*Mixto*/0:
                        spCarnes.setVisibility(View.VISIBLE);
                        Toast.makeText(ProductoActivity.this, "Mixto", Toast.LENGTH_SHORT).show();
                        break;
                    case /*Solo carne*/1:
                        spCarnes.setVisibility(View.VISIBLE);
                        Toast.makeText(ProductoActivity.this, "Solo carne", Toast.LENGTH_SHORT).show();
                        break;
                    case /*Vegetal*/2:
                       spCarnes.setVisibility(View.GONE);
                        Toast.makeText(ProductoActivity.this, "Vegetal", Toast.LENGTH_SHORT).show();
//
                        break;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
    }

}