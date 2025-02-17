import java.util.Scanner;

public class this_keyword{
           public static class std{
            int roll_no;
            String name;
            int age;
            public std(int roll_no, String name, int age) {
                this.roll_no = roll_no;
                this.name=name;
                this.age=age;
 }
           }
            public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                String name=sc.next();
                int age=sc.nextInt();
                int roll_no=sc.nextInt();
                // this_keyword ne=new this_keyword(); //if we do not use static keyword in innner class
                std s=new std(roll_no,name,age);
                System.out.println(s.name);
                System.out.println(s.roll_no);
                System.out.println(s.age);
            }
        }