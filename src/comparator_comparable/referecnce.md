# Comparator and Comparable in Java

## Overview

In Java, `Comparator` and `Comparable` are interfaces used to define custom sorting logic for objects.

### `Comparable`
- Used to define the **natural ordering** of objects.
- Implemented by the class whose objects need to be sorted.
- The `compareTo` method is overridden to specify the sorting logic.
- Allows only **one sorting sequence**.

### `Comparator`
- Used to define **custom ordering** for objects.
- A separate class implements the `Comparator` interface.
- The `compare` method is overridden to specify the sorting logic.
- Allows **multiple sorting sequences** by creating different comparator classes.

---

## Key Differences

| Feature              | Comparable              | Comparator               |
|----------------------|-------------------------|--------------------------|
| Interface Package    | `java.lang`            | `java.util`              |
| Method               | `compareTo(Object o)`  | `compare(Object o1, Object o2)` |
| Sorting Sequence     | Single (natural order) | Multiple (custom orders) |
| Implementation       | Implemented by the class | Separate class or lambda expression |

---

## `Comparable` Example

### Sorting by Natural Order

```java
import java.util.*;

class Student implements Comparable<Student> {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Student other) {
        return this.id - other.id; // Natural ordering by id
    }

    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "'}";
    }
}

public class ComparableExample {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(3, "Alice"));
        students.add(new Student(1, "Bob"));
        students.add(new Student(2, "Charlie"));

        Collections.sort(students);

        System.out.println("Sorted by id (natural order):");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}