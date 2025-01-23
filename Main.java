package schoolmanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teachers lizzy = new Teachers(1, "Lizzy", 500);
        Teachers melissa = new Teachers(2, "melissa", 700);
        Teachers bush = new Teachers(3, "Bush", 600);

        List<Teachers> teachersList = new ArrayList<>();
        teachersList.add(lizzy);
        teachersList.add(melissa);
        teachersList.add(bush);

        Student tamasha = new Student(1, "tamasha", 4);
        Student master = new Student(2, "master", 12);
        Student rubby = new Student(3, "rubby", 5);

        List<Student> studentList = new ArrayList<>();
        studentList.add(tamasha);
        studentList.add(master);
        studentList.add(rubby);

        School ghs = new School(teachersList, studentList);

        Teachers meagan = new Teachers(4, "Meagan", 900);
        ghs.addTeachers(meagan);

        tamasha.payFees(5000);
        rubby.payFees(6000);
        System.out.println(ghs.getTotalMoneyEarned());

        System.out.println("...GHS PAID TEACHERS");
        lizzy.receiveSalary(lizzy.getSalary());
        bush.receiveSalary(bush.getSalary());
        System.out.println(ghs.getTotalMoneySpent());

        System.out.println(tamasha);


    }
}
