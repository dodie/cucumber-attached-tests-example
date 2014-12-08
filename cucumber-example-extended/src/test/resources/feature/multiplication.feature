Feature: Multiplication

  Scenario Outline: Multiply numbers
    Given a Calculator
    When I perform multiplication with <num1> and <num2>
    Then I should get <result>

    Examples: 
      | num1 | num2 | result |
      | 1    | 2    | 2      |
      | 5    | 5    | 25     |
