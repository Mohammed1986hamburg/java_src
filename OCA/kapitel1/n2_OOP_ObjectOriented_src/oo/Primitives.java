package oca.basis;

public class Primitives {

	public static void main(String[] args) {
		
		//byte
		byte byte_beliebig = 100;
		byte byte_max = Byte.MAX_VALUE;
		byte byte_min = Byte.MIN_VALUE;
		byte byte_ByteSize = Byte.BYTES;
		byte byte_BitSize = Byte.SIZE;
		
		System.out.println("Byte hat in Java.."+ "   Min: "+ byte_min + "   Max: " + byte_max + "   Byte size: " + byte_ByteSize 
				+ "   Bit size: " + byte_BitSize + "   Z.B ein Wert: "+ byte_beliebig);
		
		//short
		short short_beliebig = 101;
		short short_max = Short.MAX_VALUE;
		short short_min = Short.MIN_VALUE;
		short short_ByteSize = Short.BYTES;
		short short_BitSize = Short.SIZE;

		System.out.println("Short hat in Java.."+ "   Min: "+ short_min + "   Max: " + short_max + "   Byte size: " + short_ByteSize
				+ "   Bit size: " + short_BitSize + "   Z.B ein Wert: "+ short_beliebig);
		
		
		//int
		int int_beliebig = 101;
		int int_max = Integer.MAX_VALUE;
		int int_min = Integer.MIN_VALUE;
		int int_ByteSize = Integer.BYTES;
		int int_BitSize = Integer.SIZE;

		System.out.println("Int hat in Java.."+ "   Min: "+ int_min + "   Max: " + int_max + "   Byte size: " + int_ByteSize 
				+ "   Bit size: " + int_BitSize + "   Z.B ein Wert: "+ int_beliebig);		

}
}
