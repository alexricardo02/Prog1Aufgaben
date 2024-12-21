package Self_Study;

import java.util.*;

public class _3_16_ {
    public static void main(String[] args) {
        Random random = new Random();

        // Genera un número aleatorio entre 0 y 999

        int xCoordinate = -50 + random.nextInt(50 - (-50) + 1);

        int yCoordinate = -100 + random.nextInt(100 - (-100) + 1);

        System.out.println("Coordinate: (" + xCoordinate + ", " + yCoordinate + ")");
    }
}
