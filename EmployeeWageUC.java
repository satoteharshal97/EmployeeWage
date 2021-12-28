public class EmployeeWageUC{
	
	public static void main(String[] args) {
        int IS_FULL_TIME = 1;
        double empChecker = (int)Math.floor(Math.random() * 10) % 2;
        if(empChecker == IS_FULL_TIME) {
            System.out.println("Employee is Present");
        }
        else {
            System.out.println("Employee is Absent");
        }

    }
}