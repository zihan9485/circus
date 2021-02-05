package circus;

import circus.animal.Animal;
import circus.animal.Bird;
import circus.animal.Duck;

public class Trainer {
    public static void main(String[] args) {
        Duck d = new Duck();
        getToSpeak(d);

        Bird b = (Bird)d;  // upcasting take a subclass reference and cast it to a superclass
        getToSpeak(b); //Would look at the object instead of the reference (variable), they all point back to duck

        Animal a = (Animal)b; // upcasting
        getToSpeak(a); //Initial duck object being passed around by references

        Duck d2 = (Duck) a; // downcasting take a superclass reference and cast it to a subclass
        // need to explicity downcast and only if the actual object is a subclass, cannot downcast an object further
        // than what it actually is
        train(new Duck());
        // train(new Parrot()); cannot cast Parrot to Duck at runtime,
        //Animal a2 = new Animal(); cannot create abstract class
        //Bird b2 = new Bird();
    }

    private static void getToSpeak(Animal animal) {
        System.out.println(animal.speak());
    }

    private static void train(Bird bird) {
        if (bird instanceof Duck) {
            Duck d = (Duck) bird;
            d.swim();
        }
    }
}
