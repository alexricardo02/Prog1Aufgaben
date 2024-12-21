package _9_13;

import java.util.Scanner;

public class Location {

    public int row;
    public int column;
    public double maxValue = 0;

    Location(int row, int column, double maxValue) {
        this.row = row;
        this.column = column;
        this.maxValue = maxValue;
    }

    public static Location locateLargest(double[][] a){
        int rowLocation = 0;
        int columnLocation = 0;
        double maxValue = a[0][0];

        for (int i = 0; i < a.length;i++){
            for (int j= 0; j < a[0].length; j++){
                if (a[i][j] > maxValue) {
                    maxValue = a[i][j];
                    rowLocation = i;
                    columnLocation= j;
                }
            }
        }
        return new Location(rowLocation, columnLocation, maxValue);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario el tamaño de la matriz
        System.out.print("Ingrese el número de filas: ");
        int rows = scanner.nextInt();
        System.out.print("Ingrese el número de columnas: ");
        int columns = scanner.nextInt();

        // Crear y llenar la matriz
        double[][] array = {{23.5, 35, 2, 10}, {4.5, 3, 45, 3.5}, {35, 44, 5.5, 9.6}};


        // Localizar el mayor valor en la matriz
        Location largest = Location.locateLargest(array);

        // Mostrar el resultado
        System.out.printf("La ubicación del valor más grande (%.2f) está en la fila %d, columna %d.%n", largest.maxValue, largest.row, largest.column);
    }
}
