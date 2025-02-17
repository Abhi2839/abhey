public class passing_class_fun {
    public static class student{
        String name;
        int age;
        int roll_no;
      private static int cnt_std; // to track the changes
    
    public student(String name,int age,int roll_no){
        this.name=name;
        this.age=age;
        this.roll_no=roll_no;
        cnt_std++;
    }
        public static int get_cnt_std(){
            return cnt_std;
        }
}
    // static public void fun(student x){
    //     x.name="nisha";  //changing val
    //     x.age=45;
    //     System.out.println(x.name);
    // } 
    public static void main(String[] args) {
        student sc=new student("Aman",14,12);
        // sc.name="Naman";
        // sc.age=15;
        // sc.roll_no=5;
// System.out.println(student.get_cnt_std());  // can only called if func used static keyword
System.out.println(sc.get_cnt_std());// if we do not use static keywork first we need to create object
        // fun(sc);
        // System.out.println(sc.age);
// System.out.println(sc.cnt_std);
        // student sc1=new student("Namani",45,12);
        // sc.name="Namani";
        // sc.age=25;
        // sc.roll_no=15;
// System.out.println(sc1.cnt_std);
        // student sc2=new student("Abhi",41,19);
        // sc.name="Nds";
        // sc.age=14;
        // sc.roll_no=6;
        // System.out.println(sc2.cnt_std);

        System.out.println(student.cnt_std);  //without creating the object  
        // only static var can be called directly without creating the object
    }
}
