package school_management_system;

/**
 * This class is responsible for keeping the track of students fees
 * ,name,grade
 */

public class student {

  private  int id;
  private String name;
  private int grade;
  private int fees_paid;
  private int fees_total;

    /**
     * to create a new student by intializing.
     * Fees for every student going is $30,000.
     * Fees paid intially is 0.
     * @param id id for  student.
     * @param name name of student.
     * @param grade grade of student.
     */

  public student(int id,String name, int grade){
       this.fees_paid=0;
       this.fees_total=30000;
       this.id=id;
       this.name=name;
       this.grade=grade;

  }
    //Not going to alter student's name & id.

    /**
     * used to update the student's grade.
     * @param grade new grade of the student.
     */

    public void setGrade(int grade){
      this.grade=grade;


    }

    /**
     *keep adding the fees to fees_paid field.
     * Add the fees to the feed_paid
     * This school is going to receive funds.
     * @param fees the fees that the student pays.
     */
    public void payFees(int fees){
        fees_paid += fees;
        School.updateTotalMoneyEarned(fees_paid);

    }

    /**
     *
     * @return id of student
     */

   public int getId(){
        return id;
   }

    /**
     *
     * @return name of the student
     */

   public String getName(){
        return name;
   }

    /**
     *
     * @return grade of the student.
     */

   public int getGrade(){
        return grade;

   }

    /**
     *
     * @return fees paid by the student
     */

   public int getFees_paid(){
        return fees_paid;
   }

    /**
     *
     * @return the total fees of the student.
     */

    public int getFees_total() {
        return fees_total;
    }

    /**
     *
     * @return the remaining fees.
     */

    public int getRemainedFees(){
      return  fees_total-fees_paid;
    }

}
