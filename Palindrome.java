package For;

public class Palindrome {
	public static void main(String[] args) {
		String a="Madam";
		int x=10;
		String temp="";
		for(int i=a.length()-1;i>=0;i--) {
			temp=temp+a.charAt(i);
			
		}
		if(a.equalsIgnoreCase(temp)){
			System.out.println("palindrome");
		}
		else {
			System.out.println("no its not a palindrome");
		}
	}

}
