package zajglic.construction.site;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan ("zajglic.construction.site.worker")
@SpringBootApplication
public class SiteApplication {


    public static void main(String[] args) {
        SpringApplication.run(SiteApplication.class, args);
    }

}
