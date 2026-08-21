<div align="center">

<h1>📁 Java Auto File Organizer</h1>

<p><i>Turn a messy folder into an organized one — automatically.</i></p>

![Java](https://img.shields.io/badge/Java-17%2B-orange?style=for-the-badge&logo=openjdk&logoColor=white)
![Automation](https://img.shields.io/badge/Automation-blue?style=for-the-badge)
![Console App](https://img.shields.io/badge/Console_App-lightgrey?style=for-the-badge)
![OS File Handling](https://img.shields.io/badge/OS_File_Handling-green?style=for-the-badge)

</div>

---

## 📌 About The Project

**Java Auto File Organizer** is a Java-based console application that automatically organizes files inside a messy folder. The user provides a folder path, and the program scans its contents, identifies file extensions, creates category folders, and moves each file into its proper place.

<div align="center">
<img src="./demo/demo.gif" alt="Java Auto File Organizer Demo" width="800">
</div>

## 📑 Table of Contents

- [Features](#-features)
- [File Categories](#️-file-categories)
- [Before & After](#️-before--after)
- [Duplicate File Handling](#-duplicate-file-handling)
- [How It Works](#️-how-it-works)
- [Final Summary](#-final-summary)
- [Technologies & Concepts](#️-technologies--concepts)
- [Getting Started](#-getting-started)
- [Project Structure](#-project-structure)
- [Important Note](#️-important-note)
- [Author](#-author)

---

## ✨ Features

- 📂 Accepts a folder path from the user
- ✅ Validates the path before doing anything
- 📁 Automatically creates category folders
- 🖼️ Organizes images, audio, video, documents, archives, and executables
- 📦 Places unsupported file types into `Others`
- 🔄 Handles duplicate filenames automatically
- 🔢 Renames duplicates using `(1)`, `(2)`, `(3)`, etc.
- ✅ Tracks successfully moved files
- ❌ Tracks failed file movements
- 📊 Displays a final summary after organization

---

## 🗂️ File Categories

<div align="center">

| Category | Supported Extensions |
|:---:|:---|
| 🖼️ Images | `.jpg` `.png` `.webp` `.jpeg` `.gif` `.svg` |
| 🎬 Videos | `.mp4` `.mkv` `.avi` `.mov` `.webm` |
| 🎵 Audio | `.mp3` `.wav` `.flac` `.aac` `.m4a` `.ogg` |
| 📄 Documents | `.pdf` `.docx` `.txt` `.doc` `.ppt` `.pptx` `.xls` `.xlsx` `.csv` |
| 🗜️ Archives | `.zip` `.rar` `.7z` `.tar` `.gz` `.iso` |
| ⚙️ Executables | `.exe` `.msi` `.apk` `.jar` |
| 📦 Others | All other file extensions |

</div>

---

## 🖼️ Before & After

<table align="center">
<tr>
<th>Before — Messy Folder</th>
<th>After — Organized Folder</th>
</tr>
<tr>
<td><img src="screenshots/before.png" alt="Before" width="400"></td>
<td><img src="screenshots/after.png" alt="After" width="400"></td>
</tr>
</table>

---

## 🔄 Duplicate File Handling

The program **never overwrites existing files**. If `photo.jpg` already exists inside the `Images` folder, the new file is automatically renamed:

```text
photo.jpg
photo (1).jpg
photo (2).jpg
photo (3).jpg
```

This keeps existing files safe while still moving the new file successfully.

---

## ⚙️ How It Works

<div align="center">

```
User enters folder path
          ↓
Check if folder exists
          ↓
Scan files inside folder
          ↓
Read file extension
          ↓
Identify file category
          ↓
Create category folder
          ↓
Check for duplicate filename
          ↓
Generate unique filename if required
          ↓
Move file
          ↓
Display final summary
```

</div>

---

## 📊 Final Summary

After organization completes, the application prints a quick summary:

```text
Total Files Found        : 20
Successfully Moved Files : 18
Failed To Move Files     : 2
Renamed Files             : 3
```

> [!TIP]
> The summary gives you an instant health check — how many files were found, moved, renamed, or failed — without digging through folders manually.

---

## 🛠️ Technologies & Concepts

<div align="center">

| Language | Java APIs | Core Concepts |
|:---:|:---|:---|
| ☕ Java | `java.util.Scanner` · `java.io.File` | File & directory handling · String manipulation · Extension detection · Switch expressions · Loops & conditionals · File renaming/moving · Duplicate handling · Console I/O |

</div>

---

## 🚀 Getting Started

> [!NOTE]
> Make sure Java (17+) is installed on your system before starting.

### 1️⃣ Clone the Repository

```bash
git clone https://github.com/waleed4we/auto-file-organizer.git
cd auto-file-organizer
```

### 2️⃣ Open in Your IDE (optional)

Open the project in any Java-supported IDE — IntelliJ IDEA, VS Code, or Eclipse.

### 3️⃣ Compile the Program

```bash
javac myFileOrganizer.java
```

### 4️⃣ Run the Program

```bash
java myFileOrganizer
```

### 5️⃣ Enter Your Folder Path

When prompted, enter the path of the folder you want to organize:

```text
C:\Users\YourName\Downloads
```

The application will then organize the files automatically.

---

## 📁 Project Structure

```
Java-Auto-File-Organizer/
│
├── myFileOrganizer.java
│
├── images/
│   ├── before.png
│   └── after.png
│
├── demo/
│   └── demo_video.mp4
│
└── README.md
```

---

## ⚠️ Important Note

> [!WARNING]
> This application **moves files from their original location** into category folders. Double-check the folder path you provide, and keep backups of important files before running the program on real data.

---

<div align="center">

## 👨‍💻 Author

**Malik Waleed Hussain**
*Data Analytics / Coder / Computer Science Student*

GitHub: [**@waleed4we**](https://github.com/waleed4we)

</div>
