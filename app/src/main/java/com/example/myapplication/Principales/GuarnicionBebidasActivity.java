package com.example.myapplication.Principales;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class GuarnicionBebidasActivity extends AppCompatActivity {
    private ImageButton btnBack;
    //private Button btnAñadir;
    private TextView tvContPatatas, tvContArroz, tvContAlitas, tvContNuggets;
    private CheckBox chkPatatas, chkArroz, chkAlitas, chkNuggets;
    private FloatingActionButton btnPlusPatatas, btnPlusAlitas, btnPlusArroz, btnPlusNuggets;
    private FloatingActionButton btnMinusPatatas, btnMinusArroz, btnMinusAlitas, btnMinusNuggets;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guarnicion_bebidas);
        //btnAñadir = findViewById(R.id.btnAñadir);
        btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(this::btnBack);
        int contPatatas, contArroz, contAlitas, contNuggets = 0;
        /* -------- CHECKBOXES --------- */
        chkPatatas = findViewById(R.id.chkPatatas);
        chkArroz = findViewById(R.id.chkArroz);
        chkAlitas = findViewById(R.id.chkAlitas);
        chkNuggets = findViewById(R.id.chkNuggets);
//        /* -------- Botones de sumar y restar --------- */
        btnPlusPatatas = findViewById(R.id.btnPlusPatatas);
        btnPlusAlitas = findViewById(R.id.btnPlusAlitas);
        btnPlusArroz = findViewById(R.id.btnPlusArroz);
        btnPlusNuggets = findViewById(R.id.btnPlusNuggets);
        btnMinusPatatas = findViewById(R.id.btnMinusPatatas);
        btnMinusArroz = findViewById(R.id.btnMinusArroz);
        btnMinusAlitas = findViewById(R.id.btnMinusAlitas);
        btnMinusNuggets = findViewById(R.id.btnMinusNuggets);
//        /* -------- Textos de contadores de acompañantes --------- */
        tvContPatatas = findViewById(R.id.tvContPatatas);
        tvContArroz = findViewById(R.id.tvContArroz);
        tvContAlitas = findViewById(R.id.tvContAlitas);
        tvContNuggets = findViewById(R.id.tvContNuggets);
    }
    public void btnBack(View v){
        finish();
    }

}