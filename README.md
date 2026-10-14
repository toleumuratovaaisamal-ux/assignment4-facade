# Assignment 4: Facade Design Pattern

## Project Overview
This project demonstrates the implementation of the **Facade Design Pattern** in Java (JDK 17). It provides a simplified interface (`VideoConversionFacade`) to a complex media conversion subsystem (`CodecFactory`, `BitrateReader`, `AudioMixer`).

## Project Structure
- `VideoConversionFacade.java` — Core facade class coordinating the subsystem.
- `CodecFactory.java` — Factory determining and extracting video codecs.
- `BitrateReader.java` — Handles file reading and bitrate buffer management.
- `AudioMixer.java` — Processes and finalizes the audio track.
- `Client.java` — Entry point interacting exclusively with the Facade.

## Clean Code Principles Applied
- Encapsulating Subsystem Boundaries (Chapter 8)
- Single Responsibility per Function (Chapter 3)
- Meaningful Names (Chapter 2)
