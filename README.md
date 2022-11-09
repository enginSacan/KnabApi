# KnabApi
This repo is created to show subject below:

* CRUD operations for Boards in Trello. 


## Preconditions
You need to get new token with user api key from link below:

https://trello.com/1/authorize?expiration=1day&name=Knab&scope=read,write&response_type=token&key=<your-api-key>

## How It Works

You need to install maven and add chromedriver to the pc's path.

You have to go to the folder that you clone.

Then you can run command below to run the tests:

```
mvn test -Dcucumber.options="--tags @Boards"
```

You can have the result html, json and Junit XML in the target/cucumber-report folder.

OR 

You can download intellij idea with plugins below:
* Gherkin
* Cucumber for Java
* Cucumber+

You can execute feature file in the IDE.

## Structure

Lombok library is used for creating model of the data from request and responses.

Generic data structure is used with the properties. 


## Requirement of the test
* User can create/edit/delete a board.
