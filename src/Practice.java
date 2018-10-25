import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		
	//print a statement
		System.out.print("I know how to print to the screen ");
		
//create an integer, double, and string variable
		int num= 4;
		double num2= 4.767;
		String str = "This is a string with a capital S";
		System.out.println(num+ ", "+num2+ ", " + str);
		num *= 2;
		num2 = num * num2;
		str += " concatination";
		int num3 = 40;
		System.out.println("num:" + num);
		System.out.println("num2:" + num2);
		System.out.println("str" + str);
		
		Scanner jawn = new Scanner(System.in);
		System.out.print("\n\n\nWhat is your favorite sport");
		String favSport = jawn.nextLine();
		System.out.print("Your favorite sport is " +  favSport + ", My favorite sport is Tennis");
	}

}
