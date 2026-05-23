/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_10_escritura_archivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 *
 * @author Moren
 */
public class EVA3_10_ESCRITURA_ARCHIVOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String ruta = "C:\\caparch\\";
        try {
            writeUsingFileWriter(ruta, "Hola Mundoooo!");
            writeUsingBufferedWriter(ruta, "Hola Mundoooo!");
        } catch (IOException ex) {
            ex.printStackTrace();        }
    }
    public static void writeUsingFileWriter(String ruta, String texto) throws IOException{
        System.out.println("ESCRITURA DE ARCHIVOS USANDO FILES");
        Path path = Paths.get(ruta, "writeUsingFiles.txt");
        Files.write(path, texto.getBytes());
    }
    //Lee el archivo linea por linea
    
    public static void writeUsingBufferedWriter(String ruta, String texto) throws FileNotFoundException, IOException{
        System.out.println("ESCRITURA DE ARCHIVOS USANDO BUFFERED WRITER");
        File source = new File(ruta, "writeUsingBufferedWriter.txt");
        FileOutputStream fos = new FileOutputStream(source);
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);
        String cade;
        bw.write(texto + "\n");
        bw.newLine();
        bw.close();
    }
    
}
