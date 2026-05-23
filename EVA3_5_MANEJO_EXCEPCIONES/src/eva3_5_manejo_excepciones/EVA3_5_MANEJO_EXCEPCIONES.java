/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_5_manejo_excepciones;
import java.util.Scanner;
/**
 *
 * @author Moren
 */
public class EVA3_5_MANEJO_EXCEPCIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x, y, resu;
        do{
            System.out.println("Introduzca el valor de X: ");
            x = input.nextInt();
            System.out.println("Introduzca el valor de Y: ");
            y = input.nextInt();
        }while(y == 0);
        resu = x / y;
        System.out.println(x + " / " + y + " = " + resu);
        // TODO code application logic here
    }
    
}
