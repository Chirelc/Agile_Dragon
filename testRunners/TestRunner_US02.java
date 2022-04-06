package testRunners;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import main.Dragon;
import main.Habitat;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class TestRunner_US02 {
    private List<Dragon> listDragon;
    private Habitat habitat;
    private Dragon dino;
    @Given("un dragon dino <Dragon>")
    public void un_dragon_dino_Dragon() {
        // Write code here that turns the phrase above into concrete actions
        dino=new Dragon();
        throw new io.cucumber.java.PendingException();
    }

    @Given("Ce dragon loge dans un habiat situé à {string}")
    public void ce_dragon_loge_dans_un_habiat_situé_à(String string) {
        // Write code here that turns the phrase above into concrete actions
        habitat=new Habitat(string);
        listDragon.add(dino);
        throw new io.cucumber.java.PendingException();
    }

    @When("dino meure")
    public void dino_meure() {
        habitat.supprimeDragonHabitat(dino);

        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("le système enlève dino de l'habitat et la lise de dragons se met à jour {int}")
    public void le_système_enlève_dino_de_l_habitat_et_la_lise_de_dragons_se_met_à_jour(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        habitat.supprimeDragonHabitat(dino);
        dino=null;
        assertFalse(habitat.isDragoIn(dino));
        throw new io.cucumber.java.PendingException();
    }


}
