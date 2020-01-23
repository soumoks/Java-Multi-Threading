public class ThreadApp {

    public static void main(String [] args) throws InterruptedException {
        int sum = 0;
        for(int i=0;i<5;i++){
            SimpleThread obj = new SimpleThread();
            Thread t = new Thread(obj);
            t.start();
            t.join();
            sum+=obj.getRandomNum();
        }
        System.out.println("Sum of random numbers: " + sum);
    }
}
