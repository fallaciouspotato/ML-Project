Campus Course & Records Manager (CCRM)
🔹 Project Overview

This project is a console-based Java application for managing students, courses, and enrollments at a university. It demonstrates object-oriented programming (OOP) principles, Java best practices, and covers fundamental topics like enums, inheritance, composition, builders, singletons, and CLI-based interaction.

The program allows:

Adding and listing students

Adding and listing courses

Enrolling students into courses

Recording grades and marks

Displaying academic records

🔹 How to Run
Prerequisites

Java JDK 17 or later installed

Eclipse IDE for Java Developers installed

GitHub account for project submission

Steps:

Clone the project: git clone https://github.com/YOURNAME/CCRM.git
				   cd CCRM

Open Eclipse → Import → Existing Java Project → select the cloned folder.

Locate edu.ccrm.cli.MainMenu.java.

Right-click → Run As → Java Application.

The CLI menu will appear in the console.
Example run:CCRM MAIN MENU
1) Add Student  2) List Students  3) Add Course  4) List Courses  5) Exit
>

Java Evolution Timeline :
| Year  | Version           | Key Features                                    |
| ----- | ----------------- | ----------------------------------------------- |
| 1995  | Java 1.0          | First release by Sun Microsystems               |
| 1998  | Java 2 (J2SE 1.2) | Swing, Collections Framework                    |
| 2004  | J2SE 5.0          | Generics, Enums, Annotations                    |
| 2011  | Java 7            | Try-with-resources, Diamond Operator            |
| 2014  | Java 8            | Lambdas, Streams, Default methods               |
| 2017  | Java 9            | Modules, JShell                                 |
| 2021  | Java 17           | LTS release, Sealed Classes, Pattern Matching   |
| 2023+ | Java 21/22        | Record patterns, Virtual threads (Project Loom) |

Java ME vs Java SE vs Java EE :

| Feature | Java ME (Micro) | Java SE (Standard)                        | Java EE (Enterprise)     |
| ------- | --------------- | ----------------------------------------- | ------------------------ |
| Target  | Mobile/Embedded | Desktop & General Apps                    | Web & Enterprise Systems |
| Scope   | Lightweight API | Core libraries (Collections, IO, Streams) | Adds Servlets, JSP, EJB  |
| Example | Mobile games    | Campus Manager (this project)             | Online banking system    |

JDK, JRE, JVM Explained :

JDK (Java Development Kit): Tools + compiler + JRE. Used for developing apps.

JRE (Java Runtime Environment): Libraries + JVM. Used for running apps.

JVM (Java Virtual Machine): Abstract engine that executes Java bytecode on any platform.

Features Implemented

OOP Principles

Encapsulation (private fields, getters/setters in Student, Course)

Inheritance (Person → Student)

Abstraction (Person abstract class)

Polymorphism (role() overridden in Student)

Immutable Class → Course with final fields and Builder pattern

Enum → Semester, Grade, Student.Status

Singleton → DataStore for shared storage

Composition → Student has Enrollment, Enrollment has Course

Assertions → ID must not be null in Person constructor

Collections & Generics → Map<String, Student>, Map<String, Course>

CLI with switch & loops → MainMenu menu system

Mapping Table (Topic → Implementation)

| Requirement          | File/Class                                    |
| -------------------- | --------------------------------------------- |
| Inheritance          | `Person` → `Student`                          |
| Abstraction          | `Person` (abstract class)                     |
| Polymorphism         | `role()` method                               |
| Encapsulation        | `Student`, `Course` private fields            |
| Composition          | `Student` has `Enrollment`                    |
| Enum                 | `Semester`, `Grade`, `Student.Status`         |
| Immutable Class      | `Course` with Builder                         |
| Singleton            | `DataStore`                                   |
| CLI with Switch      | `MainMenu`                                    |
| Assertions           | `Person` constructor                          |
| Generics/Collections | `Map<String, Student>`, `Map<String, Course>` |


Screenshots: 

![Java Version](Screenshots/java_version.png)
![Eclipse Packages](Screenshots/eclipse_packages.png)
![CLI Run](Screenshots/Cli_run.png)
![Backup Folder](Screenshots/backup and export.png)
	







Assertions Note:

To enable assertions, run with:java -ea edu.ccrm.cli.MainMenu

GitHub Repository

This project is hosted at:
👉 https://github.com/JayModha100/CCRM

Conclusion

This project successfully demonstrates Java OOP concepts and essential programming practices in a practical Campus Course & Records Manager. It is modular, extensible, and provides a strong foundation for future upgrades (like file persistence, GUI, or web integration).

 
