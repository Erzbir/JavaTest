package demo;

import java.util.Date;

import static java.lang.Thread.sleep;

public class Demo104 {
    public static void main(String[] args) {
        StopWatch watch = new StopWatch();
        try {
            sleep(12);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        watch.stop();
        System.out.println(watch.getElapsedTime());
    }
}

class StopWatch {
    private final long startTime;
    private long endTime;


    public StopWatch() {
        this.startTime = new Date().getTime();
    }

    public void stop() {
        this.endTime = new Date().getTime();
    }

    public long getElapsedTime() {
        return this.endTime - this.startTime;
    }
}