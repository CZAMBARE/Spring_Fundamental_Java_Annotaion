import com.spring.repository.HibernetSpeakerRepositoryImpl;
import com.spring.repository.SpeakerRepository;
import com.spring.service.SpeakerService;
import com.spring.service.SpeakerServiceImpl;
import com.spring.util.CalendarFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.Calendar;

@Configuration
@ComponentScan({"com.spring"})
public class AppConfig {

    @Bean(name="cal")
    public CalendarFactory calFactory(){
        CalendarFactory factory = new CalendarFactory();
        factory.addDays(2);
        return factory;
    }

    @Bean
    public Calendar cal() throws Exception{
        return calFactory().getObject();
    }

    /*
    @Bean(name="speakerService")
    @Scope(value = BeanDefinition.SCOPE_SINGLETON)        //@Scope(value ="singleton")   // If Nothing Mentioned It is Singleton by defualt.
    //@Scope(value = BeanDefinition.SCOPE_PROTOTYPE)
    public SpeakerService getSpeakerService(){
        //SpeakerServiceImpl service = new SpeakerServiceImpl();    -- Setter Injection
        //service.setRepository(getSpeakerRepository());           -- Setter Injection

        //SpeakerServiceImpl service = new SpeakerServiceImpl(getSpeakerRepository());   //-- Constructor Injection
        SpeakerServiceImpl service = new  SpeakerServiceImpl();  // Setter Injection With Autowired

        return service;
    }
    */

    /*
    @Bean(name="speakerRepository")
    public SpeakerRepository getSpeakerRepository(){
        return new HibernetSpeakerRepositoryImpl();
    }*/





}
