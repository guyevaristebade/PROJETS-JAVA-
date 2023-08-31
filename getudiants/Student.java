import java.util.List;

public class Student {

    private String studentName;
    private String studentCourse;
    private int studentNote;


    public Student(String studentName, String studentCourse, int studentNote){
        this.studentName = studentName;
        this.studentCourse = studentCourse;
        this.studentNote = studentNote;
    }


    public String getStudentName(){
        return studentName;
    }

    public String getStudentCourse(){
        return studentCourse;
    }

    public int getStudentNote(){
        return studentNote;
    }


}
