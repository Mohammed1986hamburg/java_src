
package mhd.wahba.firstocp;



public class Main {
    
    public static void main(String[] args) {
        
         int[][] chs = new int[2][]; chs[0] = new int[2];
chs[1] = new int[5];
int i = 97;
for (int a = 0; a < chs.length; a++) { for (int b = 0; b < chs.length; b++) {
chs[a][b] =  i;
i++; }
}
for (int[] ca : chs) { for (int c : ca) {
System.out.print(c + " "); }
System.out.println(); }

  
    }

     
}




