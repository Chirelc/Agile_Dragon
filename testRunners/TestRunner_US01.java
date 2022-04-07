package testRunners;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import main.Dragon;
import main.Habitat;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class TestRunner_US01 {
    private List<Dragon> listDragon1;
    private List<Dragon> listDragon2;
    private Habitat habitat1;
    private Habitat habitat2;
    private Dragon smaug=new Dragon();
    private Dragon dino=new Dragon();
    @Given("un habitat1 qui comprend un lieu {string}")
    public void un_habitat1_qui_comprend_un_lieu(String string) {
        habitat1=new Habitat(string);
    }

    @Given("une habitat2 qui comprend un lieu {string}")
    public void une_habitat2_qui_comprend_un_lieu(String string) {
        habitat2=new Habitat(string);
    }

    @Given("un habitat1 comprend  une liste de dragons  <listDragon1>")
    public void un_habitat1_comprend_une_liste_de_dragons_listDragon1() {
        // Write code here that turns the phrase above into concrete actions
        listDragon1 =new ArrayList<Dragon>();
    }
    @Given("les dragons smaug<Dragon> et dino<Dragon> sont dans <listDragon1>")
    public void les_dragons_smaug_Dragon_et_dino_Dragon_sont_dans_listDragon1() {
        // Write code here that turns the phrase above into concrete actions
        habitat1.setListeDragon((ArrayList<Dragon>) listDragon1);
        listDragon1.add(dino);
        listDragon1.add(smaug);
    }

    @Given("un habitat2 comprend  une liste de dragons  <listDragon2>")
    public void un_habitat2_comprend_une_liste_de_dragons_listDragon2() {
        listDragon2 =new ArrayList<Dragon>();
        habitat2.setListeDragon((ArrayList<Dragon>) listDragon2);
    }
    @When("smaug démenage")
    public void smaug_démenage() {
        habitat2.ajoutDragonHabitat(smaug);
        habitat1.supprimeDragonHabitat(smaug);
    }

    @Then("le système enlève smauge de habitat1 et le met dans habitat2.")
    public void le_système_enlève_smauge_de_habitat1_et_le_met_dans_habitat2() {
        // Write code here that turns the phrase above into concrete actions
        assertFalse(habitat1.isDragoIn(smaug));
        assertTrue(habitat2.isDragoIn(smaug));
    }


}
