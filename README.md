# University System - User Guide

## Overview
This University System is an interactive console application that lets you manage the university's professors (teachers), students, and classes. The system offers many different options to manage the internal structure of the university.

---

## How to run the program using an IDE

- Open the project in your preferred Java development environment (IntelliJ IDEA, Eclipse or similar).  
- Navigate to the `ui` package and locate the `Main` class. Run the `Main` class to start the application.

---

## How to Use the Program
When you start the application, you'll see a menu with several options. Type the corresponding number (or 'E' to exit) and press **Enter** to select an option.

---

## Menu Options and Their Functions

### **1 - Print All Professors**
- **Purpose:** Display a list of all professors (teachers) in the entire university.
- **Details Provided:** Teacher ID, Name, Salary, Years of Experience, and Weekly active hours.

### **2 - Print All Students**
- **Purpose:** Display a list of all students enrolled in the university.
- **Details Provided:** Student ID, Name, and Age.

### **3 - Print All Classes**
- **Purpose:** Show a list of all classes available at the university.
- **Details Provided:** Partial class information such as Class ID, Class Name, Classroom, the assigned Teacher’s Name, and a list of enrolled Student Names.
- **Additional Step:** After the list is shown, you can enter a specific Class ID to view more detailed information about that class, including complete teacher and student details.

### **4 - Create a New Student**
- **Purpose:** Add a new student to the system.
- **Process:**
  1. Enter the new student's name.
  2. Enter the student's age.
  3. Provide the ID of an existing class to enroll the student.
- **Outcome:** The new student is added to both the global student list and the selected class.

### **5 - Create a New Class**
- **Purpose:** Create a new class in the university.
- **Process:**
  1. Enter the class name.
  2. Enter the classroom (e.g., room number or designation).
  3. Provide the ID of an existing teacher to assign to the class.
  4. Enter the IDs of students to be enrolled in the class (separated by commas).
- **Outcome:** A new class is created and added to the university's class list, with the designated teacher and enrolled students.

### **6 - List All Classes for a Student**
- **Purpose:** Display all classes in which a specific student is enrolled.
- **Process:** Enter the student's ID when prompted.
- **Outcome:** The program shows partial details for each class that the student is part of. If no classes are found for the provided student ID, a message will inform you accordingly.

### **E - Exit the Program**
- **Purpose:** Close the application.
- **Process:** Simply type 'E' and press **Enter** to exit.

---

## Recommendations
- **Input Tips:** Always enter valid IDs and proper comma-separated lists when prompted to avoid errors.
- **Navigation:** Use the menu options accordingly to manage professors, students, and classes.
