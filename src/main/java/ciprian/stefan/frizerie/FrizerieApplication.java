package ciprian.stefan.frizerie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
@EnableJpaRepositories

public class FrizerieApplication {

    public static void main(String[] args) {
        SpringApplication.run(FrizerieApplication.class, args);
    }

}
