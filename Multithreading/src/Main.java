public class Main {
    public static void main(String[] args) {

        System.out.println("*********Hello Multithreading*******");
//
//        WithRunnable Run =  new WithRunnable();
//
//    try {
//        for(int i = 1 ; i<10 ; i++){
//            System.out.println("Main Thread:" + i);
//            Thread.sleep(1000);
//        }
//    }catch (InterruptedException e){
//        System.out.println(e);
//    }
        System.out.println("*********Hello Multithreading*******");
    testingPriority p1 = new testingPriority();
    p1.setPriority(6);
    testingPriority p2 = new testingPriority();
    p2.setPriority(1);
        System.out.println("The priority assigned to thread t1 is: " +
                + p1.getPriority());
        System.out.println("The priority assigned to thread t2 is: " +
                + p2.getPriority());

        p1.start();
//System.out.println("*********Hello Multithreading*******");
//Synchronization sync = new Synchronization();
//Thread th2 = new Thread(sync);
//Thread th1 = new Thread(sync);
//
//        th1.setName("Thread 1");
//        th2.setName("Thread 2");
//        th2.start();
//        th1.start();







    }
}