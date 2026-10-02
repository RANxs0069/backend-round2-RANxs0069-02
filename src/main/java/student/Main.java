package student;

public class Main {
    public static void main(String[] args) {
        Student stu1 = new Student("Alice","0901001",99);
        Student stu2 = new Student("Bob","0901002",97);
        Student stu3 = new Student();

        stu1.introduce();
        stu2.introduce();
        stu3.introduce();

        Student stu4 = new GraduateStudent("ran","RANxs0069",100,"牛逼森");

        stu4.introduce();

        GraduateStudent gStu4 = (GraduateStudent) stu4;//需要一个强制类型转换向下转型，才能调用专属子类的方法

        gStu4.research();
    }
}
