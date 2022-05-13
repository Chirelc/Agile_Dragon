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
public class TestRunner_US05 {
    private List<Dragon> listDragon;
    private Batiment b;
    private LogementAdaptator logement;
    private Dragon spyro;
    private Dragon mushu;
    @Given("un logementAdaptator1  avec un lieu {string}")
    public void un_logementAdaptator1_avec_un_lieu(String string) {
        logement=new LogementAdaptator(string);

    }
    @Given("un batiment avec {int} etage ,  {int} fenetres et {int} porte")
    public void un_batiment_avec_etage_fenetres_et_porte(Integer int1, Integer int2, Integer int3) {
      b= new Batiment(1,2,1);
      logement.setBatiment(b);
    }
    @Given("un dragon {string} y loge")
    public void un_dragon_y_loge(String string) {
        spyro= new Dragon();
        logement.ajoutDragonHabitat(spyro);
    }
    @Given("un dragon qui attend d'être loger")
    public void un_dragon_qui_attend_d_être_loger() {
        mushu=new Dragon();
    }

    @When("on ajoute le dragon {string} dans le logement")
    public void on_ajoute_le_dragon_dans_le_logement(String string) {
     logement.ajoutDragonHabitat(mushu);
    }
    @Then("celui ci n'est pas ajouté à la liste de dragons du logement")
    public void celui_ci_n_est_pas_ajouté_à_la_liste_de_dragons_du_logement() {
        assertFalse(logement.isDragoIn(mushu));
    }

}
