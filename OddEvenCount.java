package For;

public class OddEvenCount {
	public static void main(String[] args) {
		
	int evencount=0;
	int oddcount=0;
	
	for(int i=20;i<=26;i++) {
		if(i%2==0) {
		evencount=evencount+1;
		}
		else {
		oddcount=oddcount+1;
		}
		
	}
	System.out.println(evencount+" even numbers");
	System.out.println(oddcount+" odd numbers");
}
}


