import java.util.*;

public class file2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String S = sc.next();

        if (S.contains(a)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
