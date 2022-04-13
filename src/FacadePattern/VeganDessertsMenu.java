package FacadePattern;

public class VeganDessertsMenu implements Menu{
    @Override
    public void showMenu() {
        System.out.println("Pistachio Oat Squares");
        System.out.println("Banana Bread");
        System.out.println("Apple Oatmeal Cookies");
    }
}
