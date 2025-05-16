# Grade Manager

GradeManager is a simple console application designed to help manage student grades for a school project. This application allows users to add, remove, and retrieve grades, with basic persistence functionality to save and load grades from a file.

## Features

- Add grades for students
- Remove grades for students
- Retrieve grades for students
- Save grades to a file
- Load grades from a file

## Project Structure

```
GradeManager
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── school
│   │   │           └── GradeManager.java
│   │   └── resources
│   └── test
│       └── java
│           └── com
│               └── school
│                   └── GradeManagerTest.java
├── pom.xml
└── README.md
```

## Getting Started

To build and run the application, follow these steps:

1. Ensure you have Maven installed on your machine.
2. Clone the repository or download the project files.
3. Navigate to the project directory in your terminal.
4. Run the following command to build the project:

   ```
   mvn clean install
   ```

5. To run the application, use the following command:

   ```
   mvn exec:java -Dexec.mainClass="com.school.GradeManager"
   ```

## Running Tests

To run the unit tests for the application, execute the following command:

```
mvn test
```

## License

This project is licensed under the MIT License. See the LICENSE file for more details.