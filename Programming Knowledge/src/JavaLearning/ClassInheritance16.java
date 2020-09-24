package JavaLearning;

public class ClassInheritance16 {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        System.out.println(rect.areaRectangle());
        System.out.println();

        Triangle tri = new Triangle();
        System.out.println(tri.areaTringle());
        System.out.println();
    }

}

class Polygon {
    protected int height = 10;
    protected int width = 20;
    protected int area;
}

class Rectangle extends Polygon {
    public double areaRectangle() {
        area = width * height;
        return area;
    }
}

class Triangle extends Polygon {
    public double areaTringle() {
        area = (width * height)/2;
        return area;
    }

}
