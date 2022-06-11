package hust.soict.hedspi.aims.media;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc implements Playable{

    private String artist;
    private List<Track> tracks = new ArrayList<Track>();

    public String getArtist() {
        return artist;
    }
    public CompactDisc(String title, String category, float cost, int length, String director) {
        super(title, category, cost, length, director);
    }
    public void addTrack(Track track){
        if (tracks.contains(track)){
            System.out.println("This track is already exists!");
            return;
        }
        System.out.println("Added track successfully!");
        tracks.add(track);
    }

    public void removeTrack(Track track){
        if (tracks.contains(track)){
            tracks.remove(track);
            return;
        }
        System.out.println("This track doesn't existed!");
    }

    public int getLength(){
        int sum = 0;
        for (int i = 0; i < tracks.size(); i++){
            sum += tracks.get(i).getLength();
        }
        return sum;
    }

    @Override
    public void play() {
        for (int i = 0; i < tracks.size(); i++){
            tracks.get(i).play();
        }
    }
}
