package src;

public class Main {
    public static void main(String[] args) {
        Cashier cashir =new Cashier("Denis",true);
        new Buyer(cashir,"A");
        new Buyer(cashir,"B");
        new Buyer(cashir,"C");
        new Buyer(cashir,"D");
        new Buyer(cashir,"I");
    }
}
