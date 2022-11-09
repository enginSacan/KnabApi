package steps.rest;

import client.BoardHandler;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Boards {


    @When("User creates a board")
    public void userCreatesABoard(DataTable table) {
        table.asMaps().forEach(name -> BoardHandler.createBoard(name.get("name")));
    }

    @Then("User should get the board")
    public void userShouldGetTheBoard() {
        Assert.assertEquals("ReThinking",BoardHandler.getBoardResponse().getName());
    }

    @Given("User gets created board")
    public void userGetsCreatedBoard() {
        BoardHandler.getBoard(BoardHandler.getBoardResponse().getId());
    }

    @When("User updates board description")
    public void userUpdatesBoardDescription() {
        BoardHandler.updateBoardDescription(BoardHandler.getBoardResponse().getId(), "Test description");
    }

    @Then("User should get board with changes")
    public void userShouldGetBoardWithChanges() {
        Assert.assertEquals("Test description",BoardHandler.getBoardResponse().getDesc());
    }

    @When("User deletes board created")
    public void userDeletesBoardCreated() {
        BoardHandler.deleteBoard(BoardHandler.getBoardResponse().getId());
    }

    @Then("User should not get board")
    public void userShouldNotGetBoard() {
        Assert.assertEquals(null,BoardHandler.getBoardResponse().getId());
    }
}
