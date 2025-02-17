public class method_overridding {
    public static void main(String[] args) {
        tiger t=new tiger();
        t.eat();
        animal a=new animal();
        a.eat();
    }
}

class animal{
    void eat(){
        System.out.println("Eat veg");
    }
}

class tiger extends animal{
    void eat(){
        System.out.println("Eat non veg");
    }
}