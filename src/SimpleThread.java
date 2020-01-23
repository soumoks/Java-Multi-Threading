import java.util.Random;

public class SimpleThread implements Runnable {
    private int randomNum;

    /**
     * Getter for the randomNum member field
     * @return
     */
    public int getRandomNum(){
        return randomNum;
    }

    /**
     * Run method generates a random Num
     */
    @Override
    public void run() {
        Random rand = new Random();
        randomNum = rand.nextInt(101);
        System.out.println("Random Number: " +  randomNum);
    }
}
