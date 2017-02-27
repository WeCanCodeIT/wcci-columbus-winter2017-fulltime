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

```JavaScript
var myVariable = "foo";
myVariable = 42; // this is valid
```
- duck typing

![](baby-duck.jpg)

# Welcome to the console

- Chrome Developer tools, ways to get there:
    - Tools Menu->Developer tools
    - Shift+Ctrl+I
    - Right click an element and select *Inspect*
- Click the *Console* tab

    ![](helloConsole.png)

    - `<- undefined` indicates the return value
    - implements what is known as a **R**ead **E**valuate **P**rint **L**oop (REPL)

## Writing to the console

### Java

```Java
System.out.println("my message");
```

### JavaScript

```JavaScript
console.log("my message");
```

# Variables

### Java (statically typed)

```Java
VirtualPet fido;
int days;
```

### JavaScript (dynamic)

```JavaScript
var fido;
var days;
```
*Be Careful!* If you do not use `var` to declare a JavaScript variable, it will be created automagically in the global scope. This can cause you pain.

# Arrays

### Java

```Java
String[] menuItems = { "filet mignon", "escargot", "tacos de pescado" };
```

### JavaScript

```JavaScript
var menuItems = [ "filet mignon", "escargot", "tacos de pescado" ];
```
Square brackets, not curly brackets.

See? I know how to spell it, Dinah!

## Iterating by index

### Java

```Java
String[] menuItems = { "filet mignon", "escargot", "tacos de pescado" };
for(int idx = 0; idx < menuItems.length; idx++) {
    System.out.println(menuItems[idx]);
}
```

### JavaScript

```JavaScript
var menuItems = [ "filet mignon", "escargot", "tacos de pescado" ];
for (var idx = 0; idx < menuItems.length; idx++) {
    console.log(menuItems[idx]);
}
```

## Iterating with forEach

### Java

```Java
String[] menuItems = { "filet mignon", "escargot", "tacos de pescado" };
for(String item: menuItems) {
    System.out.println(item);
}
```

### JavaScript

```JavaScript
var menuItems = [ "filet mignon", "escargot", "tacos de pescado" ];
menuItems.forEach(function(element) {
    console.log(element)
})
```

The function argument to `forEach` above is known as a *callback* function. JavaScript focuses on *functional* programming.

Java's `Collection` interface has a similar `forEach` method (in version 8 and above) for functional programming.

# JavaScript Object Notation (JSON)

### Java (classical)

```Java
public class VirtualPet {
    private int hunger = 0;
    public void feed() {
        hunger = hunger-5;
    }
    public boolean isHungry() {
        return hunger >= 30;
    }
}
VirtualPet fido = new VirtualPet();
```

### JavaScript (prototypical)

```JavaScript
function VirtualPet() {}; // constructor
VirtualPet.prototype = {
    hunger: 20,
    feed: function() {
        this.hunger = this.hunger - 5;
    },
    isHungry: function() {
        return this.hunger >= 30;
    }
};
var fido = new VirtualPet();
```

*Encapsulation* in JavaScript is more difficult.

## Also JSON - instead of Maps

### Java

```Java
Map<String, String> prices = new HashMap<String, String>();
prices.put("filet mignon", "34.95");
prices.put("tacos de pescado", "19.95");

for (Entry<String, String> entry : prices.entrySet()) {
    System.out.println(entry.getKey() + ": " + entry.getValue());
}
```

### JavaScript

```JavaScript
var prices = {
    "filet mignon": "34.95",
    "tacos de pescadot": "19.95"
};

for (var item in prices) {
    console.log(item + ": " + prices[item]);
}
```

## Also Also JSON

JavaScript objects are a lot like maps. In our previous example, we were really iterating over the properties of a JavaScript object. Doing this:

```JavaScript
function VirtualPet() {}; // constructor
VirtualPet.prototype = {
    hunger: 20,
    feed: function() {
        this.hunger = this.hunger - 5;
    }
};
var fido = new VirtualPet();

console.log("Fido's hunger before feeding is " + fido.hunger);
fido.feed();

console.log("After feeding:");
for (var attr in fido) {
    console.log(attr + ": " + fido[attr]);
}
```

will result in:

    Fido's hunger before feeding is 20
    After feeding:
    hunger: 15
    feed: function () {
        this.hunger = this.hunger - 5;
        }
