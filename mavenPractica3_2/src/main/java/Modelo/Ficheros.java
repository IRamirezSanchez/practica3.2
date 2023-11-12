package Modelo;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;

public class Ficheros {

    public static void guardarFichero(String entrada, JFileChooser archivo) throws IOException {       
        File archivoGuardar = archivo.getSelectedFile();
        try (FileWriter fw = new FileWriter(archivoGuardar)) {
            fw.write(entrada);
        }       
    }
    
    public static String leerFichero(JFileChooser archivo) throws IOException {        
        File archivoAbrir = archivo.getSelectedFile();
        try(FileReader fr = new FileReader(archivoAbrir)){
        StringBuilder contenido =new StringBuilder();
        int caracter;
        while((caracter=fr.read())!= -1){
            contenido.append((char)caracter);
        }
        return  contenido.toString();
        }
        
    }
}
