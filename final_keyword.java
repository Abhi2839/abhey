public class final_keyword {
    // final keyword is used not change the val of var
    public static class stdss{
String name;
int age;
int rno;
final String school_name="Xyz";
    }
    public static void main(String[] args) {
 stdss sc=new stdss();
 sc.name="Rahul";
 sc.age=20;
sc.rno=45;
// sc.school_name="Abc"; //val can'nt be changed
System.out.println(sc.name);
System.out.println(sc.age);
System.out.println(sc.rno);
System.out.println(sc.school_name);
    }
    
}
