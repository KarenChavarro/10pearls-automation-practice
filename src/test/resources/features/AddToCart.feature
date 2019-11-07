Feature: Add Product to Cart
  In order to buy in Etsy
  As as customer
  I want to add product to cart

  Scenario: Add to Cart
    Given the user is on the Etsy home page
    When the user searches for the product "succulents"
    And the user adds the product to the cart
    Then The system adds the product to the shopping cart