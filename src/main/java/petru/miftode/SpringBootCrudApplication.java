package petru.miftode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootCrudApplication {

    @Bean
    public StartupRunner startupRunner(){
        return new StartupRunner();
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootCrudApplication.class, args);
    }
}
