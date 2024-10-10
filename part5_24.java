import java.util.Scanner;
public class part5_24 {
    public static void main(String[] args) {
        int x,y;
        
        
        try{
            Scanner o=new Scanner(System.in);
            System.out.println("enter x:");
            x= o.nextInt();
            System.out.println("enter y:");
            y= o.nextInt();
            System.out.println(x/y);
        }
         catch (Exception e) {
            System.out.println("Division by zero or number not int");
        }
    }
}