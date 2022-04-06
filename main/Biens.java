package main;

/**
 * Décrivez votre classe Tresor ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Biens
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private int qttOr;
    public Dragon getD() {
		return d;
	}
	public void setD(Dragon d) {
		this.d = d;
	}
	public void setQttOr(int qttOr) {
		this.qttOr = qttOr;
	}
	private Dragon d;

    /**
     * Constructeur d'objets de classe Biens
     */
   public  Biens(Dragon d)
    {
        // initialisation des variables d'instance
        this.qttOr= 10;
        this.d=d;
    }
      int getQttOr(){
        return this.qttOr;
    }
    public void analyseDragon(){
      if(d.getGentille()){
         qttOr=+1;
        } 
    }

    /**
     * Un exemple de méthode - remplacez ce commentaire par le vôtre
     *
     * @param  y   le paramètre de la méthode
     * @return     la somme de x et de y
     */
  
}