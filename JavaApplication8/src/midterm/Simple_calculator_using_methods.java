/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midterm;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Simple_calculator_using_methods {
    public static int addNum(int a , int b){
        return a+b;
        
    }
    public static int subNum(int a , int b){
        return a-b;
    }
    
    public static int mulNum(int a , int b){
        return a*b;
    }
      
    public static int divNum(int a , int b){
        return a/b;
    }
    
    public static int percentNum(int a , int b){
        return a%b;
    }
    
    public static void main(String[] args){
        Scanner in = new Scanner (System.in);
        
        System.out.println();
        int x = 21, y = 22;
        System.out.println("The Addition: " + addNum(x,y));
        System.out.println("The Subtraction: " + subNum(x,y));  
        System.out.println("The Multiplication: " + mulNum(x,y));
         System.out.println("The Divition: " + divNum(x,y));
        System.out.println("The Percentage: " + percentNum(x,y));
    }
}
