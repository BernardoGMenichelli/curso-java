package model.services;

public class NetflixService implements AdvancedStreaming, PremiumFeatures {

    @Override
    public void play(String title) {
        System.out.println("Playing: " + title + " on Netflix");
    }

    @Override
    public void changeQuality(String quality) {
        System.out.println("Streaming quality set to: " + quality);
    }

    @Override
    public void download(String title) {
        System.out.println("Downloading: " + title + " from Netflix");
    }

}
