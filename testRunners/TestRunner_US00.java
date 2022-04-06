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
    private Dragon Smaug;
    private Dragon Dino;

    @Given("un habitat qui comprend un lieu {string}")
    public void un_habitat_qui_comprend_un_lieu(String string) {
        // Write code here that turns the phrase above into concrete action
        habitat=new Habitat(string);
    }



    @Given("une  liste de dragon comprend deux dragons")
    public void une_liste_de_dragon_comprend_deux_dragons() {
        // Write code here that turns the phrase above into concrete actions
        Smaug=new Dragon();
        Dino=new Dragon();
        throw new io.cucumber.java.PendingException();
    }


    @Given("un habitat comprend  une liste de dragons  <listDragon>")
    public void un_habitat_comprend_une_liste_de_dragons_listDragon() {
        // Write code here that turns the phrase above into concrete actions
        listDragon =new ArrayList<Dragon>();
        throw new io.cucumber.java.PendingException();
    }


    @When("le maire décide de loger un dragon")
    public void le_maire_décide_de_loger_un_dragon() {
        // Write code here that turns the phrase above into concrete actions
        listDragon.add(Smaug);
        listDragon.add(Dino);
        throw new io.cucumber.java.PendingException();
    }

    @Then("le système met à jour le nombre de dragons dans  l'habitat {int}.")
    public void le_système_met_à_jour_le_nombre_de_dragons_dans_l_habitat(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        assertTrue( Smaug.isInHabitat(habitat));
        assertTrue( Dino.isInHabitat(habitat));
        assertEquals( listDragon.size(),int1);
        throw new io.cucumber.java.PendingException();
    }
}
