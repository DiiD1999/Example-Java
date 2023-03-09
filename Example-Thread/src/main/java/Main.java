import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Thread thread1 = new ThreadOne();
        thread1.start();

        Thread thread2 = new Thread(new ThreadTwo());
        thread2.start();

        ThreadThree thread3 = new ThreadThree();
        FutureTask<Integer> futureTask = new FutureTask<Integer>(thread3);
        new Thread(futureTask).start();

        Integer sum = futureTask.get();
        System.out.println(sum);


//        Thread.sleep(500);
    }
}
