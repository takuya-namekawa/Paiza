public class Taxi1 extends Car_1{
    private int price;

    public void start() {
        price = 420;
    }
    public void run() {
        price += 80;
    }
    public void display() {

        System.out.println("値段：" +   price);
    }
}
