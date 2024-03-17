package employee.com;

public class EMPAPP {
	public static void main(String[] args) {

		EmployeeCreation ec= new EmployeeCreation();
		Employee e1=ec.createEmployee("jaddu", 8000.00, 8, "ece", "acc");
		Employee e2=ec.createEmployee("rahul", 1000.00, 1, "ece", "acc");
		Employee e3=ec.createEmployee("jaiswal", 55000.00, 0.5, "ece", "acc");
		
		//creating employee database of capacity 10
		EmployeeDB eDB=new EmployeeDB(10);
		
		//storing employee is database
		eDB.addEmployee(e1);
		eDB.addEmployee(e2);
		eDB.addEmployee(e3);
		
		eDB.viewFullDatabase();
		System.out.println("Total Employee: "+eDB.getEmployeeCount());
		
		eDB.viewFullDatabase();
		
		System.out.println();
		Employee e=eDB.searchEmployee(1002);
		System.out.println(e.getId()+" "+e.getName());
		eDB.updateSalary(1003, 5000.00);
		eDB.viewFullDatabase();
		eDB.deleteEmployee(1001);
		eDB.viewFullDatabase();
		System.out.println("Total Employee: "+eDB.getEmployeeCount());
				}

}
