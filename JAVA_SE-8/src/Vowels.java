
public class Vowels {
	public static void main(String[] args) {
		String message = "Hello, how are you...";
		
		
		
		
		
		for(int index=0 ; index < message.length() ; index++ )
			{char chr = message.charAt(index);
			if(chr =='a'||chr =='e'||chr =='i'||chr =='o'||chr =='u') {
				System.out.println(chr);
			}
	
			}
	
		
		switch(chr) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
				System.out.println(chr);
				break;
		default:
		}
	
	}
}
