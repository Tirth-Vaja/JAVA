import java.util.Random;
import java.lang.Thread;

class RandomNum extends Thread
{
	Random rand = new Random();
	int y = rand.nextInt(100);
	public void run()
	{
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			System.out.println("An Error Has Occured");
			e.printStackTrace();
		}

		if (y % 2 == 0)
		{
			Square s = new Square();
			s.start();
		}
		else
		{
			Cube c = new Cube();
			c.start();
		}
	}
	int getRandom()
	{
		return y;
	}
}
class Square extends Thread
{
	public void run()
	{
		try
		{
			RandomNum x = new RandomNum();
			int y = x.getRandom();
			System.out.println("Square Of " + y + " is : " + (y*y));
		}
		catch(Exception e)
		{
			System.out.println("An Error Has Occured");
			e.printStackTrace();
		}
	}
}

class Cube extends Thread
{
	public void run()
	{
		try
		{
			RandomNum x = new RandomNum();
			int y = x.getRandom();
			System.out.println("Cube Of " + y + " is : " + (y*y*y));
		}
		catch(Exception e)
		{
			System.out.println("An Error Has Occured");
			e.printStackTrace();
		}
	}
}


public class RandomSelect {
	public static void main(String[] args) {
		RandomNum x = new RandomNum();
		RandomNum y = new RandomNum();
		x.start();
		y.start();
	}

}
