package AdapterPattern;

public class AdapterPatternMain {
    public static void main(String[] args) {

        ApplePhone applePhone = new ApplePhone();
        AndroidCharger androidCharger = new AndroidCharger();
        System.out.println("Avem un telefon Apple și un încărcător Android !");

        AppleCharger androidChargerAdapterForApple = new AndroidChargerAdapterForApple(androidCharger); //Adapter Pattern
        System.out.println("Am creat un încărcător Apple convertind  un încărcător Android");
        applePhone.plugAppleCharger(androidChargerAdapterForApple);
        applePhone.charge();
    }
}