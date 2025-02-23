
class Student{
    String name;
    int age;
    double grade;
    public Student(String name,int age,double grade)
    {
this.name=name;
this.age=age;
this.grade=grade;
    }
    void printIt()
    {
        System.out.println(age);
        System.out.println(grade);
        System.out.println(name);

    }

}


public class one{

    public static void main(String[]args)
    {
Student s1= new Student("DewanBagi",56,4.00);
System.out.println(s1.name + " "+ s1.age + " "+s1.grade);
s1.printIt();
    }




}