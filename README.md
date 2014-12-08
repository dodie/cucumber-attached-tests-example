cucumber-attached-tests-example
===============================
Example Maven project to demonstrate attached tests with Cucumber to share test code and feature files between modules.

The **cucumber-example** base project implements a simple, extensible Calculator with a basic feature set.
The **cucumber-example-extended** project use the base project as dependency, extending it's functionality.

The base project provides common test infrastructure and Cucumber feature tests for the base functionality, while the extended project contains only the nessecary feature tests. The latter executes tests for both the new and the inherited functionality to test configuration and integration.

### Usage
Perform ```mvn install``` on the Maven projects:
- cucumber-example-parent
- cucumber-example
- cucumber-example-extended
