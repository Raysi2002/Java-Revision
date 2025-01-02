
# Regular Expressions (Regex) in Java

Regular expressions (regex) are patterns used to match character combinations in strings. In Java, regex is supported through the `java.util.regex` package.

---

## **Core Components of Regex in Java**

### **1. Pattern Class**
- Compiles a regular expression into a pattern.
- Methods:
    - `Pattern.compile(String regex)`: Compiles the given regex into a pattern.

### **2. Matcher Class**
- Used to interpret the pattern and perform match operations.
- Methods:
    - `Matcher.matches()`: Checks if the entire string matches the pattern.
    - `Matcher.find()`: Searches for subsequence matches in the input string.

### **3. Example Usage**
```java
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexExample {
    public static void main(String[] args) {
        // Compile the regex pattern
        Pattern pattern = Pattern.compile("a+b+c*d*");

        // Create a matcher for the input string
        Matcher matcher = pattern.matcher("aabbccd");

        // Check if the string matches the pattern
        boolean matches = matcher.matches();
        System.out.println("Does it match? " + matches);
    }
}
```

---

## **Common Regex Syntax**

| Regex Syntax      | Description                                             | Example Input | Matches   |
|--------------------|---------------------------------------------------------|---------------|-----------|
| `.`               | Matches any character except newline                    | `a.c`         | `abc`, `a7c` |
| `*`               | Matches 0 or more occurrences of the preceding element  | `ab*`         | `a`, `abbb` |
| `+`               | Matches 1 or more occurrences of the preceding element  | `ab+`         | `ab`, `abbb` |
| `?`               | Matches 0 or 1 occurrence of the preceding element      | `ab?`         | `a`, `ab` |
| `[abc]`           | Matches any one of the characters in the brackets       | `[aeiou]`     | `a`, `e` |
| `[^abc]`          | Matches any character not in the brackets               | `[^aeiou]`    | `b`, `c` |
| `[a-z]`           | Matches any character in the range                      | `[a-z]`       | `b`, `x` |
| `\d`             | Matches any digit (equivalent to `[0-9]`)               | `\d`         | `3`, `7` |
| `\D`             | Matches any non-digit character                         | `\D`         | `a`, `#` |
| `\w`             | Matches any word character (alphanumeric or `_`)       | `\w`         | `a`, `1` |
| `\W`             | Matches any non-word character                          | `\W`         | `@`, `!` |
| `\s`             | Matches any whitespace character                        | `\s`         | ` ` (space), `\t` |
| `^`               | Matches the start of the string                         | `^abc`        | `abc` (start only) |
| `$`               | Matches the end of the string                           | `xyz$`        | `xyz` (end only) |

---

## **Practical Examples**

### **1. Simple Pattern Matching**
```java
Pattern pattern = Pattern.compile("a+b+c*d*");
Matcher matcher = pattern.matcher("abbcdd");
System.out.println(matcher.matches()); // Output: true
```

### **2. Validating Email Addresses**
```java
Pattern emailPattern = Pattern.compile("^[\w.%+-]+@[\w.-]+\.[a-zA-Z]{2,}$");
Matcher emailMatcher = emailPattern.matcher("example@test.com");
System.out.println(emailMatcher.matches()); // Output: true
```

### **3. Password Validation**
- At least one uppercase letter, one lowercase letter, one digit, and one special character.
```java
Pattern passwordPattern = Pattern.compile("^(?=.*[A-Z])(?=.*[a-z])(?=.*\d)(?=.*\p{Punct}).{8,}$");
Matcher passwordMatcher = passwordPattern.matcher("Test@1234");
System.out.println(passwordMatcher.matches()); // Output: true
```

---

## **Tips for Learning Regex**
1. **Start Small**: Begin with simple patterns and gradually move to complex ones.
2. **Test Regularly**: Use online tools like [regex101](https://regex101.com/) to test patterns.
3. **Use Documentation**: Refer to Java's [Regex Documentation](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/regex/Pattern.html).

---

## **Conclusion**
Regex is a powerful tool for string matching and manipulation. Mastering it takes practice and understanding of its syntax and use cases. Experiment with different patterns to build confidence.
