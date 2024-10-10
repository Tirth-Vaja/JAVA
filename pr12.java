import java.util.*;

public class pr12{
    public static void main(String args[]){
        if (args.length>0){
            int pound =Integer.parseInt(args[0]);
            System.out.println("Conversion of your pound in to rupees is"+pound*100);
        }
        else{
            Scanner tier=new Scanner(System.in);
            System.out.println("Enter your amount in pounds:");
            int p=tier.nextInt();
            int rupee = p*100;
            int conversion=rupee;
            System.out.println("Conversion of your pound in to rupees is"+ rupee);

        }
    }
}