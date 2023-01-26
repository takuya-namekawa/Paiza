import java.util.*;
public class file3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();

        String str1 = S.substring(0,1);
        String str2 = S.substring(3,4);


        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);

        int total = num1 + num2;


        String str3 = S.substring(1,2);

        String str4 = S.substring(2,3);


        int num3 = Integer.parseInt(str3);
        int num4 = Integer.parseInt(str4);
        int total2 = num3 + num4;


        String str5 = String.valueOf(total);
        String str6 = String.valueOf(total2);

        String str7 = str5 + str6;
        System.out.println(str7);




    }
}
