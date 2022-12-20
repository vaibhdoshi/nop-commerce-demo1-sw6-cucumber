Feature:ElectronicsTest
  As user I want to navigate to nop commerce website

  @smoke
  Scenario: User should navigate to cell phones page successfully
    Given I am on home page
    When I mouse hover on electronics tab,cell phone tab andd click
    Then I should navigate to cell phone page successfully

  @sanity
  Scenario:User should add product successfully
    Given I am on home page
    When I mouse hover on electronics tab,cell phone tab andd click
    And I should navigate to cell phone page successfully
    And I click on list view tab
    And I click Nokia Lumia
    And I verify Nokia Lumia product text
    And I verify the product price
    And I cleared quantity field
    And I changed quantity to two
    And I click on add to cart button tab
    And I verify product has been added to your shopping cart
    And I click on cross button
    And I mouse hover on shopping cart
    And I click on go to cart button
    And I verify message Shopping cart
    And I verify total
    And I click on update shopping cart button
    And i click on checkbox terms of service
    And I click on checkout
    And I verify welcome,please sign in!
    And I click on Register tab
    And I verify Register text
    And I click on female radio button
    And I enter first name
    And I enter last name
    And I enter email address
    And I enter password
    And I enter confirm Password
    And I click on register button
    And I verify the message your registration completed
    And I click on continue tab
    And I verify text shopping cart
    And I click on checkbox agree with terms of service
    And I click on checkout
    And I enter city name
    And I enter home address
    And I enter postcode
    And I enter phone number
    And I click on continue button
    And I click on second day air radio button
    And click on continue buttonn
    And I select credit card radio button
    And I select Visa from select credit card dropdown
    And I enter card holder name
    And I enter card number
    And I enter expiry month
    And I enter expiry year
    And I enter card code
    And I click on continue button














