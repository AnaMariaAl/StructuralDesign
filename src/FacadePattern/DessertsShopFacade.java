package FacadePattern;

public class DessertsShopFacade {
    private VeganDessertsMenu veganDessertsMenu;
    private NonVeganDessertsMenu nonVeganDessertsMenu;

    public DessertsShopFacade() {
        this.veganDessertsMenu = new VeganDessertsMenu();
        this.nonVeganDessertsMenu = new NonVeganDessertsMenu();
    }
    public void showVeganDessertsMenu()
    {
        this.veganDessertsMenu.showMenu();
    }
    public void showNonVeganDessertsMenu ()
    {
        this.nonVeganDessertsMenu.showMenu();
    }
    public void showVegNonVegDessertsMenu()
    {
        this.veganDessertsMenu.showMenu();
        this.nonVeganDessertsMenu.showMenu();
    }
}
