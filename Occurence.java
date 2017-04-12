/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package occurence;

/**
 *
 * @author Austin
 */
import java.util.*;
import java.util.Scanner;

public class Occurence {

    public static void main(String[] args) throws NoSuchElementException
    { 

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter integers to be counted for occurence. Enter 0 to stop: ");
        System.out.println();

        Map<Integer, Integer> map = new HashMap<>();
        
        int numbers;
        

        while((numbers = keyboard.nextInt()) != 0) 
        {        
            if (!map.containsKey(numbers))
                map.put(numbers, 1);
            else
            {
                int value = map.get(numbers);
                value++;
                map.put(numbers, value);  
            }                                     
        }
                    
        int maxValue=(Collections.max(map.values()));  
        Set<Map.Entry<Integer, Integer>> entrySet = map.entrySet();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {  
            if (entry.getValue()==maxValue) 
            {
                System.out.println("Number " + entry.getKey()+ " occurred the most" );    
            }
       
    }


}

}