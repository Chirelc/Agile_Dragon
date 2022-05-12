package main;
import java.util.ArrayList;
public class Habitat {
private ArrayList <Dragon> listeDragon=new ArrayList();
private String lieu;

public Habitat (String lieu){
this.lieu=lieu;
}

public  ArrayList<Dragon>   getDragons() {
	return listeDragon;
}
// Cette fonction ajoute un dragon  uniquement si celui ci n'est pas deja present dans la grotte 
public boolean  ajoutDragonHabitat(Dragon d) {
	boolean m=false;
	for(int i =0;i<listeDragon.size();i++) {
		if(listeDragon.get(i).equals(d)) {
			m=true;
			return m;
		}
	}
	this.listeDragon.add(d);
	d.setHabitat(this);
	return m;
}
public boolean supprimeDragonHabitat(Dragon d ){
	boolean m =true;
	for(int i =0;i<listeDragon.size();i++) {
		if(listeDragon.get(i).equals(d)) {
			listeDragon.remove(d);
			d.setNullHabitat();
			return m;
		}		
	}
	m=false; 
	return m;	
	
}
public boolean supprimeHabitat(){
	boolean m =true;
	for(int i =0;i<listeDragon.size();i++) {
		listeDragon.get(i).setNullHabitat();
	}
	listeDragon.clear();
	m=false; 
	return m;	
	
}

public boolean isDragoIn(Dragon d) {
	for(int i =0;i<listeDragon.size();i++) {
		if(listeDragon.get(i).equals(d)) {
			return  true;
		}
	}
	return false;

}
public void Demenage(Habitat h, Dragon d) {
	h.ajoutDragonHabitat(d);
	this.supprimeDragonHabitat(d);
	}

public ArrayList<Dragon> getListeDragon() {
	return listeDragon;
}

public void setListeDragon(ArrayList<Dragon> listeDragon) {
	this.listeDragon = listeDragon;
}

public String getLieu() {
	return lieu;
}

public void setLieu(String lieu) {
	this.lieu = lieu;
}
}