package com.example.turismofinal.Moldes;

import java.io.Serializable;

public class MoldeRestaurante implements Serializable {
    private String nombre;
    private String telefono;
    private String rangoprecio;
    private String platorecomendado;
    private Integer foto;
    private  Integer fotoadicional;
    private String resena;

    public MoldeRestaurante(String nombre, String telefono, String rangoprecio, String platorecomendado, Integer foto, Integer fotoadicional, String resena) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.rangoprecio = rangoprecio;
        this.platorecomendado = platorecomendado;
        this.foto = foto;
        this.fotoadicional = fotoadicional;
        this.resena = resena;
    }

    public String getResena() {
        return resena;
    }

    public void setResena(String resena) {
        this.resena = resena;
    }

    public Integer getFotoadicional() {
        return fotoadicional;
    }

    public void setFotoadicional(Integer fotoadicional) {
        this.fotoadicional = fotoadicional;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(Integer foto) {
        this.foto = foto;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getRangoprecio() {
        return rangoprecio;
    }

    public void setRangoprecio(String rangoprecio) {
        this.rangoprecio = rangoprecio;
    }

    public String getPlatorecomendado() {
        return platorecomendado;
    }

    public void setPlatorecomendado(String platorecomendado) {
        this.platorecomendado = platorecomendado;
    }




}

