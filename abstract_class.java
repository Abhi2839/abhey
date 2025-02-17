public class abstract_class{
    // there can be constructor
    public static void main(String[] args) {
        horse h=new horse();
        h.eat();
        // chikeen c=new chikeen();
        // System.out.println(c.color);
        h.change_color();
         System.out.println(h.color);
        // h.walk();
        // chikeen c=new chikeen();
        // c.walk();
        // animal a=new animal() ;  cannot be created object 
        // tunga t=new tunga();

    }
}


abstract class animal{
    String color;
    animal(){
        color="brown";
        System.out.println("animal is created");
    }
    void eat(){
        System.out.println("Eating");
    }
    abstract void walk();  // abstract there is not implementation/there is no creation of object
}
class horse extends animal{
    void change_color(){
        color="dark brown";
    }
    horse(){
        System.out.println("horse is created");
    }
    void walk(){
        System.out.println("Horse is walking");
    }
}
class tunga extends horse{
    void change_color(){
        color="black";
    }
    tunga(){
        System.out.println("tunga is created");
    }
void walk(){
    System.out.println("walk tunga");
}
}
 class chikeen extends animal {
    void change_color(){
        color="yellow";
    }
    chikeen(){
        System.out.println("chikeen is created");
    }
void walk(){
    System.out.println("Walk on 2leg");
}
    
}