package com.example.turismofinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.turismofinal.Moldes.MoldeHotel;
import com.example.turismofinal.Moldes.MoldeRestaurante;

public class AmpliandoRestaurante extends AppCompatActivity {

    MoldeRestaurante moldeRestaurante;
    TextView Ampliandonombrerest;
    ImageView AmpliandofotoRest;
    TextView AmpliandoprecioRest;
    TextView Ampliandocontactohotel;
    TextView resenaAhotel;
    ImageView fotoadicional;

    public MoldeRestaurante getMoldeRestaurante() {
        return moldeRestaurante;
    }

    public void setMoldeRestaurante(MoldeRestaurante moldeRestaurante) {
        this.moldeRestaurante = moldeRestaurante;
    }


    public TextView getAmpliandonombrerest() {
        return Ampliandonombrerest;
    }

    public void setAmpliandonombrerest(TextView ampliandonombrerest) {
        Ampliandonombrerest = ampliandonombrerest;
    }

    public ImageView getAmpliandofotoRest() {
        return AmpliandofotoRest;
    }

    public void setAmpliandofotoRest(ImageView ampliandofotoRest) {
        AmpliandofotoRest = ampliandofotoRest;
    }

    public TextView getAmpliandoprecioRest() {
        return AmpliandoprecioRest;
    }

    public void setAmpliandoprecioRest(TextView ampliandoprecioRest) {
        AmpliandoprecioRest = ampliandoprecioRest;
    }

    public TextView getAmpliandocontactohotel() {
        return Ampliandocontactohotel;
    }

    public void setAmpliandocontactohotel(TextView ampliandocontactohotel) {
        Ampliandocontactohotel = ampliandocontactohotel;
    }

    public TextView getResenaAhotel() {
        return resenaAhotel;
    }

    public void setResenaAhotel(TextView resenaAhotel) {
        this.resenaAhotel = resenaAhotel;
    }

    public ImageView getFotoadicional() {
        return fotoadicional;
    }

    public void setFotoadicional(ImageView fotoadicional) {
        this.fotoadicional = fotoadicional;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ampliando_restaurante);


        Ampliandonombrerest=findViewById(R.id.Àmpliandonombrerest);
        AmpliandofotoRest=findViewById(R.id.AmpliandofotoRest);
        AmpliandoprecioRest=findViewById(R.id.AmpliandoprecioRest);
        Ampliandocontactohotel=findViewById(R.id.Ampliandocontactohotel);
        resenaAhotel=findViewById(R.id.resenaAhotelrest);
        fotoadicional=findViewById(R.id.fotoadicionalrest);






            moldeRestaurante=(MoldeRestaurante) getIntent().getSerializableExtra("datosrestaurante");
            Toast.makeText(this, moldeRestaurante.getNombre(),Toast.LENGTH_LONG).show();

        //CARGANDO LA INFO EN LOS COMPONENTES GRAFICOS
        AmpliandofotoRest.setImageResource(moldeRestaurante.getFoto());
        AmpliandoprecioRest.setText(moldeRestaurante.getRangoprecio());
        Ampliandonombrerest.setText(moldeRestaurante.getNombre());
        Ampliandocontactohotel.setText(moldeRestaurante.getTelefono());
        resenaAhotel.setText(moldeRestaurante.getResena());
        fotoadicional.setImageResource(moldeRestaurante.getFotoadicional());




    }
}