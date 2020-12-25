# cucumberFW2 Steps
1- Create a git repository on GitHub
2- Clone the project in local machine
3- Create Cucumber Frame Work on IntelliJ  
4-Create a feature branch in the project by using terminal/ CMD
    Important git commands
    \git checkout -b feature/branchname
    \git add .
    \git commit -m "Message"
    \git push 
    \git push --set-upstream origin feature/branchname
5- Add dependencies and plugins in pom.xml file 
6- Add the steps in README file
8- Go to the src folder and then test folder
9- Then create few important packages in java package
        test
            java            
                Base
                Features
                PageObject
                StepDef
    Then create a java class name it something like TestRunner 
10- Install a couple of plugins 
        -First go to the file 
        -Then Settings
        -Plugins 
        -Then install Cucumber for java & Gherkin  plugins

11- In the Features package create few more packages to write test cases such as 
        Login, SignUp, WebTable etc. 

12- Create a feature file in Signup package or any other package depending on what test case you are going to write 
        -Creating feature file is very simple just click on a regular file.
        -When you name the file just add .feature at the end like "NameIs.feature"

        Inthe feature fiel use the Gherkin syntax to write the test case 

                             Feature: Sign Up

                            Scenario: Sign Up With valid Email address
                            Given That I am on TalentTek home page
                            When we fill the form with valid email address
                            And I click on the Create my Account Button
                            Then I verify that I successfully signed up
                            
                            Scenario: Sign Up without password
                            Given That I am on TalentTek home page
                            When we fill the form without password
                            And I click on the Create my Account Button
                            Then I verify that I wasn't successfully signed up

