import java.util.Scanner;

public class DiceGame {
    public static Scanner keyboard = new Scanner(System.in);
    public static int count;
    public static int score;

    public static void main(String[] args){
        System.out.println("Welcome! Let's Play Roll Dice!");
        rollDice();
        theDiceGame();
    }
    public static int rollDice() {
        int die1 = (int) (Math.random() * 6 + 1);
        int die2 = (int) (Math.random() * 6 + 1);
        int rollDice = die1 + die2;
        return rollDice;
    }
    public static void theDiceGame() {
        //set count to zero
        count = 0;
        //ask if they want to play
        System.out.println("Do you want to play?");
        String question = keyboard.next();
        if (question.equals("n")) {
            System.out.println("Maybe next time");
        }
        int rollDice = rollDice();
        System.out.println("You rolled a " + rollDice);
        do {
            while (rollDice != 1) {
                count += rollDice;
                System.out.println("Your score is " + count);
                System.out.println("Play again?");
                question = keyboard.next();

             if (question.equals("n")) {
                System.out.println("Maybe next time!");
            }
            rollDice = rollDice();
            System.out.println("You rolled a " + rollDice);
        }
        System.out.println("You Rolled a 1");
    }while (count < 100);
        System.out.println("A score of 100 has been reached!");
    }
}
