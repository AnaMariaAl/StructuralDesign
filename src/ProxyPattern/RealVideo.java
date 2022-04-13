package ProxyPattern;

public class RealVideo implements Video {
    private String fileName;

    public RealVideo(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println("Se afiseaza" + fileName);
    }

    private void loadFromDisk(String fileName) {
        System.out.println("Se incarca " + fileName);

    }
}
