package soundsystem;

import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.util.ArrayList;
import java.util.List;

@Configuration
@EnableAspectJAutoProxy
public class TrackCounterConfig {

    @Bean
    public CompactDisc sgtPeppers(){
        BlankDisc cd=new BlankDisc();
        cd.setTitle("Sgt......Title");
        cd.setArtist("Sgt.....Artist");
        List<String> tracks=new ArrayList<>();
        tracks.add("sgt track1");
        tracks.add("sgt track2");
        tracks.add("sgt track3");
        tracks.add("sgt track4");
        tracks.add("sgt track5");
        tracks.add("sgt track6");

        cd.setTracks(tracks);
        return cd;
    }

    @Bean
    public TrackCounter trackCounter(){
        return new TrackCounter();
    }
}
