import java.util.Scanner;
public class userInput {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("enter name");
		String name = scanner.nextLine();
		System.out.println("ur name is: "+name);
		
		System.out.println("enter age");
		int age = scanner.nextInt();
		System.out.println("ur age is: "+age);
		scanner.nextLine();
		
		System.out.println("enter fav food");
		String food = scanner.nextLine();
		System.out.println("ur fav food is: "+food);
	}

}
