package main;

import java.util.ArrayList;

public class LogementAdaptator extends Batiment{
Habitat habitat;
    public LogementAdaptator(){
        super();
        this.habitat=null;
    }
   public void setHabitat(Habitat h){
       this.habitat=h;
   }
   public Habitat getHabitat(){
        return this.habitat;
   }

}

