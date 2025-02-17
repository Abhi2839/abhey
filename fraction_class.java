// import java.util.Scanner;

public class fraction_class {
    
    
    
    public static fraction add(fraction f1,fraction f2){
        int num = f1.numerator * f2.denomerator + f2.numerator * f1.denomerator;
        int den = f1.denomerator * f2.denomerator;
        fraction f3 = new fraction(num, den);
        return f3;
    }

public static fraction multiply(fraction f1,fraction f2){
    int num=f1.numerator*f2.numerator;
    int den=f1.denomerator*f2.denomerator;
    fraction f3 = new fraction(num, den);
    return f3;
}

public static fraction subtraction(fraction f1,fraction f2){
    int num = f1.numerator * f2.denomerator - f2.numerator*f1.denomerator;
    int den=f1.denomerator*f2.denomerator;
    fraction f3 = new fraction(num, den);
    return f3;

}
public static fraction division(fraction f1,fraction f2){
    int num=f1.numerator*f2.denomerator;
    int den=f2.numerator*f1.denomerator;
    fraction f3=new fraction(num, den);
   
    return f3;
}
    public static int gcd(int a,int b){
        int ans=1;
        for (int i=2;Math.min(a,b)>=i;i++){
            if (a%i==0 && b%i==0)
            {
                ans=i;
            }
        }
        return ans;
    }
   
    public static class fraction{
        int numerator;
        int denomerator;
        
        public fraction(int a,int b){
            this.numerator = a;
            this.denomerator = b;
            simplfy();
        }


// public void simplfy(){
//     if (denomerator>numerator){
//         if (denomerator%numerator==0){
//             denomerator=denomerator/numerator;
//             numerator = 1;

//         }
//     }
// }
public void simplfy(){
    int ans= gcd(numerator,denomerator);
    numerator=numerator/ans;
    denomerator=denomerator/ans;
}  

}




    public static void main(String[] args) {
// Scanner sc=new Scanner(System.in);
// int a=sc.nextInt();
// int b=sc.nextInt();
// int c=sc.nextInt();
// int d=sc.nextInt();
        fraction f1=new fraction(4,3);
        // System.out.println("numerator is "+f1.numerator+" denominator is "+f1.denomerator);
// f1.simplfy();
// System.out.println(f1.numerator+"/"+f1.denomerator);
        fraction f2=new fraction(8,3);
// System.out.println("numerator is "+f2.numerator+" denominator is "+f2.denomerator);
// System.out.println();
fraction f3=add(f1, f2);
System.out.println("After addition");

System.out.println("numerator is "+f3.numerator+" denominator is "+f3.denomerator);
System.out.println("After multiplication");
fraction f4=multiply(f1, f2);
System.out.println(f4.numerator+" "+f4.denomerator);
System.out.println("After division");
fraction f5=division(f1, f2);
System.out.println(f5.numerator+" "+f5.denomerator);
System.out.println("After subtarction");
fraction f6=subtraction(f1, f2);
System.out.println(f6.numerator+" "+f6.denomerator);


}
}
