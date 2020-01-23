import java.util.ArrayList;
import java.util.Random;

public class SimpleThread implements Runnable {
    private ArrayList<Integer> randomNumList;

    /**
     * Getter for randomNum Array List
     * @return
     */
    public ArrayList<Integer> getRandomNumList(){
        return randomNumList;
    }

    /**
     * Default constructor.
     * This constructor initialises the ArrayList Object
     */
    public SimpleThread(){
        randomNumList = new ArrayList<>();
    }

    /**
     * Run method generates a random Num
     */
    @Override
    public synchronized void run() {
        Random rand = new Random();
        randomNumList.add(rand.nextInt(101));
        //Prints the last element in the ArrayList
        System.out.println("Random Number: " +  randomNumList.get(randomNumList.size() -1));
    }
}
