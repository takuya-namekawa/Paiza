public class Student3 {
    String name;
    int engScore;
    int mathScore;

    Student3(String n, int e, int m) {
        name = n;
        engScore = e;
        mathScore = m;
    }
    void display() {
        System.out.println(name + "さんの点数です。英語の点数は" + engScore + "数学の点数は" + mathScore + "でした！！");
    }
}
