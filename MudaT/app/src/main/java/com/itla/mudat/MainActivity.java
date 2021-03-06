package com.itla.mudat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Intent;
import android.text.TextUtils;

public class MainActivity extends AppCompatActivity {


    private EditText txtnombre;
    private Button btnmostrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtnombre = (EditText) findViewById(R.id.txtNombre);
        btnmostrar = (Button) findViewById(R.id.btnMostrar);

        btnmostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

         // Toast.makeText(MainActivity.this,"HOLA: ".concat(txtnombre.getText().toString()), Toast.LENGTH_LONG).show();

                Intent visualizar =new Intent(MainActivity.this,Visualizar.class);
                Bundle parametros =new Bundle();
                parametros.putString("Nombre","HOLA: ".concat(txtnombre.getText().toString()));
                visualizar.putExtras(parametros);
                startActivity(visualizar);
            }
        });
    }
}
