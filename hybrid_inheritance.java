public class hybrid_inheritance {
    public static void main(String[] args) {
        // Creating objects of the classes
//    shark s=new shark();
//    s.eat();
//    s.name();
//    s.swim();

cat c= new cat();
c.meow();
c.walk();
c.breathe();
c.eat();
    }
}

class animal{
    void eat(){
        System.out.println("eat");
    }
    void breathe(){
        System.out.println("breathe");
    }
}
class fish extends animal{
    void swim(){
        System.out.println("swims");
    }
}
class shark extends fish{
    void name(){
        System.out.println("shark");
    }
}
class tuna extends fish{
    void name (){
        System.out.println("tuna");
    }
}

class bird extends animal{
    void fly(){
        System.out.println("fly");
    }
}
class mammal extends animal{
    void walk(){
        System.out.println("walk");
    }
}
class dog extends mammal{
    void bark(){
        System.out.println("bark");
    }
}
class cat extends mammal{
    void meow(){
        System.out.println("meow");
    }
}