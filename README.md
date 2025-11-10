# TravelAutomation – Flight Search Automation Framework

This project is a simple and clean automation framework created as part of a travel website automation task.  
The goal was to automate the Flights search flow using Selenium, Java, TestNG, Maven, and the Page Object Model (POM).

I built the framework in a modular and maintainable way so new tests or pages can be added easily.

---

## ✈ What This Automation Does

The test covers the complete end-to-end scenario:

- Opens the travel website
- Navigates to the **Flights** section
- Enters the **source** and **destination** cities
- Selects a **date from next month**
- Clicks on the **Search** button
- Extracts the **cheapest** and **second cheapest** flight prices
- Opens a **new browser tab**
- Switches into it
- Navigates to **Google**
- Handles popups, waits, and dynamic elements along the way

---

## 📂 Project Structure

The project follows the Page Object Model (POM):

TravelAutomation
│
├── pom.xml
├── testng.xml
├── README.md
│
└── src
├── main
│ └── java
│ └── com.travel
│ ├── base
│ │ ├── BasePage.java
│ │ └── BaseTest.java
│ ├── pages
│ │ └── FlightsPage.java
│ └── utils
│ └── DriverFactory.java
│
└── test
└── java
└── com.travel.tests
└── FlightsTest.java


- **base** → Common classes like driver setup and shared methods  
- **pages** → Page Objects for each page (Flights page here)  
- **tests** → TestNG test scripts  
- **utils** → Browser driver and helper utilities  

---

## 🛠 Tools & Technologies

- **Java 17**
- **Selenium WebDriver**
- **TestNG**
- **Maven**
- **WebDriverManager**
- **Page Object Model (POM)**

---

##  How to Run the Tests

### Using Maven:

BASH:
mvn clean test
