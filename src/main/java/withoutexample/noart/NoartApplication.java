package withoutexample.noart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class NoartApplication {
    public static void main(String[] args) {
        SpringApplication.run(NoartApplication.class, args);
    }
}
