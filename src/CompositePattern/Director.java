package CompositePattern;

import java.util.ArrayList;
import java.util.List;

public class Director extends Employee {
    private  List<Employee> employeeList;

    public Director()
    {
        employeeList = new ArrayList<>();
    }
    @Override
    public void employeeDetails()
    {
        for (Employee employee : employeeList)
        {
            employee.employeeDetails();
        }
    }
    public void addEmployee(Employee employee)
    {
        employeeList.add(employee);
    }
}
