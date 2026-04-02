# Java Grades Statistics Program

## Description

This Java program reads **20 student final grades** using the keyboard, validates that each grade is between **1 and 7**, and then calculates several statistics based on the entered grades.

The program uses:

* `Scanner` for keyboard input
* `ArrayList<Double>` to store grades
* Methods for input validation
* Loops and counters for calculations

---

## Program Requirements

The program performs the following calculations:

1. Average of grades **greater than 5**
2. Average of grades **less than 4**
3. Count of grades **equal to 1**
4. **Overall average** of all grades

### Optional Rule (mentioned in the code comment)

If the user enters **0**, the program should terminate early and display an error message (this is mentioned as an optional improvement and is not fully implemented in the current code).

---

## How the Program Works

### Step 1 — Input Grades

The program asks the user to enter 20 grades.
Each grade must be between **1 and 7**.
If the user enters an invalid grade, the program **recursively asks again** until a valid grade is entered.

This validation is handled by the method:

```java
public double addToArray(int i)
```

This method:

* Prompts the user for a grade
* Validates the range [1–7]
* If invalid, it calls itself again (recursion) until the input is correct

---

### Step 2 — Store Grades

All grades are stored in an `ArrayList<Double>`:

```java
ArrayList<Double> array = new ArrayList<>();
```

---

### Step 3 — Process Data

The program loops through the grades and calculates:

* Sum of grades > 5
* Sum of grades < 4
* Count of grades == 1
* Total sum for overall average

---

### Step 4 — Display Results

The program prints:

```text
Average greater than 5 : X
Average less than 4 : X
Notes equal to 1 : X
General Average : X
```

---

## How to Compile and Run

```bash
javac Main.java
java Main
```

---

## Example Execution

```text
Enter note 1 between [1-7]: 6.5
Enter note 2 between [1-7]: 3.2
Enter note 3 between [1-7]: 1
...
Average greater than 5 : 6.1
Average less than 4 : 2.8
Notes equal to 1 : 2
General Average : 4.3
```

---

## Concepts Practiced

This program helps practice the following Java concepts:

* Classes and methods
* Recursion
* ArrayList
* For loops
* Conditional statements
* Counters and accumulators
* Input validation
* Basic statistics (averages)

---

## Possible Improvements

* Allow the program to terminate if the user enters **0**
* Prevent division by zero when there are no grades > 5 or < 4
* Use exception handling for non-numeric input
* Close the Scanner (`s.close()`)

---

## Author

Created as a Java practice exercise to work with arrays, methods, validation, and loops.
