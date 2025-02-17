public class multilevel_inheritance {
    public static void main(String[] args) {
        // inheritnace is when properties and methods of base class are passed on to a derived class.
dog tommy=new dog();
tommy.eat();
tommy.legs=4;
System.out.println(tommy.legs);
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
class mammal extends Animal{
    int legs;
}

class dog extends mammal{
    int tail;
    String breed;
}
