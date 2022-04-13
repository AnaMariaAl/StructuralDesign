package AdapterPattern;

public class ApplePhone {
    private AppleCharger charger;

    public void plugAppleCharger(AppleCharger charger) {
        System.out.println("Incărcătorul e conectat la telefonul tau Apple");
        this.charger = charger;
    }

    public void charge() {
        System.out.println("Incărcarea telefonului Apple");
        this.charger.charge();
    }
}
