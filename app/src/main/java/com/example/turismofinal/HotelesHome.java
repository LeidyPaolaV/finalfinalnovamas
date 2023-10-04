package com.example.turismofinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HotelesHome extends AppCompatActivity {

    Button botonhoteles;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoteles_home);

        botonhoteles=findViewById(R.id.botonvermashoteles);

        botonhoteles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(HotelesHome.this,ListaHoteles.class);
                startActivity(intent);

            }
        });
    }
}

