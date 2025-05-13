/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numberguessinggame;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author lab_services_student
 */
public class NumberGuessingGame {

    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);
        // create a random object to generate random numbers 
        Random random = new Random();
        //generate a random nuber between 1 and 100 
        int numberToGuess = random.nextInt(100)+1;
        //counter to keep track pf number of guesses 
        int numberOfTries = 0;
        //variable to store 
        int guess;
        //oolean fag to determine if correct
        boolean hasWon = false;
        //welcome message
        System.out.println("Welcome to the number guessing game");
        System.out.println("i have selected a number between 1 and 100, can you guess it");
        
        while(!hasWon) {
            System.out.println("Enter your guess");
            guess = scanner.nextInt();
            numberOfTries++;
            
            if (guess<numberToGuess){
                System.out.println("Too low! Try again");
            }
            else if(guess>numberToGuess){
                System.out.println("Too high! Try again");
            }
            else{
                hasWon =true;
                System.out.println("perefct guess!");
            }
            
   }
}
}
