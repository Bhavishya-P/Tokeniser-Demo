import java.util.Scanner;
import java.io.*;
//import java.util.StringTokenizer;
class Employee
{
	String name;
	int age;
	{
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("\n Enter Name ");
			name = br.readLine();
			System.out.print("\nEnter Age : ");
			age = Integer.parseInt(br.readLine());
		}
		catch(Exception e)
		{

		}
		
	}
}
public class Tokeniser {

	public static void main(String[] args) throws IOException 
	{
		
		try 
		{
			File file = new File("C:/Users/Polepalli/Desktop/New folder/Data.txt");
			file.createNewFile();
			new PrintWriter(new FileOutputStream(file,true));
			new BufferedReader(new InputStreamReader(System.in));
		}
		finally
		{
			System.out.println("Done");
		}
		

	}

}

	