public class WithRunnable implements Runnable{

    public WithRunnable(){
        Thread t1 = new Thread(this,"child");
        t1.start();
    }


    @Override
    public void run() {
        try {
            for (int i = 1; i < 10; i++) {
                System.out.println("Child Thread:" + i );
                Thread.sleep(600);
            }
        }catch (InterruptedException e){
            System.out.println("Child Interrupted!!!");
        }

    }
}
