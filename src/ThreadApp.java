import java.util.ArrayList;

public class ThreadApp {
    public static void main(String [] args) throws InterruptedException {
        int sum = 0;
        SimpleThread obj = new SimpleThread();
        for(int i=0;i<5;i++){
            Thread t = new Thread(obj);
            t.start();
            t.join();
        }
        /*
        Generate the sum present in the SimpleThread ArrayList.
         */
        for(Integer temp: obj.getRandomNumList()){
            sum+=temp;
        }
        System.out.println("Sum of random numbers: " + sum);
    }
}
