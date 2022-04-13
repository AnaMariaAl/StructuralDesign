package ProxyPattern;

public class MainProxyPattern {
    public static void main(String[] args) {
        Video video = new ProxyVideo("tutorial.CumFaciBors.mp4");

        //Video va fi încarcat de pe disc
        video.display();
        System.out.println("");

        //Video nu va fi încarcat de pe disc
        video.display();
    }
}
