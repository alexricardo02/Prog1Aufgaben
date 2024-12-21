package Self_Study;
import java.util.Scanner;


public class _2_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Subtotal and propina as percentaje");
        double subtotal = sc.nextDouble();
        double propina = sc.nextDouble();
        double total = subtotal + (subtotal * (propina / 100));

        System.out.println("The propina is " + subtotal * (propina / 100) + " and total is " + total);
    }
}
