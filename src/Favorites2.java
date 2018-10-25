import java.util.Scanner;

public class Favorites2 {

	public static void main(String[] args) 
	{
	
		Scanner jawn = new Scanner(System.in);
		System.out.print("Please enter your name: ");
		String name = jawn.nextLine();
		System.out.print("please enter your favorite color:  ");
		String favcolor = jawn.nextLine();
		System.out.print("Please enter your favorite food:  ");
		String favFood = jawn.nextLine();
		System.out.print("Please enter your favorite subject:   ");
		String favSubject = jawn.nextLine();
		System.out.println("\n\n\n" + name  + ":");
		System.out.println("\n\tFavorite Color"+ favcolor);
		System.out.println("\n\tFavorite Food"+ favFood);
		System.out.println("\n\tFavorite Subject" + favFood);
	}

}
