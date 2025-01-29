**Playwright Test Automation Framework**  

**Overview**
This repository contains a Playwright-based Test Automation Framework designed for efficient end-to-end testing. 
The framework is built with reusability and scalability in mind, leveraging best practices such as the Page Object Model (POM) and integration with tools like TestNG.

**Features**
_Playwright Integration:_   High-performance browser automation.
_TestNG Support:_   Testing and reporting.
_Page Object Model (POM):_   For maintainable and reusable test components.
_Cross-Browser Testing:_   Supports Chromium, Firefox, and WebKit.
_Customizable Configuration:_   Easily adapt the framework for different environments.

**Project Architecture**
_The framework is designed as follows:_
_BaseTest:_   A base class for common setup and teardown logic.
_Page Classes:_   Each page in the application has its own class, encapsulating its locators and actions.
_Test Classes:_   TestNG test cases that interact with the page objects.
_Utilities:_   Helper classes for reusable logic such as reading test data or screenshots.


**High-Level Diagram**
Framework Design 
[Automation design.pdf](https://github.com/user-attachments/files/18580704/Automation.design.pdf)


**Prerequisites**
Node.js (16.x or later)
Java (17 or later)
Maven (Latest version)
Eclipse IDE

**Run Tests Execute tests via TestNG:**
Configure Environment Update the config.properties file to set base URLs, credentials, or any other environment-specific settings.

**Folder Structure**

![Folder Structure](https://github.com/user-attachments/assets/5d35cf42-bb41-41c1-af47-2026195473e3)











