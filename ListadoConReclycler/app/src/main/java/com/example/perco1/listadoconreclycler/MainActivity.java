package com.example.perco1.listadoconreclycler;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingresar);

        Button btn= (Button) findViewById(R.id.boton1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String usu= ((EditText)findViewById(R.id.jtxtUsuario)).getText().toString();
                String pass= ((EditText)findViewById(R.id.jtxtpass)).getText().toString();
                if (pass.equals("admin") && pass.equals("admin")){
                    Intent pantalla = new Intent(MainActivity.this
                            , Ingresar.class);
                    Toast.makeText(getApplicationContext(), "Regresando...", Toast.LENGTH_SHORT).show();
                    startActivity(pantalla);
                    finish();
                }
                else{
                    Toast.makeText(getApplicationContext(), "Incorrecto Man", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}
