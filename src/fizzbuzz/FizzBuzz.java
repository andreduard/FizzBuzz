/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fizzbuzz;

/**
 *
 * @author Andres
 * 
 * Program that prints the numbers from 1 to 100. 
 * But for multiples of three print “Fizz” instead of the number and for the multiples of five print “Buzz”. 
 * For numbers which are multiples of both three and five print “FizzBuzz                                                                                                              
 * 
 */
public class FizzBuzz {

    
    public static void main(String[] args) {
        
        Model newModel = new Model(); 	
        newModel.DoFizzBuzz();			//Inicia el FizzBuzz

    }
    
}
