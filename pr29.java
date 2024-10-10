import java.util.*;
import java.io.*;

public class Search
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		try
		{
			File f = new File(args[0]);
			while (!f.exists())
			{
				System.out.print(f.getName()+" not Found Please Enter The Correct File Name! : ");
				args[0] = sc.nextLine();
				f = new File(args[0]);
			}

			FileReader f1 = new FileReader(f);
			int lines = 0;
			Scanner sca = new Scanner(f);
			
			while(sca.hasNextLine())
			{
				sca.nextLine();  // for finding Length
				lines++;
			}
			
			System.out.print("Enter The Word You Want To Search For in " + f.getName() + " : ");
			String user = sc.nextLine();
			
			//reading data of file & Checking For User Entered Word
			String [] s = new String[lines];
			Scanner scaa = new Scanner(f1);
			int x = 0;
			while(scaa.hasNextLine()) // (x!=i)
			{
				s[x] = scaa.nextLine();
				StringTokenizer x1 = new StringTokenizer(s[x]);
				while(x1.hasMoreTokens())
				{
					if (user.equals(x1.nextToken()))
					{
						System.out.println("Word "+ user +" Found in line "+(x+1)+" in "+f.getName());
					}
				}

				x++;
			}

			sca.close();
			scaa.close();
		}
		catch (IOException e) {
			System.out.println("An Error Has Occured");
			e.printStackTrace();
		}
		
		sc.close();
	}
}
