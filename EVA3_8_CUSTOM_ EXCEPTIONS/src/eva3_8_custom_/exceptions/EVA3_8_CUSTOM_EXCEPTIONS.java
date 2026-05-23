/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_8_custom_.exceptions;

/**
 *
 * @author Moren
 */
public class EVA3_8_CUSTOM_EXCEPTIONS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
            try{
                //throw new MiExcepcion("Excepcion personalizada!!");
                throw new MiCheckedException("Excepcion personalizada!!");
            }catch (MiCheckedException ex){
                Logger.getLogger(EVA3_8_CUSTOM_EXCEPTIONS)
            }
        // TODO code application logic here
    }
    
}

class MiExcepcion extends RuntimeException{
    public MiExcepcion(String message){
        super(message);
    }
}

class MiCheckedException extends Exception{
    public MiCheckedException(String message){
        super(message);
    }
}
