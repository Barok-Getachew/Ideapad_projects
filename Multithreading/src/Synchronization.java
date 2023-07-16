public class Synchronization implements  Runnable{

    int counter = 1 ;
    @Override
    public void run() {
        synchronized (this){
            Thread tr = Thread.currentThread();
            String th_name = tr.getName();
            System.out.println("Thread " + th_name + " is alloted " + counter);
            counter++;
        }

    }
}
