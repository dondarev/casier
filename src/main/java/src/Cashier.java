package src;

import java.util.concurrent.TimeUnit;

public class Cashier {
    String name;
    boolean work;

    public Cashier(String name, boolean work) {
        this.name = name;
        this.work = work;
    }

    public synchronized String collectingAnOrder() throws InterruptedException {
        TimeUnit.SECONDS.sleep((long) (Math.random()*10));
        return "Order number "+(Math.random()*10);
    }

    public synchronized boolean isWork() {
        if (work) {
            int i = (int) (Math.random() * 100);
            work = i%2 == 0;
            return work;
        }else {
            return false;
        }
    }
}