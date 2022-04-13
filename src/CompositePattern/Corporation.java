package CompositePattern;

public class Corporation {
    public static void main(String[] args) {
        Employee employee1 = new Developer("Osipciuc Ion", 100);
        Employee employee2 = new Developer("Alcaza Ana-Maria", 200);
        Employee employee3 = new Developer("Botnaru Alexandru", 300);
        Employee employee4 = new Manager("Toma Cezar", 400);

        CorporationDetails corporationDetails = new CorporationDetails("Google");
        corporationDetails.showCorporationName();
        corporationDetails.addEmployee(employee4);
        corporationDetails.addEmployee(employee1);
        corporationDetails.addEmployee(employee2);
        corporationDetails.addEmployee(employee3);

        corporationDetails.employeeDetails();

    }
}