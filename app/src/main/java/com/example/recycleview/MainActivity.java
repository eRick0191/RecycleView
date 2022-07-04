package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private Button btnSalir;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Aplicacion app = (Aplicacion) getApplication();
        recyclerView = (RecyclerView) findViewById(R.id.rec);
        recyclerView.setAdapter(app.getAdaptador());
        btnSalir = (Button) findViewById(R.id.btnSalir);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        app.getAdaptador().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    int posicion = recyclerView.getChildAdapterPosition(v);
                    String dato = app.getAlumnos().get(posicion).getNombre();
                    Toast.makeText(MainActivity.this, "Se hizo click en: " + dato, Toast.LENGTH_LONG).show();
            }
        });
    }
}