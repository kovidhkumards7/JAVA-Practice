
public class swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;
		a = 56;
		b = 89;
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("value of a is : "+a);
		System.out.println("value of b is : "+b);
		int temp = a;
		a = b;
		b = temp;
		System.out.println("value of a is : "+a);
		System.out.println("value of b is : "+b);
		
		


	}

}
