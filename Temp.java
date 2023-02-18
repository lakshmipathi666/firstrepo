package For;

public class Temp {
	public static void main(String[] args) {
		String word="java";
		String temp="";
		for (int i=word.length()-1;i>=0;i--) {
			temp=temp+word.charAt(i);
			System.out.println(temp);
		}
		
	}

}
