package config;

import concert.Audience;
import concert.AudienceAround;
import concert.AudienceConcise;
import concert.Performance;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackageClasses = Performance.class)
public class ConcertConfig {
    /*@Bean
    public AudienceConcise audience(){
        return new AudienceConcise();
    }*/
    /*@Bean
    public Audience audience(){
        return new Audience();
    }*/
    @Bean
    public AudienceAround audience(){
        return new AudienceAround();
    }
}
