package com.example.turismofinal;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.example.turismofinal.Moldes.MoldeHotel;
import com.example.turismofinal.Moldes.MoldeTurismo;
import com.example.turismofinal.adaptadores.AdaptadorHotel;
import com.example.turismofinal.adaptadores.AdaptadorTurismo;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;


import java.util.ArrayList;

public class ListaTurismo extends AppCompatActivity {

    ArrayList<MoldeTurismo> listaTurismo=new ArrayList<>();
    RecyclerView recyclerView;

    FirebaseFirestore db = FirebaseFirestore.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_turismo);
        recyclerView=findViewById(R.id.listadinamicaturismo);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));


        db.collection("sitiosturisticos")
                .get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                        if (task.isSuccessful()) {
                            for (QueryDocumentSnapshot document : task.getResult()) {

                                String nombreSitios=document.getString("nombre");
                                String precioSitios=document.getString("precio");
                                Toast.makeText(ListaTurismo.this, nombreSitios + precioSitios, Toast.LENGTH_SHORT).show();

                            }
                        } else {

                        }}});


        llenarListaConDatos();
        AdaptadorTurismo adaptadorTurismo=new AdaptadorTurismo(listaTurismo);
        recyclerView.setAdapter(adaptadorTurismo);

    }
    public void llenarListaConDatos(){
        listaTurismo.add(new MoldeTurismo("Valle Encantado","Luis Alberto", "3154685892","70.000",R.drawable.s1, "5.0 me gusto la comida, me encanto la limpieza",R.drawable.hdd));
        listaTurismo.add(new MoldeTurismo("El Lugar Deseado", "Carlota Hernandez", "3215647859", "80.000",R.drawable.s2, "4.0 no me gusto como me atendio la mesera",R.drawable.gta));
        listaTurismo.add(new MoldeTurismo("Un Buen Sitio", "Lina Rios", "3156789126", "92.000",R.drawable.s3, "3.7 No me dieron toallas ", R.drawable.boda));
        listaTurismo.add(new MoldeTurismo("El Descanso Merecido", "Melissa Jaramillo", "3127892462", "102.000",R.drawable.s4, "5.0 Todo me encanto, gracias a la señora de la limpieza",R.drawable.original));
    }
}