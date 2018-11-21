package concert;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Lili implements People {
    private Performance p;

    @Autowired
    public void setP(Performance p){
        this.p=p;
    }
    @Override
    public void doPerform() {
        p.perform();
    }
}
