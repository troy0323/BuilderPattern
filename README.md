# BuilderPattern
## Problem Scenario

Imagine you're developing an e-commerce application where customers create accounts with varying levels of detail.

Initially, you use a standard constructor for the User class:

public User(String firstName, String lastName, String email,
           String address, String phone, int age) {
     // ...
}

However, you encounter challenges:

- Registration forms: It's cumbersome to ensure users enter all fields in the correct order, leading to errors and frustration.
- Optional fields: Not all customers provide complete information, but the constructor forces them to.
- Data consistency: Changes to user profiles after registration can cause unexpected issues due to mutable fields.

# UML Class Diagram
![image](https://github.com/troy0323/BuilderPattern/assets/90951302/c03bb3b7-7050-4bb6-84f9-01b4c9533b9c)

  
