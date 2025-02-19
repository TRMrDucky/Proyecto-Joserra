/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.spotify.control;

import com.spotify.dtos.RegistrarArtistaDTO;
import com.spotify.entidades.Artista;
import com.spotify.persistencia.ArtistasDAO;
import com.spotify.presentacion.CatalogoArtistas;
import com.spotify.presentacion.RegistroArtista;
import java.util.List;
import javax.swing.JOptionPane;


/**
 *
 * @author 52644
 */
public class controlRegistrarArtistas {
    private CatalogoArtistas formCatalogoArtistas;
    private ArtistasDAO artistasDAO;
    private RegistroArtista formRegistroArtista;
    
    public controlRegistrarArtistas(ArtistasDAO artistasDAO){
        this.artistasDAO = artistasDAO;
    }
    
    public void iniciarCasoUso(){
        this.formRegistroArtista = new RegistroArtista(this);
        this.formRegistroArtista.setVisible(true);
    }
    
    public void registrarArtista(RegistrarArtistaDTO nuevoArtistaDTO){
        Artista artista = this.artistasDAO.registrarArtista(nuevoArtistaDTO);
        JOptionPane.showMessageDialog(formRegistroArtista, "Se registro el artista", "Informacion", JOptionPane.INFORMATION_MESSAGE);
        mostrarFormularioCatalogoArtista();
    }
    
    
    private void mostrarFormularioCatalogoArtista(){
        this.formCatalogoArtistas = new CatalogoArtistas(this);
        this.formCatalogoArtistas.setVisible(true);
    }
    
    public List<Artista> consultarListaArtistas(){
        return this.artistasDAO.consultarArtistas();
    }
}
