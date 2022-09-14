public class MainThing implements Runnable {

    private int threadNumber;
    public MainThing (int threadNumber) {
        this.threadNumber = threadNumber;
    }



    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println(i + " from thread " + threadNumber);
            if (threadNumber == 3){
                throw new RuntimeException();
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}