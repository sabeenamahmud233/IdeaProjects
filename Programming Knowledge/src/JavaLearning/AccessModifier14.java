package JavaLearning;

    /*
        Access Level:
        Modifier        Class       Package         SubClass        World
        public           Yes          Yes              Yes            Yes
        protected        Yes          Yes              Yes            No
        default          Yes          Yes              No             No
        private          Yes          No               No             No
    */

public class AccessModifier14 {
    public static void main(String[] args) {
        Class1 obj = new Class1();
        obj.setA(5);
        System.out.println(obj.getA());

        obj.setB(10);
        System.out.println(obj.getB());

        Class2 obj1 = new Class2();
        obj1.setA(5);
        System.out.println(obj1.getA());

        obj1.setB(10);
        System.out.println(obj1.getB());

        Class3 obj2 = new Class3();
        obj2.setA(5);
        System.out.println(obj2.getA());

        obj2.setB(10);
        System.out.println(obj2.getB());

    }

    private static class Class1 {
        private int a = 10;
        private int b = 20;

        public int getA() {
            return a;
        }

        public void setA(int a) {
            this.a = a;
        }

        public int getB() {
            return b;
        }

        public void setB(int b) {
            this.b = b;
        }
    }

    protected static class Class2 {
        private int a = 10;
        private int b = 20;

        public int getA() {
            return a;
        }

        public void setA(int a) {
            this.a = a;
        }

        public int getB() {
            return b;
        }

        public void setB(int b) {
            this.b = b;
        }
    }

    static class Class3 {
        private int a = 10;
        private int b = 20;

        public int getA() {
            return a;
        }

        public void setA(int a) {
            this.a = a;
        }

        public int getB() {
            return b;
        }

        public void setB(int b) {
            this.b = b;
        }
    }
}

