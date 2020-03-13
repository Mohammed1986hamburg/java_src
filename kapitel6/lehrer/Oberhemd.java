public class Oberhemd{
 public static final byte BLAU = 1;
 public static final byte ROT = 2;
 public static final byte GRUEN = 3;
 
 public static final byte UNI = 1;
 public static final byte KARIERT = 2;
 public static final byte GESTREIFT = 3;
 
 protected byte farbe;
 protected byte muster;
 
 public Oberhemd (byte farbe, byte muster){
 this.farbe = farbe;
 this.muster = muster;
 }
 
 public String toString(){
 String retString;
 switch(this.farbe){
 case BLAU : retString = "blaues, ";
			 break;
 case ROT :	 retString = "rotes, ";
			 break;
case GRUEN : retString = "grünes, ";
			 break;
default :	retString = "";
			 
}
return retString;
}

switch(this.muster){
case UNI : retString += "unifarbenes Hemd";
		   break;
case KARIERT: retString += "kariertes Hemd";
			 break;
case GESTREIFT : retString += "getsreiftes Hemd";
			 break;
default: retString += "Hemd";
}
public static void main(String[] args){
	Oberhemd hemd1 = new Hemd();
	Oberhemd hemd2 = new Hemd();
	Oberhemd hemd3 = new Hemd();
	
	System.out.println(hemd1);
	System.out.println(hemd2);
	System.out.println(hemd3);
}

// 1. Passen Sie obigen Sourcecode so an, das er Läuft.
// 1a. Übergeben Sie andere Zahlen als die festgelegten und schauen was passiert.
// 2. Objekte der Klasse bekommen im Konstruktor 2 Zahlenwerte übergeben, die bisher nicht
//	  auf Gültigkeit überprüft werden, und ob sie das Muster oder die Farbe bestimmen.
//    Erweitern Sie den Konstruktor so, das er diese Argumente auf Gültigkeit prüft.
// 3. Wenden Sie ein Exception Handling an.