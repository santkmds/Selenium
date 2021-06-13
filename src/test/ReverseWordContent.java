package test;

public class ReverseWordContent {

 public static void main(String[] args) {
	String s = "Hi How Are You";
	
	String s1 [] = s.split(" ");
	for (int i = 0; i < s1.length; i++) {
		StringBuffer sb = new StringBuffer(s1[i]);
		
		System.out.print(sb.reverse());
		System.out.print(" ");
	}
	
	
			
}

}
