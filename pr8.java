import java.util.Scanner;
class pr8{
    public static void main(String[] args) {
        int[] arr = new int[5]; 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 no:");
        for(int i = 0;i<5;i++){
            arr[i] = sc.nextInt();
        }
        // pr8 obj = new pr8();
        int c= pr8.counter(arr);
        System.out.println("Count of 9 is"+c);
        


    }
    public static int counter(int[] arr){
        int count = 0;
        for(int i = 0;i<5;i++){
            if(arr[i]==9){
                count++;
            }
        }
            return count;
    }
}