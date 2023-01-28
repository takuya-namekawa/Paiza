public class StuSample2 {
    public static void main(String[] args) {
        Student2 stu = new Student2();
        Student2 stu2 = new Student2();
        Student2 stu3 = new Student2();
        stu3.setData("青山");
        stu3.display();
        stu.setData("北田",67, 55);
        stu2.display();
        stu2.setScore(88,99);


        stu.display();
    }
}
