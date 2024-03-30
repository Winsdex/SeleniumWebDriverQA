@Navigation
Feature: Navigation bar
    To see subpages
    Without loging in
    i can  click the navigation bar links

    Background: I am on Free Range Testers web without logging in.
        # Given I navigate to www.google.com
        Given I navigate to www.freerangetesters.com


    @Tabla
    Scenario Outline: I can access the subpages throght the navigation bar
        When  I go to <section> using navigation bar
        Examples:
            | section   |
            | Cursos    |
            | Recursos  |
            | Blog      |
            | Mentorías |
            | Udemy     |
            | Entrar    |


    #  Scenario: Courses are presented correctly to potential customers
    #     When I go to Cursos using the navigation bar
    #     And select Introducción al Testing
    @Plans
    Scenario: Users can select a plan when signing up
        When I select Elegir Plan
        Then I can validate the option in the steps


# @Google
# Scenario: user can naviagte google
#     Then I can write Guacamayas in the textbox
#     And I can search whithe the botoun



