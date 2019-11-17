import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class DRIVER {

	public static void main(String[] args) {
		try 
		{
			Scanner x = new Scanner(new FileInputStream("SCHEDULE.txt"));
			PrintWriter y = new PrintWriter(new FileOutputStream("SAVED.txt"));
			String [] ClassName = new String[5];
			String [] ClassTime = new String[5];
			
			x.nextLine();
			x.nextLine();
			x.nextLine();
			
			ClassName[0] = x.nextLine();
			x.nextLine();
			ClassTime[0] = x.nextLine();
			x.nextLine();
			x.nextLine();
			
			ClassName[1] = x.nextLine();
			x.nextLine();
			ClassTime[1] = x.nextLine();
			x.nextLine();
			x.nextLine();
			
			ClassName[2] = x.nextLine();
			x.nextLine();
			ClassTime[2] = x.nextLine();
			x.nextLine();
			x.nextLine();
			
			ClassName[3] = x.nextLine();
			x.nextLine();
			ClassTime[3] = x.nextLine();
			x.nextLine();
			x.nextLine();
			
			ClassName[4] = x.nextLine();
			x.nextLine();
			ClassTime[4] = x.nextLine();
			x.nextLine();
			x.nextLine();
		}
		catch(FileNotFoundException e)
		{
				
		}

	}

}
