//Problem 1: Sorting Employees by Multiple Criteria
//
//You have an Employee class with fields: id, name, and salary.
//
//Task:
//        1.	Write a Comparator to sort employees by salary in descending order.
//2.	If two employees have the same salary, sort them by name in ascending order.
//
//Example Input:
//
//List<Employee> employees = Arrays.asList(
//        new Employee(1, "Alice", 50000),
//        new Employee(2, "Bob", 60000),
//        new Employee(3, "Charlie", 50000)
//);
//
//Expected Output:
//
//Employee{id=2, name='Bob', salary=60000}
//Employee{id=1, name='Alice', salary=50000}
//Employee{id=3, name='Charlie', salary=50000}


package comparator_comparable.problems;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Problem1 {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Aashish", 1, 100000L));
        employeeList.add(new Employee("Preeti", 2, 200000L));
        employeeList.add(new Employee("Aarav", 3, 300000L));
        employeeList.add(new Employee("Kenish", 4, 300000L));
        Comparator<Employee> comparator = (i, j) ->{
            if(i.salary < j.salary)
                return 1;
            if(i.salary.equals(j.salary)){
                if(i.name.compareTo(j.name) > 0){
                    return 1;
                }else{
                    return -1;
                }
            }
            else
                return -1;
        };
        employeeList.sort(comparator);
        System.out.println(employeeList);
    }
}

class Employee{
    String name;
    Integer id;
    Long salary;
    Employee(){

    }
    Employee(String name, Integer id, Long salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return STR."{Name: \{this.name} ID: \{this.id} Salary: \{this.salary}}";
    }
}