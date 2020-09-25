package school_management_system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teachers radha = new Teachers(1,"Radha" ,500);
        Teachers seema = new Teachers(2,"Seema" ,700);
        Teachers ram = new Teachers(3,"Ram" ,600);

        List<Teachers> teachersList =new ArrayList<>();
        teachersList.add(radha);
        teachersList.add(seema);
        teachersList.add(ram);

        student tamasha =new student(1,"Tamasha sharma",4);
        student raksha =new student(2,"Raksha vasudev",12);
        student akhil =new student(3,"Akhil jain",4);

        List<student> studentsList =new ArrayList<>();
        studentsList.add(tamasha);
        studentsList.add(raksha);
        studentsList.add(akhil);

        School wcs = new School(teachersList,studentsList);

        tamasha.payFees(5000);
        raksha.payFees(6000);
        System.out.println("wcs has earned=$" +wcs.getTotalMoneyEarned());

        System.out.println("--------Making WCS PAY SALARY");
        radha.receivesalaries(radha.getSalary());
        System.out.println("wcs has spent for salary to " + radha.getName() +  " and now has $" +wcs.getTotalMoneyEarned());

        ram.receivesalaries(ram.getSalary());
        System.out.println("wcs has spent for salary to " + ram.getName() +  " and now has $" +wcs.getTotalMoneyEarned());

    }
}

