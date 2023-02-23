import Adapter.RunnableAdapter;
import Adapter.Task;
import org.junit.Test;

import java.util.concurrent.Callable;

public class TaskTest {

    @Test
    public void test() throws InterruptedException {
        Callable<Long> callable = new Task(123450000L);
        Thread thread = new Thread(new RunnableAdapter(callable));
        thread.start();
        // 阻塞主线程1000，防止主线程先于子线程结束，导致没有结果返回
        Thread.sleep(1000);
    }
}
