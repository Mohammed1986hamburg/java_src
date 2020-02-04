package kapitel_2.aufgaben;

public class UnaryOperationsPrecedence {

	public static void main(String[] args) {
		
		//#1
		int p = 1;
		System.out.println(++p +"... 2 ...... 2 ..."+ p++);
		//.............................
		
		//#2
		int x = 2 + 5 *10 *2 /4 - 20 *4 % 2; //27
		System.out.println(x);
		//.............................
		
		//#3
		int y = 10,  z = 5; //21
		y = --y * (y = 2) + ++z / y;
		  // 9 * (y = 2) + ++z / y;           left then ()
		  // 9 *    2    + ++z / 2;           y=2   
		  // 9 *    2    + 6 / 2;             z=6
		  // 18 + 3
		System.out.println(y);
		//.............................
		
		//#4
		int w = (2 + 5 *10) *(2 /(4 - 20) *4 % 2); //0
				//   52     *   (2/-16      *4 % 2 )
		        //   52     *    0       *4  % 2)             // 2/-16=0.125=0 bcz it is int not double
		       //    52     *    0 % 2                       // 0%2=0
		System.out.println(w);
		//.............................
		
		
		//#5
		int u= (x = 5) + x * --x % 4; //5
		System.out.println(u);
		//.............................
		
		//#6
		boolean ok = true;
		System.out.println(ok = !ok); // false
		System.out.println(!ok);    // true
		//.............................
		
		//#7
		int Y = 5;
		Y = Y++ - --Y * Y++ - --Y;
		 // 5 -  5 * 5 - 5 
		// 5 -  25 - 5 
		// -20-5  
		//-25
		System.out.println(Y);
		//............................

		//#7
		int y1, x1, z1;
		y1=x1=z1=5;
		System.out.println(y1=y1 + ++y1 + --y1 + y1);
		System.out.println(y1 + ++y1 +" " + x1 + z1); // 12    10
		System.out.println(y1 + ++y1 +" " + (x1 + z1)); // 12   10
		//............................
		
		//#8
		int t = 5;
		t = t + 5 * 2 * ++t + t;
		System.out.println(t);
		//.............................	
		
		int k1=2;
		int k2=2;
		int k =  (k1 & k2);
		System.out.println(k);
		
		
	}

}
