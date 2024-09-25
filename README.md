# Rocket Launcher Simulator & Design Patterns in Java

## Overview

This project is divided into two exercises:

1. **Exercise 1: Design Patterns**: Implementation of various design patterns categorized into behavioral, creational, and structural patterns.
2. **Exercise 2: Rocket Launch Simulator**: A simulation of a rocket launcher system built using Java.

## Features

### Exercise 1: Design Patterns

#### Behavioural Design Patterns
- **Observer Pattern**: Implements a one-to-many dependency where objects are notified of state changes.
- **Strategy Pattern**: Allows changing the algorithm used by an object at runtime.

#### Creational Design Patterns
- **Builder Pattern**: Facilitates the construction of complex objects step-by-step.
- **Factory Pattern**: Provides a way to create objects without specifying the exact class of the object that will be created.

#### Structural Design Patterns
- **Adaptor Pattern**: Enables compatibility between two incompatible interfaces.
- **Decorator Pattern**: Dynamically adds behavior or responsibilities to objects.

### Exercise 2: Rocket Launcher Simulator

The rocket launcher simulator models the entire lifecycle of a rocket launch. It provides functionalities such as:
- Initializing the rocket.
- Setting and modifying launch parameters.
- Simulating the launch sequence.
- Monitoring and managing the status of the rocket during the launch.

## How to Run

### Design Patterns (Exercise 1)
1. Navigate to the directory of any design pattern you'd like to explore.
2. Compile and run the pattern:
   ```bash
   javac -d bin src/Exercise1/CreationalDesignPattern/FactoryPattern/*.java
   java -cp bin Exercise1.CreationalDesignPattern.FactoryPattern.Main
   ```

   *(Replace `FactoryPattern` with the desired pattern directory)*

### Rocket Launch Simulator (Exercise 2)
1. Navigate to the `RocketLaunchSimulator` directory.
2. Compile and run the simulator:
   ```bash
   javac -d bin src/Exercise2/RocketLaunchSimulator/*.java
   java -cp bin Exercise2.RocketLaunchSimulator.Main
   ```

## Prerequisites

- Java JDK 8 or higher.
- IDE (IntelliJ, Eclipse, or any text editor).
