
  Feature: Home Page product link text product functionality check of nopCommerce

    Scenario Outline: Homepage Link text functionality.
      Given I am homepage of nop commerce
      When I click on "<product category>"
      Then I should see "<product list>" of particular  category .

      Examples:
      |product category    | product list       |
      |Computers            | Computers         |
      | Electronics        | Electronics        |
      | Apparel            | Apparel            |
      | Digital downloads  | Digital downloads  |
      | Books              | Books               |
      |  Jewelry           | Jewelry             |
      |  Gift Cards        |  Gift Cards        |

