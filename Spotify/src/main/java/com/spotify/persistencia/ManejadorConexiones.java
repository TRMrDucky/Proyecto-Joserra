/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.spotify.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author 52644
 */
public class ManejadorConexiones {
    //Informacion para conectar a la base de datos
        private final String cadenaConexion = "jdbc:mysql://127.0.0.1/spotify_10am";
        private final String usuario = "root";
        private final String contrasenia = "Numeros1-2";
        
        public Connection crearConexion() throws SQLException{
            Connection conexion = DriverManager.getConnection(
                    cadenaConexion,
                    usuario,
                    contrasenia
            );
            return conexion;
        }
        
}
