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
public class palindrome {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter The Wordenengs: ");
        String input = in.nextLine().toLowerCase();
        System.out.print("Enter The Second Wordenengs: ");
        String input1 = in.nextLine().toLowerCase();
        
        String reversed="";
        
        for(int i= input.length()-1; i>=0; i--){
        reversed += input.charAt(i);
          for(int x= input1.length()-1; i>=0; i--){
        reversed += input1.charAt(i);
        }
        if(input.equals(reversed)){
            System.out.print(input+ " is a palindrome ");
        } else {
            System.out.print(input+ " is not a palindrome ");
        }
        }
    }