package test;

public class CFG {

	static boolean checkPalin(String word)
	{
		int n = word.length();
		word = word.toLowerCase();
		for (int i = 0; i < n; i++,n--) {
			
			if (word.charAt(i)!=word.charAt(n-1)) {				
				return false;				
			}			
		}
		
		return true;
		
	}
	
	static int countPalin(String str)
	{
		str = str + " ";
		int count =0;
		String word ="";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			if (ch != ' ') {
				word= word + ch;			
				
			}else {
				if(checkPalin(word)) {
					count++;
				}
			}
			
		}
		
		return count;
		
	}
	
	public static void main(String[] args) {
		System.out.println(countPalin("Hello MADAM MADAM Hello BOB"));
	}

}
