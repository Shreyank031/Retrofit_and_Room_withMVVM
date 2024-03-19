# Retrofit with MVVM

## Description
This project demonstrates the integration of Retrofit with the MVVM
(Model-View-ViewModel) architecture pattern in an Android application. Retrofit
is used for making network requests to fetch data from an API, while MVVM
facilitates a separation of concerns between the UI components (View), data
(Model), and logic (ViewModel).

## Key Concepts

### Retrofit
Retrofit is a type-safe HTTP client for Android and Java that simplifies the
process of making network requests. It allows developers to define an interface
with abstract methods representing API endpoints, which are then implemented by
Retrofit to handle network operations. Retrofit supports various serialization
formats like JSON, XML, and protocol buffers.

### MVVM Architecture
MVVM is an architectural pattern that separates the UI (View) from the data
(Model) using a ViewModel to manage the presentation logic and communicate
between the View and the Model. The key components of MVVM are:
- **Model**: Represents the data and business logic of the application.
- **View**: Represents the UI components and is responsible for displaying data to the user.
- **ViewModel**: Acts as a mediator between the View and the Model, exposing data to the View and handling user interactions. It also retains UI-related data across configuration changes.

### LiveData
LiveData is a data holder class provided by the Android Architecture Components
library that is lifecycle-aware. It allows data to be observed for changes,
ensuring that UI components only update when they are in the active lifecycle
state. LiveData is commonly used in conjunction with ViewModel to provide
reactive UI updates.

### ViewModel
ViewModel is a class provided by the Android Architecture Components library
that is responsible for managing UI-related data and handling user
interactions. It survives configuration changes (e.g., screen rotations) and
retains its state across the lifecycle of the associated UI component.
ViewModel typically exposes LiveData objects to the UI for observing data
changes.

## Usage
1. Launch the application on your Android device.
2. The MainActivity will make a network request using Retrofit to fetch data from the API.
3. The response data will be logged to the console.

