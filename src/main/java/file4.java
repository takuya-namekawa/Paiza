import java.util.*;
public class file4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] sArray = s.split("");

        String a = Integer.toString(Integer.parseInt(sArray[0]) + Integer.parseInt(sArray[3]));
        String b = Integer.toString(Integer.parseInt(sArray[2]) + Integer.parseInt(sArray[3]));

        System.out.println(a + b);
    }
}
