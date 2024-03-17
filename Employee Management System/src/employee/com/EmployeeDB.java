package employee.com;

public class EmployeeDB {
	private Employee[] emparr;
	private int index=0;
	private int empCount=0;
	
	EmployeeDB(int size){
		emparr=new Employee[size];
	}
	/**
	 * this method is used to add Employee details into the Database.
	 * @param e should be Employee type
	 * @return Returns true if added successfully, else return false
	 */
	public boolean addEmployee(Employee e) {
		if(index<emparr.length) {
			emparr[index++]=e;
			System.out.println("Employee deatils added to DB");
			empCount++;
			return true;
		}
		else {
			System.out.println("Database is full");
			return false;
		}
	}
	/**
	 * this method prints all the details of the employee
	 */
	public void viewFullDatabase() {
		System.out.println("--------------------------------------------------");
		System.out.println("ID\tName\tSalary\tExp\tDesignation\tCompany name");
		System.out.println("--------------------------------------------------");
		for(Employee emp:emparr) {
			if(emp!=null) {
				System.out.println(emp.getId()+"\t"+emp.getName()+"\t"+emp.getSalary()+"\t"+emp.getExp()+"\t"+emp.getDesignation()+"\t"+emp.getCompname());
			}
		}
	}
	/**
	 * this method used to get total Employee in Database
	 * @return int value representing total Employees
	 */
	public int getEmployeeCount(){
		return empCount;
	}
	/**
	 * this method is used to search employee based on id,
	 * @param id of the employee to be searched
	 * @return return reference to found employee otherwise return null
	 */
	public Employee searchEmployee(int id) {
		Employee e=null;
		for(int i=0;i<emparr.length;i++) {
			if(emparr[i]!=null&&emparr[i].getId()==id) {
				System.out.println("Employee found in database");
				e=emparr[i];
			}
		}
		if(e==null) {
			System.out.println("Employee is not found in database");
		}
		return e;
	}
	/**
	 * this method is used to update the salary of the employee. if employee is found in
	 * database it will update salary of the employee by the specified amount
	 * @param id -employee id whose salary to be updated
	 * @param amount-amount to be added to salary
	 * @return true-if update is success
	 *         false-if update is failed
	 */
	public boolean updateSalary(int id,double amount) {
		Employee e=searchEmployee(id);
		if(e!=null) {
			e.setSalary(e.getSalary()+amount);
			System.out.println("Salary Updated");
			return true;
		}
		else {
			System.out.println("unable to update, check your Employee ID");
			return false;
		}
	}
	/**
	 * this method is used to delete employee details from database.
	 * it deletes the complete employee details if the records found in database.
	 * @param id of the employee to be deleted
	 * @return true-if employee is success
	 *         false- if employee is failed
	 */
	public boolean deleteEmployee(int id) {
		boolean isDelete=false;
		for(int i=0;i<emparr.length;i++) {
			if(emparr[i]!=null && emparr[i].getId()==id) {
				System.out.println("Employee found in database and deleted");
				emparr[i]=null;
				isDelete=true;
				empCount--;
				//index--;
			}
		}
		if(isDelete==false) {
			System.out.println("Employee not found in database");
		}
		return isDelete;
	}

}
