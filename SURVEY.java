import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;
public class Driver {

	public static void main(String[] args) {

	
	System.out.println("\tHi welcome to task > > >\n\t\t\t It! !\nThis app will help you plan and manage your time so that procrastination will no longer be an issue! \n");	
	
		System.out.println("Let's get started with a survey to gauge your level (where you stand) in your classes.");
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What time do you go to sleep on average everyday? Answer should be written in terms of 24h time (0:00-23:59), 12:00AM would be 0:00.");
		
		String sleepTime = keyboard.next();
		
		System.out.println("Alright, and what time do you go you wake up on average everyday?");
	
		String wakeTime = keyboard.next();
		
		//question time 
		
		System.out.println("How many classes are you taking?");
		int classes = keyboard.nextInt();
		
		String [] classesArr = new String [classes];
			
		int points [] = new int [classes];
		double pointPercent [] = new double [classes];
		
		for (int i =1; i<=classes; i++)
		{
			System.out.println("What is the name of class number "+i+"?");
			 String className = keyboard.next();
			 
			 classesArr [i-1]= className;
			
			
		}
			
		System.out.println("Alright we are almost done!\n");
	
		for (int i=0; i<classesArr.length;i++)
		{	
			System.out.println("How comfortable do you feel with the subject of "+classesArr [i]+"?");
			System.out.println("Answer by entering an integer between 1 and 5 inclusive.\n");
			
			System.out.println("1)\tThis stuff is easy! xP\n"
							+ "2)\tVery comfortable :)\n"
								+ "3)\tComfortable\n"
								+ "4)\tHaving trouble :/\n"
								+ "5)\tI need help! :'(");
			
			int comfortLvl = keyboard.nextInt();
			
			switch (comfortLvl)
			{
			case 1:
				points [i]= 1;
					break;
			case 2:
					points [i]= 2;
					break;
			case 3:
					points [i]= 3;
					break;
			case 4:
					points [i]= 4;
					break;
			case 5:
					points [i]= 5;
					break;		
			}
		}
			
			System.out.print("And how many hours per day would you like to spend on studying. Don't write 0! ");
			double hrs = keyboard.nextDouble();
			double hrsPerClass [] = new double [classes];
			
			int totalPts=0; //calculating total points
			for  (int j = 0; j<classes;j++)
			{
				totalPts = points[j]+totalPts;		
				
			}
			//double pointPercent [] = new double [classes];
			for (int j=0;j<pointPercent.length;j++)
			{
				pointPercent [j] = ((double)points [j])/totalPts*hrs;
				
			}
			
			for (int j =0; j<hrsPerClass.length;j++)
			{
				hrsPerClass[j] = pointPercent [j];
			}
	
			System.out.println("So here is the data for how much you should be studying for each class everyday:\n");
			
			NumberFormat rounder = new DecimalFormat("##.##");			
			
			
			
			for (int j=0; j<classes; j++)
			{
				System.out.println(rounder.format(hrsPerClass[j])+" hours for "+classesArr[j] +" class.");
			}
	
	
	}

}
