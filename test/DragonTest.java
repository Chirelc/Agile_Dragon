package test;
import main.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

/**
 * Classe-test DragonTest.
 *
 * @author  (votre nom)
 * @version (un numéro de version ou une date)
 *
 * Les classes-test sont documentées ici :
 * http://junit.sourceforge.net/javadoc/junit/framework/TestCase.html
 * et sont basées sur le document Š 2002 Robert A. Ballance intitulé
 * "JUnit: Unit Testing Framework".
 *
 * Les objets Test (et TestSuite) sont associés aux classes à tester
 * par la simple relation yyyTest (e.g. qu'un Test de la classe Name.java
 * se nommera NameTest.java); les deux se retrouvent dans le męme paquetage.
 * Les "engagements" (anglais : "fixture") forment un ensemble de conditions
 * qui sont vraies pour chaque méthode Test à exécuter.  Il peut y avoir
 * plus d'une méthode Test dans une classe Test; leur ensemble forme un
 * objet TestSuite.
 * BlueJ découvrira automatiquement (par introspection) les méthodes
 * Test de votre classe Test et générera la TestSuite conséquente.
 * Chaque appel d'une méthode Test sera précédé d'un appel de setUp(),
 * qui réalise les engagements, et suivi d'un appel à tearDown(), qui les
 * détruit.
 */
public class DragonTest
{
    private Dragon Smaug;
    private Dragon Smaug2;
    private Biens biens1;
    private Habitat habitat;
    private Habitat grotte;
    

    @BeforeEach
    public void setUp()
    {
        Smaug = new Dragon();
        Smaug2 = new Dragon();
        grotte= new Habitat("pres du puit");
        biens1 = new Biens(Smaug);
        habitat= new Habitat("ici");
    }
    // Définissez ici les variables d'instance nécessaires à vos engagements;
    // Vous pouvez également les saisir automatiquement du présentoir
    // à l'aide du menu contextuel "Présentoir --> Engagements".
    // Notez cependant que ce dernier ne peut saisir les objets primitifs
    // du présentoir (les objets sans constructeur, comme int, float, etc.).
    

    /**
     * Constructeur de la classe-test DragonTest
     */
 /*public DragonTest()
    {
    } */
@Test
    public void testGetGentille() throws Exception{
        Dragon d1 = new Dragon();
        assertEquals(true, d1.getGentille());
    }
    
@Test 
    public void testGetFeu() throws Exception{
        Dragon d1= new Dragon();
        
        assertEquals(true, d1.getFeu());
    }
    
@Test
    
    public void testSeBat() throws Exception{
         Dragon d1= new Dragon();
        
        d1.seBat();
        
        assertEquals(false , d1.getGentille());
    }

@Test
    public void testSetGentille() throws Exception{
         Dragon d1= new Dragon();
        
        d1.setGentille();
        
        assertEquals(true , d1.getGentille());
    }
    
    
@Test
    
    public void testSetGentille2() throws Exception{
          Smaug.seBat();
        assertEquals(false ,Smaug.getGentille());
    }
    
@Test

public void testAjoutDragonHabitat() throws Exception{
	assertEquals(false,habitat.ajoutDragonHabitat(Smaug));
	assertEquals(Smaug,habitat.getDragons().get(0));
	assertEquals(false,habitat.ajoutDragonHabitat(Smaug2));
	assertEquals(Smaug2,habitat.getDragons().get(1));
	assertEquals(true,habitat.ajoutDragonHabitat(Smaug));
	assertEquals(2,habitat.getDragons().size());
	assertEquals(true,Smaug.isInHabitat(habitat));
	assertEquals(true,habitat.isDragoIn(Smaug));
	
	
}
@Test
public void testSupprimeDragonHabitat() throws Exception{
	testAjoutDragonHabitat();
	//On supprime un dragon dans la grotte
	habitat.supprimeDragonHabitat(Smaug);
	assertNull(Smaug.getHabitat());
	assertEquals(false,Smaug.isInHabitat(habitat));
	//on supprime toute la grotte
	habitat.supprimeHabitat();
	assertNull(Smaug2.getHabitat());
	
}
@Test
public void testDragonChangeHabitat() throws Exception{
	testAjoutDragonHabitat();
	//smaug ne veut plus habitat à habitat mais à grotte
	Smaug.setHabitat(grotte);
	assertEquals(true, grotte.isDragoIn(Smaug));
	assertEquals(false,habitat.isDragoIn(Smaug));
	
	
}
@Test
public void testLogementAdaptateur()throws Exception{
    LogementAdaptator l=new LogementAdaptator("3 rue du feu");
    l.ajoutDragonHabitat(Smaug);
    Batiment b = new Batiment();
    l.setBatiment(b);
    assertEquals(3,b.getNbrEtages());

}



    /**
     * Supprime les engagements
     *
     * Méthode appelée après chaque appel de méthode de test.
     */
@AfterEach
    public void tearDown() // throws java.lang.Exception
    { 
   
    
      
     
        
    }
    
}
