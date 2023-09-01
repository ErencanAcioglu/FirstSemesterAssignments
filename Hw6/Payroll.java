

//Erencan Acıoğlu 150122056
/*
 * Payroll object represents the payroll of the employees.
 * Data field workHour keeps the number of hours an employee has worked.
 * Data field itemCount keeps the number of items an employee has produced.
 * 
 */

public class Payroll {
	private int workHour;
    private int itemCount;

    public Payroll(int workHour, int itemCount) {
        this.workHour = workHour;
        this.itemCount = itemCount;
    }
    /*
     * calculateSalary() method calculates salary of the employee according to the number of hours an employee has worked
     * and the number of items s/he produced. 
     * For each hour an employee works, s/he earns 30 liras and for each item s/he produces s/he additionally earns 20 liras.
     */
    public int calculateSalary() {
        return workHour * 30 + itemCount *20;
    }
    
      //toString()method returns a String containing information about the work hour and the item count of the payroll.
    public String toString() {
        return "The work hour is " + workHour + " and the produced item count is " + itemCount + ".";
    }

    public int getWorkHour() {
        return workHour;
    }

    public void setWorkHour(int workHour) {
        this.workHour = workHour;
    }

    public int getItemCount() {
        return itemCount;
    }

    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }

     
}
