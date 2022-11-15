# KnabApi
This repo is created to show subject below:

* CRUD operations for Boards in Trello. 


## Preconditions
You need to get your api key from your power-ups.

https://trello.com/power-ups/

You need to get new token with user api key from link below:

https://trello.com/1/authorize?expiration=1day&name=Knab&scope=read,write&response_type=token&key=<your-api-key>

## Params of Token Generator:
* expiration: time of the token is valid.
* name: Your application name.
* scope: rights that token could have 'read, write, account'.
* response_type: type that authentication should return.
* key: Api Key that you get from your power ups.

## How It Works

IMPORTANT NOTICE: Token and key need to be added to the rest.properties file before start the automation.

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

Variables could be added to rest.properties under resource folder.


## Requirement of the test
* User can create/edit/delete a board.
