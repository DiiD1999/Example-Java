package Adapter;

import java.util.concurrent.Callable;

/**
 * 适配器模式，为实现Callable而没有实现Runnable接口添加适配器
 *
 * @author DiiD
 */
public class RunnableAdapter implements Runnable{
    private Callable<?> callable;

    public RunnableAdapter(Callable<?> callable) {
        this.callable = callable;
    }


    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
        try{
            callable.call();
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
