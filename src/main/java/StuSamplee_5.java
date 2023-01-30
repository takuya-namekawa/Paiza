public class StuSamplee_5 {
    public static void main(String[] args) {
        Student_5  stu = new Student_5("武田", 323);
        Person5 psn = stu;
        psn.display();

        //捕捉：　instanceof クラス名
        //オブジェクトのクラスを特定する
        //対象オブジェクト　instanceof クラス名

        if (psn instanceof Student_5) {
            Student_5 stu2 = (Student_5)psn;
            stu2.chgStuNo(4848);
            stu2.display();
        }

    }
}
