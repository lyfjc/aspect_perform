package concert;

import org.aspectj.lang.annotation.*;

@Aspect
public class AudienceConcise {
    @Pointcut("execution(* concert.Performance.perform(..)))")
    public void performance1(){}

    @Before("performance1()")
    public void silenceCellPhones(){
        System.out.println("Silencing cell phones");
    }

    @Before("performance1()")
    public void takeSeats(){
        System.out.println("Taking seats");
    }

    @AfterReturning("performance1())")
    public void applause(){
        System.out.println("CLAP CLAP CLAP!");
    }

    @AfterThrowing("performance1()")
    public void demandRefund(){
        System.out.println("Demand a refund");
    }
}
