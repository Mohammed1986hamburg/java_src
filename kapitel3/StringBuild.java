package oca.api.string;

public class StringBuild {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();	// Instanz sb wird erzeugt mit standard (Indexen von 0-15)
		
		System.out.println(sb);
		
		 sb.append("ABCD");			// append() f�gt etwas an die vorhandene
									// Zeichenkette an --> hinzuf�gen
		System.out.println(sb);

		String str = "  ---efg---  ";
		
		sb.append(str);
		
		System.out.println(sb);
		
		StringBuilder obj = new StringBuilder("hijk");	// das Objekt(Instanz) obj wird erzeugt
		
		sb.append(obj);					// Nutzen der in obj gespeicherten Zeichen
		System.out.println(sb);
		
		obj.delete(2,3);				// Ein Zeichen in obj l�schen
		System.out.println(obj);
		System.out.println(sb);
		
		sb = obj;						// Beide Referenzvariablen verweisen auf das Objekt aus Zeile 21
		
		sb.append(" Hugenduebel");		// sb und obj verweisen auf dasselbe Objekt und �nderungen 
										// die durch eine Referenzvariable (sb oder obj) ausgef�hrt werden
		System.out.println(obj);		// gelten f�r EIN EINZIGES OBJEKT
		
		sb = new StringBuilder(11);		// Nutzen einer bestehenden Referenzvariablen und weise ein NEUES 
										// Objekt zu. sb zeigt nicht mehr auf das Objekt von Zeile 21 !!
										// 11 legt hier die l�nge des Stringbuilders fest (Indexe 0- 10)
		
		System.out.println("~~~~~~~~~~~~~~~~~~");
		System.out.println(sb);
		sb = obj.append(45) ;			// int wird in Zeichen umgewandelt und an das Objekt von obj. angef�gt
										// die Referenzadresse von obj wird an sb zugewiesen.
		
	}

}
