package soundsystem;

import java.util.ArrayList;
import java.util.List;

public class BlankDisc implements CompactDisc {
    private String title;
    private String artist;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    private List<String> tracks=new ArrayList<>();
    public void setTracks(List<String> tracks) {
        this.tracks = tracks;
    }

    @Override
    public void playTrack(int n) {
        if(n<tracks.size()+1)
            System.out.println("Playing track '"+n+"':"+
                    tracks.get(n-1));
    }
}
