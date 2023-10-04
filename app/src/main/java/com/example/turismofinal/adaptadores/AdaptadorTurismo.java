package com.example.turismofinal.adaptadores;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.turismofinal.AmpliandoTurismo;

import com.example.turismofinal.Moldes.MoldeTurismo;
import com.example.turismofinal.R;

import java.util.ArrayList;

public class AdaptadorTurismo extends RecyclerView.Adapter<AdaptadorTurismo.viewHolder> {
    public ArrayList<MoldeTurismo> listaTurismo;

    //creamos un constructor vacio
    public AdaptadorTurismo() {
    }


    //creamos un constructor lleno
    public AdaptadorTurismo(ArrayList<MoldeTurismo> listaTurismo) {
        this.listaTurismo = listaTurismo;
    }

    @NonNull
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //esta parte de codigo permite crear N copias del molde grafico
        View vista= LayoutInflater.from(parent.getContext()).inflate(R.layout.moldesitiosturisticos,null,false);
        return new AdaptadorTurismo.viewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorTurismo.viewHolder holder, int position) {
        holder.actualizarDatos(listaTurismo.get(position));
    }

    @Override
    public int getItemCount() {
        return listaTurismo.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {

        ImageView imagentourvalle;
        TextView nombreSitioTuristico;
        TextView rangoprecioSitios;
        TextView contactositios;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            imagentourvalle=itemView.findViewById(R.id.imagentourvalle);
            nombreSitioTuristico=itemView.findViewById(R.id.sitioturistico);
            rangoprecioSitios=itemView.findViewById(R.id.rangoprecioSitios);
            contactositios=itemView.findViewById(R.id.telefonoSitios);
        }

        public void actualizarDatos(MoldeTurismo moldeTurismo) {
            imagentourvalle.setImageResource(moldeTurismo.getFoto());
            nombreSitioTuristico.setText(moldeTurismo.getNombre());
            rangoprecioSitios.setText(moldeTurismo.getPrecio());
            contactositios.setText(moldeTurismo.getTelefono());

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(itemView.getContext(), AmpliandoTurismo.class);
                    intent.putExtra("datosTurismo",moldeTurismo);
                    itemView.getContext().startActivity(intent);
                }
            });

        }
    }
}


