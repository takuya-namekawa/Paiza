public class StuSample_6 {
    public static void main(String[] args) {
        TandF taf = new TandF("陸上競技部");
        Football fb = new Football("サッカー部");

        Student_6 stu1 = new Student_6("田中", taf);
        stu1.display();
        stu1.practice();

        Student_6 stu2 = new Student_6("菅原", fb);
        stu2.display();
        stu2.practice();

    }
}
