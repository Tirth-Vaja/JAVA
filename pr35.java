import java.util.Scanner;

public class Increment extends Thread
{

	public void run()
	{
		int x;
		System.out.print("Enter A Varaible : ");
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		sc.close();
		x++;
		try {
			Thread.sleep(1000);
		}
		catch (InterruptedException e) {
			System.out.println("An error Occurred.");
			e.printStackTrace();
		}
		System.out.println("Value of Varaible is now : "+x);
	}
	
	public static void main(String[] args)
	{
		Increment t = new Increment();
		t.start();
	}
}
