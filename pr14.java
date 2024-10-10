import java.util.*;

class Date{
    int month;
    int year;
    int day; 

    public Date(int day,int month,int year){
        this.month=month;
        this.year=year;
        this.day=day;
    }

    public int getMonth(){
        return month;
    }

    public void setMonth(int month){
        this.month=month;
    }
    
       public int getYear(){
        return year;
    }

    public void setYear(int year){
        this.year=year;
    }

    public int getDay(){
        return day;
    }

    public void setDay(int day){
        this.day=day;
    }

    public void displayDate() {
        System.out.println(day + "/" + month + "/" + year);
    }

    public static void main(String args[]){
        Date D=new Date(2,4,2006);   
        D.displayDate();

        D.setDay(12);
        D.setMonth(25);
        D.setYear(2024);

        System.out.print("The modified date is: ");
        D.displayDate();   
    }

}
