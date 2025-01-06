package _11_12;

import java.util.ArrayList;

public class _11_12 {

    public static double sum(ArrayList<Double> list) {
        double result = 0;
        for(double numero : list) {
            result += numero;
        }
        return result;
    }

}
