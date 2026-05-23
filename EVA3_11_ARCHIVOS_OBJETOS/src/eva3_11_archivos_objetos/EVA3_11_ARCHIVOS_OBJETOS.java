/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_11_archivos_objetos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.io.Serializable;

/**
 *
 * @author Moren
 */
public class EVA3_11_ARCHIVOS_OBJETOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException {
        String ruta = "C:\\caparch\\archivoObjetos.dat";
        try {
            writeObject(ruta);
            readObject(ruta);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        // TODO code application logic here
    }
    
    public static void writeObject(String ruta) throws FileNotFoundException, IOException{
        System.out.println("ESCRITURA DE ARCHIVOS USANDO OBJETOUTPUTSTREAM");
        File source = new File(ruta);
        FileOutputStream fos = new FileOutputStream(source);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(new Persona ("Juan", "Perez", 50));
        oos.writeObject(new Persona ("Pedro", "Gonzalez", 45));
        oos.writeObject(new Persona ("Kevin", "Flores", 20));
        oos.close();
    }
    
    public static void readObject(String ruta) throws FileNotFoundException, IOException, ClassNotFoundException{
        System.out.println("LECTURA DE ARCHIVOS USANDO OBJETOUTPUTSTREAM");
        File source = new File(ruta);
        FileInputStream fis = new FileInputStream(source);
        ObjectInputStream ois = new ObjectInputStream(fis);
        while(true){
            Persona perso = (Persona)ois.readObject();
            System.out.println("Nombre: " + perso.getNombre());
            System.out.println("Apellidos: " + perso.getApellidos());
            System.out.println("Edad: " + perso.getEdad());
        }
        
    }
    
}

class Persona implements Serializable{
    private String nombre;
    private String apellidos;
    private int edad;

    public Persona() {
        this.nombre = "";
        this.apellidos = "";
        this.edad = 0;
    }
        
    public Persona(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    

        
}
