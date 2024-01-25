import java.util.Scanner;
public class basicTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//input name
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter name: ");
		String name = scanner.nextLine();
		
		//input name
		System.out.println("enter age: ");
		int age = scanner.nextInt();
		scanner.nextLine();
		
		//input designation
		System.out.println("enter designation: ");
		String desig = scanner.nextLine();
		
		//disply name, desig and age
		System.out.println("ur name is : "+name);
		System.out.println("ur designation is : "+desig);
		System.out.println("ur age is : "+age);
		 

	}

}
