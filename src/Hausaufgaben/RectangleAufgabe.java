package Hausaufgaben;

public class RectangleAufgabe {
    public static void main(String[] args){
        Rectangle rectangle1 = new Rectangle(40, 4);
        Rectangle rectangle2 = new Rectangle(35.9, 3.5);

        System.out.println(rectangle1.returnArea());
        System.out.println(rectangle1.returnPerimeter());

        System.out.println(rectangle2.returnArea());
        System.out.println(rectangle2.returnPerimeter());
    }


}

class Rectangle {
    double width;
    double height;

    Rectangle() {
        width = 1;
        height = 1;
    }

    Rectangle(double newHeight, double newWidth) {
        height = newHeight;
        width = newWidth;
    }

    double returnArea() {
        return width * height;
    }

    double returnPerimeter() {
        return width * 2 + height * 2;
    }
}

