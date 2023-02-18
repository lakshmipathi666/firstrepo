package For;

public class FibonociiSeries {
	public static void main(String[] args) {
		int num=8;
		int a=0;
		int b=1;
		int c=0;
		int num1=0;
		for(int i=0;i<=num;i++) {
			
			c=a+b;
			a=b;
			b=c;
			num1=num1+a;
			System.out.println(num1);
		}
		
	}
}
