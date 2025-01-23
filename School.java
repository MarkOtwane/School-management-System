package schoolmanagementsystem;

import java.util.List;

public class School {
    private List<Teachers> teachers;
    private List<Student> student;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;

    public School(List<Teachers> teachers, List<Student> student){
        this.teachers = teachers;
        this.student = student;
        totalMoneyEarned=0;
        totalMoneySpent=0;
    }

    public List<Teachers> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teachers> teachers) {
        this.teachers = teachers;
    }

    public void addTeachers(Teachers teachers){
        teachers.add(teachers);
    }

    public List<Student> getStudent() {
        return student;
    }

    public void addStudent(Student student) {
        student.add(student);
    }

    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    public static void updateTotalMoneyEarned(int moneyEarned) {
        totalMoneyEarned += moneyEarned;
    }

    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    public static void updateTotalMoneySpent(int moneySpent) {
        totalMoneySpent -= moneySpent;
    }
}
