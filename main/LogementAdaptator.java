package main;

import java.util.ArrayList;

public class LogementAdaptator extends Habitat{
Batiment batiment;
    public LogementAdaptator(String lieu){
        super(lieu);
        this.batiment=new Batiment();
    }
    public LogementAdaptator(String lieu, Batiment b){
        super(lieu);
        if(this.getListeDragon().size()<= b.getListePortes().size()){
            this.batiment=b;
        }else{
            this.batiment=null;
        }

    }
   public void setBatiment( Batiment b){
        if(this.batiment==null){
        if(this.getListeDragon().size()<= b.getListePortes().size()){
           this.batiment=b;
       }
        }else{
            if(this.getListeDragon().size()<= b.getListePortes().size()){
                this.batiment=b;
            }

        }

   }
    public boolean  ajoutDragonHabitat(Dragon d) {
        boolean m = false;
        if(this.getListeDragon().size() + 1<= this.batiment.getListePortes().size()) {
            for (int i = 0; i < this.getListeDragon().size(); i++) {
                if (this.getListeDragon().get(i).equals(d)) {
                    m = true;
                    return m;
                }
            }
            this.getListeDragon().add(d);
            d.setHabitat(this);
        }
        return m;
    }

   public Batiment getBatiment(){
        return this.batiment;
   }

}

