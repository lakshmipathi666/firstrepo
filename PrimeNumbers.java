package For;

public class PrimeNumbers {
	public static void main(String[] args) {
		int a=3;
		boolean h=true;
		for(int i=2;i<a;i++) {
			if(a%i==0) {
				h=false;
			}
		}
			if(h==true) {
				System.out.println("prime");
			}
			else {
				System.out.println("notPrime");
			}
		}
	}


