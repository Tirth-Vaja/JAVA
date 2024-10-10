import java.util.Scanner;

class second{
    public static void main(String[] args) {
        Scanner tier = new Scanner(System.in);
        System.out.println("Enter distanc in meter:");
        float dist = tier.nextFloat();
        //System.out.println(dist);
        System.out.println("Enter Hours:");
        float hours = tier.nextFloat();
        System.out.println("Enter Minutes:");
        float minutes = tier.nextFloat();
        System.out.println("Enter Seconds::");
        float seconds = tier.nextFloat();

        System.out.println("Your speed in meters per seconds is:"+ dist/seconds);
        System.out.println("Your speed in kelometrs per hours is:"+ (dist/1000)/seconds);
        System.out.println("Your speed in meters per seconds is:"+ (dist/1609)/seconds);





    }
}