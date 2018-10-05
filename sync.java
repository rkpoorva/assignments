class threads extends Thread 
{
  public synchronized void print()
  {
    for(int i=1;i<=500;i++)
    {
      System.out.println(i);
    }
  }
   public synchronized void print1()
  {
    for(int i=501;i<=1000;i++)
    {
      System.out.println(i);
    }
  }
  public void run()
  {
    print();
    print1();
  }
  public static void main(String args[])
  {
    threads m = new threads();
    m.start();
  }
}