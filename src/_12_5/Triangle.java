package _12_5;

public class Triangle {

    double side1;
    double side2;
    double side3;

    public Triangle(double side1, double side2, double side3) throws IllegalTriangleException {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        boolean firstSum = side1 + side2 > side3;
        boolean secondSum = side2 + side3 > side1;
        boolean thirdSUm = side3 + side1 > side2;

        if (!firstSum || !secondSum || !thirdSUm) {
            throw new IllegalTriangleException("triangle created with sides that violate the rule");
        }
    }

    public static void main(String[] args) throws IllegalTriangleException {
        Triangle triangle = new Triangle(12.0, 32.0, 33.0);
    }

}
