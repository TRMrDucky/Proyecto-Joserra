/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.spotify;

import com.spotify.control.controlRegistrarArtistas;
import com.spotify.dtos.RegistrarArtistaDTO;
import com.spotify.entidades.Artista;
import com.spotify.persistencia.ArtistasDAO;
import com.spotify.persistencia.ManejadorConexiones;
import com.spotify.presentacion.RegistroArtista;
import java.util.List;

/**
 *
 * @author 52644
 */
public class Spotify {

    public static void main(String[] args) {
        RegistrarArtistaDTO nuevoArtista1 = new RegistrarArtistaDTO
        ("Mexico", "Julion Alvarez", "Banda", 1999);
        
        ManejadorConexiones manejadorConexiones = new ManejadorConexiones();
        ArtistasDAO artistasDAO = new ArtistasDAO(manejadorConexiones);
        artistasDAO.registrarArtista(nuevoArtista1);
        
        controlRegistrarArtistas control = new controlRegistrarArtistas(artistasDAO);
        control.iniciarCasoUso();
    }
}
