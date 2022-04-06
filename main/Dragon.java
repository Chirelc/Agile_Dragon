package main;

/**
 * Décrivez votre classe Dragon ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Dragon 
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private boolean feu;
    private boolean gentille;
    private Habitat habitat;
    /**
     * Constructeur d'objets de classe Dragon
     */
    public Dragon()
    {
        // initialisation des variables d'instanceint pattes
        this.feu = true;
        this.gentille=true;
       
        
    }
   public boolean getFeu(){
        return this.feu;
    }
    public boolean getGentille(){
        return this.gentille;
    }
    public void seBat(){
        if(this.gentille){
         this.gentille= false ;
        }
    }
    public boolean setGentille(){
        return this.gentille=true;
    }
   public void setHabitat(Habitat h) {
	   if(habitat!=null) {
		   habitat.supprimeDragonHabitat(this);
	   }
	   h.ajoutDragonHabitat(this);
	   habitat=h;
	   
}
 
  public void setHabitat() {
        
	this. habitat=null;
} 

  public Habitat getHabitat() {
	  return  habitat;
  }
  public boolean isInHabitat(Habitat h) {
	  if(this.habitat!=h) {
		  return false;
	  }else {return true;}
  }



    /**
     * Un exemple de méthode - remplacez ce commentaire par le vôtre
     *
     * @param  y   le paramètre de la méthode
     * @return     la somme de x et de y
     */

    
}