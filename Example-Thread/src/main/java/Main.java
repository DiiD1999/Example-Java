import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Thread thread1 = new ThreadOne();
        // 将子线程设置为守护线程, 使得主线程在退出的时候，JVM会关闭所有守护线程
        // 如果setDaemon在start后，会出现IllegalThreadStateException错误
        thread1.setDaemon(true);
        thread1.start();

        Thread thread2 = new Thread(new ThreadTwo());
        // 设置为守护线程
        thread2.setDaemon(true);
        thread2.start();

        //todo 实现Callable的线程时守护线程吗?
        ThreadThree thread3 = new ThreadThree();
        FutureTask<Integer> futureTask = new FutureTask<Integer>(thread3);
        new Thread(futureTask).start();

        Integer sum = futureTask.get();
        System.out.println(sum);


        Thread.sleep(500);
    }
}
