import java.util.*;
class member
{
    String name, age, phone_number, address, salary;
    void print_salary()
    {
        System.out.println(salary);
    }
}

class emp extends member
{
    String specialization;
    emp(String name,String age,String phone_number,String address,String salary,String specialization)
    {
        this.name = name;
        this.age = age;
        this.phone_number = phone_number;
        this.address = address;
        this.salary = salary;
        this.specialization = specialization;
    }
}

class manager extends member
{
    String department;
    manager(String name,String age,String phone_number,String address,String salary,String department)
    {
        this.name = name;
        this.age = age;
        this.phone_number = phone_number;
        this.address = address;
        this.salary = salary;
        this.department = department;
    }
}

class pr18
{
    public static void main(String[] args) {
        emp em = new emp("joe", "23", "5465468645","vadodara","2000000","backend");
        manager mg = new manager("saul","33" , "4563139766","vadodara","40000000","frontend");
        em.print_salary();
        mg.print_salary();
    }
}