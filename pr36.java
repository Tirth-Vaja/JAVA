public class Priority extends Thread
{
    public static void main(String[] args) {
      Priority t1 = new Priority();
      Priority t2 = new Priority();
      Priority t3 = new Priority();

      System.out.println("Current Priorities Of Threads:");
      System.out.println("Priority of Thread-1 : "+t1.getPriority());
      System.out.println("Priority of Thread-2 : "+t2.getPriority());
      System.out.println("Priority of Thread-3 : "+t3.getPriority());
      System.out.println();
      System.out.println();

      t1.setPriority(3);
      t2.setPriority(5);
      t3.setPriority(7);

      System.out.println("Priorities Of Threads After Setting New Priorities:");
      System.out.println("Priority of Thread-1 : "+t1.getPriority());
      System.out.println("Priority of Thread-2 : "+t2.getPriority());
      System.out.println("Priority of Thread-3 : "+t3.getPriority());
      System.out.println();
      System.out.println();

      System.out.println("Priority of Main Thread : "+Thread.currentThread().getPriority());
    }
}
