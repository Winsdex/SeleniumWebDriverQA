Feature: Navigation bar
    To see subpages
    Without loging in  
    i can  click the navigation bar links

    # Scenario Outline: I can access the subpages throght the navigation bar
    #     Given I navigate to www.freerangetesters.com
    #     When  I go to <section> using navigation bar
    #     Examples:
    #         | section    |
    #         | Crusos     |
    #         | Recursos   |
    #         | Udemy      |
    #         | Mentorias  |
    #         | Newsletter |
 

    #  Scenario: Courses are presented correctly to potential customers
    #     Given I navigate to www.freerangetesters.com
    #     When I go to Cursos using the navigation bar
    #     And select Introducción al Testing

    Scenario: Users can select a plan when siigning up
        Given I navigate to www.freerangetesters.com
        When I select Elegir Plan


    