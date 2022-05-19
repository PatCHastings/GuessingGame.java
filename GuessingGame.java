import java.util.Scanner;
public class GuessingGame {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int min = 1;
        int max = 7;
        int randomInt = (int) Math.floor(Math.random() * (max - min + 1) + min);

        System.out.println("Guess a number between 1 and 7..");
        int guess = input.nextInt();

        if (guess == randomInt) {
            System.out.println(randomInt);
            System.out.println("Wow! First try! YOU WIN!!");
            }
        else if (guess == 7) {
            System.out.println("That's the number I was thinking; good job!");
            }
        else if (guess == 0) {
            System.out.println("To clarify.. you must only pick a single natural number between 1 and 7 like i just mentioned.. you get one last chance dont screw it up..");
            guess = input.nextInt();
            }
            if (guess == 7) {
                System.out.println("phew..you almost didnt win!");
            } else if (guess == randomInt) {
                System.out.println(randomInt);
                System.out.println("YOU WIN!!");
            } else {
                System.out.println("YOU LOSE!!");
            }

            }
        }
