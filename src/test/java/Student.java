import java.util.ArrayList;

public class Student {
    public ArrayList<Integer> grades;
    private long studentId;
    private String name;

    public Student(){
        this.grades = new ArrayList<>();
    }
    public Student(long id){
        this.studentId = id;
    }
    public Student(long id, String name){
        this.name = name;
        this.studentId = id;
        this.grades = new ArrayList<>();
    }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double getGradeAverage() {
        double total = 0;
        for(int grade : grades ){
            total+= grade;
        }
        return total/grades.size();
    }
}
