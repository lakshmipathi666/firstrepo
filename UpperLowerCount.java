package For;

public class UpperLowerCount {
	public static void main(String[] args) {
		String a="namE";
		String temp=a.toUpperCase();
		int lowerCount=0;
		int upperCount=0;
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)==temp.charAt(i)){
				upperCount++;
			}
			else {
				lowerCount++;
			}
		}System.out.println(lowerCount);
		System.out.println(upperCount);
	}

}
