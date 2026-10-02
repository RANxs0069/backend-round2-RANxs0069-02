package student;

public class GraduateStudent extends Student {
    private String advisor;

    public GraduateStudent(String name, String studentID, int score,String advisor) {
        super(name, studentID, score);//super调用父类构造方法
        this.advisor = advisor;
    }
    public String getAdvisor() {
        return advisor;
    }
    public void setAdvisor(String advisor) {
        this.advisor = advisor;
    }

    @Override
    public void introduce(){
        System.out.println("My name is " + getName() + ",my id is " + getStudentID() + ",my score is " + getScore() + ",my advisor is " + this.advisor);
    }//父类private的属性不可直接读写，要通过public的方法访问

    public void research() {
        System.out.println("我在做科研");
    }
}
