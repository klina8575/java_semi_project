package studentInfo.project.school;

import java.util.ArrayList;

public class Subject {
    private String subjectName; //과목명
    private int subjectId; //과목코드
    private int gradeType; //학점 평가 정책(필수과목, 일반과목)
    private ArrayList<Student> studentList = new ArrayList<>(); //과목을 수강신청한 학생 리스트

    public Subject(String subjectName, int subjectId) {
        this.subjectName = subjectName;
        this.subjectId = subjectId;
        //this.gradeType = gradeType;
    }

    //수강신청
    public void register(Student student) {
        studentList.add(student);
    }

    //getter, setter

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public int getGradeType() {
        return gradeType;
    }

    public void setGradeType(int gradeType) {
        this.gradeType = gradeType;
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }
}
