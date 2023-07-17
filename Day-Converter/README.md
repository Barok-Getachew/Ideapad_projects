# Conversion Calculator README

This project is a simple conversion calculator that allows you to convert between days, weeks, months, and years. It also includes a GUI and file operations to track the conversion history.

## Installation

To run this project, you will need to have Java Development Kit (JDK) installed on your system. You can download JDK from the official website:

- [Java SE Downloads](https://www.oracle.com/java/technologies/javase-downloads.html)

You will also need to install the JavaFX library for the GUI. You can download it from the official website:

- [JavaFX Downloads](https://openjfx.io/)

## Usage

### GUI

To use the GUI, run the following command in the project directory:
- javac Main.java
- java Main
This will open the conversion calculator GUI. You can enter a value in any of the input fields and select the units to convert from and to. Click the "Convert" button to perform the conversion, and the result will be displayed in the output field.

### File Operations

The conversion history is saved to a file named `history.txt` in the project directory. Each conversion is saved as a separate line in the format:
YYYY-MM-DD HH:MM:SS, value, fromUnits, toUnits, result
## License

This project is licensed under the MIT License. See the `LICENSE` file for more information.
