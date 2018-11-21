package concert;

import org.springframework.stereotype.Component;

@Component
public class Dance implements Performance {
    @Override
    public void perform() {
        System.out.println("Dancing!");
    }
}
