import java.util.*;

class pr13{
    String fn;
    String ln;
    double monthlysalary;

    public pr13(String fn,String ln,double monthlysalary){
        this.fn=fn;
        this.ln=ln;

        if (monthlysalary>0){
            this.monthlysalary=monthlysalary;
        }
        else{
            this.monthlysalary=0.0;
        }
    }

    public String getFirstName(){
        return fn;
    }

    public void setFirstName(String fn){
        this.fn=fn;
    }
    
       public String getLasttName(){
        return ln;
    }

    public void setln(String ln){
        this.ln=ln;
    }

    public double getMonthlySellary(){
        return monthlysalary;
    }

    public void setMonthlySellary(double monthlysalary){
        if (monthlysalary>0){
            this.monthlysalary=monthlysalary;
        }
        else{
            this.monthlysalary=0.0;
        } 
    }

    public double yearlysalary(){
        return monthlysalary*12;
    }

    public void raisSalary(double percentage){
        double raisAmount = monthlysalary * percentage/100;
        monthlysalary+=raisAmount;
    }

    public static void main(String[] args){
        pr13 emp1=new pr13("Tirth","Vaja",10000);
        pr13 emp2=new pr13("Devarsh","Soni",11000);

        System.out.println("Employee "+emp1.getFirstName()+" "+emp1.getLasttName()+"'s salary is "+ emp1.yearlysalary());
        System.out.println("Employee "+emp2.getFirstName()+" "+emp2.getLasttName()+"'s salary is "+ emp2.yearlysalary());

        emp1.raisSalary(10);
        emp2.raisSalary(10);

        System.out.println("salary after 10% raise:");
        System.out.println("Employee "+emp1.getFirstName()+" "+emp1.getLasttName()+"'s salary is "+ emp1.yearlysalary());
        System.out.println("Employee "+emp2.getFirstName()+" "+emp2.getLasttName()+"'s salary is "+ emp2.yearlysalary());
    }
}