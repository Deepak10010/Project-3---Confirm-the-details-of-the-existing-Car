@existing-usedcar-page
Feature: Acceptance testing to validate existing Used Car listing

  @existing-used-cars-Positive
  Scenario: To validate existing Used Car listing
    Given I am on the Home Page "https://www.tmsandbox.co.nz/"  of TradeMe website
    When I move to Motors tab
      | Marketplace |
      | Jobs        |
      | Motors      |
      | Property    |
    And click on "Motors" tab
    And The Page Title should be "TRADEME SANDBOX - Buy online and sell with NZ's #1 auction & classifieds site | Trade Me SANDBOX"
    And click on "Used cars" link
    And click on used cars result item
    And click on the existing car
    Then I should see the details of the existing car
      | Attributes           | Values                   |
      | Number plate         | EDD369                   |
      | Kilometres           | 163,794km                |
      | Body                 | Dark Blue, 4 door, Sedan |
      | Seats                |                        5 |
      | Fuel type            | Petrol                   |
      | Engine               | 6 cylinder, 28cc         |
      | Transmission         | Tiptronic                |
      | History              | 5+ owners, Imported      |
      | Registration expires | Sep 2021                 |
      | WoF expires          | Jan 2021                 |
      | Model detail         | E46                      |
