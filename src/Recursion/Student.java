package Recursion;

public class Student {
    String name;
    int roll;
    int std;

    Student(String namewa, int rollwa){
        this.name = namewa;
        this.roll = rollwa;
        System.out.println("i am constructor..");

    }

    int getRoll(){
        return roll;
    }

    static String getName(){
        return "ASsds";
    }

    public static void main(String[] args) {

        //System.out.println(Student.getName());

        Student student1 = new Student("falna", 43);
        //student1.name = "Anish";
        student1.std = 32;
        System.out.println(student1.name);
        System.out.println(student1.getRoll());

        Student student2 = new Student("dhilna",4322);
        student2.name = "Amrit";
        student2.std = 33;
        System.out.println(student2.name);
        System.out.println(student2.getRoll());
    }
}
