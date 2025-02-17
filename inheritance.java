public class inheritance {
    public static void main(String[] args) {
        // inheritnace is when properties and methods of base class are passed on to a derived class.
fish shark=new fish();
shark.eat();
shark.breathe();
shark.fins=4;
System.out.println(shark.fins);
shark.swim();
    }
}

class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathe");
    }
}

// derived class
class fish extends Animal{
    int fins;
    void swim(){    
    System.out.println("swims");
}

}
