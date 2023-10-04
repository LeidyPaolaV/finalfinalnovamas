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

import com.example.turismofinal.AmpliandoHotel;
import com.example.turismofinal.AmpliandoRestaurante;
import com.example.turismofinal.ListaRestaurantes;
import com.example.turismofinal.Moldes.MoldeRestaurante;
import com.example.turismofinal.R;

import java.util.ArrayList;

public class AdaptadorRestaurante extends RecyclerView.Adapter<AdaptadorRestaurante.viewHolder> {
    public ArrayList<MoldeRestaurante> ListaRestaurantes;

    //creamos un constructor vacio
    public AdaptadorRestaurante() {
    }


    //creamos un constructor lleno
    public AdaptadorRestaurante(ArrayList<MoldeRestaurante> listaRestaurantes) {
        this.ListaRestaurantes = listaRestaurantes;
    }

    @NonNull
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //esta parte de codigo permite crear N copias del molde grafico
        View vista= LayoutInflater.from(parent.getContext()).inflate(R.layout.molderestaurante,null,false);
        return new AdaptadorRestaurante.viewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorRestaurante.viewHolder holder, int position) {
        holder.actualizarDatos(ListaRestaurantes.get(position));

    }

    @Override
    public int getItemCount() {
        return ListaRestaurantes.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {

        ImageView fotoRestaurante;
        TextView nombreRestaurante;
        TextView precioRestaurante;
        TextView contactoRestaurante;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            fotoRestaurante=itemView.findViewById(R.id.restauranteencantador);
            nombreRestaurante=itemView.findViewById(R.id.nombrelistarestaurantes);
            precioRestaurante=itemView.findViewById(R.id.preciolistarestaurantes);
            contactoRestaurante=itemView.findViewById(R.id.telefonorestaurante);
        }

        public void actualizarDatos(MoldeRestaurante moldeRestaurante) {
            fotoRestaurante.setImageResource(moldeRestaurante.getFoto());
            nombreRestaurante.setText(moldeRestaurante.getNombre());
            precioRestaurante.setText(moldeRestaurante.getRangoprecio());
            contactoRestaurante.setText(moldeRestaurante.getTelefono());

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(itemView.getContext(), AmpliandoRestaurante.class);
                    intent.putExtra("datosrestaurante",moldeRestaurante);
                    itemView.getContext().startActivity(intent);
                }
            });

        }
    }
}

