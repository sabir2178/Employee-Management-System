package employee.com;

public class EmployeeCreation {
private static int randnum=1001;
	
	public Employee createEmployee(String name,double salary,double exp,String designation,String compname) {
		Employee e= new Employee(randnum++, name, salary, exp, designation, compname);
		return e;
	}
}


