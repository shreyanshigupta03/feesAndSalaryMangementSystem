package school_management_system;

public class Teachers {
    /**
     * This class is responsible for keeping track
     * of teachers name ,id ,salary.
     */

    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    /**
     * Creates a new Teacher objects.
     * @param id id for the teacher.
     * @param name name of the teacher.
     * @param salary salary of the teacher.
     */
    public Teachers(int id,String name,int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.salaryEarned=0;
    }

    /**
     *
     * @return id of the teacher
     */
    public int getId(){
        return id;
    }
    /**
     *
     * @return name of the teacher
     */

    public String getName(){
        return this.name;

    }
    /**
     *
     * @return salary of the teacher
     */
    public int getSalary(){
        return salary;
    }

    /**
     * set the slary.
     * @param salary
     */

    public void setSalary(int salary){
        this.salary=salary;
    }

    /**
     * A.dds to salary.
     * Removes from the total money earned by the school.
     * @param salary
     */
    public void receivesalaries(int salary){
        salaryEarned+=salary;
        School.updateTotalMoneySpent(salary);

    }

}
