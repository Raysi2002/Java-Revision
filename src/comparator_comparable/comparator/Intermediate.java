package comparator_comparable.comparator;

import java.util.*;

public class Intermediate {

    public String empName;
    public Long salary;
    public Intermediate(){

    }
    public Intermediate(String empName, Long salary){
        this.empName = empName;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Name: " + this.empName + " Salary: " + this.salary;
    }

    public static void main(String[] args) {
        Comparator<Intermediate> comparator = (Intermediate i, Intermediate j) -> i.salary <= j.salary ? 1 : -1;

        List<Intermediate> empList = new ArrayList<>();
        Intermediate emp1 = new Intermediate("Aashish", 100000L);
        Intermediate emp2 = new Intermediate("Preeti", 200000L);
        Intermediate emp3 = new Intermediate("Kanxu", 300000L);
        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);
        empList.sort(comparator);
        System.out.println(empList);
    }

}
