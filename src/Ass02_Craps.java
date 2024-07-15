import java.util.Scanner;

public class Ass02_Craps
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String userInput;
        int die1 = 0;
        int die2 = 1;
        int dieRoll;
        boolean gameOver = false;

        do
        {
            do
            {
                System.out.println("Press enter to begin the game of Craps.");
                scanner.nextLine();

                die1 = (int) (Math.random() * 6) + 1;
                die2 = (int) (Math.random() * 6) + 1;
                dieRoll = die1 + die2;

                System.out.println("You rolled: " + die1 + " + " + die2 + " = " + dieRoll);

                if(dieRoll == 2 || dieRoll == 3 || dieRoll == 12)
                {
                    System.out.println("Craps! You lose. Sorry :(");
                    gameOver = true;
                }
                else if (dieRoll == 7 || dieRoll == 11)
                {
                    System.out.println("Congratulations! You've rolled a natural. :)");
                    gameOver = true;
                }
                else
                        System.out.println("Point is set to: " + dieRoll);
                        System.out.println("Press enter to roll and try to meet the point. :)");
                        scanner.nextLine();

                        int bdie1 = 0;
                        int bdie2 = 1;
                        int newDieRoll = bdie1 + bdie2;

                        bdie1 = (int) (Math.random() * 6 + 1);
                        bdie2 = (int) (Math.random() * 6) + 1;
                        newDieRoll = bdie1 + bdie2;


                            System.out.printf("You rolled: %d + %d = %d\n", bdie1, bdie2, newDieRoll);

                            if (newDieRoll == dieRoll) {
                                System.out.println("Congrats! You made the point. :)");
                                gameOver = true;
                            } else if (newDieRoll == 7) {
                                System.out.println("Oh no you rolled a seven. You lose. :(");
                                gameOver = true;
                            } else {
                                System.out.println("Try rolling for the point again. ;)");
                                gameOver = true;
                            }

            } while (!gameOver);

            System.out.print("Do you want to roll again? (yes/no): ");
            userInput = scanner.nextLine();
            System.out.println();

        } while (userInput.equalsIgnoreCase("yes"));

        System.out.println("Thanks for playing! I hope you had fun! :D");
        scanner.close();
    }
}