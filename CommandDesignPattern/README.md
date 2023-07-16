# Command Designed Pattern - Java Implementation

![Command Pattern Logo](https://drive.google.com/file/d/181u_6sZo-h35jmAql7QPTDya-LXFrnu5/view?usp=drive_link)

Command Designed Pattern is a behavioral design pattern in Java that converts requests or simple operations into objects. This pattern allows decoupling of sender and receiver objects, providing flexibility and extensibility to the application. The project showcases a Java implementation of the Command Pattern and provides an example scenario where it can be utilized effectively.

## Table of Contents

- [Introduction](#introduction)
- [Key Concepts](#key-concepts)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)
- [Contact](#contact)

## Introduction

The Command Designed Pattern is used to encapsulate a request or operation as an object, allowing parameterization of clients with different requests, queuing of requests, and logging of the requests. By applying this pattern, it is easier to add new commands without changing existing code and promotes the principle of "loose coupling" between classes.

## Key Concepts

- **Command**: The Command interface declares a method for executing a command.

- **Concrete Command**: Classes that implement the Command interface. They are responsible for invoking the appropriate operations on Receiver objects.

- **Invoker**: Asks the command to carry out the request.

- **Receiver**: Knows how to perform the operations associated with carrying out a request.

- **Client**: Creates a ConcreteCommand object and sets its receiver.

## Getting Started

Follow the instructions below to get the Command Designed Pattern project running on your local machine.

### Prerequisites

- Java Development Kit (JDK) 8 or higher installed on your system.
- A Java IDE (Eclipse, IntelliJ, etc.) or a text editor for code editing.

### Installation

1. Clone the repository from GitHub:

```bash
git clone https://github.com/Barpk-Getachew/command-pattern.git
```





## Usage

1. Locate the `Client` class in the project, which serves as the main entry point for the example scenario.

2. Run the `main` method in the `Client` class to see the demonstration of the Command Designed Pattern.

3. The example scenario will showcase how various commands are executed and their effects on the receiver objects.

## Contributing

We welcome contributions to improve the Command Designed Pattern project. To contribute, follow these steps:

1. Fork the repository on GitHub.

2. Create a new branch with a descriptive name for your feature/fix.

3. Make your changes and commit them with clear commit messages.

4. Push the changes to your forked repository.

5. Submit a pull request to the original Command Designed Pattern repository.

6. Your pull request will be reviewed, and upon approval, it will be merged into the main branch.

Thank you for exploring the Command Designed Pattern in Java! If you encounter any issues or have questions, please feel free to contact us or raise an issue on GitHub. Happy coding!
