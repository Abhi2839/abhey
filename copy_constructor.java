public class copy_constructor{
   class student{
    String name;
    String school;
    int roll;
    int marks[];
student(student s1) //copy constructor
{
    marks=new int[3];
    this.name=s1.name;
    this.school=s1.school;
    this.roll=s1.roll;
    this.marks=s1.marks;
}
student(){
    marks=new int[3];
    System.out.println("constructor is called...");
}
// student(String name){
//     this.name=name;
//     marks=new int[3];
// }
// student(String school){
//     this.school=school;

//     marks=new int[3];
// }
// student(int roll){
//     marks=new int [3];
//     this.roll=roll;
// }

   }
    public static void main(String[] args) {
        copy_constructor cc=new copy_constructor();
        student s1=cc.new student();
        s1.name="Raghav";
        s1.school="lfcs";
        s1.roll=12;
        s1.marks[0]=90;
        s1.marks[1]=80;
        s1.marks[2]=70;
student s2=cc.new student(s1);
s2.marks[0]=100;
for (int i=0;3>i;i++){
    System.out.println(s2.marks[i]);
}
s2.name="Abc";
System.out.println(s2.name);
    }
}