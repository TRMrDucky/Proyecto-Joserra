/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.spotify.dtos;

/**
 *
 * @author 52644
 */
public class RegistrarArtistaDTO {

    private String nacionalidad;
    private String Nombre;
    private String tipo;
    private Integer anioInicio;

    public RegistrarArtistaDTO(String nacionalidad, String Nombre, String tipo, Integer anioInicio) {
        this.nacionalidad = nacionalidad;
        this.Nombre = Nombre;
        this.tipo = tipo;
        this.anioInicio = anioInicio;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public Integer getAnioInicio() {
        return anioInicio;
    }
    
    
    
}
