import java.io.*;

public class Explore{
	public static void main(String[] args) {
		try
		{
			File f1 = new File("file4.txt");

			FileWriter fw = new FileWriter(f1);

			BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
			BufferedWriter bw = new BufferedWriter(fw);

			System.out.println("Enter Data You Want To Write In File : ");
			String s = new String(br.readLine());

			fw.write(s,0,s.length());
			fw.close();
			bw.close();
			br.close();
			System.out.println("Data Has Been Successfully Written!");
		}
		catch(IOException e)
		{
			System.out.println("An Error Has Occured : ");
			e.printStackTrace();
		}
	}
}
