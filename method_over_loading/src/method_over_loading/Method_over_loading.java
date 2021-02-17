/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package method_over_loading;

/**
 *
 * @author amanlab02
 */

class fact{
 
 int factorial_Method(int number){
     int fact= 1;
     int i;
    for( i=1;i<=number;i++){    
      fact=fact*i;    
 
     
    }
     return fact;

 }
}

public class Method_over_loading {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    fact f =new fact();
    
        int b =f.factorial_Method(5);
        System.out.println(b);
        
    }
    
}
