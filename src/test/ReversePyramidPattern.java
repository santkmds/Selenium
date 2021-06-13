package test;

public class ReversePyramidPattern {

	public static void main(String[] args) {
		
		
		/*
		 * int rows=5; for (int i= 0; i<= rows-1; i++) { for (int j=0; j<=i; j++) {
		 * System.out.print(" "); } for (int k=0; k<=rows-1-i; k++) {
		 * System.out.print("*" + " "); } System.out.println(); }
		 */
		
		/*
		 * int rows=5; //inner loop for (int i= rows-1; i>=0 ; i--) { //outer loop for
		 * (int j=0; j<=i; j++) { //prints star and space System.out.print("*" + " "); }
		 * //throws the cursor in the next line after printing each line
		 * System.out.println(); }
		 */
		
		
		int i,j;
		for(i=1;i<=4;i++) {
			for ( j = 1; j<=i; ++j) {
				System.out.print(j+ " ");
				
			}
			
			System.out.println();
			
		}
		
	}

}























