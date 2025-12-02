import java.util.*;
class GuessNumber{
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       Random r=new Random();
       int totalRounds = 0;
       int roundsWon = 0;
       System.out.println("Welcome to Number Guessing Game");
       while (true) {
            totalRounds++;
            System.out.println("\nRound " + totalRounds);
            int randomNumber = r.nextInt(100) + 1;
            int attemptsAllowed = 5;  
            int attemptsTaken = 0;
            boolean won = false;
             while (attemptsTaken < attemptsAllowed) {
                System.out.print("Guess a number between 1 and 100 (Attempt "+ (attemptsTaken + 1) + "/" + attemptsAllowed + "): ");
                int guess = sc.nextInt();
                attemptsTaken++;

                if (guess == randomNumber) {
                    System.out.println("Awesome! You guessed the number in "+ attemptsTaken + " attempts.");
                    won = true;
                    roundsWon++;
                    break;
                } else if (guess < randomNumber) {
                    System.out.println("Too low!");
                } else {
                    System.out.println("Too high!");
                }
            }
             if (!won) {
                System.out.println("Out of attempts! The correct number is: " + randomNumber);
            }
            System.out.print("\nDo you want to play another round? (yes/no): ");
            String choice = sc.next();

            if (!choice.equalsIgnoreCase("yes")) {
                break;
            }
        }
        System.out.println("\nFINAL SCORE");
        System.out.println("Total Rounds Played : " + totalRounds);
        System.out.println("Rounds Won          : " + roundsWon);
        System.out.println("Win Percentage      : " + ((roundsWon * 100) / totalRounds) + "%");
        System.out.println("Thanks for playing!");
    }
}