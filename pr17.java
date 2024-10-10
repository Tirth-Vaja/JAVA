import java.util.*;

class p17
{
    public static void main(String[] args)
    {
        child ch = new child();
        parent pa = new parent();
        ch.disp();
        ch.dis();
    }
}

class child extends parent
{
    void dis()
    {
        System.out.println("this is child class");
    }
}

class parent
{
    void disp()
    {
        System.out.println("this is parent class");
    }
}