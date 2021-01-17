package de.borisskert.examples.springjavafx;

import javafx.application.Application;
import javafx.application.HostServices;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestBeanConfiguration {

    @Bean
    Application application() {
        return new JavaFxApplication();
    }

    @Bean
    HostServices hostServices(Application application) {
        return application.getHostServices();
    }
}
