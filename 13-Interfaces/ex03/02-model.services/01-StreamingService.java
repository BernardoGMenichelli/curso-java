package model.services;

public interface StreamingService {

    void play(String title);
    
    default void showAds() {
        System.out.println("Showing ads before the content...");
    }
}
