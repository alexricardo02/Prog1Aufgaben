package Self_Study;

import java.util.Scanner;

public class _2_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter starting velocity in m/s, ending velocity in m/s and time span : ");
        double startingVelocity = sc.nextDouble();
        double endingVelocity = sc.nextDouble();
        double timeSpan = sc.nextDouble();

        double result = (endingVelocity - startingVelocity) / timeSpan;
        System.out.println("Average Acceleration is: " + result);
    }
}
