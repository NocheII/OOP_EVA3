/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_7_throws;

/**
 *
 * @author Moren
 */
public class EVA3_7_THROWS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            System.out.println("Resultado = " + division(10,0));
            // TODO code application logic here
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    //throw es principalmente para excepciones de tipo checked
    
    public static int division (int x, int y) throws Exception{
        int resu = 0;
        
        if(y==0)
            throw new Exception("el divisor no puede ser cero!!");
        // throw nos permite lanzar una excepcion a cualquier clase
        resu = x / y;
        return resu;
    }    
}
