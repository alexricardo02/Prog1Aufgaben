package Self_Study;

import java.util.Random;
import java.util.Scanner;

public class _3_17_ {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = 1 + random.nextInt(2);
        Scanner sc = new Scanner(System.in);

        System.out.println("scissor (0), rock (1), paper (2): ");
        int number = sc.nextInt();

        if (number == 0){
            switch (randomNumber) {
                case 0:
                    System.out.println("Draw");
                    break;
                case 1:
                    System.out.println("You lost");
                    break;
                case 2:
                    System.out.println("You won");
                    break;
            }
        } else if (number == 1) {
            switch (randomNumber){
                case 0:
                    System.out.println("You won");
                    break;
                case 1:
                    System.out.println("Draw");
                    break;
                case 2:
                    System.out.println("You lost");
                    break;
            }
        } else if (number == 2) {
            switch (randomNumber){
                case 0:
                    System.out.println("You lost");
                    break;
                case 1:
                    System.out.println("You won");
                    break;
                case 2:
                    System.out.println("Draw");
                    break;
            }
        } else {
            System.out.println("Wrong number");
        }
    }
}
