/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.spotify.entidades;

import java.util.Objects;

/**
 *
 * @author 52644
 */
public class Artista {

    private Integer codidoArtista;
    private String nacionalidad;
    private String Nombre;
    private String tipo;
    private Integer anioInicio;

    public Artista() {
    }

    public Artista(String nacionalidad, String Nombre, String tipo, Integer anioInicio) {
        this.nacionalidad = nacionalidad;
        this.Nombre = Nombre;
        this.tipo = tipo;
        this.anioInicio = anioInicio;
    }

    public Artista(Integer codidoArtista, String nacionalidad, String Nombre, String tipo, Integer anioInicio) {
        this.codidoArtista = codidoArtista;
        this.nacionalidad = nacionalidad;
        this.Nombre = Nombre;
        this.tipo = tipo;
        this.anioInicio = anioInicio;
    }

    public Integer getCodidoArtista() {
        return codidoArtista;
    }

    public void setCodidoArtista(Integer codidoArtista) {
        this.codidoArtista = codidoArtista;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getAnioInicio() {
        return anioInicio;
    }

    public void setAnioInicio(Integer anioInicio) {
        this.anioInicio = anioInicio;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.codidoArtista);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Artista other = (Artista) obj;
        return Objects.equals(this.codidoArtista, other.codidoArtista);
    }

    @Override
    public String toString() {
        return "Artista{" + "codidoArtista=" + codidoArtista + ", nacionalidad=" + nacionalidad
                + ", Nombre=" + Nombre + ", tipo=" + tipo + ", anioInicio=" + anioInicio + '}';
    }
}
