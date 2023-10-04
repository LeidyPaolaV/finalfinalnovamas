package com.example.turismofinal;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.service.autofill.FillEventHistory;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    //ATRIBUTOS DE LA CLASE
    EditText cajaNombreUsuario;
    EditText cajaContrasena;

    Button botoningreseaqui;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        cajaNombreUsuario=findViewById(R.id.nombreusuario);
        cajaContrasena=findViewById(R.id.passworUsuario);
        botoningreseaqui=findViewById(R.id.botoningresar);

        botoningreseaqui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //capturando datos de las cajas (Edittext)
                String nombreUsuario=cajaNombreUsuario.getText().toString();
                String passworUsuario=cajaContrasena.getText().toString();

              //  Toast.makeText(Login.this, "Su nombre es : "+nombreUsuario, Toast.LENGTH_SHORT).show();
             //   Toast.makeText(Login.this, "Su contraseña es: "+passworUsuario, Toast.LENGTH_SHORT).show();

                //Abrimos una nueva actividad (Home)
                Intent intent=new Intent(Login. this, Home.class);

                //Pasando datos a la nueva Actividad
               intent.putExtra("nombre", nombreUsuario);
                intent.putExtra("contraseña", passworUsuario);

                startActivity(intent);
            }
        });





    }
}