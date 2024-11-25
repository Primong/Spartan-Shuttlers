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
Badminton Player Management System is a console-based Java application designed to help manage and track players in the sport of badminton. The system allows users to register new players, view player information, and analyze gender statistics. It implements several key features to ensure efficient player data management while promoting inclusivity and gender equality, making it a useful tool for managing badminton players in both professional and recreational contexts.

# ll. Features
- Add a Player
- View all Player
- Show Gender Stats

# lll. Explanation of how OOP principles were applied

## Encapsulation
1.1. **Encapsulation** refers to the bundling of data (attributes) and methods (functions) that operate on that data into a single unit, or class. It also restricts direct access to some of an object's components, which is typically achieved through access modifiers (e.g., private, public).

1.2. The **Player class** encapsulates player attributes such as name, age, rank, country, and gender, as well as the logic to manage these attributes.

## Inheritance
2.1. **Inheritance** allows one class to inherit the attributes and methods of another class, enabling code reusability and the creation of hierarchical relationships between classes.

2.2. The Player class is abstract, and two subclasses—BadmintonSinglesPlayer and BadmintonDoublesPlayer—inherit from it. Both subclasses inherit the Player class's fields (name, age, rank, etc.) and methods, such as getPlayerId(), getName(), getRank(), and getGender().

## Abstraction
3.1. **Abstraction** involves hiding the complex implementation details and exposing only the necessary parts of the object to the user.

## Polymorphism
4.1. **Polymorphism** allows objects of different classes to be treated as objects of a common superclass. It also enables method overriding, where a subclass can provide its specific implementation of a method.

4.2. **Method overriding** is demonstrated with the displayInfo() method. Both BadmintonSinglesPlayer and BadmintonDoublesPlayer override the displayInfo() method defined in the Player class to provide specific implementations.
- **BadmintonSinglesPlayer** displays the player's style (e.g., "Offensive" or "Defensive").
- **BadmintonDoublesPlayer** displays the name of the player's partner.

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
