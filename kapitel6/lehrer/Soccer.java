package oca.exceptions;

public class Soccer extends Game {

	public static void main(String[] args) throws Exception{
		Soccer spieler = new Soccer();
		try{
			
			throw new MisleadSoccerException("Erste Exception");
			
		}catch(MisleadSoccerException me) {
				System.out.println(me.getMessage());
				throw new Exception("Zweite Exception");
			
		}catch(SoccerException e) {
			System.out.println(e.getMessage());
			
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		finally {
		
			throw new Exception("Dritte Exception");
		}

	}
	@Override
	public void spiel(Game obj)throws SoccerException{		// ducked Exception
		Soccer spieler = (Soccer)obj;
		
			spieler.treffeTor();
			
//			System.out.println("Nach dem Spielaufruf");		// unreachable code
		
	}
	
	void treffeTor()throws MisleadSoccerException{
		
		System.out.println("Toor");
		throw new MisleadSoccerException("Doch daneben");
	}

}


abstract class Game {  void spiel (Game object)throws SoccerException{ System.out.println("Playing");}}

//-- --------------------------------------------------------------------------------------------------------------------
//-- --------------------------------------------------------------------------------------------------------------------
// Eigene Exception
class SoccerException extends Exception{  			 // durch die Vererbung von Exception wird SoccerException eine CHECKED Exceptuion
	String text;
	SoccerException(String text){
		this.text = text;
	}
	public String getMessage() {return text;}
} 

class MisleadSoccerException extends SoccerException{ // Subclass von SoccerException
	public MisleadSoccerException(String info) {
		super(info) ; 
	}
}

// Eigene RuntimeException
class GoalTooSmallException extends RuntimeException{} // durch die Vererbung von Runtime ist GoalTooSmallException eine 
													   // unchecked Exception	
