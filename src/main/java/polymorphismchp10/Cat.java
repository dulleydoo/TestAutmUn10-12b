package polymorphismchp10;

public class Cat extends Animal{

    @Override
    public void makeSound(){
        System.out.println("moew");
    }

    public void scratch(){
        System.out.println("Im a cat. I scratch things");
    }
}
