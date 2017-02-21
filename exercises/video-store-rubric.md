# Video Store Rubric

## Weights

Each task will receive a weight. The ratio of the scores to total possible will be used to score a total of 90 points.

- `VideoStoreApp` class

    - `main` method
        - [ ] creates the appropriate subtypes of `Movie`: 4
        - [ ] creates `Rental` instance(s) for each `Movie` instance: 3
        - [ ] creates a `RentalStatement` instance: 2 
        - [ ] adds each `Rental` to the `RentalStatement`: 2
        - [ ] uses `RentalStatement` to print statement: 2 

- `Movie` class
    
    Much of this class was completed in class, so only modifications / additions will be assigned points

    - [ ] `abstract` `calculateFees` method declaration: 3 

- `Movie` subclasses (three or more)

    - [ ] constructors accepting title and calling superclass constructor appropriately: 3 @ 2 each = 6  
    - [ ] `calculateFees` method implementation: 3 @ 4  each = 12  

- `Rental` class

    - [ ] constructor implementation: 2 
    - attribute declarations and assignments
        - [ ] `rented`: 1
        - [ ] `days`: 1
    - method implementations
        - [ ] `calculateFees` (delegating to `rented`): 4 
        - [ ] `getTitle` (delegating to `rented`): 2 
        - [ ] `getPriceCode` (delegating to `rented`): 2
        - [ ] `getDays`: 1

- `RentalStatement` class

    - [ ] `rentals` attribute declaration and assignment: 4 
    - [ ] `add` method used to populate `rentals`: 3 
    - [ ] `print` method iterates over and prints `rentals`: 4 

## Scoring

- Required tasks completed: 90 points

    Total for weighted tasks above: 58

    Calculation: total from above / 58 * 90

- Code quality: 10 points

    Code that is not conistently formatted will receive few or no points in this area. (*The Eclipse formatting hotkey is Shift+Ctrl+F. Get into the habit of using it. It will make your code easier to read for you and others.*)

    Otherwise, code will be evaluated based on the level of progress of the class/student based on instructor discretion. Primary things we will look for include:

    - expressively-named variables/methods (avoid abbreviating other than loop index variables)
    - small methods and classes (extract private methods as necessary)
    - unit tests