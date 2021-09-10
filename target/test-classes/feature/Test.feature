Feature: Sign in Adactin Hotel page

  Scenario Outline: User has to login to hotel page
    Given user has to enter "<username>","<password>" and click login
    When select "<location>","<hotelname>","<roomtype>"
    And fillup the "<firstname>","<lastname>","<Address>","<cardno>","<cardtype>","<cardmonth>","<cardyear>","<cvv>"
    Then verify and print the oder id

    Examples: 
      | username | password | location | hotelname   | roomtype | firstname | lastname | Address    | cardno           | cardtype | cardmonth | cardyear | cvv |
      | Milton19 | L837GC   | Sydney   | Hotel Creek | Standard | Mila      | Devil    | Villupuram | 1234567891234567 | VISA     | January   |     2022 | 123 |
      | Milton19 | L837GC   | Sydney   | Hotel Creek | Standard | Mila      | Devil    | coimbatore | 1234567891234567 | VISA     | January   |     2022 | 123 |
    #  | Milton19 | L837GC   | Sydney   | Hotel Creek | Standard | Mila      | Devil    | salem      | 1234567891234567 | VISA     | January   |     2022 | 123 |
    #  | Milton19 | L837GC   | Sydney   | Hotel Creek | Standard | Mila      | Devil    | tuticorin  | 1234567891234567 | VISA     | January   |     2022 | 123 |
     # | Milton19 | L837GC   | Sydney   | Hotel Creek | Standard | Mila      | Devil    | erode      | 1234567891234567 | VISA     | January   |     2022 | 123 |
    #  | Milton19 | L837GC   | Sydney   | Hotel Creek | Standard | Mila      | Devil    | trichy     | 1234567891234567 | VISA     | January   |     2022 | 123 |
     # | Milton19 | L837GC   | Sydney   | Hotel Creek | Standard | Mila      | Devil    | pondy      | 1234567891234567 | VISA     | January   |     2022 | 123 |
    #  | Milton19 | L837GC   | Sydney   | Hotel Creek | Standard | Mila      | Devil    | chennai    | 1234567891234567 | VISA     | January   |     2022 | 123 |
   #   | Milton19 | L837GC   | Sydney   | Hotel Creek | Standard | Mila      | Devil    | dindugal   | 1234567891234567 | VISA     | January   |     2022 | 123 |
   #   | Milton19 | L837GC   | Sydney   | Hotel Creek | Standard | Mila      | Devil    | madurai    | 1234567891234567 | VISA     | January   |     2022 | 123 |
