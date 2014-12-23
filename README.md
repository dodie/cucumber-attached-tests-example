cucumber-attached-tests-example
===============================
Example Maven project to demonstrate attached tests with Cucumber to share test code and feature files between projects.

The **cucumber-example** base project implements a simple, extensible Calculator with a basic feature set.
The **cucumber-example-extended** project use the base project as dependency, extending it's functionality.

The base project provides common test infrastructure and Cucumber feature tests for the base functionality, while the extended project contains only the necessary feature tests. The latter executes tests for both the new and the inherited functionality to test configuration and integration.

See this post for more information: [https://advancedweb.hu/2014/12/23/attached-tests-with-maven/](https://advancedweb.hu/2014/12/23/attached-tests-with-maven/)

### Usage
Perform ```mvn install``` on the Maven projects:
- cucumber-example-parent
- cucumber-example
- cucumber-example-extended
