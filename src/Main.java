public class Main {
    public static void main(String[] args) {
        EvenThread evenThread= new EvenThread();
        OddThread oddThread= new OddThread();
        Thread thread= new Thread(evenThread);
        Thread thread1= new Thread(oddThread);
        thread.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread1.start();
    }
}
