public class EmployeeCreator {
    public void CreateEmployee(String employeeName, int employeeId, int salary)throws InvalidEmployeeIdException,InvalidSalaryException{
        if(employeeId < 100000) {
            throw new InvalidEmployeeIdException("Employee Id should be greater than " + 100000);
        }

        if(salary < 10000) {
            throw new InvalidSalaryException("Salary should be greater than 10000");
        }

        System.out.println("I have created a employee with name " + employeeName + " employee id:" + employeeId);
    }
}
