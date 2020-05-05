
class multiThreads implements Runnable
{
	public void run()  
	{
		System.out.println("Multi Thread Class");
	}
}
public class Exp9_1 {

	public static void main(String[] args) {
	multiThreads m = new multiThreads();
	Thread t1 = new Thread(m);
    t1.start();
	}
}