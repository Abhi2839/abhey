// import java.util.Scanner;

// public class numerical_pattern {
//     public static void main(String[] args) {
//         //12345
//         //23451
//         //34512
//         //45123
//         //51234
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         for (int i=1;n>=i;i++){
//             for(int j=i;n>=j;j++)
//             System.out.print(j);
//             for(int k=1;k<=i-1;k++)
//             System.out.print(k);
//             System.out.println();
//         }
//     }
// }


// import java.util.Scanner;

// public class numerical_pattern {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int i=1;
//         while (10>=i) {
//     System.out.println(n+"*"+i+"="+n*i);
//     i++;
//         }
//     }
// }

// import java.util.Scanner;

// public class numerical_pattern {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         for (int i=1;10>=i;i++){
            
//             System.out.println(n+"*"+i+"="+n*i);
//         }
//     }
// }

import java.util.Scanner;

public class numerical_pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int i=1;
        do{
            System.out.println(i);
            i++;
        }
        while(5>=i);
    }
}
