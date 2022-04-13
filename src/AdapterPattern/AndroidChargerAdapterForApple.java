package AdapterPattern;

public class AndroidChargerAdapterForApple  extends AppleCharger{
    private final AndroidCharger androidCharger;

    public AndroidChargerAdapterForApple (AndroidCharger androidCharger) {

        this.androidCharger = androidCharger;
    }

    @Override
    public void charge() {
        System.out.println("Utilizați un adaptor android pentru a incarca iphone-ul");
        androidCharger.charge(); // Aici incărcătorul Android nu știe că încarcă un dispozitiv Apple.
    }
}
