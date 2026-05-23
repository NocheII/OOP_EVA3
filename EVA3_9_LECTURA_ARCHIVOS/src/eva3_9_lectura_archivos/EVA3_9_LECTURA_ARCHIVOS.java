/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_9_lectura_archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.System.in;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 *
 * @author Moren
 */
public class EVA3_9_LECTURA_ARCHIVOS {
    public static void main(String[] args) {
        String ruta = "C:\\caparch\\Texto.txt";
        try {
            readUsingFiles(ruta);
            readUsingScanner(ruta);
            readUsingBufferedReader(ruta);
        } catch (IOException ex) {
            ex.printStackTrace();        }
    }
    public static void readUsingFiles(String ruta) throws IOException{
        System.out.println("LECTURA DE ARCHIVOS USANDO FILES");
        Path path = Paths.get(ruta);
        String cade = Files.readString(path);
        System.out.println(cade);
    }
    //Lee el archivo linea por linea
    public static void readUsingScanner(String ruta) throws FileNotFoundException{
        System.out.println("LECTURA DE ARCHIVOS USANDO SCANNER");
        File source = new File(ruta);
        Scanner scanner = new Scanner(source);
        String cade;
        int cont = 1;
        while(scanner.hasNextLine()){
            cade = cont + "-" +scanner.nextLine();
            cont++;
            System.out.println(cade);
        }
    }
    public static void readUsingBufferedReader(String ruta) throws FileNotFoundException, IOException{
        System.out.println("LECTURA DE ARCHIVOS USANDO BUFFERED READER");
        File source = new File(ruta);
        FileInputStream fis = new FileInputStream(source);
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);
        String cade;
        while((cade = br.readLine())!= null){
            System.out.println(cade);
        }
    }
    
}
