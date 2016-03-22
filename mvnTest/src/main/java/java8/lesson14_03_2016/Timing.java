package java8.lesson14_03_2016;

/**
 * Created by Acer s3 on 15.03.2016.
 */
public class Timing {

    interface Op {
        void runOp();
    }

    public static long time(Op operation) {
        long start = System.currentTimeMillis();
        operation.runOp();
        long stop = System.currentTimeMillis();
        return (stop - start);
    }

    public static void main(String[] args) {
        long elapsed = time(Timing::sortBigArray);
        System.out.println(elapsed);
    }

    private static void sortBigArray() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
