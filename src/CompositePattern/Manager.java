package CompositePattern;

public class Manager extends Employee {
    protected String fullName;
    protected long employeeID;
    protected String position;

    public Manager(String fullName, long employeeID)
    {
        this.fullName = fullName;
        this.employeeID = employeeID;
    }
    @Override
    public void employeeDetails()
    {
        System.out.println("Name:" + fullName + " empID:" + employeeID + " POSITION:Manager");
    }
}

