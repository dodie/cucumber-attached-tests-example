Feature: Addition

  Scenario Outline: Add two numbers
    Given a Calculator
    When I perform addition with <num1> and <num2>
    Then I should get <result>

    Examples: 
      | num1 | num2 | result |
      | 1    | 2    | 3      |
      | 5    | 5    | 10     |
