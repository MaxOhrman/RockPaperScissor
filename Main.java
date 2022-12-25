package com.maxohrman;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("::::::::::::::::::::::::::::::::::::::::");
        System.out.println("Hello and welcome to Rock Paper Scissor!");
        System.out.println("::::::::::::::::::::::::::::::::::::::::");
        System.out.println("");
        System.out.println("Please type Rock, paper or scissor to play!");

        boolean validInput = false;

        while (!validInput) {
            Scanner scan = new Scanner(System.in);
            String input = scan.nextLine().toLowerCase();

            if (input.equals("rock") || input.equals("paper") || input.equals("scissor")){
                RockPaperScissor game = new RockPaperScissor();
                game.startRound(input);
                validInput = true;
            } else
            System.out.println("Invalid input, type Rock, paper or scissor to play!");
        }

    }
}
