package AdapterPattern;

public class AndroidPhone {
    private AndroidCharger charger;

    public void plugAndroidCharger(AndroidCharger charger) {
        System.out.println("Incărcătorul e conectat la telefonul tau Android");
        this.charger = charger;
    }

    public void charge() {
        System.out.println("Incărcarea telefonului Android");
        this.charger.charge();
    }
}
