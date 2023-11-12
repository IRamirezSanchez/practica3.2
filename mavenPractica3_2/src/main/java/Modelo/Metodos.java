package Modelo;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFrame;

public class Metodos {
    
    private static int mouseX, mouseY;
    private static boolean mousePressed;
     
    public static void vibrar(JFrame component) {
        int duracion = 750; // Duración de la vibración (en milisegundos)

        //int nuevoY = component.getY();
        int nuevoY = component.getLocationOnScreen().y;
        //int nuevoX = component.getX();
        int nuevoX = component.getLocationOnScreen().x;

        for (int i = 0; i < duracion; i++) {
            if (i % 2 == 0) {
                component.setLocation(nuevoY + 5, nuevoX + 5);
            } else {
                component.setLocation(nuevoY, nuevoX);
            }

        }

    }
   
    public static void habilitarArrastre(JFrame frame) {
        frame.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                mousePressed = true;
                mouseX = e.getX();
                mouseY = e.getY();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                mousePressed = false;
            }
        });

        frame.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                if (mousePressed) {
                    int x = e.getXOnScreen();
                    int y = e.getYOnScreen();
                    frame.setLocation(x - mouseX, y - mouseY);
                }
            }
        });
    }



    
    public static boolean esCorreoValido(String correo) {
        // Expresión regular para validar un correo electrónico
        String regex = "^[A-Za-z0-9]{5,}@[A-Za-z0-9]+\\.[A-Za-z]{2,3}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(correo);
        return matcher.matches();
    }

      /**
     * Crea un String con los campos rellenos con un "1" y los que no "0" del
     * formulario 1- Nombre 2- Apellidos 3- FechaNac 4- Correo
     *
     * @param nombre
     * @param apellidos
     * @param fechaNac
     * @param correo
     * @return String campos rellenados ejemplo "1010".
     */
    public static String contadorCampos(String nombre, String apellidos, String fechaNac, String correo) {
        String contador = "";
        if (nombre == null || nombre.equals("")) {

            contador += "0";
        } else {
            contador += "1";
        }
        if (apellidos == null || apellidos.equals("")) {

            contador += "0";
        } else {
            contador += "1";
        }

        if (fechaNac == null || fechaNac.equals("")) {

            contador += "0";
        } else {
            contador += "1";
        }

        if (correo == null || correo.equals("")) {

            contador += "0";
        } else {
            contador += "1";
        }

        return contador;
    }
    
    public static String elegirQuery(String campos) {
        int contador = 0;

        String query = "INSERT INTO users (usuario, contrasenia";
        String query2 = ") VALUES (?, ?";
        if (campos.charAt(0) == '1') {
            query = query + ", nombre";
            contador++;
        }

        if (campos.charAt(1) == '1') {
            query = query + ", apellidos";
            contador++;
        }

        if (campos.charAt(2) == '1') {
            query = query + ", fechaNac";
            contador++;
        }

        if (campos.charAt(3) == '1') {
            query = query + ", correo";
            contador++;
        }

        query = query + query2 + contadorVALUES(contador) + ")";
        return query;
    }

    private static String contadorVALUES(int contador) {
        String solucion = "";

        switch (contador) {
            case 1:
                solucion = ", ?";
                break;
            case 2:
                solucion = ", ?, ?";
                break;
            case 3:
                solucion = ", ?, ?, ?";
                break;
            case 4:
                solucion = ", ?, ?, ?, ?";
                break;
            case 0:
                solucion = "";
                break;
            default:
                System.out.println("Error: Opcion no disponible");
                break;
        }
        return solucion;
    }
}
