# SpartanShuttlers: Badminton Players Management System

Badminton Player Management System allows the user to manage players, including adding players, viewing their details, and displaying gender statistics. 

# Table of Contents

1. [Project Overview](#project-overview)
2. [Features](#project-overview)
3. [Explanation of how OOP principles were applied](#explanation-of-how-oop-principles-were-applied)
   - [Encapsulation](#encapsulation)
   - [Inheritance](#inheritance)
   - [Abstraction](#abstraction)
   - [Polymorphism](#polymorphism)
4. [Chosen SDG Gender Equality (SDG 5)](#chosen-sdg-gender-equality-(sdg-5))
5. [Instructions for running the program](#instructions-for-running-the-program)

# l. Project Overview
The Badminton Player Management System is a console-based application developed in Java. Its primary purpose is to manage and maintain a list of badminton players, including their personal details, performance statistics, and player type (Singles or Doubles). It also provides administrative functionalities such as adding new players, updating player match statistics, and viewing detailed player information. The system supports user login and session management with basic authentication.

# ll. Features
- Add a Player
- View all Player
- Update Players Stats
- Search Players
- Show Top Players by Rank
- Show Gender Stats

# lll. Explanation of how OOP principles were applied

## Encapsulation
Encapsulation involves bundling data (attributes) and methods (functions) that manipulate the data into a single unit, or class. It also involves restricting direct access to some of an object's components to prevent unintended interference and misuse.

**Application in the System:**

- **Private attributes:** In the Player class, attributes like name, age, rank, country, and gender are defined as private. This prevents external classes from directly accessing and modifying these values. This ensures that the state of the player object can only be modified in a controlled manner.
- **Getter methods:** The class provides getter methods (like getName(), getAge(), getRank()) to access private fields. This way, the player details are encapsulated and cannot be modified directly from outside the class.

## Inheritance
Inheritance is a mechanism that allows one class to inherit the properties and methods of another. It promotes code reuse and establishes a natural hierarchy between classes.

**Application in the System:**

- **Player subclasses:** The BadmintonSinglesPlayer and BadmintonDoublesPlayer classes inherit from the abstract Player class. These subclasses inherit common attributes and methods from Player (such as name, rank, getName(), getPlayerId()) but also extend the Player class to include specific attributes relevant to their type (e.g., playingStyle for singles players and partnerName for doubles players).
- This allows for code reuse: both singles and doubles players share core functionality (e.g., tracking match statistics), and only the specific details unique to each player type are added in the subclasses.

## Abstraction
Abstraction is the principle of hiding the complex implementation details and exposing only the essential features of an object. It allows focusing on "what" an object does, rather than "how" it does it.

**Application in the System:**

- **Abstract Player class:** The Player class is abstract and contains common functionality shared by all player types (e.g., updateMatchStats(), getPlayerId(), getName(), etc.). This class defines the core attributes and methods that all player types should have, but the specifics (such as how player information is displayed) are left for subclasses to define.
- **Abstract method displayInfo():** The displayInfo() method is declared abstract in the Player class, leaving it up to the subclasses (like BadmintonSinglesPlayer and BadmintonDoublesPlayer) to implement it in a way that fits their specific requirements.
- This design hides unnecessary implementation details from the user and allows a clean, high-level interaction with player objects, focusing on functionality rather than internal workings.

## Polymorphism
Polymorphism is the ability of different classes to respond to the same method call in different ways. This can happen through method overriding (runtime polymorphism) or method overloading (compile-time polymorphism).

**Application in the System:**

- **Method Overriding (Runtime Polymorphism):** The BadmintonSinglesPlayer and BadmintonDoublesPlayer classes override the displayInfo() method from the Player class. This means that, although the system can treat both player types as Player objects, when the displayInfo() method is called, it will invoke the correct version based on the actual object type (either BadmintonSinglesPlayer or BadmintonDoublesPlayer).
- This allows the same method to have different behaviors depending on the object it is called on, providing flexibility and making the system easier to extend with new player types.

# lV. Chosen SDG Gender Equality (SDG 5)
The Badminton Player Management System was designed with a strong focus on gender equality as its core principle. The project aligns with SDG 5 by addressing gender inclusion and representation in the sport of badminton, helping to ensure that all genders—whether male, female, or non-binary—are equally recognized and treated with respect in the system.

- A **gender statistics feature** is built into the system, which counts the number of male, female, and non-binary players. This feature allows users to monitor the gender balance among players, providing valuable data that can highlight any disparities in gender representation.
- The system gives equal treatment to both male and female players as well as non-binary players. Every player, regardless of gender, can be added to the system, viewed in the player list, and tracked for gender statistics.
- Badminton is a sport that has traditionally had separate competitions for male and female players, but efforts to promote gender equality are increasingly evident. The system highlights this by acknowledging the importance of both male and female participation, while also making space for non-binary players.

# v. Instructions for running the program
## Main Page

![main menu](https://github.com/user-attachments/assets/6410d6b7-9b4e-4927-8ab7-52ddbf9392f4)

## Add Player

- You will be prompted to enter details like:
- Name, age, rank, country, and gender.
- You will also choose whether the player is a Singles or Doubles player, and enter additional relevant information (e.g., playing style or partner name).

![add player](https://github.com/user-attachments/assets/7b7f868d-d065-462e-bef2-7406b8e8d238)

## View Player

- his option displays a list of all players in the system with their details, including ID, name, age, rank, country, gender, and player type (Singles or Doubles).
  
![view player](https://github.com/user-attachments/assets/fbafa715-49dc-46c7-95f3-e03b8245dbc7)

## Show Gender Stats

- This option shows a summary of gender statistics, counting how many players belong to each gender category (Male, Female, Other).

![gender stats](https://github.com/user-attachments/assets/8be21a14-227f-4c72-8680-afcc008dc217)

## Exit
- Exit the program.
