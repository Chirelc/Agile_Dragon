package testRunners;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.jupiter.api.Assertions.*;
import main.Batiment;

public class TestRunner_US06 {
    private Batiment b;

    @Given("le nombre d'etages {int} et le nombre de fenetres {int} dun batiment")
    public void le_nombre_d_etages_et_le_nombre_de_fenetres_dun_batiment(Integer int1, Integer int2) {
        b = new Batiment();
        b.setNbrEtages(int1);
        b.setNbrFenetres(int2);
    }
    @When("l'utilisateur demande le calcul du nombre total de fenetres")
    public void l_utilisateur_demande_le_calcul_du_nombre_total_de_fenetres() {
        int t = b.totalFenetres();
    }

    @Then("le {int} doit etre retourné.")
    public void le_doit_etre_retourné(Integer int1) {
        assertEquals(int1, b.totalFenetres());
    }
}


