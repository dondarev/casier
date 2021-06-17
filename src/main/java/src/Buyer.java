package src;

public class Buyer implements Runnable{
    private Cashier cashir;
    private String name;

    public Buyer(Cashier cashir, String name) {
        this.cashir = cashir;
        this.name = name;
        new Thread(this).start();
    }

    @Override
    public void run() {
       if (cashir.isWork()){
           try {
               String s = cashir.collectingAnOrder();
               System.out.println("Buyer "+name+" taken order "+s+".");
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }else {
           System.out.println("MacDac is close.");
       }
    }
}
