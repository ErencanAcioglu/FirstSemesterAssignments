
	
		//Erencan Acıoğlu 150122056
		/*
		 * A Factory object represents a factory with employees.
		 * Data field name represents the name of the factory.
		 * Data field employees represents employees working for the factory
		 * Data field storage represents the storage area of the factory.
		 * Data field payrolls represents the payrolls belonging to the employees.
		 * Data field itemPrice represents the price for one item.
		 * 
		 */
				


public class Factory {
   
	private String name;
    private Employee[] employees;
    private Storage storage;
    private Payroll[] payrolls;
    private double itemPrice;

    public Factory(String name, int capacity, double itemPrice) {
        this.name = name;
        this.itemPrice = itemPrice;
        employees = new Employee[0];
        payrolls = new Payroll[0];
        storage = new Storage(capacity);
    
       
    }

    public double getRevenue() {
        int itemCount = storage.getCount();
        return itemCount * itemPrice;
    }


	public double getPaidSalaries() {
        double totalSalaries = 0;
        for (int i = 0; i < payrolls.length; i++) {
            totalSalaries += payrolls[i].calculateSalary();
        }
        return totalSalaries;
    }


    public void addEmployee(Employee employee) {
        Employee[] newArray = new Employee[employees.length + 1];
        for (int i = 0; i < employees.length; i++) {
            newArray[i] = employees[i];
        }
        newArray[employees.length] = employee;
        employees = newArray;
        Item[] items = employee.getItems();
        for (int i = 0; i < items.length; i++) {
            storage.addItem(items[i]);
        }
    }

    public Employee removeEmployee(int id) {
      
        if (employees.length == 0) {
          System.out.println("There are no employees!");
          return null;
        }

     
        boolean found = false;
        int employeeIndex = -1;
        for (int i = 0; i < employees.length; i++) {
          if (employees[i].getId() == id) {
            employeeIndex = i;
            found = true;
            break;
          }
        }

       
        if (!found) {
          System.out.println("Employee does not exist!");
          return null;
        }

   
        Employee removedEmployee = employees[employeeIndex];
        Employee[] newEmployees = new Employee[employees.length - 1];
        int j = 0;
        for (int i = 0; i < employees.length; i++) {
          if (i != employeeIndex) {
            newEmployees[j] = employees[i];
            j++;
          }
        }
        employees = newEmployees;

       
        Payroll payroll = removedEmployee.endShift();
        addPayroll(payroll);

        return removedEmployee;
      }

    private void addPayroll(Payroll payroll) {
        Payroll[] newArray = new Payroll[payrolls.length + 1];
        for (int i = 0; i < payrolls.length; i++) {
            newArray[i] = payrolls[i];
        }
        newArray[payrolls.length] = payroll;
        payrolls = newArray;
    }
    
    public String getName() {
  		return name;
  	}

  	public void setName(String name) {
  		this.name = name;
  	}

  	public Employee[] getEmployees() {
  		return employees;
  	}

  	public void setEmployees(Employee[] employees) {
  		this.employees = employees;
  	}

  	public Storage getStorage() {
  		return storage;
  	}

  	public void setStorage(Storage storage) {
  		this.storage = storage;
  	}

  	public Payroll[] getPayrolls() {
  		return payrolls;
  	}

  	public void setPayrolls(Payroll[] payrolls) {
  		this.payrolls = payrolls;
  	}

  	public double getItemPrice() {
  		return itemPrice;
  	}

  	public void setItemPrice(double itemPrice) {
  		this.itemPrice = itemPrice;
  	}
}
