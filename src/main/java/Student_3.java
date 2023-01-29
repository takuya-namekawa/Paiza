public class Student_3 extends Person3{
    private int stuNo;
    public Student_3(String name) {
        this(name, 55);
    }

    public Student_3(String name, int stuNo) {
        super(name);
        this.stuNo = stuNo;
    }
    public void display() {
        super.display();
        System.out.println("学籍番号：" + stuNo);
    }
}
