import java.util.concurrent.Callable;

/**
 * 通过实现Callable<>实现多线程
 * @author DiiD
 */
public class ThreadThree implements Callable<Integer> {
    /**
     * Computes a result, or throws an exception if unable to do so.
     *
     * @return computed result
     * @throws Exception if unable to compute a result
     */
    public Integer call() throws Exception {
        System.out.println(Thread.currentThread().getName() + " ThreadThree");
        return 1;
    }
}
