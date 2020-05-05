public class Exp9_4 extends Thread {
    public static void main(String args[]) throws InterruptedException {

        Thread Thread1 = new Thread();
        Thread Thread2 = new Thread();
        Thread Thread3 = new Thread();
        Thread Thread4 = new Thread();
        Thread Thread5 = new Thread();

        Thread1.setPriority(5);
        Thread2.setPriority(1);
        Thread3.setPriority(8);
        Thread4.setPriority(6);
        Thread5.setPriority(9);
        Thread1.sleep(200);

        if (Thread1.isAlive())
            System.out.println("Thread 1 is alive");

        else
            System.out.println("Thread 1 is not alive");

        Thread2.start();

        if (Thread2.isAlive())
            System.out.println("Thread 2 is alive");

        else
            System.out.println("Thread 2 is not alive");

        Thread3.sleep(1500);

        if (Thread3.isAlive())
            System.out.println("Thread 3 is alive");

        else
            System.out.println("Thread 3 is not alive");

        Thread3.start();

        if (Thread4.isAlive())
            System.out.println("Thread 4 is alive");

        else
            System.out.println("Thread 4 is not alive");

        Thread5.start();

        if (Thread5.isAlive())
            System.out.println("Thread 5 is alive");

        else
            System.out.println("Thread 5 is not alive");
    }
}