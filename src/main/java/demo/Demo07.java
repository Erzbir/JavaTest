/**
 * @Author:HENG
 * @Date:2022/6/24 16:43
 */
public class Demo07 {
    public static void main(String[] args) {
        long totalSeconds = System.currentTimeMillis() / 1000;
        long currentSeconds = totalSeconds % 60;

        long totalMinutes = totalSeconds / 60;
        long currentMinutes = totalMinutes % 60;

        long totalHours = totalMinutes / 60;
        long currentHours = totalHours % 24;

        System.out.println(currentHours + ":" + currentMinutes + ":" + currentSeconds);
    }
}