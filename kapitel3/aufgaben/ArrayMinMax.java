package kapitel3.aufgaben;

public class ArrayMinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] nums = {12,14,34,843,23,107,29,1001,4,576};
		System.out.println(min(nums));
		System.out.println(max(nums));

	}
	
	public static int min(int... arr){
		int min = arr[0];
		for (int num : arr) {
			if (num<min) {
				min = num;	
			}
		}
	   return min;
	}
	public static int max(int... arr){
		int max = arr[0];
		for (int num : arr) {
			if (num>max) {
				max = num;	
			}
		}
	   return max;
	}

}
