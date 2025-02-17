public class palindrome{
    public static void main(String[] args) {
        int a=546,b=0,d=a;
    while (a>0) {
        int c=a%10;
        b=b*10+c;
        a/=10;
    }

    System.out.println("Palindrome of "+d+" is "+b);
    }
}