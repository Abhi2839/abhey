
import java.util.*;
public class basic{
    public static class student{
        String name;
        int roll_no;
        int marks;
    }       
        public static void main(String[] args) {
            student s=new student();
            s.name="Rahul";
            s.roll_no=1;
            s.marks=90;
            System.out.println(s.name);
            System.out.println(s.roll_no);
            System.out.println(s.marks);
            student ss=new student();
            ss.name="Parth";
            System.out.println(ss.name);
            ss.roll_no=45;
            System.out.println(ss.roll_no);
            ss.marks=63;
            System.out.println(ss.marks);
        }
    }