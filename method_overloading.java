public class method_overloading {
    public static void main(String[] args) {
        calc c=new calc();
        System.out.println(c.add(10,20));
        System.out.println(c.add(10.0,12.0,144.0));
        System.out.println(c.add(10,20,30));
     
    }
}


class calc{
     int add(int a, int b) {
    return a+b;
    }
    double add(double c,double b,double a){
        return (a+b+c);
    }
    int add(int a, int b,int c) {
        return a+b+c;
        }
}