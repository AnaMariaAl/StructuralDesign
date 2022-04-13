package CompositePattern;

public class Developer extends Employee{
    protected String fullName;
    protected long employeeID;
    protected String position;

    public Developer(String fullName, long employeeID)
    {
        this.fullName = fullName;
        this.employeeID = employeeID;
    }
    @Override
    public void employeeDetails()
    {
        System.out.println("Numele:" + fullName + " ID:" + employeeID + " POSITION :Developer");
    }
}

