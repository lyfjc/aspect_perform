package soundsystem;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import java.util.HashMap;
import java.util.Map;

@Aspect
public class TrackCounter {
    private Map<Integer,Integer> trackCounts=
            new HashMap<>();
    @Pointcut("execution(* soundsystem.CompactDisc.playTrack(int))"+
    "&& args(trackNumber1)")
    public void trackPlayed(int trackNumber1){}

    @Before("trackPlayed(trackNumber2)")
    public void countTrack(int trackNumber2){
        int currentCount=getPlayCount(trackNumber2);
        trackCounts.put(trackNumber2,currentCount+1);
    }

    public int getPlayCount(int trackNumber){
        return trackCounts.containsKey(trackNumber)
                ?trackCounts.get(trackNumber):0;
    }
}
