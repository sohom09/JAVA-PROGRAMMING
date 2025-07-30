class mydemo extends Thread
{
    public void run()
    {
        try
        {
            System.out.println("Hello World! Thread: "+Thread.currentThread().getId());
        }
        catch(Exception e)
        {
            System.out.println("Error Occurred: "+e);
        }
        finally
        {
            System.out.println("Thread Execution Completed");
        }
    }
    public static void main(String args[])
    {
        for(int i=0;i<=2000;i++)
        {
            mydemo t1 = new mydemo();
            mydemo t2 = new mydemo();
            t1.start();
            t2.start();
        }
    }
}