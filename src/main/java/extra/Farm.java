package extra;

import org.w3c.dom.ls.LSOutput;

public class Farm {
    public static void main(String[] args) {
        Pig piggy = new Pig();
        System.out.println(piggy.makeSound());
        piggy.eat();

        Animal ducky = new Duck();
        System.out.println(ducky.makeSound());
        ducky.eat();
    }
}
