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
        
                      
        boolean is3 = i % 3 == 0;		//GIVE IS3 THE VALUE OF TRUE IF IS MOD 3 
        boolean is5 = i % 5 == 0;		//GIVE IS5 THE VALUE OF TRUE IF IS MOD 5  
        
        
        if (is3 && is5)       	//IF BOTH ARE TRUE PRINT FIZZBUZZ
        {
            System.out.println("FizzBuzz");
        }       
        else if (is3)         	//IF IS TRUE PRINT FIZZ
        {
            System.out.println("Fizz");
        }
        else if (is5)      		//IF IS TRUE PRINT BUZZ
        {
            System.out.println("Buzz");
        }
        else                    //IF NOT TRUE PRINT THE NUMBER
        {
            System.out.println(i);
        }
    }
}

}