# Bank Account

## Directions

You will be creating a console application to manage a customer's bank accounts.

##Classes/Interfaces

Create the following classes:

##### BankAccountApp class

Give this class a `main` method. It will be used to run your application. It will be responsible for all of the output to to the console and accepting input from the console.

It should display a menu with entries that allows the user the following options:

- View balance for:
  - [ ] checking account
  - [ ] savings account
  - [ ] credit card account
- [ ] Deposit funds to either checking or savings
- [ ] Withdraw Funds from either checking or savings
- [ ] Exit

##### Account base class

The Account class will be extended by each of the classes representing specific account types. It should include:

- [ ] An `update()` method that represents the passage of time, calculating interest or other time-related attributes. This is similar to the `tick()` method from [VirtualPet](virtual-pet.md).
- [ ] An `abstract` `getAccountType()` method to be implemented by `Account` subclasses.
- [ ] Implementations of methods common to all accounts.
- [ ] `abstract` declarations for **all** other methods (to be implemented by accounts).
- [ ] A *constructor* that accepts the opening balance for the account.
- Attributes related to accounts. At a minimum these should include:
    - [ ] client name
    - [ ] account number
    - [ ] account balance
    - [ ] interest rate
- [ ] Use `java.math.BigDecimal` to represent attributes like account balance that represent money.

#### Classes representing specific account types

Create the following classes:

- [ ] CheckingAccount
- [ ] SavingsAccount
- [ ] CreditCardAccount

Each of these classes:

- [ ] Should extend the `Account` class, implementing its `abstract` methods.
- [ ] Should implement any `abstract` methods from the `Account` class.
- [ ] Should **not** declare any new methods.

## Extensions

- [ ] Create account summary files for each account type that track transactions. Each account type should have its own text file. Each line of these files should include the following information about the transaction:
  - [ ] client name
  - [ ] account number
  - [ ] account type
  - [ ] date and time (use `java.util.Date`)
  - [ ] "+" for a deposit or "-" for a withdrawal
  - [ ] amount
  - [ ] balance after the transaction

## Hints

Persistence is not required, so it is ok (and expected) that each time you run the program, the account balances and other attributes reset.
