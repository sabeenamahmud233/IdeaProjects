package JavaLearning;

public class ClassConstructorExplain11 {
    public static void main(String[] args) {
        Cube cubeObj1 = new Cube(5, 6, 8);
        int result1 = cubeObj1.cubeVolume();
        System.out.println("Volume of cube is: " + result1);

        Cube cubeObj2 = new Cube();
        cubeObj2.cubeVolume();
        int result2 = cubeObj2.cubeVolume();
        System.out.println("Volume of cube is: " + result2);

    }
}

class Cube {
    int length, breadth, height, volume;

    public Cube(int length, int breadth, int height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
        this.volume = 0;
    }

    public Cube() {
        this.length = 2;
        this.breadth = 4;
        this.height = 5;
        this.volume = 0;
    }

    public int cubeVolume() {
        volume = length * breadth * height;
        return volume;
    }
}
