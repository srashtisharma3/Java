package com.company;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();

        int scissor = 1;
        int rock = 2;
        int paper = 3;

        int userScore = 0;
        int computerScore = 0;
        int rounds = 5;

        System.out.println("Welcome to Rock-Paper-Scissors!");
        System.out.println("1: Scissors, 2: Rock, 3: Paper");

        for (int i = 0; i < rounds; i++) {
            System.out.println("Enter your choice (Round " + (i + 1) + "): ");
            int userChoice = s.nextInt();
            int computerChoice = r.nextInt(3) + 1;  // Generates a random number between 1 and 3

            System.out.println("Computer generated: " + (computerChoice == scissor ? "Scissors" : computerChoice == rock ? "Rock" : "Paper"));

            // Determine the result for the current round
            if ((computerChoice == scissor && userChoice == paper) ||
                    (computerChoice == rock && userChoice == scissor) ||
                    (computerChoice == paper && userChoice == rock)) {
                System.out.println("Computer wins this round!");
                computerScore++;
            } else if (computerChoice == userChoice) {
                System.out.println("This round is a tie!");
            } else if ((userChoice == scissor && computerChoice == paper) ||
                    (userChoice == rock && computerChoice == scissor) ||
                    (userChoice == paper && computerChoice == rock)) {
                System.out.println("You win this round!");
                userScore++;
            } else {
                System.out.println("Invalid input! Please enter 1, 2, or 3.");
                i--;  // Repeat this round if the input is invalid
            }
        }

        // Determine the overall winner
        if (userScore > computerScore) {
            System.out.println("You are the overall winner!");
        } else if (computerScore > userScore) {
            System.out.println("Computer is the overall winner!");
        } else {
            System.out.println("The game is a tie overall!");
        }

        System.out.println("Final Score - You: " + userScore + ", Computer: " + computerScore);
    }
}
