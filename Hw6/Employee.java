

		//Erencan Acıoğlu 150122056
		
		/*
		 * An Employee object represents an employee working for the factory.
		 * Data field id keeps the id number of the Employee object created.
		 * Data fields name and surname keeps the name and the surname of the employee, respectively.
		 * Data field workHour keeps the number of hours an employee will work.
		 * Data field speed keeps the number of items that the employee can produce in an hour.
		 * Data field items array holds the items produced by the employee.
		 * Data field payroll keeps the payroll of the employee.
		 * 
		 */

public class Employee {
    private int id;
    private String name;
    private String surname;
    private int workHour;
    private int speed;
    private Item[] items;
    private Payroll payroll;

    public Employee(int id, String name, String surname, int workHour, int speed) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.workHour = workHour;
        this.speed = speed;
        items = new Item[workHour*speed];
        startShift();
        payroll = endShift();
        
    }
    
	public Item[] startShift() {
        for (int i = 0; i < items.length; i++) {
            int id = (int) (Math.random() * 100 + 1);
            items[i] = new Item(id);
        }
        return items;
    }


    public Payroll endShift() {
        int itemCount = items.length;
        Payroll payroll = new Payroll(workHour, itemCount);
        this.payroll = payroll;
        return payroll;
    }
    public String toString() {
        return "This is the employee with id " + id + " speed " + speed + ". " + payroll;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getWorkHour() {
        return workHour;
    }

    public void setWorkHour(int workHour) {
        this.workHour = workHour;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public Item[] getItems() {
        return items;
    }
    public void setItems(Item[] items) {
        this.items = items;
    }
    
    public Payroll getPayroll() {
		return payroll;
	}

	public void setPayroll(Payroll payroll) {
		this.payroll = payroll;
	}

 
}
