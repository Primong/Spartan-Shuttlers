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
