/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m52t2_medina;

import java.util.Scanner;

/**
 *
 * @author medinaj5733
 */
public class M52T2_Medina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // this program will say hello to the user
       System.out.println("Hello!");
      
        // then ask for their name
        String name;
        Scanner keyb = new Scanner (System.in);
        System.out.println("What's your name?");
        name = keyb.next();
        // then ask for their age
        int age;
        // finally, it will repeat those back
        System.out.println("Nice to meet you " + name + ".");
        //System.out.println("I'm much younger than " + age);
        
        
        
        
    }
    
}
