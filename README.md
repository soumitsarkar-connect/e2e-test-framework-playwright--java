# 🎭 E2E Test Framework - Playwright with Java (BDD)

## Overview
This project is an End-to-End (E2E) Test Automation Framework using **Microsoft Playwright**, **Java**, and **BDD with Cucumber**. It is designed for fast, scalable, and reliable browser testing across multiple environments with human-readable test scenarios.

---

## ✅ Features

- 🔹 **Playwright** for fast and modern web automation
- 🔹 **Cucumber** for BDD-style test scripting
- 🔹 **Page Object Model (POM)** for clean code organization
- 🔹 **Maven** for build and dependency management
- 🔹 **JUnit** for test execution
- 🔹 **Cucumber HTML Reports** for clean and visual output
- 🔹 **Reusable Components** for efficient test development
- 🔹 Modular structure to support scaling and team collaboration

---

## 🛠 Installation

Make sure the following are installed:

- Java 11+
- Maven
- Node.js (16+) & npm
- IDE (IntelliJ IDEA, Eclipse, or VS Code)
- Modern browsers (Chrome, Edge, Firefox)

### Clone the Repository

```bash
git clone https://github.com/your-username/playwright-java-cucumber.git
cd playwright-java-cucumber
Install Playwright Dependencies
bash
Copy
Edit
npm install
npx playwright install
📁 Project Structure
bash
Copy
Edit
src/
├── main/
│   └── java/
│       ├── components/           # Reusable UI components
│       │   ├── Button.java
│       │   ├── InputBox.java
│       │   ├── NavMenu.java
│       │   ├── Text.java
│       ├── pages/               # Page Object Models
│       │   ├── CartPage.java
│       │   ├── LoginPage.java
│       │   ├── ProductPage.java
│       └── utils/
│           └── PlaywrightFactory.java
│
├── test/
│   ├── java/
│   │   ├── runner/
│   │   │   └── TestRunner.java
│   │   └── stepDefinitions/
│   │       ├── CartSteps.java
│   │       ├── LoginSteps.java
│   │       ├── ProductSteps.java
│   │       ├── Hooks.java
│   │       └── common/
│   │           ├── UserActionSteps.java
│   │           ├── UserVerificationSteps.java
│   │           └── WaitSteps.java
│
│
│
├── resources/
│   └── features/                # Gherkin Feature Files
│       ├── CartPage.feature
│       ├── Login.feature
│       ├── Menu.feature
│       ├── PlaceOrder.feature
│       ├── Products.feature
│
├── target/                     # Compiled test output & reports
│   └── cucumber-reports.html
├── pom.xml                     # Maven build file
├── .gitignore
🚀 Running Tests
Run All Tests
bash
Copy
Edit
mvn test
Run Specific Tagged Tests
bash
Copy
Edit
mvn test -Dcucumber.filter.tags="@smoke"
Generate HTML Reports
bash
Copy
Edit
mvn verify
Open the report after execution:

bash
Copy
Edit
target/cucumber-reports.html
⚙️ Configuration
Test configuration can be adjusted in:

TestRunner.java – Tags, glue path, plugins

Hooks.java – Browser launch, cleanup steps, and more

PlaywrightFactory.java – Context and browser management

🧩 Future Enhancements
Add support for cross-browser parallel execution

Integrate with CI tools (GitHub Actions, Jenkins)

Allure/Extent Reports for advanced visualization

Add environment-based configuration (dev/test/prod)

API test integration for end-to-end workflows

🤝 Contributing
Fork the repository

Create a new feature branch

Commit your changes

Push and open a Pull Request

📄 License
This project is licensed under the MIT License. See the LICENSE file for more details.