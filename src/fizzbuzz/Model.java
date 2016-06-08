/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fizzbuzz;

/**
 * 
 * @author Andres
 */
public class Model {
    
public void DoFizzBuzz(){    

    for(int i=1 ; i <= 100; i++) {
        
                      
        boolean is3 = i % 3 == 0;   
        boolean is5 = i % 5 == 0;  
        
        
        if (is3 && is5)       
        {
            System.out.println("FizzBuzz");
        }       
        else if (is3)         
        {
            System.out.println("Fizz");
        }
        else if (is5)      
        {
            System.out.println("Buzz");
        }
        else                    
        {
            System.out.println(i);
        }
    }
}

}