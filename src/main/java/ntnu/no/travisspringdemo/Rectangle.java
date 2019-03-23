package ntnu.no.travisspringdemo;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    int getPerimeter() {
        return width * height;
    }

    int getArea() {
        return (width + height) * 2;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
