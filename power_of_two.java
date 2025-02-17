public class power_of_two {
    public static void main(String[] args) {
        int n=40;
            while(n%2==0)
    {
            n/=2;
    }
    if (n==1)
    System.out.println("Power of two");
    else
    System.out.println("Not a power of two");
}
}
