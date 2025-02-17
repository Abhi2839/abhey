public class static_key {
    public static void main(String[] args) {
        student s1=new student();
        s1.schoolName="DPS";
        s1.name="Abc";
        System.out.println(s1.name);
        student s2=new student();
        // if we declare school name for student s1 as we used static for school name it won'nt for any student it will samer
        System.out.println(s2.schoolName);
        System.out.println(s2.name); //prints default val that is null
        // if we change school
        student s3=new student();
        s3.schoolName="AXB";
        System.out.println(s2.schoolName);
        System.out.println(s1.schoolName);
    }
}

class student{
    String name;
    int rollNo;
    static String schoolName;
    void setName(String name){
        this.name=name;
    }
    String getName(){
        return this.name;
    }
}
