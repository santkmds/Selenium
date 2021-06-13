package v2soft11Mar;

public class ReverseWordInSentence {
	
	
	public void rev(String str)
	{
		
		
		String[] words =str.split(" ");
		System.out.println("words =" +words);
		String reversedString ="";
		for (int i=0 ; i<words.length;i++){
		String word = words[i];
		String reverseWord = "";
		for (int j = word.length()-1; j>=0; j--)
		{
		reverseWord=reverseWord+word.charAt(j);
		}
		reversedString =reversedString+reverseWord + " ";
		//System.out.print(reverseWord);
		System.out.print(reversedString);
		
		
		
		
		
		
		
		}
		//System.out.println("Reverse = "+str);
		
		
	}
	
	public static void main(String[] args) {
		ReverseWordInSentence obj = new ReverseWordInSentence();
		obj.rev("Hi How Are You");
	}
	
}

