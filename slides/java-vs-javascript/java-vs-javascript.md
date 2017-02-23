# Java vs JavaScript

> "Java is to Javascript as ham is to hamster." -- Jeremy Keith

![](segue-blog-java-vs-javascript.png)

Or…

> "... as car is to carpet." -- Some other guy 

# Differences

Java                |&lt;-&gt;|JavaScript
-------------------:|---                            |:---------
compiled            ||interpreted (usually)
write once, run anywhere (usually)||subject to differences in execution environments
statically typed    ||dynamic
classical inheritance - a class inherits from another class||prototypal inheritance - an object inherites from another object (its *prototype*)


# Dynamic languages

- no compilation phase, 'bad' code is executed
- variables have no type
```
var myVariable = "foo";
myVariable = 42; // this is valid
```
- duck typing

![](baby-duck.jpg)

## JSON, not Maps

- JSON = JavaScript Object Notation