interface Animal {
    void makeSound();
    void eat();
}

public class Dog implements Animal  {
    @Override
    public void makeSound(){
        System.out.println("making sound");
    }

    @Override
    public void eat() {
        System.out.println("dog is eating");
    }

    public static void main(String[] args){
        Dog myDog = new Dog();
        myDog.eat();
        myDog.makeSound();
    }
    
}

