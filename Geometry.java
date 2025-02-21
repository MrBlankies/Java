class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;

    }

    public void draw() {
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
}

public class Geometry {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10, 5);
        Rectangle r2 = new Rectangle(6, 8);

        System.out.println("Rectangle 1:");
        r1.draw();
        System.out.println("Rectangle 2:");
        r2.draw();
    }
}
