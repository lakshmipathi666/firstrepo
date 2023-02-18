package For;

public class One {
	public static void main(String[] args) {
		int a=4;
		int b=1;
		int c=0;
		int d=1;
		for(int i=1;i<=a;i++) {
			b=i;
			c=c+b;
			d=d*c;
		}
		System.out.println(d);
	}
}
