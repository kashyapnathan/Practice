import java.util.Scanner;

public class BirthdayCalculator {

	public static void main(String[] args) {
		Scanner getDisBread = new Scanner (System.in);	
		System.out.println("Please enter the birth year of the first person ");
		double firstYear = getDisBread.nextDouble();
		System.out.println("Please enter the birth year of the first person ");
		double secondYear = getDisBread.nextDouble();

		if(firstYear>secondYear)
		{System.out.println("The second person is older");}
			
		if(firstYear<secondYear)
			{System.out.println("The First Person is older");}
		
		else
		
		System.out.println("Please enter the birth month (As a number) of the first person ");
		double firstMonth = getDisBread.nextDouble();
		System.out.println("Please enter the birth month (As a number) of the first person ");
		double secondMonth = getDisBread.nextDouble();
		
		if(firstMonth>secondMonth)
			System.out.println("The second person is older");
			
		if(firstMonth<secondMonth)
			System.out.println("The first person is older");
		
		  else
			
		System.out.println("Please enter the birth date of the first person ");
		double firstDay = getDisBread.nextDouble();
		System.out.println("Please enter the birth date of the first person ");
		double secondDay = getDisBread.nextDouble();
		
		if(firstDay>secondDay)
			System.out.println("The second person is older");
		
		if(firstDay<secondDay)
			System.out.println("The first person is older");
		
		else
			System.out.println("The people in question are twins");
		
	}
	}


