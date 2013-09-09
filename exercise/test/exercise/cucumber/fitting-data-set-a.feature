Feature: data fitting set 1

Scenario: aardvark
Given data points
  |  x |  y |
  | 10 | 20 |
  |  1 |  2 |

Then best fit is 10 + 20x
