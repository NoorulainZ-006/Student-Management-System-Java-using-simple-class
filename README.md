# Simple Student Management System (Java)

## Overview
This is a **basic Student Management System** written in Java.  
It allows you to **add**, **search**, **remove**, and **view** student records using simple console-based interaction.  
The program demonstrates the use of:
- **Classes & Objects**
- **Constructors**
- **Methods**
- **User Input using Scanner**
- **Menu-driven logic using do-while and switch**

---

## Features
✅ Add up to 3 students  
✅ View student details  
✅ Search for a student by ID  
✅ Remove a student record  
✅ Exit the program safely  

---

## Class Structure

### `Students` Class
Handles all the functionality for a single student record.

**Attributes:**
- `name` (String)
- `id` (int)
- `grade` (double)

**Constructor:**
```java
Students() {
    name = null;
    id = 0;
    grade = 0.0;
}
