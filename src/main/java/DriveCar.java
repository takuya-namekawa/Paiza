public class DriveCar {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.no = 2525;
        c1.speed = 30;
        System.out.println("ナンバーは" + c1.no + "車の速さは" + c1.speed + "です");
        c1.stop();
        System.out.println("ナンバーは" + c1.no + "車の速さは" + c1.speed + "です");
    }
}
