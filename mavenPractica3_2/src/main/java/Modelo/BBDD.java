/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USER
 */
public class BBDD {
    
    
    
    
    private static String cadena_conexion;
    private static String usuario;
    private static String contrasenia;
    private static Connection con = null;
    private static PreparedStatement pstm = null;
    private static ResultSet rs = null;

    private static Connection conectarBBDD() {
        try {
            Properties propiedades = new Properties();
            propiedades.load(new FileReader("src/main/java/BBDD/configConection"));
            cadena_conexion=propiedades.getProperty("cadena_conexion");
            usuario=propiedades.getProperty("usuario");
            contrasenia=   propiedades.getProperty("contrasenia");  

            con = DriverManager.getConnection(cadena_conexion , usuario, contrasenia);
            if(con !=null){
                System.out.println("Conexion BD establecida");
            }
        } catch (SQLException e) {
            System.out.println("Error de conexion:  " + e.toString());
            
        } catch (FileNotFoundException ex) {
            System.out.println("Error, no se ha encontrado el fichero.");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        return con;

    }

    private static void desconectarBBDD(Connection con) {

        try {
            if (con != null) {
                con.close();
            }
        } catch (SQLException ex) {
            System.out.println("Error al cerrar la conexion.");
            System.out.println(ex.toString());
        }

    }

    /**
     *
     * @param usuario
     * @param nombre
     * @param contrasenia
     * @param apellidos
     * @param fechaNac
     * @param correo
     * @return True si se Guarda y False si no se guarda por que ya existe.
     */
    public static boolean guardarUsuario(String usuario, String contrasenia, String nombre, String apellidos, String fechaNac, String correo) {
        String camposSeleccionados;
        String queryFinal;
        if (consultarUsuario(usuario, contrasenia)) {
            return false;
        }
        con = conectarBBDD();

        try {
            camposSeleccionados = Metodos.contadorCampos(nombre, apellidos, fechaNac, correo);
            queryFinal = Metodos.elegirQuery(camposSeleccionados);
            pstm = con.prepareStatement(queryFinal);

            pstm.setString(1, usuario);
            pstm.setString(2, contrasenia);
            ejecutarPstm(nombre, apellidos, fechaNac, correo);
            pstm.executeUpdate();

            pstm.close();

        } catch (SQLException e) {

            System.out.println("Error:  " + e.toString());
        }

        desconectarBBDD(con);
        return true;
    }

    /**
     *
     * @param nombre
     * @param contrasenia
     * @return Boolean True, EXISTE el usuario y Boolean False, NO EXISTE el
     * usuario.
     */
    public static boolean consultarUsuario(String nombre, String contrasenia) {

        con = conectarBBDD();

        String sql = "SELECT usuario, contrasenia FROM users WHERE usuario = ? AND contrasenia = ?";

        try {
            
            pstm = con.prepareStatement(sql);

            pstm.setString(1, nombre);
            pstm.setString(2, contrasenia);

            rs = pstm.executeQuery();
            if (rs.next()) {
                // El usuario existe en la tabla
                System.out.println("El usuario existe en la tabla.");
                return true;
            } else {
                // El usuario no existe en la tabla
                System.out.println("El usuario no existe en la tabla.");
                return false;
            }
        } catch (NullPointerException es){
            System.out.println("Acceso Denegado");
        } catch (SQLException ex) {
            Logger.getLogger(BBDD.class.getName()).log(Level.SEVERE, null, ex);

        } finally {
            desconectarBBDD(con);

        }
        return false;

    }

    public static boolean modificarContrasenia(String usuario, String contrasenia) {

        con = conectarBBDD();
        
        String query = "UPDATE users SET contrasenia = ? WHERE usuario = ?";

        try {
            pstm = con.prepareStatement(query);
            pstm.setString(1, contrasenia);
            pstm.setString(2, usuario);

            int rowsUpdated = pstm.executeUpdate();

            if (rowsUpdated > 0) {
                // Se ha actualizado la contraseña exitosamente
                System.out.println("Contraseña modificada");
                return true;
            } else {
                // No se encontró al usuario o no se realizó ninguna actualización
                System.out.println("No se ha modificado la contraseña");
                return false;
            }

        } catch (SQLException ex) {
            Logger.getLogger(BBDD.class.getName()).log(Level.SEVERE, null, ex);
            

        } finally {
            desconectarBBDD(con);

        }
        return false;
    }

    

    private static void ejecutarPstm(String nombre, String apellidos, String fechaNac, String correo) {
        int contador = 3;

        try {
            if (nombre != null && !nombre.equals("")) {
                pstm.setString(contador, nombre);
                contador++;

            }

            if (apellidos != null && !apellidos.equals("")) {
                pstm.setString(contador, apellidos);
                contador++;
            }

            if (fechaNac != null && !fechaNac.equals("")) {
                pstm.setString(contador, fechaNac);
                contador++;
            }

            if (correo != null && !correo.equals("")) {
                pstm.setString(contador, correo);
                contador++;
            }

        } catch (SQLException ex) {
            Logger.getLogger(BBDD.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

  

}
