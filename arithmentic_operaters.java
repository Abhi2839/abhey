import java.util.Scanner;

public class arithmentic_operaters {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("addition of "+a+" and "+b+" is "+(a+b) );
        System.out.println("subtraction of "+a+" and "+b+" is "+(a-b) );
        System.out.println("division of "+a+" and "+b+" is "+(a/b) );
        System.out.println("multiplition of "+a+" and "+b+" is "+(a*b) );
        System.out.println("modulus of "+a+" and "+b+" is "+(a%b) );
        System.out.println("increment of "+a+" and "+b+" is "+(++a)+ " "+ (b++) );
        System.out.println("decrement of "+a+" and "+b+" is "+(a--)+" " + (b--) );
    }
}
