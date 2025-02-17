public class hierachal_inheritance {
    public static void main(String[] args) {
     human a=new human();
     a.eat();   
    }
}

class mammal{
    void eat() {
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathe");
    }

}
class human extends mammal{
    void walk(){
        System.out.println("walk");
    }
}
class dog extends mammal{
    void bark(){
        System.out.println("bark");
    }
}
class fish extends mammal{
    void swim(){
    System.out.println("swim");
    }
}