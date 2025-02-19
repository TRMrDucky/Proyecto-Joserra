package com.spotify.persistencia;

import com.spotify.dtos.RegistrarArtistaDTO;
import com.spotify.entidades.Artista;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author 52644
 */
public class ArtistasDAO {

    private final ManejadorConexiones manejadorConexiones;

    public ArtistasDAO(ManejadorConexiones manejadorConexiones) {
        this.manejadorConexiones = manejadorConexiones;
    }

    public Artista registrarArtista(RegistrarArtistaDTO artistaDTO) {

        String codigoSQL = """
                           INSERT INTO artistasNuevos(nacionalidad, nombre, tipo, añoInicio)
                           VALUES(?, ?, ?, ?);
                           """;

        try {
            Connection conexion = manejadorConexiones.crearConexion();

            //Prepara un comando que se puede ejecutar posteriormente
            PreparedStatement comando = conexion.prepareStatement(codigoSQL);
            comando.setString(1, artistaDTO.getNacionalidad());
            comando.setString(2, artistaDTO.getNombre());
            comando.setString(3, artistaDTO.getTipo());
            comando.setInt(4, artistaDTO.getAnioInicio());
            int filasAfectadas = comando.executeUpdate();
            System.out.println("Se registro el artista:D");
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        //Temporal, necesitamos el ID del artista que se generó
        return null;
    }
    
    public List<Artista> consultarArtistas(){
        String codigoSQL = """
                           SELECT
                           codigoArtista, 
                           nombre,
                           nacionalidad, 
                           añoInicio, 
                           tipo
                           From artistasNuevos;
                           """;
        List<Artista> listaArtistas = new LinkedList<Artista>();
        try{
            Connection conexion = this.manejadorConexiones.crearConexion();
            PreparedStatement comando = conexion.prepareStatement(codigoSQL);
            ResultSet resultadosConsulta = comando.executeQuery();
            //Nos movemos a cada una de las filas devueltas
            while(resultadosConsulta.next()){
                //Estamos dentro de una fila
                String nombre = resultadosConsulta.getString("nombre");
                Integer codigoArtista = resultadosConsulta.getInt("codigoArtista");
                String nacionalidad = resultadosConsulta.getString("nacionalidad");
                Integer anioInicio = resultadosConsulta.getInt("añoInicio");
                String tipo = resultadosConsulta.getString("tipo");
                Artista artista = new Artista(codigoArtista, nacionalidad,nombre, tipo, anioInicio);
                listaArtistas.add(artista);
            }
        }catch(SQLException e){
            System.err.println("Error al consultar los artistas" + e.getMessage());
        }
        return listaArtistas;
    }

}
