/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.game;

/**
 *
 * @author Tosin101
 */
import java.util.Scanner;
public class Game {

    public static void main(String[] args) {
        System.out.println ("Let's play a number game.... \n"
                + "You will enter a large number, a small numbe and a guess number where they will meet if the small number was incremented and if the large number was decremented by 2.");
        int large, small, guess;
      
        System.out.println("Enter the large number between 100 and 1000!");
        //TAKES IN LARGE NUMBER FROM USER
        Scanner scan = new Scanner(System.in);
                large = Integer.parseInt(scan.nextLine());
                //CHECK IF LARGE NUMBER IS SMALLER THAN 100 OR GREATER 1000... iF NOT ACCEPTS USER INPUT
                if(large<100 || large > 1000)
                {
                    while (true){
                    System.out.println("Re-enter the large number between 100 and 1000!");
                    large = Integer.parseInt(scan.nextLine());
                    if(large>=100 && large<=1000){break;}
                                }
                }
                        
                System.out.println("Enter the small number.. smaller than the large number");
                //TAKES IN SMALL NUMBER
                small = scan.nextInt();
                scan.nextLine();
                                //CHECK IF LARGE NUMBER IS SMALLER THAN 0 OR GREATER LARGE NUMBER... iF NOT ACCEPTS USER INPUT
                if(small > large || small < 0)
                {
                    while (true){
                    System.out.println("Re-enter the small number lesser than your large number!");
                    small = Integer.parseInt(scan.nextLine());
                    if(small>0 && small<large){break;}
                                }
                }
                System.out.printf("Your large number is %d \t\n And your small number is %d\n", large , small);
                System.out.printf("Now enter the number where the large and small number will meet if small is incremented by one\n And second number decremented by 2!!\n");
                guess = scan.nextInt();
                scan.nextLine();
                while(small < large)
                {
                    small++;
                    large -=2;
                }
                int checkIfClose = (small - 5);
                if(guess >= checkIfClose || guess <= checkIfClose )
                System.out.printf("My fellow user your guess is close enough...\t where the answer is: " + small);
                        else
                    System.out.printf("Please try again later... \t The answer is " + small);
                scan.close();
                
    }
}
