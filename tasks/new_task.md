# 🎨 Programming Task: Create Your Art Gallery Manager

Welcome to your next programming challenge! In this task, you will bring together your skills in class design, file data handling, and creative programming to build an Art Gallery Manager. Your application will dynamically create art piece objects by reading data from files, manage the gallery operations, and give you the freedom to infuse creativity in the process. This task is both fun and useful, as it illustrates effective ways of organizing and managing data in a real-world scenario.

## 📚 Learning Goals

1. **Using Data from Files to Instantiate Objects**
   - Understand file formats and parsing techniques for data extraction.
   - Use file I/O classes in Java to read data and convert it into object attributes.
   - Handle exceptions and ensure data integrity during object instantiation.

2. **Designing Classes**
   - Identify class responsibilities and define clear interfaces.
   - Implement cohesive class structures with appropriate fields and methods.
   - Leverage design patterns to solve common problems and enhance class design.

3. **Programming Creatively**
   - Explore different approaches to problem-solving and algorithm design.
   - Experiment and iterate to refine solutions.
   - Integrate user feedback and testing to improve program effectiveness and usability.

## 🎯 Task Structure

The task has six exercises, progressing from theoretical understanding to implementing a functional, creative application.

---

## 🧠 Exercise 1: Understanding File Formats

### Objective
Focus on the theoretical aspect of file handling and object instantiation.

### Instructions
1. **Research** common file formats utilized in programming (e.g., CSV, JSON, XML).
2. **Explain** the strengths and weaknesses of each format concerning complexity and ease of use.
3. **Describe** how data from a file is parsed and mapped to class attributes in Java.

### Deliverables
- Write a short report (300-500 words) summarizing your findings.

---

## 📂 Exercise 2: File I/O Basics in Java

### Objective
Deepen your theoretical understanding of Java's file handling capabilities.

### Instructions
1. **List** and briefly **describe** the classes in Java’s standard library that are commonly used for file I/O operations.
2. **Exercise** your understanding by identifying how exception handling plays a vital role in file operations.

### Deliverables
- A document containing your answers and examples.

---

## 🛠️ Exercise 3: Design Your ArtPiece Class

### Objective
Start integrating concepts by designing a foundational class for your application.

### Instructions
1. **Identify** the attributes relevant to an art piece (e.g., title, artist, year, medium).
2. **Implement** an `ArtPiece` class in Java with these fields and appropriate methods.
3. **Create** a method within `ArtPiece` that returns a formatted string description of the art piece.

### Code Example
```java
public class ArtPiece {
    private String title;
    private String artist;
    private int year;
    private String medium;

    public ArtPiece(String title, String artist, int year, String medium) {
        // Initialize fields
    }

    public String getDescription() {
        // Return a formatted description
    }
}
```

### Deliverables
- A `.java` file with your `ArtPiece` class definition.

---

## 📜 Exercise 4: Populate Your Gallery

### Objective
Combine file reading skills with object instantiation.

### Instructions
1. **Create** a file named `gallery.txt` that holds information about various art pieces in a simple format, e.g., `Title, Artist, Year, Medium`.
2. **Write** a method `loadGalleryFromFile(String filename)` in a `GalleryManager` class that reads the file line-by-line, creates `ArtPiece` objects, and stores them in a collection.

### Code Outline
```java
public class GalleryManager {
    private List<ArtPiece> gallery;

    public void loadGalleryFromFile(String filename) throws IOException {
        // Read file and populate gallery
    }
}
```

### Deliverables
- The `GalleryManager` class with the `loadGalleryFromFile` method.
- Example `gallery.txt` file.

---

## 🎨 Exercise 5: Expand Your Gallery Capabilities

### Objective
Create additional functionalities and expand the manager capabilities.

### Instructions
1. **Extend** the `GalleryManager` class with features like searching for art pieces by artist or year.
2. **Implement** a method to format and display all art pieces in the gallery.

### Code Example
```java
public List<ArtPiece> searchByArtist(String artistName) {
    // Return list of matching art pieces
}

public void displayGallery() {
    // Print all art pieces with descriptions
}
```

### Deliverables
- Expanded `GalleryManager` class with new methods.

---

## 🚀 Exercise 6: Add a Creative Twist

### Objective
Incorporate creativity into your program by adding a unique feature.

### Instructions
1. **Brainstorm** a creative feature or gameplay mechanic that enhances user interaction, such as:
   - Organizing an art auction.
   - Simulating visitor feedback or ratings.
   - Curating themed exhibitions based on user input.
2. **Implement** your idea in the `GalleryManager` class or by introducing new classes.

### Guidance
- Use UML diagrams to plan out your class interactions if necessary.
- Consider using design patterns like Strategy or Observer for the new feature implementation.

### Deliverables
- Expanded Java code with the new feature.
- A short description (100-150 words) explaining your creative addition.

---

## 📑 Conclusion

Congratulations on completing the Art Gallery Manager task! You've applied your skills in file handling, class design, and creative thinking within Java, resulting in a practical and engaging program. Please submit all your files, reports, and any additional documentation as requested in each exercise.

---

Enjoy the journey of blending art with technology as you create your virtual gallery! 🖼️✨