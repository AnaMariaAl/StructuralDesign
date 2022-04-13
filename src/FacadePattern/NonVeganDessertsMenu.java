package FacadePattern;

public class NonVeganDessertsMenu implements Menu{
    @Override
    public void showMenu() {
        System.out.println("Crème Brûlée");
        System.out.println("Cheesecake");
        System.out.println("Profiteroles");
    }
}
