package main;

import java.util.ArrayList;

public class Batiment {
	 	private int nbrEtages;
	    private int nbrFenetres;
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
	   


	    /**
	     * Constructeur d'objets de classe Batiment
	     */
	    public Batiment()
	    {
	        // initialisation des variables d'instance
	        //x = 0;
			// on considère par défaut 3 habitants par étage
	        this.nbrEtages = 3;
	        this.nbrFenetres = 4;
			this.listePortes = new ArrayList<Door>();
			for(int i =0;i<3*nbrEtages;i++ ){
				Door d=new Door();
				this.listePortes.add(d);
			}
	    }

	public Batiment(int nbrEtages,int nbrFenetres,int nbPortes )
	{
		// initialisation des variables d'instance
		//x = 0;
		this.nbrEtages =nbrEtages ;
		this.nbrFenetres = nbrFenetres;
		this.listePortes=new ArrayList<Door>();
		for( int i =0;i<nbPortes;i++){
			Door d=new Door();
			this.listePortes.add(d);
		}
		this.listePortes = listePortes ;

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
