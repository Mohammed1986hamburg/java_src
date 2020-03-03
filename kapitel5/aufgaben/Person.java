package oca.uebungInterface;

import java.util.ArrayList;

public class Person {

	private ArrayList<Literatur> literatur = new ArrayList();
	private ArrayList<Brief> briefe = new ArrayList();
	private String name;
	
	//getter
	public ArrayList<Literatur> getLiteratur() {return literatur;}

	public ArrayList<Brief> getBriefe() {return briefe;	}

	public String getName() {return name;}

	//setter
	public void setLiteratur(ArrayList<Literatur> literatur) {this.literatur = literatur;}

	public void setBriefe(ArrayList<Brief> briefe) {this.briefe = briefe;}


	//constructor
	Person(){}
	
	
	public static void main(String[] args) {
		

	}

}
