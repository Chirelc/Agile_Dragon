package cucumber.test;

import java.util.ArrayList;

public class Batiment {
	 	private int nbrEtages;
	    private int nbrFenetres;
	    private Door maPorte;//porte principale
	    private ArrayList<Door> listePortes;

	    public int getNbrFenetres() {
	       return nbrFenetres;
	   }

	   public void setNbrFenetres(int NbrFenetres) {
	       this.nbrFenetres = NbrFenetres;
	   }
	   
	   public int getNbrEtages() {
	       return nbrEtages;
	   }

	   public void setNbrEtages(int NbrEtages) {
	       this.nbrEtages = NbrEtages;
	   }
	   
	    public void setPorte(Door maPorte) {
	       this.maPorte = maPorte;
	   }
	   
	   public Door getPorte() {
	       return maPorte;
	   }

	    /**
	     * Constructeur d'objets de classe Batiment
	     */
	    public batiment()
	    {
	        // initialisation des variables d'instance
	        //x = 0;
	        this.maPorte = new Door();
	        this.nbrEtages = 3;
	        this.nbrFenetres = 4;
	        Door p = new Door();
	        this.listePortes = new ArrayList<Door>();
	        this.listePortes.add(p);

	    }

	    
	    public int totalFenetres()
	    {
	        int e = this.getNbrEtages();
	        int f = this.getNbrFenetres();
	        return multiply(e, f);
	    }

		private int multiply(int e, int f) {
			int x = e*f;
	        return x;
		}

		public ArrayList<Door> getListePortes() {
			return listePortes;
		}

		public void setListePortes(ArrayList<Door> listePortes) {
			this.listePortes = listePortes;
		}
		
		public void addPorte(Door p) {
			this.listePortes.add(p);
		}

}
