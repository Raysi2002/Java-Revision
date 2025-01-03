Problem 1: Sorting Employees by Multiple Criteria

You have an Employee class with fields: id, name, and salary.

Task:
1.	Write a Comparator to sort employees by salary in descending order.
2.	If two employees have the same salary, sort them by name in ascending order.

Example Input:

``` java 
List<Employee> employees = Arrays.asList(
new Employee(1, "Alice", 50000),
new Employee(2, "Bob", 60000),
new Employee(3, "Charlie", 50000)
);
```

Expected Output:

```java
Employee{id=2, name='Bob', salary=60000}
Employee{id=1, name='Alice', salary=50000}
Employee{id=3, name='Charlie', salary=50000}
```
Problem 2: Sorting Products by Custom Criteria

You have a Product class with fields: id, name, and price.

Task:
1.	Sort the products by price in ascending order.
2.	Write another Comparator to sort by name length in descending order.

Example Input:

```java
List<Product> products = Arrays.asList(
new Product(1, "Laptop", 800),
new Product(2, "Phone", 500),
new Product(3, "Television", 700)
);
```

Expected Output (By Price):

```java
Product{id=2, name='Phone', price=500}
Product{id=3, name='Television', price=700}
Product{id=1, name='Laptop', price=800}
```

Expected Output (By Name Length):

```java
Product{id=3, name='Television', price=700}
Product{id=1, name='Laptop', price=800}
Product{id=2, name='Phone', price=500}
```

Problem 3: Sorting Students by Marks and Roll Number

You have a Student class with fields: rollNumber, name, and marks.

Task:
1.	Sort students by marks in descending order.
2.	If two students have the same marks, sort them by roll number in ascending order.

Example Input:

```java
List<Student> students = Arrays.asList(
new Student(101, "Alice", 85),
new Student(102, "Bob", 92),
new Student(103, "Charlie", 85)
);
```

Expected Output:

```java
Student{rollNumber=102, name='Bob', marks=92}
Student{rollNumber=101, name='Alice', marks=85}
Student{rollNumber=103, name='Charlie', marks=85}
```

Bonus Challenge:

Use Java 8’s Comparator API (comparing, thenComparing) to implement these tasks instead of creating separate classes. This will help you get familiar with modern Java practices.