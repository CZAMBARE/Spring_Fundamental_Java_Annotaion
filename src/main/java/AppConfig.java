import com.spring.repository.HibernetSpeakerRepositoryImpl;
import com.spring.repository.SpeakerRepository;
import com.spring.service.SpeakerService;
import com.spring.service.SpeakerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name="speakerService")
    public SpeakerService getSpeakerService(){
        //SpeakerServiceImpl service = new SpeakerServiceImpl();    -- Setter Injection
        //service.setRepository(getSpeakerRepository());           -- Setter Injection

        SpeakerServiceImpl service = new SpeakerServiceImpl(getSpeakerRepository());   //-- Constructor Injection
        return service;
    }


    @Bean(name="speakerRepository")
    public SpeakerRepository getSpeakerRepository(){
        return new HibernetSpeakerRepositoryImpl();
    }





}
