package io.github.mattn.sbbatch;

import io.github.mattn.sbbatch.model.Person;
import io.github.mattn.sbbatch.repository.PersonRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
/**
 * Application is main entry point.
 * @author mattn
 */
@EnableAutoConfiguration
@EnableBatchProcessing
@EnableConfigurationProperties
@Slf4j
public class Application implements CommandLineRunner {
    @Autowired
    private PersonRepository personRepository;

    /***
     * main is startup.
     * @param args command line arguments
     */
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(Application.class);
        application.setWebEnvironment(false);
        ApplicationContext context = application.run();
        SpringApplication.exit(context);
    }

    @Override
    /**
     * worker handler.
     */
    public void run(String... strings) throws Exception {
        log.debug("hello");

        Person person = new Person();
        person.setFirstName("Yasuhiro");
        person.setLastName("Matsumoto");
        personRepository.save(person);
    }
}
