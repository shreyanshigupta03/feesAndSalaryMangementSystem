package school_management_system;
import java.util.ArrayList;
import java.util.List;

/**
 * Many teachers,student.
 * Implements teachers and student
 * using ArrayList.
 * money spent counts salary of teachers only.
 */

public class School {


    private List<Teachers> teachers;
    private List<student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;

    /**
     * new school object is created.
     * @param teachers list of teachers in the school.
     * @param students list of students in the school.
     */

    public School(List<Teachers> teachers, List<student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned=0;
        totalMoneySpent=0;
    }

    /**
     *
     * @return the lis of teachers in the school.
     */

    public List<Teachers> getTeachers() {
        return teachers;
    }

    /**
     *Add a teacher to the school.
     * @param  teacher the teacher to be added.
     */

    public void addTeachers(Teachers teacher) {
        teachers.add(teacher);

    }

    /**
     *
     * @return the list of students in the school.
     */

    public List<student> getStudents() {
        return students;
    }

    /**
     *Add a student to the school.
     * @param student the student to be added
     */

    public void addStudents(student student) {
       students.add(student);
    }

    /**
     *
     * @return the total money earned by the school.
     */

    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    /**
     *Add the total money earned by the school.
     * @param MoneyEarned money that is suppposed to be added.
     */

    public static void updateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned += MoneyEarned;
    }

    /**
     *
     * @return the total money spent on salary of teacher.
     */

    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    /**
     * update the money that is spent by school which
     * is salary given by the schoolto its teachers.
     * @param MoneySpent the money spent by school.
     */

    public static void updateTotalMoneySpent(int MoneySpent) {

        totalMoneyEarned-=MoneySpent;
    }
}
