Feature: login y product add

  Scenario: Login
  Given Pablo is on the SauceDemo home page
    When he put credentials
    Then he is redirected to homepage

  Scenario: Pick products
  Given Pablo is on the inventory page
    When he pick two products and push cart button
    Then he is redirected to cartCheckout page

  Scenario: Checkout
  Given Pablo is on the cart page
    When he push checkout button
    Then he is redirected to checkout page