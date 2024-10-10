import java.util.Scanner;
class third{
    public static void main(String[] args) {
        Scanner tier = new Scanner(System.in);
        System.out.println("Enter days:");
        int days = tier.nextInt();
        int a[]= new int[days];
        int sum=0;

        for (int i=0;i<days;i++){
            System.out.print("Eter your expenses for day"+(i+1)+":");
            a[i]=tier.nextInt();
        }
        for (int i=0;i<days;i++){
            sum = sum +a[i];
        }
        System.out.println("Sum of your daily expenses for "+days+" days are:" +sum);


    }
}