package com.maxohrman;

public class RockPaperScissor {

    private int playerScore = 0;
    private int computerScore = 0;
    private int playerChoice = 0;
    private int computerChoice = 0;

    public void setPlayerScore(int playerScore) {
        this.playerScore = playerScore;
    }

    public void increasePlayerScore() {
        this.playerScore ++;
    }

    public void setComputerScore(int computerScore) {
        this.computerScore = computerScore;
    }

    public void increaseComputerScore() {
        this.computerScore ++;
    }

    public int getPlayerScore() {
        return this.playerScore;
    }

    public int getComputerScore() {
        return this.computerScore;
    }

    public void computerChoice() {
        this.computerChoice = (int)(Math.random() * 3) +1;
    }

    public static void wait(int ms)
    {
        try
        {
            Thread.sleep(ms);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    }

    public static String choiceToString(int choice){
        if (choice == 1) {
            return "Rock";
        }
        if (choice == 2 ) {
            return "paper";
        }
        if (choice == 3) {
            return "Scissor";
        }
        return "";
    }

    public void presentChoices(){
        System.out.println("The player has chosen " + choiceToString(this.playerChoice) + "!");
        wait(1000);
        System.out.print("The computer has chosen ");
        wait(1000);
        System.out.print(".");
        wait(1000);
        System.out.print(".");
        wait(1000);
        System.out.print(". ");
        wait(1000);
        System.out.println(choiceToString(this.computerChoice) + "!");
    }

    public void startRound(String choice) {
        if (choice.equals("rock")) {
            this.playerChoice = 1;
        } else if (choice.equals("paper")) {
            this.playerChoice = 2;
        } else if (choice.equals("scissor")) {
            this.playerChoice = 3;
        }

        //Computer makes a choice
        computerChoice();
        if (this.computerChoice == this.playerChoice) {
            wait(1000);
            System.out.println("The computer choose: " + choiceToString(this.computerChoice));
            System.out.println("Its a draw!");
        } else if (this.playerChoice == 1 && this.computerChoice == 2 ) {
            presentChoices();
            wait(1000);
            System.out.println("The computer won!");
            increaseComputerScore();
        } else if (this.playerChoice == 2 && this.computerChoice == 3 ) {
            presentChoices();
            wait(1000);
            System.out.println("The computer won!");
            increaseComputerScore();
        } else if (this.playerChoice == 3 && this.computerChoice == 1 ) {
            presentChoices();
            wait(1000);
            System.out.println("The computer won!");
            increaseComputerScore();
        } else {
            presentChoices();
            wait(1000);
            System.out.println("You won!");
            increasePlayerScore();
        }

    }

}
