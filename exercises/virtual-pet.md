# Virtual Pet

Create a virtual pet. Bonus points if it becomes a fad!

## Setup

We'll set up this project just like we've set up our other projects.

- [ ] Create a Java project called `virtual-pet`
    - [ ] It should have `src/main/java` and `src/test/java` source folders.
    - [ ] Add the JUnit 4 library as a dependency.
- [ ] Create a README.md file in your project folder to describe what you've done with your project. No fancy formatting is necessary. Just separate paragraphs with an empty line. (If you'd like to learn more about Markdown formatting, check out the [Github Markdown Guide](https://guides.github.com/features/mastering-markdown/).)

## Classes
- [ ] In your `src/test/java` source folder, create a `VirtualPetTest` class.
- In your `src/main/java` folder:
    - [ ] create a `VirtualPet` class.
    - [ ] create a `VirtualPetApp` class with a `main` method. (Remember to check the box to create a `main` method when creating the class.)


## Details

Make a virtual pet program. This is your version of a Tamagotchi or DigiPet! This might seem like a daunting task, but we can break it down.

First, decide what features you want to incorporate. You might be tempted to make this a long list - start small! Think Minimum Viable Product (MVP)! (Tip: Use your README.md file to keep track of a prioritized list of the features you'd like to implement).

Think of what attributes and methods you will need. Attributes could include things like hunger or thirst. Methods could involve things that happen when a person interacts with the pet.

You should include a `tick()` method (think clocks, not parasites) representing the passage of a unit of time. This should do things like update properties that are time dependent, such as hunger or thirst. Whenever the menu is shown or some user interaction occurs, you can call the `tick()` method to cause properties to update.

### Ideas

Things (attributes) that a virtual pet should have, along with some ideas for activities (methods) that might address them are:

- hunger (feed it)
- thirst (water it)
- waste (let it out to the bathroom)
- boredom (play with it)
- sickness (take it to the doctor)

Your methods should cause the appropriate properties to update - for instance, if you have a `feed()` method, it might make `hunger` go down, but make `thirst` go up.

Attributes that might update when `tick()` is called:
  - boredom increasing
  - hunger increasing
  - sleepiness increasing

If you play with the pet, perhaps that makes it more tired. Have fun with this part!

Also, remember that more features `!=` better. Pick a focus for your pet. Maybe go with a theme.

Once you've built the `VirtualPet` class, it's time to think about the user interface. We're using a console interface for now, so it will likely involve some sort of loop and a menu showing possible actions, as well as indicating the state of the pet. You'll need to decide when to call the `tick()` method - whether you want it to `tick()` every time the menu is shown, or based on some other criteria.

Your user interface should live in the `main` method of the `VirtualPetApp` class. Use `System.out` to print output to the console and `java.util.Scanner` to read user input.

An example user interface is below (yours doesn't need to match this!):

```
Horace the Hippo
Hunger: 27
Thirst: 5
Boredom: 5
Tiredness: 50

What do you want to do?
1. Feed Horace
2. Water Horace
3. Play with Horace
4. Put Horace to sleep
5. Do nothing

> 1

You feed Horace.
```

### Tips on Writing Tests

To expose attributes of your pet for testing, create accessor methods (commonly called "getters"). Here is an example:

```
public class VirtualPet {
  
  private int hunger;

  // other attributes

  public int getHunger() {
    return hunger;
  }

  public boolean isHungry() {
    return hunger >= 50; // I just picked an arbitrary number. Use whatever you like!
  }

  // other methods
}
```

Generally, your tests will involve calling the `tick()` method one or more times and checking on the state of your pet. An example could be calling `tick()` until your pet should be hungry, then verifying that it is hungry.

Your pet could become pretty complex, so stick to testing the more straightforward interactions with your pet. What's important is that you become more comfortable with writing tests. Don't worry, we won't tell Uncle Bob!

### Stretch Tasks

Pets are not robots - they usually have some sort of self-determination! When `tick()` is called, you might want to have your pet take a look at its needs and address one, prioritizing whichever need is highest. You could also make your pet uncooperative - when the user tries to feed the pet, for example, you might make the pet refuse to eat if it is bored.

Rather than using numbers to convey your pet's status, you could have some sort of visual representation of the pet. I.e., instead of printing `hunger: 50`, you could use smileys or [ASCII art](https://en.wikipedia.org/wiki/ASCII_art) to show hunger when `hunger >= 50`.
```
     >=<        
,.--'  ''-.
(  )  ',_.'
Xx'xX      

Horace looks like this: :0

1. Feed Horace
2. Water Horace
3. Play with Horace
4. Put Horace to sleep
5. Do nothing
```

### Required Tasks

- VirtualPet class
  - [ ] Create at least three attributes (aka properties aka fields).
  - [ ] Create at least three methods (messages it receives).
  - [ ] Create a `tick()` method that represents the passage of time.
- VirtualPetApp class
  - [ ] Create a `main` method that asks for user input (using `Scanner`) and writes output to the console (via `System.out`).

### Stretch Tasks

- [ ] Give the pet the ability to take care of some of its own needs.
- [ ] Create a visual representation of your pet.

## Hints

Don't try to tackle everything at once! Break this project up into smaller chunks, and you will find that they are all manageable.

- Submission Link (TBD)