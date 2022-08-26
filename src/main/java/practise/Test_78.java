package practise;

import lombok.Getter;
import org.junit.jupiter.api.Test;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

@Getter
public class Test_78 {

    enum Day{
        SATURDAY, SUNDAY
    }
    public static String name = "子线程";
    public static ThreadLocal<String> threadLocal = new ThreadLocal<>();
    @SafeVarargs
    public static <T> T getMiddle(T... a) {
        return a[a.length / 2];
    }
    // 调用方法时可以把具体类型卸载尖括号中
    public static void main(String[] args) {
        String middle = Test_78.<String>getMiddle("John", "Q", "Public");
        System.out.println(middle);
    }

    private static void printMsg(ThreadLocal<String> threadLocal) {
        System.out.println(Thread.currentThread().getName() + " -----> " + threadLocal.get());
    }


    @Test
    void test() throws InterruptedException {
        // 创建的线程具有延时执行的特点
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(10);
        for (int i = 0; i < 20; i++) {
            // 如果想要将外部的变量传递到匿名内部类中, 可以做成常量
            final int finalI = i;
            // 如果用execute()方法则没有延迟
            // 第一个参数: 需要执行的任务
            // 第二个参数: 延迟时长
            // 第三个参数: 时间单位
            executor.schedule(() -> System.out.println(Thread.currentThread().getName() + "--->" + finalI), 5, TimeUnit.SECONDS);
            TimeUnit.SECONDS.sleep(5);
        }
    }

}



