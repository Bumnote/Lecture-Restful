package basic.restful;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class RestfulApplication {

    public static void main(String[] args) {
        ApplicationContext ac = SpringApplication.run(RestfulApplication.class, args);
        String[] beanNames = ac.getBeanDefinitionNames();

        for (String beanName : beanNames)
            System.out.println(beanName);
    }
}
