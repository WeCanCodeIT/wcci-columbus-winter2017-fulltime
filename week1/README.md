# Week 1
Jump to: [Tuesday](#tuesday-january-24th) | [Wednesday](#wednesday-january-25th) | [Thursday](#thursday-january-26th) | [Friday](#friday-january-27th)
## Monday, January 23rd
[Today in history](https://en.wikipedia.org/wiki/January_23#Events)
- Team Building: "Hello, Team!"
- Introduction to Eclipse
  - workspaces
  - projects
- Your First Java Application: "Hello, World!"

### Homework
- Join Slack
- Create a [GitHub](https://github.com) account. [*Note: This will become your portfolio. Use a name that can be taken seriously, please.*]

### References
- The Eclipse help system (Help->Help Contents) from within Eclipse
- [GitHub Guides](https://guides.github.com/)

## Tuesday, January 24th

[Today in history](https://en.wikipedia.org/wiki/January_24#Events)
- JDKs, JVMs, JREs -- that's a lot of letters!
  - The Java Virtual Machine (JVM): write once, run (almost) anywhere
  - The Java Runtime Environment (JRE): run (almost) anywhere
  - The Java Development Kit (JDK): write once
- Git and GitHub
  - Why is version control important?
- Basic building blocks
  - classes: code blueprints
  - objects: built from the blueprints
  - methods: sending messages to objects
    - constructors: methods that create objects
  - variables: holding onto things
- primitive types
- introduction to String
- basic conditionals

### Homework
- [Try GitHub Challenge 1.1: Got 15 minutes and want to learn Git?](https://try.github.io/levels/1/challenges/1)

## Wednesday, January 25th
[Today in history](https://en.wikipedia.org/wiki/January_25#Events)
- Calculator (in class exercise)
  - [ ] `CalculatorApplication` class (with a `main` method)
    - [ ] create `Calculator` instance
  - [ ] `Calculator` class
    - [ ] `add` method
    - [ ] `subtract` method
      - [ ] call the add method after negating the second value
    - [ ] `multiply` method
    - [ ] `divide` method
    - [ ] `invert` method
      - [ ] modify the `divide` method to call `invert` then `multiply`
  - [ ] `CalculatorApplication`'s `main` method should:
    - [ ] prompt the user for two numbers
    - [ ] prompt the user for an operation ('+', '-', '*', or '/')
    - [ ] call the appropriate method on the `Calculator` instance previously created
    - [ ] display the result ("2 + 2 = 4")
    - **extensions**:
        - ask the user whether she would like to perform another calculation, beginning again if she says "yes"; otherwise, display "Goodbye" and exit
        - use switch statments rather than if/then/else

### Homework
- continue working on the calculator exercise, implementing the operations that we didn't finish during class

## Thursday, January 26th
[Today in history](https://en.wikipedia.org/wiki/January_26#Events)
- CodeEval
- Strings: [tutorialspoint String tutorial](https://www.tutorialspoint.com/java/java_strings.htm)
- [Arrays](https://docs.google.com/presentation/d/15i4YRKWI7dbjG-peq-iO8OaZoxt6a2-E0N3Tpq5BdT4/edit?usp=sharing)

### Exercises in class
#### GPA Calculator
##### Fork It!

- Brian:
    - created a java-gpa-calculator repository

- the class:
    - forked the repository from GitHub

- Brian:
    - cloned the repository (`git clone https://github.com/btforsythe/java-gpa-calculator`)
    - added a build.gradle
    - added a src/main/java folder (default location for java source files)
        - [Note: later, we'll have a src/test/java folder as well]
    - added java files (classes):
        - GpaCalculator.java (GpaCalculator class)
        - GpaCalculatorTest.java (GpaCalculatorTest class)
        - [*Note: we realized we didn't really need `GpaCalculator` -- we're just putting code inside `GpaCalculatorTest`'s `main` method.]

- the class:
    - cloned their forks (`git clone https://github.com/*user*/java-gpa-calculator`)
    - created a pull request in GitHub to pull changes from Brian's repository
    - merged the pull request
    - changed directories into the repository directory (`cd java-gpa-calculator`)
    - pulled the latest code (`git pull`)
    - ran the eclipse task to set up an eclipse project (`gradle eclipse`)
    - Imported the project into Eclipse (File->Import..., Existing Project...)

##### Instructions

- ask the user how many classes were taken
- ask the user for the letter grades received (one at a time) [assume a 4.0 scale]
- display the resulting GPA

#### Piggy Bank Deposit Calculator

- *question:* Which data type should we use for the coins deposited?
- ask the user for the number of silver/gold dollars, quarters, dimes, nickels, and pennies deposited
- display the resulting total

#### Exercises (from CodeEval)

For each of these, create an appropriately named class with a main method to run your code.

##### Lowercase

Given a string, write a program to:
- convert it into lowercase
- write it to `System.out`

|example input|output|
|-------------|------|
|HELLO BOOTCAMP|hello bootcamp|
|This is some text|this is some text|

##### Penultimate Word

Write a program which finds the next-to-last word in a string.

|example input|output|
|-------------|------|
|some line with text|with|
|another line|another|

*[Hint: you'll want to call `split(" ")` on your input String.]*

##### Odd Numbers

Print the odd numbers from 1 to 99.

##### Even Numbers

Write a program which checks input numbers and determines whether a number is even or not.

|example input|output|
|-------------|------|
|701|false|
|4123|false|
|2936|true|

##### Age Distribution

You're responsible for providing a demographic report for your local school district based on age. To do this, you're going determine which 'category' each person fits into based on age.

The person's age will determine which category the person should be in:

|age|output|
|---|------|
|0 to 2|Still in Mama's arms|
|3 to 4|Preschool Maniac|
|5 to 11|Elementary School| 
|12 to 14|Middle School|
|15 to 18|High School|
|19 to 22|College|
|23 to 65|Working for The Man|
|66 to 100|The Golden Years|
|< 0 or > 100|This program is for humans|

##### Compare Points

Bob's hiking club is lost in the mountains on the way to a scenic overlook. Fortunately, Bob has a GPS device, so that he can see the coordinates where the group is currently at. The GPS gives the current X/Y coordinates as O, P, and the scenic overlook is located at Q, R. Bob now just needs to tell the group which way to go so they can get to the overlook in time for s'mores.

|O|P|Q|R|direction|
|:---:|:---:|:---:|:---:|---------|
|0|0|1|5|NE|
|12|13|12|13|here|
|0|1|0|5|N|


### Homework
##### Capitalize Words

Write a program which capitalizes the first letter of each word in a sentence.

|input|output|
|-----|------|
|Hello world|Hello World|
|javaScript language|JavaScript Language|
|a letter|A Letter|
|1st thing|1st Thing|

##### Word to Digit

Having a string representation of a set of numbers you need to print this numbers.

All numbers are separated by semicolon. There are up to 20 numbers in one line. The numbers are "zero" to "nine".

|example input|output|
|-------------|------|
|eight;six|86|
|two;four;two|242|

## Friday, January 27th
[Today in history](https://en.wikipedia.org/wiki/January_27#Events)
### Fortune Teller exercise

Due: Monday, January 30th by 9:30 AM ([GitHub submission link](https://docs.google.com/a/wecancodeit.org/forms/d/1My9F-7TyvtTYCszGgFv1NKcQ74cB20hOWJ_tHYMo03s/viewform))

- [ ] create an application class (a class with a `main` method)
- [ ] [optional] create a `FortuneTeller` class (or classes)
- [further instructions](https://github.com/WeCanCodeIT/wcci-fulltime-fall2016-cbus/blob/master/Week1/Assignments/FortuneTeller.md)
