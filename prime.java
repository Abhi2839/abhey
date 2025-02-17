public class prime {
    public static void main(String[] args) {
        int n = 15;
        boolean ans=true;

        if (n==0 || n==1)
        {
            System.out.println("Not a prime number");
            return ;
        }
        for (int i=2;n>i;i++){
            if( n%i==0)
            {
                ans=false;
            }

        }
        if (ans==true){
            System.out.println(n+" is a prime number");
        }
        else{
            System.out.println(n+" is not a prime number");
        }
    }
}
