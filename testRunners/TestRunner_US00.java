package testRunners;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import main.Dragon;
import main.Habitat;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class TestRunner_US00 {
    private List<Dragon> listDragon;
    private Habitat habitat;
    private Dragon smaug;
    private Dragon dino;

    @Given("un habitat qui comprend un lieu {string}")
    public void un_habitat_qui_comprend_un_lieu(String string) {
        // Write code here that turns the phrase above into concrete action
        habitat=new Habitat(string);
    }

    @Given("une  liste de dragon comprend deux dragons")
    public void une_liste_de_dragon_comprend_deux_dragons() {
        // Write code here that turns the phrase above into concrete actions
        smaug =new Dragon();
        dino =new Dragon();
    }

    @Given("un habitat comprend  une liste de dragons  <listDragon>")
    public void un_habitat_comprend_une_liste_de_dragons_listDragon() {
        // Write code here that turns the phrase above into concrete actions
        listDragon =new ArrayList<Dragon>();
       habitat.setListeDragon((ArrayList<Dragon>) listDragon);
    }

    @When("le maire décide de loger un dragon")
    public void le_maire_décide_de_loger_un_dragon() {
        // Write code here that turns the phrase above into concrete actions
        smaug.setNullHabitat();
        dino.setNullHabitat();
        habitat.ajoutDragonHabitat(dino);
        habitat.ajoutDragonHabitat(smaug);
    }

    @Then("le système met à jour le nombre de dragons dans  l'habitat {int}.")
    public void le_système_met_à_jour_le_nombre_de_dragons_dans_l_habitat(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        assertTrue( smaug.isInHabitat(habitat));
        assertTrue( dino.isInHabitat(habitat));
        assertEquals( listDragon.size(),int1);
    }
}
