import concert.Lili;
import config.ConcertConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = ConcertConfig.class)
@ContextConfiguration("/aspect.xml")
public class PerformTest {
    @Autowired
    private Lili lili;
    @Test
    public void audience(){
        lili.doPerform();
    }
}
