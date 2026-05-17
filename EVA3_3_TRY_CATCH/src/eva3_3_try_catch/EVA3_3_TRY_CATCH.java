/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_3_try_catch;

/**
 *
 * @author Moren
 */
public class EVA3_3_TRY_CATCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = 100, y = 0, resu = 0;
        try{
            resu = x / y;
            System.out.print("ESTO NUNCA SE EJECUTA");
            //MAS INSTRUCCCIONES... PERO NO SE EJECUTAN SI HAY UNA EXCEPCION ANTES 
        }catch(ArithmeticException e){
            // QUE HACEMOS CON LA EXCEPCION
            // NADA IMPIDE QUE VUELVAN A GENERAR UNA EXCEPCION
            System.out.println("Indeterminado");
        }
        System.out.println("Resu x / y = " + resu);
        // TODO code application logic here
    }
    
}
