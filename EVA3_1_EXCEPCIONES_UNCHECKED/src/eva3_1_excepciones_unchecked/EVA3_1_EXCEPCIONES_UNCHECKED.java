/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_1_excepciones_unchecked;

/**
 *
 * @author Moren
 */
public class EVA3_1_EXCEPCIONES_UNCHECKED {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //ARITHMETIC EXCEPTION --> DIVISION ENTRE CERO
        /*int x = 100, y = 0, resu;
        resu = x / y;
        System.out.println("Resu x / y = " + resu);*/
        
        //Arrayindexoutofboundsexception
        /*int[] arreglo = new int[5];
        System.out.println(arreglo[6]);*/
        //nullpointerexception
        String cade = null;
        System.out.println(cade.length());
        
        
    }
    
}
