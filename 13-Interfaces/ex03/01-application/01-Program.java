package application;

import model.services.FreeStreamingService;
import model.services.NetflixService;
import model.services.StreamingService;

public class Program {

    public static void main(String[] args) {
        StreamingService free = new FreeStreamingService();
        NetflixService netflix = new NetflixService();
        
        free.play("Breaking Bad");
        System.out.println();
        
        netflix.play("Stranger Things");
        netflix.changeQuality("4K");
        netflix.download("Stranger Things");
    }
}
