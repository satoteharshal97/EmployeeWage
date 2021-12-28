public class EmployeeWageUC{
	
	public static void main(String[] args) {

	int EMP_WAGE_PER_HOUR = 20;
       	int IS_FULL_TIME = 1;
	int IS_PART_TIME = 2;
	int empHours = 0;
	int empWage = 0;
        double empChecker = (int)Math.floor(Math.random() * 10) % 3;
		
        if(empChecker == IS_FULL_TIME) {
            	empHours = 8;
        }
	else if(empChecker == IS_PART_TIME){
		empHours = 4;
	}
        else {
		empHours = 0;
        }
	empWage = empHours * EMP_WAGE_PER_HOUR;
	System.out.println("Employee Wage: " + empWage);
    }
}