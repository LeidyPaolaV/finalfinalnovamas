package com.example.turismofinal;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.example.turismofinal.Moldes.MoldeHotel;
import com.example.turismofinal.adaptadores.AdaptadorHotel;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;


import java.util.ArrayList;

public class ListaHoteles extends AppCompatActivity {

    ArrayList<MoldeHotel> listaHoteles=new ArrayList<>();
    RecyclerView recyclerView;

    FirebaseFirestore db = FirebaseFirestore.getInstance();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_hoteles);
        recyclerView=findViewById(R.id.listadinamicahoteles);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

        db.collection("hoteles")
                .get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                        if (task.isSuccessful()) {
                            for (QueryDocumentSnapshot document : task.getResult()) {

                                String nombreHotel=document.getString("nombre");
                                String precioHotel=document.getString("precio");
                                Toast.makeText(ListaHoteles.this, nombreHotel + precioHotel, Toast.LENGTH_SHORT).show();


                            }
                        } else {

                        }
                    }
                });

        llenarListaConDatos();
        AdaptadorHotel adaptadorHoteles=new AdaptadorHotel(listaHoteles);
        recyclerView.setAdapter(adaptadorHoteles);

    }
    public void llenarListaConDatos(){
        listaHoteles.add(new MoldeHotel("Hotel casa Benigno", "$80000 COP", "3107099476",R.drawable.h1, "5.0 Me  senti super comoda en este lugar, me encanto",R.drawable.hoteee));
        listaHoteles.add(new MoldeHotel("Hotel caña de azùcar", "$150000 COP", "3225457893",R.drawable.h2, "4.0 me gusto mucho, pero deberian de dar mas desayuno, muy poco",R.drawable.cache));
        listaHoteles.add(new MoldeHotel("Hotel flor de durazno", "$180000 COP", "3152635846",R.drawable.h3, "En este maravilloso hotel estaras tan comodo que no extrañaras tu casa",R.drawable.dec));
        listaHoteles.add(new MoldeHotel("Hotel la campera", "$200000 COP", "3053425935",R.drawable.h4, "En este maravilloso hotel estaras tan comodo que no extrañaras tu casa", R.drawable.fff));
        listaHoteles.add(new MoldeHotel("Hotel villas vieja", "$350000 COP", "3286471200",R.drawable.h5, "En este maravilloso hotel estaras tan comodo que no extrañaras tu casa",R.drawable.reee));
    }
}



