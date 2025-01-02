Here’s a categorized breakdown of regex problems based on difficulty levels, along with corresponding problem sets for practice.

Easy Level

These problems involve basic regex patterns and are good for beginners.

Patterns to Learn
•	Character classes ([a-z], [A-Z], [0-9], etc.).
•	Quantifiers (*, +, ?).
•	Anchors (^, $).
•	Escaping special characters (\\).

Problems
1.	Match all words that start with ‘a’:
•	Input: "apple banana apricot orange"
•	Output: ["apple", "apricot"]
2.	Match all digits in a string:
•	Input: "The year is 2025, and the time is 12:45 PM"
•	Output: ["2025", "12", "45"]
3.	Match valid email addresses:
•	Input: "user@example.com, invalid@.com, test@domain.org"
•	Output: ["user@example.com", "test@domain.org"]
4.	Match words ending with ‘ing’:
•	Input: "I am singing, dancing, and enjoying"
•	Output: ["singing", "dancing", "enjoying"]
5.	Match all words with exactly 3 letters:
•	Input: "The cat sat on the mat"
•	Output: ["cat", "sat", "mat"]

Medium Level

These problems involve more complex patterns, including groups, alternations, and character sets.

Patterns to Learn
•	Groups and capturing ((abc)).
•	Alternation (|).
•	Lookahead and lookbehind ((?=...), (?<=...)).

Problems
1.	Match dates in dd-mm-yyyy or dd/mm/yyyy format:
•	Input: "12-05-2023, 31/12/2024, 2025-01-01"
•	Output: ["12-05-2023", "31/12/2024"]
2.	Match words containing both uppercase and lowercase letters:
•	Input: "HELLO World, JAVA python"
•	Output: ["World", "python"]
3.	Match valid IPv4 addresses:
•	Input: "192.168.1.1, 999.999.999.999, 10.0.0.1"
•	Output: ["192.168.1.1", "10.0.0.1"]
4.	Match strings enclosed in double quotes:
•	Input: "She said, "Hello!" and left."
•	Output: [""Hello!""]
5.	Match repeated words:
•	Input: "This is is a test test sentence."
•	Output: ["is is", "test test"]

Advanced Level

These problems require a deep understanding of regex, including advanced constructs like non-capturing groups, recursive patterns, and advanced lookaheads.

Patterns to Learn
•	Non-capturing groups ((?:...)).
•	Conditional expressions ((?(...)...)).
•	Recursive patterns (if supported).

Problems
1.	Validate a password with these rules:
•	At least 8 characters.
•	At least one uppercase, one lowercase, one digit, and one special character.
•	Input: "Password@123, Pass12, WeakPass!"
•	Output: ["Password@123"]
2.	Match nested parentheses:
•	Input: "((a+b)*(c-d)) and ((x/y)+z)"
•	Output: ["((a+b)*(c-d))", "((x/y)+z)"]
3.	Match HTML tags and their content:
•	Input: "<div>Hello</div> <span>World</span>"
•	Output: ["<div>Hello</div>", "<span>World</span>"]
4.	Match valid US phone numbers:
•	Formats: (123) 456-7890, 123-456-7890, 123.456.7890.
•	Input: "(123) 456-7890, 123-456-7890, 123.456.7890, 1234567890"
•	Output: ["(123) 456-7890", "123-456-7890", "123.456.7890"]
5.	Extract all URLs from a string:
•	Input: "Visit https://example.com or http://test.org for more info."
•	Output: ["https://example.com", "http://test.org"]

Tips for Practicing
1.	Use tools like regex101 to test patterns interactively.
2.	Solve problems incrementally, starting from easy to advanced.
3.	Break complex problems into smaller parts to identify patterns.

Let me know if you need solutions or further explanations for any of these! 😊