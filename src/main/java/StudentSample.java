public class StudentSample {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.name = "菅原";
        stu.engScore = 89;
        stu.mathScore = 43;

        stu.display();
        System.out.println("平均点は" + stu.getAvg() + "です");
    }
}
