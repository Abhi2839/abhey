

public class swap {
    public static void main(String[] args) {
        int a = 10;
        int b=20;
        System.out.println("Before swapping a= "+a+" and b= "+b);
//    int temp=a;
//    a=b;
//    b=temp;
a=a^b;
b=a^b;
a=a^b;
        System.out.println("Before swapping a= "+a+" and b= "+b);
    System.out.println("Max of a and b is "+Math.max(a,b));
    }
}
