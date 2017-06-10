package com.example.perco1.listadoconreclycler;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;
import java.util.List;

public class Ingresar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        RecyclerView rv= (RecyclerView) findViewById(R.id.lista);
        LinearLayoutManager llm=new LinearLayoutManager(this);
        rv.setLayoutManager(llm);


        List<Datos> listaNombres= Arrays.asList(new Datos(R.mipmap.ic_launcher,"Nombre1","Apellido1"),
                new Datos(R.mipmap.ic_launcher,"Nombre2","Apellido2"),
                new Datos(R.mipmap.ic_launcher,"Nombre3","Apellido3"),
                new Datos(R.mipmap.ic_launcher,"Nombre4","Apellido4")
        );
        Adaptador adapter=new Adaptador(listaNombres);
        rv.setAdapter(adapter);






    }
}
