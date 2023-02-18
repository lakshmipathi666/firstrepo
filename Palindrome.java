package For;

public class Palindrome {
	public static void main(String[] args) {
		String a="Madam";
		String temp="";
		for(int i=a.length()-1;i>=0;i--) {
			temp=temp+a.charAt(i);
			
		}
		if(a.equalsIgnoreCase(temp)){
			System.out.println("its a palindrome");
		}
		else {
			System.out.println("its not a palindrome");
		}
	}

}
