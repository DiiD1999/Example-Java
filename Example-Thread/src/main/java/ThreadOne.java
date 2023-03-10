/**
 * 通过继承的方式实现多线程
 *
 * @author DiiD
 */
public class ThreadOne extends  Thread {

    @Override
    public void run() {
        try{
            Thread.sleep(500);
        }catch (Exception e) {
            e.printStackTrace();
        }

        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            if (i == Integer.MAX_VALUE >> 4) {
                // 测试主线程存在，子线程是否还存在。事实证明还存在
                System.out.println(i);
                break;
            }
        }
        System.out.println(Thread.currentThread().getName() + " ThreadOne");
    }
}
