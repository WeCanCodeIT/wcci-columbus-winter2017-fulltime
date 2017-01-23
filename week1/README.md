# Week 1
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
- [Conditionals](https://docs.google.com/presentation/d/19PVxVvHTiADbd8LYmosGONFzrhR3hqWQD4ObQcah_u0/edit#slide=id.p)
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
    - [ ] prompt the user for two 
    - [ ] prompt the user for an operation ('+', '-', '*', or '/')
    - [ ] call the appropriate method on the `Calculator` instance previously created
    - [ ] display the result ("2 + 2 = 4")
    - [ ] **extension**: ask the user whether she would like to perform another calculation, beginning again if she says "yes"; otherwise, display "Goodbye" and exit

### Homework
- continue working on the calculator exercise, implementing the operations that we didn't finish during class

## Thursday, January 26th
[Today in history](https://en.wikipedia.org/wiki/January_26#Events)
- CodeEval
- Strings: [tutorialspoint String tutorial](https://www.tutorialspoint.com/java/java_strings.htm)
- [Arrays](https://docs.google.com/presentation/d/15i4YRKWI7dbjG-peq-iO8OaZoxt6a2-E0N3Tpq5BdT4/edit?usp=sharing)
### Exercises in class
#### GPA Calculator

- ask the user how many classes were taken
- ask the user for the letter grades received (one at a time) [assume a 4.0 scale]
- display the resulting GPA

#### Piggy Bank Deposit Calculator

- *question:* Which data type should we use for the coins deposited?
- ask the user for the number of silver/gold dollars, quarters, dimes, nickels, and pennies deposited
- display the resulting total

#### CodeEval Exercises

- [Lowercase](https://www.codeeval.com/open_challenges/20)
- [Penultimate Word](https://www.codeeval.com/open_challenges/92)
- [Odd Numbers](https://www.codeeval.com/open_challenges/25)
- [Even Numbers](https://www.codeeval.com/open_challenges/100)
- [Age Distribution](https://www.codeeval.com/open_challenges/152)
- [Compare Points](https://www.codeeval.com/open_challenges/192)

### Homework
- CodeEval: [Capitalize Words](https://www.codeeval.com/open_challenges/93)
- CodeEval: [Word to Digit](https://www.codeeval.com/open_challenges/104)

## Friday, January 27th
[Today in history](https://en.wikipedia.org/wiki/January_27#Events)
- Fortune Teller exercise
  - [ ] create an application class (a class with a `main` method)
  - [ ] create a `FortuneTeller` class (or classes)