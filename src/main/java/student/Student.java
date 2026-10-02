package student;

public class Student {
    private String name;
    private String studentID;
    private int score;

    public Student(String name, String studentID, int score) {
        this.name = name;
        this.studentID = studentID;
        this.score = score;
    }//定义有参构造方法，传入参数初始化对象

    public Student(){
    }//必须显式写出无参构造方法，初始化对象为java默认值

    public String getName() {
        return name;
    }
    public String getStudentID() {
        return studentID;
    }
    public int getScore() {
        return score;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }
    public void setScore(int score) {
        if(score >= 0 && score <= 100){
            this.score = score;
        }else{
            return;
        }//给setScore做一个检验，不合法则不予修改
    }

    public void introduce(){
        System.out.println("My name is " + this.name + ",my id is " + this.studentID + ",my score is " + this.score);
    }

}
