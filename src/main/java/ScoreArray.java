public class ScoreArray {
    public static void main(String[] args) {
        int[] data = new int[4];

        data[0] = 90;
        data[1] = 80;
        data[2] = 100;
        data[3] = 90;

        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }

        System.out.println("-----");
        for (int array : data) {
            System.out.println(array);
        }
    }
}
