import java.util.Scanner;
public class part5_26_1 {
    public static void main(String[] args) 
    throws  age{
        Scanner o= new Scanner(System.in);
        System.out.println("Enter Your Age");
        int a=o.nextInt();
        if (a<=18 && a<=60) {
            throw new age(a);
        }
        else{
             System.out.println("Valid Age");

         }
        System.out.println("hello");
    }    
}
/**
 * part5_26_1
 */
 class age extends Exception {
    public age(int a){
        System.out.println("Invaild age");
    }
    
}