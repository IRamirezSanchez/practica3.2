package Modelo;

import java.util.TreeMap;

public class Gestor_Usuarios {

    private static TreeMap<String, String> usuariosContraseñas;

    public Gestor_Usuarios() {
        usuariosContraseñas = new TreeMap<>();        
        usuariosContraseñas.put("isra", "1234");
    }
    
    public static boolean comprobarUsuarioContrasenia(String usuario, String contrasenia) {
        return usuariosContraseñas.containsKey(usuario) && usuariosContraseñas.get(usuario).equals(contrasenia);
    }

    public static void agregarUsuario(String usuario, String contrasenia) {
        usuariosContraseñas.put(usuario, contrasenia);
    }

}
