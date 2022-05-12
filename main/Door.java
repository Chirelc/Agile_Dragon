package main;

public class Door {
	private String couleur;
    private Batiment Batiment;

    
    public Door()
    {
        this.couleur = (String) "blanc";
    }
    
    public String getCouleur() {
       return couleur;
   }

   public void setCouleur(String couleur) {
       this.couleur = couleur;
   }

	public Batiment getBatiment() {
		return Batiment;
	}
	
	public void setBatiment(Batiment batiment) {
		this.Batiment = batiment;
	}

}
