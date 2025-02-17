import java.util.Scanner;

public class tranpose_matrix {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int matrix[][]=new int[a][a];
        int tranpose[][]=new int[a][a];
for (int i=0;a>i;i++){
    for (int j=0;a>j;j++){
        int b=sc.nextInt();
        matrix[i][j]=b;
    }
}
System.out.println("Before transpose");
for (int i=0;a>i;i++){
    for(int j=0;a>j;j++){
       System.out.print(matrix[i][j]+" ");
    }
    System.out.println();
    }
// transpose
for (int i=0;a>i;i++){
    for(int j=0;a>j;j++){
    tranpose[j][i]=matrix[i][j];
    }
    }
//print transpose matrix
System.out.println("After transpose");
for (int i=0;a>i;i++){
    for(int j=0;a>j;j++){
       System.out.print(tranpose[i][j]+" ");
    }
    System.out.println();
    }
}
}