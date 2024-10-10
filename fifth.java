import java.util.Scanner;
class fourth {
    public static void main(String[] args) {

        Scanner tier = new Scanner(System.in);

        int n1=0;
        int n2=1;
        int c=0;

        System.out.println("Enter the no :");
        int days = tier.nextInt();

        System.out.println("Series of first " +days+ " Fibonacci no is:");

        System.out.println(0);
        System.out.println(1);

        for (int i=0;i<days-2;i++){
            c=n1+n2;
            System.out.println(c);
            n1=n2;
            n2=c;
        }

        }
}