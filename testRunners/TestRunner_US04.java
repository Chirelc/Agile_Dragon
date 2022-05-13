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

public class TestRunner_US04 {
    private Batiment b1;
    private Batiment b2;
    private LogementAdaptator logement1;
    private LogementAdaptator logement2;
    private Dragon spyro;
    @Given("un logementAdaptator1  avec un lieu {string} et un dragon qui y loge")
    public void un_logementAdaptator1_avec_un_lieu_et_un_dragon_qui_y_loge(String string) {
        spyro= new Dragon();
        logement1 = new LogementAdaptator(string);
        logement1.ajoutDragonHabitat(spyro);
    }

    @Given("un logementAdaptator2  avec un lieu {string}")
    public void un_logementAdaptator2_avec_un_lieu(String string) {
   logement2=new LogementAdaptator(string);
    }

    @Given("un batiment2 avec {int} etages et {int} fenetres et {int} portes")
    public void un_batiment2_avec_etages_et_fenetres_et_portes(Integer int1, Integer int2, Integer int3) {
        b2=new Batiment(int1,int2,int3);
        logement2.setBatiment(b2);
    }


    @When("le maire décide de déménager le dragon dans un plus grand logement2")
    public void le_maire_décide_de_déménager_le_dragon_dans_un_plus_grand_logement2() {
        logement1.Demenage(logement2,spyro);
    }

    @Then("le système met à jour  le logement du dragon et  calcul du nombre total de fenetres {int} du batiment2")
    public void le_système_met_à_jour_le_logement_du_dragon_et_calcul_du_nombre_total_de_fenetres_du_batiment2(Integer int1) {
        assertFalse(logement1.isDragoIn(spyro));
        assertTrue(logement2.isDragoIn(spyro));
        assertEquals(int1,logement2.getBatiment().totalFenetres());
    }

}
