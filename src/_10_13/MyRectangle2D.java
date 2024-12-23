package _10_13;

public class MyRectangle2D {
    public double x;
    public double y;
    public double width;
    public double height;

    public MyRectangle2D(){
        x = 0;
        y = 0;
        width = 1;
        height = 1;
    }

    public MyRectangle2D(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * width + 2 * height;
    }

    public boolean contains(double x, double y) {
        return y>=0 && y<=height && x>=0 && x<=width;
    }

    public boolean contains(MyRectangle2D r) {
        return (r.x + r.width/2) <= this.x + (this.width / 2) &&
                (r.x - r.width/2) >= this.x - (this.width / 2) &&
                (r.y + r.height/2) <= this.y + (this.height / 2) &&
                (r.y - r.height/2) >= this.y - (this.height / 2);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
