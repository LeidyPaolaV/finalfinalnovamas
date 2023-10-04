package com.example.turismofinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.turismofinal.Moldes.MoldeRestaurante;
import com.example.turismofinal.Moldes.MoldeTurismo;

public class AmpliandoTurismo extends AppCompatActivity {

    MoldeTurismo moldeTurismo;
    TextView Àmpliandonombreturismo;
    ImageView Ampliandofototurismo;
    TextView Ampliandoprecioturismo;
    TextView Ampliandocontactoturismo;
    TextView resenaAturismo;
    ImageView fotoadicional;

    public AmpliandoTurismo() {
    }

    public AmpliandoTurismo(int contentLayoutId) {
        super(contentLayoutId);
    }

    public MoldeTurismo getMoldeTurismo() {
        return moldeTurismo;
    }

    public void setMoldeTurismo(MoldeTurismo moldeTurismo) {
        this.moldeTurismo = moldeTurismo;
    }

    public TextView getÀmpliandonombreturismo() {
        return Àmpliandonombreturismo;
    }

    public void setÀmpliandonombreturismo(TextView àmpliandonombreturismo) {
        Àmpliandonombreturismo = àmpliandonombreturismo;
    }

    public ImageView getAmpliandofototurismo() {
        return Ampliandofototurismo;
    }

    public void setAmpliandofototurismo(ImageView ampliandofototurismo) {
        Ampliandofototurismo = ampliandofototurismo;
    }

    public TextView getAmpliandoprecioturismo() {
        return Ampliandoprecioturismo;
    }

    public void setAmpliandoprecioturismo(TextView ampliandoprecioturismo) {
        Ampliandoprecioturismo = ampliandoprecioturismo;
    }

    public TextView getAmpliandocontactoturismo() {
        return Ampliandocontactoturismo;
    }

    public void setAmpliandocontactoturismo(TextView ampliandocontactoturismo) {
        Ampliandocontactoturismo = ampliandocontactoturismo;
    }

    public TextView getResenaAturismo() {
        return resenaAturismo;
    }

    public void setResenaAturismo(TextView resenaAturismo) {
        this.resenaAturismo = resenaAturismo;
    }

    public ImageView getFotoadicional() {
        return fotoadicional;
    }

    public void setFotoadicional(ImageView fotoadicional) {
        this.fotoadicional = fotoadicional;
    }



    public AmpliandoTurismo(int contentLayoutId, MoldeTurismo moldeTurismo, TextView àmpliandonombreturismo, ImageView ampliandofototurismo, TextView ampliandoprecioturismo, TextView ampliandocontactoturismo, TextView resenaAturismo, ImageView fotoadicional) {
        super(contentLayoutId);
        this.moldeTurismo = moldeTurismo;
        Àmpliandonombreturismo = àmpliandonombreturismo;
        Ampliandofototurismo = ampliandofototurismo;
        Ampliandoprecioturismo = ampliandoprecioturismo;
        Ampliandocontactoturismo = ampliandocontactoturismo;
        this.resenaAturismo = resenaAturismo;
        this.fotoadicional = fotoadicional;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ampliando_turismo);

        Àmpliandonombreturismo.findViewById(R.id.Àmpliandonombreturismo);
        Ampliandofototurismo.findViewById(R.id.Ampliandofototurismo);
        Ampliandoprecioturismo.findViewById(R.id.Ampliandoprecioturismo);
        Ampliandocontactoturismo.findViewById(R.id.Ampliandocontactoturismo);
        resenaAturismo.findViewById(R.id.resenaAturismo);
        fotoadicional.findViewById(R.id.fotoadicional);





        moldeTurismo=(MoldeTurismo) getIntent().getSerializableExtra("datosturismo");
        //Toast.makeText(this, moldeTurismo.getNombre(),Toast.LENGTH_LONG).show();

    }
}