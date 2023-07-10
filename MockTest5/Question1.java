class Animal{
     void makeSound(){
        System.out.println("Animal sound");
    }
}
class Dog extends Animal{
    @Override
     void makeSound(){
        System.out.println("Dog sound");
     }
}
class Cat extends Animal{

    @Override
    void makeSound(){
        System.out.println("Cat sound");
    }
}

class Cow extends Animal{
    @Override
    void makeSound(){
        System.out.println("Cow sound");
    }

}
public class Question1{
    public static void main(String[] args) {
        Animal animal=new Animal();
        animal.makeSound();
        animal=new Dog();
        animal.makeSound();
        animal=new Cat();
        animal.makeSound();
        animal=new Cow();
        animal.makeSound();
    }

}