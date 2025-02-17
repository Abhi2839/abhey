// import java.util.Scanner;
// public class max_of_three {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int a=20;
//         int b=30;
//         int c=10;
 
//         if (a>b && a>c)
//         System.out.println(a);
//         else if (b>a && b>c)
//         System.out.println(b);
//         else
//         System.out.println(c);
//    }
// }

// // import java.util.Scanner;
// // public class max_of_three {
// // public static void main(String[] args) {
// // Scanner sc=new Scanner(System.in);
// // int a=20;
// // int b=30;
// // int c=10;
// // int d=Math.max(a,Math.max(b,c));
// // System.out.println(d);

// // }
// // }
// class Test {
//     Test() {
//         System.out.println("Constructor Called");
//     }
//     protected void finalize() {
//         System.out.println("Finalize Called");
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Test testObj = new Test();
//         testObj = null; 
//         System.gc(); 
//     }
// }
// import java.util.Scanner;
// class main{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         switch(a){
//             case 90:
//             System.out.println("A");
//             // break;
//             case 80:
//             System.out.println("B");
//             // break;
//             case 70:
//             System.out.println("C");
//             // break;
//             default:
//             System.out.println("D");
//         }
//     }
// }

import java.util.Scanner;

class main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for (int i=1;n>=i;i++){
sum+=i;
        }
System.out.println(sum);
    }
}