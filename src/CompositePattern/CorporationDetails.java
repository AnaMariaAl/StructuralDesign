package CompositePattern;

public class CorporationDetails extends Director{
    private String corporationName;

    public CorporationDetails(String CorporationName)
    {
        this.corporationName = CorporationName;
    }
    public void showCorporationName()
    {
        System.out.println(this.corporationName);
    }
}

