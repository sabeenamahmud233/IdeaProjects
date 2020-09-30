package JavaIntermediateLearning;

public class Stream14 {
    public static void main(String[] args) {
        Hero h = new Hero();
        h.act();
        h.speak();
        h.comedy();

        Villain v = new Villain();
        v.act();
        v.speak();
        v.rude();
        v.comedy();
    }
}


interface Actor {
    void act();
    void speak();

    // If we change the interface in the future after publishing the interface
//    void comedy();  // This will give an error because Villain class didn't implement this method


    // to avoid this we can do the following
    // we can implement the method in the interface
    // So the classes that haven't implemented the method will have the default values

    default void comedy() {
        System.out.println("An Actor must make people laugh.");
    }
}

class Hero implements Actor {

    @Override
    public void act() {
        System.out.println("A Hero must act.");
    }

    @Override
    public void speak() {
        System.out.println("A Hero must speak.");
    }

    @Override
    public void comedy() {
        System.out.println("A Hero must make people laugh.");
    }
}

class Villain implements Actor {

    @Override
    public void act() {
        System.out.println("A Villain must act.");
    }

    @Override
    public void speak() {
        System.out.println("A Villain must speak.");
    }

    public void rude() {
        System.out.println("A Villain must paly a rude role.");
    }
}

