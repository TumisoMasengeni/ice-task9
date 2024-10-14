/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.jopp2;

import javax.swing.*;
/**
 *
 * @author Tumiso
 */
public class JOpp2 {

    public static void main(String[] args) {
            /*  Create a program that accepts two numbers from the user
    Create a menu with 4 numerical options for performing the
    foloowing
    1. Addition
    2. Subtraction
    3. Division
    4. Multiplication
If a a user enter a number that is not in the menu show:
"Calculation not recorgnized"
Use a while loop to keep on asking to user to enter their 
option to perform on the two numbers until you enter 0
*/
            //declaration
            int a,b;
            int results;
            int option = -1;
            
            //prompting user
            String prompt = JOptionPane.showInputDialog("Enter a value:");
            a = Integer.parseInt(prompt);
            
            prompt = JOptionPane.showInputDialog("Enter a second value:");
            b = Integer.parseInt(prompt);
            
            while(option !=0){
            System.out.println("Menu");
             System.out.println("1. Addition");
              System.out.println("2. Subtraction");
               System.out.println("3. Division");
                System.out.println("4. Multiplication");
                
                prompt = JOptionPane.showInputDialog("Select option from menu");
                option = Integer.parseInt(prompt);
                
                switch (option){
                    case 1: results = a + b;
                    System.out.println("answer:" + results);
                    break;
                    case 2: results = a - b;
                    System.out.println("answer:" + results);
                    break;
                      case 3: results = a / b;
                    System.out.println("answer:" + results);
                    break;
                      case 4: results = a * b;
                    System.out.println("answer:" + results);
                    break;
                      default: System.out.println("Calculation not recorgnized");
                }
            
            
    }
    }
}
