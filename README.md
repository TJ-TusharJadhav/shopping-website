# SauceDemo E-Commerce Automation Project

## Project Overview
SauceDemo is an e-commerce automation testing project designed to validate the functionality of an e-commerce platform. The project uses **Java** as the programming language, **Maven** as the build tool, and the **Cucumber** framework for Behavior-Driven Development (BDD). Browser automation is achieved using **Selenium WebDriver**, and test results are reported using **Cucumber Reports**.

---

## Features
- **Browser Automation**: Automates browser interactions using Selenium WebDriver.
- **BDD**: Implements tests in Gherkin syntax with Cucumber.
- **Cross-Browser Testing**: Configurable to run on multiple browsers.
- **Reports**: Generates detailed and interactive Cucumber Reports.

---

## Prerequisites
Before running the project, ensure the following tools and dependencies are installed on your system:

- **Java JDK 8 or higher**
- **Maven 3.6.0 or higher**
- **Eclipse IDE**
- **Google Chrome**, **Mozilla Firefox**, or any other supported browser
- **ChromeDriver** or **GeckoDriver** (based on the browser)

---

## Project Setup
1. Clone the repository:
   ```bash
   git clone <repository_url>
   cd saucedemo
   ```

2. Open the project in Eclipse:
   - File > Import > Existing Maven Projects > Select project directory.

---

## Project Structure
```
SauceDemo/
├── src/main/java
│   ├── utilities         # Helper classes and utility functions
│   ├── pages             # Page Object Model classes
│   └── config            # Configuration files
│
├── src/test/java
│   ├── stepdefinitions   # Step definitions for Cucumber
│   ├── features          # Gherkin feature files
│   └── runners           # Test runner classes
│
├── src/test/resources
│   ├── config.properties # Configuration settings
│   └── drivers           # Browser drivers
│
├── pom.xml               # Maven project file
└── README.md             # Project documentation
```

---

## Running Tests
1. Run tests using Maven:
   ```bash
   mvn clean test
   ```

---

## Configuration
Modify the `config.properties` file in `src/test/resources` to customize the following settings:

| Property        | Description                         | Example         |
|-----------------|-------------------------------------|-----------------|
| `browser`       | Browser to use for testing         | `chrome`, `firefox` |
| `baseURL`       | Base URL of the e-commerce site    | `https://www.saucedemo.com/` |
| `timeout`       | Default timeout for Selenium       | `30` (seconds)  |

---

## Reporting
The project uses **Cucumber Reports** for generating test execution reports. Reports can be found in the following directory:
```

---

## Contributing
1. Fork the repository.
2. Create a feature branch:
   ```bash
   git checkout -b feature/your-feature-name
   ```
3. Commit your changes:
   ```bash
   git commit -m "Add your message here"
   ```
4. Push to the branch:
   ```bash
   git push origin feature/your-feature-name
   ```
5. Open a pull request.

---

## License
This project is licensed under the MIT License. See the LICENSE file for details.

---

## Contact
For queries or contributions, contact:
- **Name**: Tushar Jadhav
- **Email**: tusharsjadhav60@gmail.com
