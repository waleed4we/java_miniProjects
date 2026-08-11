# History Saving Calculator In Java


<p align="center">
  <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white">
</p>

<p align="center">
  <img src="https://img.shields.io/badge/Type-Console%20App-333333?style=for-the-badge">
  <img src="https://img.shields.io/badge/File%20Handling-Enabled-4B0082?style=for-the-badge">
  <img src="https://img.shields.io/badge/Exception%20Handling-Enabled-8B0000?style=for-the-badge">
</p>

A Simple **Java Console-Based Calculator** That Performs Basic Arithmetic Operations And Automatically Saves Successful Calculations To A Local History File

## 🚀 Features

- Perform Simple Mathematical Operations Like + , - , * , / , %
- Save Successful Calculations To History
- View Saved Calculation History
- Clear Calculation History
- Handles Invalid Number Input , Invalid Operators, Division By Zero
- Also Handles Modulo By Zero And Invalid Menu Input
- Displays A Message When No History Is Found

## 🛠️ Technologies & Concepts Used

- **Java**
- **Console Application**
- **Conditional Flow** — `if-else`
- **Switch Statements**
- **Loops** — `while`
- **Methods**
- **Arrays**
- **Strings**
- **Scanner** — User Input
- **File Handling**
	- **BufferedReader**
	- **BufferedWriter**
- **Exception Handling**


## 📸 Screenshots

### Calculator Menu

  ![[menu_and_exit.png]]

### Performing A Calculation
  
![[performing_a_calculation.png]]

### Viewing Calculation History

  ![[viewing_history.png]]

### Clearing Calculation History

![[clearing_history.png]]

## 📂 Project Structure

```text
history_saving_calculator/
│
├── screenshots/
│   ├── clearing_history.png
│   ├── menu_and_exit.png
│   ├── performing_a_calculation.png
│   └── viewing_history.png
│
├── java_calculator.java
└── readme.md
```

> `history.txt` Is Created Automatically By The Program And Is Intentionally Not Included In The Repository Because It Contains Personal Calculation History

## ▶️ How To Run

### 1. Clone The Repository

```bash
git clone YOUR_REPOSITORY_URL
```

### 2. Open The Project

Open The `history_saving_calculator` Folder In Your Java IDE Or VS Code.

### 3. Compile The Program

```bash
javac java_calculator.java
```

### 4. Run The Program

```bash
java java_calculator
```

## 🧮 How It Works

When The Program Starts, You Can Choose From Four Options:

```
1 → Perform A Calculation
2 → View Calculation History
3 → Clear Calculation History
4 → Exit The Calculator
```

For Calculations, Enter An Expression Using Spaces Between Numbers And Operator.

Example:

```
10 + 5
```

The Calculator Takes The Complete Expression As A **String** Using `Scanner`.

The Entered Expression:

```
10 + 5
```

Is Stored In The `user_choice` String Variable.

The Program Then Removes Extra Spaces At The Beginning And End Of The Expression And Splits The Expression Using A Space:

```
String[] parts = user_choice.trim().split(" ");
```

For Example:

```
10 + 5
```

Is Split Into Three Parts:

```
parts[0] → 10
parts[1] → +
parts[2] → 5
```

The Three Parts Represent:

- `parts[0]` → First Number
- `parts[1]` → Operator
- `parts[2]` → Second Number

The Program First Checks That The Expression Contains Exactly Three Parts.

If The Format Is Invalid, The User Is Asked To Enter The Expression Again.

The First And Second Parts Are Then Converted From `String` Into `double` Using `Double.parseDouble()`.

The Operator Remains A `String` And Is Used In A `switch` Statement To Determine Which Mathematical Operation Should Be Performed.

The Calculator Supports:

```
+ → Addition
- → Subtraction
* → Multiplication
/ → Division
% → Modulo
```

For Example:

```
10 + 5
```

The Program Performs:

```
10 + 5 = 15.0
```

And Displays:

```
Result: 15.0
```

Successful Calculations Are Automatically Saved To `history.txt`.

---
## 📜 History System

The Calculator Uses Java File Handling To Store Calculation History.
Each Successful Calculation Is Saved In This Format:

```text
10 + 5 : 15.0
20 * 3 : 60.0
100 / 4 : 25.0
```

The History Can Be:
- Viewed
- Appended With New Calculations
- Cleared Completely

## ⚠️ Input Handling

The Program Handles Common Invalid Inputs Such As:

- Invalid Menu Choices
- Invalid Numbers
- Invalid Operators
- Division By Zero
- Modulo By Zero
- Empty History

## 🎯 Project Purpose

This Mini Project Was Built To Practice Core Java Concepts Such As:

- Variables
- Conditional Statements
- Loops
- Switch Statements
- Methods
- Arrays
- Strings
- Exception Handling
- File Reading And Writing
- User Input Handling

---
## 👨‍💻 Author

**Malik Waleed Hussain**
**Data Analytics / Coder / Computer Science Student**
GitHub: **@waleed4we**

---
A Beginner-Level Java Project Built As Part Of My Java Mini Projects Collection.