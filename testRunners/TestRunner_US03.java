package testRunners;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import main.Batiment;
import main.Dragon;
import main.Habitat;
import main.LogementAdaptator;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TestRunner_US03 {
    private List<Dragon> listDragon;
    private Batiment b;
    private LogementAdaptator logement;
    private Dragon spyro;

    @Given("un logementAdaptator  avec un lieu {string}")
    public void un_logementAdaptator_avec_un_lieu(String string) {
       logement = new LogementAdaptator(string);
    }

    @Given("un batiment avec les valeurs standards d'etages, de portes et de  fenetres")
    public void un_batiment_avec_les_valeurs_standards_d_etages_de_portes_et_de_fenetres() {
        b = new Batiment();
        logement.setBatiment(b);
    }

    @When("le maire décide de loger un  dragon {string}")
    public void le_maire_décide_de_loger_un_dragon(String string) {
        spyro=new Dragon();
        logement.ajoutDragonHabitat(spyro);

    }

    @Then("le système met à jour le nombre de dragons {int} dans  le  logementAdaptator.")
    public void le_système_met_à_jour_le_nombre_de_dragons_dans_le_logementAdaptator(Integer int1) {
     assertEquals(logement.getListeDragon().size(),int1);
    }

}
