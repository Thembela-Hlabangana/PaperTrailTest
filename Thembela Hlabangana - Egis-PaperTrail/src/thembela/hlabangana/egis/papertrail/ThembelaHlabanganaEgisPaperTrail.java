/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thembela.hlabangana.egis.papertrail;

import java.util.*;

/**
 *
 * @author tnhla
 */
public class ThembelaHlabanganaEgisPaperTrail {

   
    public static void main(String[] args) {
       Question1();
       System.out.println("\nQuestion 2 starts here: \n");
       Question2();
    }
    
    public static void Question1()
    {
        
        for (int i = 1; i < 101; i++) //prints numbers from 1-100
        {
            if(i%3 == 0 && !(i%5 == 0)) //if number is a multiple of 3 but not 5
            {
               System.out.println("Rubber"); 
            }
            else 
                if(i%5 == 0 && !(i%3 == 0))
                {
                    System.out.println("Duck");//if number is a multiple of 5 but not 3
                }
                else 
                    if(i%5 == 0 && i%3 == 0)
                    {
                        System.out.println("RubberDuck");//if number is a multiple of 3 and 5
                    }
                    else
                    { //else actual number prints
                         System.out.println(i);
                    }
        }
    }
    
    public static void Question2()
    {
        //get user input
        Scanner s = new Scanner(System.in);
        System.out.println("Enter data to be encoded");
        String input = s.nextLine();
        
        //declarations
        int val = input.length(), count = 1;
        String output = "";
        
        for(int t = 0; t < val; t++) //loops through user entry
        {
            count = 1; //start count again when new letter appears
            
           //if vals match, add to counter
            while(t < val - 1 && input.charAt(t) == input.charAt(t + 1))
            {
                count++;
                t++;
            }
            output = output + input.charAt(t) + "" + count; //display each letter per iteration + number of times it appears
            
        }
         System.out.println("Length encoded data: " + output);
    }
}
