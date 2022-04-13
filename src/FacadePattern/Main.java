package FacadePattern;

public class Main {
    public static void main(String[] args) {
        DessertsShopFacade dessertsShop = new DessertsShopFacade();

        System.out.println("Vegan Menu");
        dessertsShop.showVeganDessertsMenu();

        System.out.println("---------------------");

        System.out.println("Non Vegan Menu");
        dessertsShop.showNonVeganDessertsMenu();

        System.out.println("----------------------");
        System.out.println("Vegan & Non Vegan Menu");
        dessertsShop.showVegNonVegDessertsMenu();
    }
}
