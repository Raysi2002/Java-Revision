package comparator_comparable;

import java.util.ArrayList;
import java.util.List;

public class Advance {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Aashish", 98, 116));
        studentList.add(new Student("Preeti", 99, 161));
        studentList.add(new Student("Sonu", 95, 116));
        studentList.add(new Student("Kanxu", 91, 611));

        studentList.sort((i, j) -> i.marks <= j.marks ? 1 : -1);
        System.out.println(studentList);
    }
}

class Student{
    public String name;
    public int marks;
    public int rollNo;

    Student(){

    }
    Student(String name, int marks, int rollNo){
        this.name = name;
        this.marks = marks;
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return  "Student Name :" + this.name +
                " Student marks :" + this.marks +
                " Student rollNo :" +  this.rollNo;

    }
}