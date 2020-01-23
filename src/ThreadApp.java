import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadApp {
    //Max number of threads in thread pool
    static final int MAX_T = 5;
    public static void main(String [] args) throws InterruptedException {
        int sum = 0;
        SimpleThread obj = new SimpleThread();
        ExecutorService pool = Executors.newFixedThreadPool(MAX_T);
        for(int i=0;i<5;i++){
            pool.execute(obj);
        }
        pool.shutdown();
        /*
        https://stackoverflow.com/questions/20495414/thread-join-equivalent-in-executor
        Await termination of all threads before further compute.
        Requires import java.util.concurrent.TimeUnit;
         */
        while (!pool.awaitTermination(24L, TimeUnit.HOURS)) {
            System.out.println("Not yet. Still waiting for termination");
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
