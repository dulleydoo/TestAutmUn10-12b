package polymorphismchp10;
//Polymorphism
public class Zoo {
    public static void main(String[] args) {
        Dog rocky = new Dog();
        rocky.fetch();
        rocky.makeSound();
        feed(rocky);

        Animal sasha = new Dog();
        sasha.makeSound();
        feed(sasha);
        //We changed sasha from a dog to a cat, its
        // legal because they are both of type Animal
        sasha = new Cat();
        sasha.makeSound();
        //we cannot make a direct call of the cat method because
        //its of type animal. Unless we cast it to Cat type
        ((Cat) sasha).scratch();
        feed(sasha);
    }
    public static void feed (Animal animal){
        if(animal instanceof Dog){
            System.out.println("Here's your dog food");
        } else if (animal instanceof Cat) {
            System.out.println("Here's your cat food");
        }

    }
}
/*
Type vs Instance
An object can have a superclass type, and a subclass instance

Access
Polymorphic objects can only access the methods of their type
(not their instance). Casting is required in order to access
the methods of their instance.

Overridden Methods
If a method is overridden by the class,
the polymorphic object will execute the overridden
method at runtime

InstanceOf Operator
The instanceof operator is used to determine if an object
is an instance of a certain class.
 */