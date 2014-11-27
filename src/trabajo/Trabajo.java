/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajo;

/**
 *
 * @author Usuario
 */
public class Trabajo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        int d,f;
        System.out.println("Ingrese un numero: ");
        
        int numeros[][]= new int[4][4];
        int contador= 0;
        for(d=0;d<4;d++){
            for(f=0;f<4;f++){
                  if(d%2==1){
                    numeros[d][f]= d*f;
                  }else{
                    numeros[d][f]=d+f;
                  }
            }
        System.out.println("El numero es:");
        
    }
    }
    
}
    
