package model.services;

public class FreeStreamingService implements StreamingService{
    @Override
    public void play(String title){
        showAds();
        System.out.println("Playing: " + title);
    }
}
