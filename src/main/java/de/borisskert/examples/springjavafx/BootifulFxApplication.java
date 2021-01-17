package de.borisskert.examples.springjavafx;

import javafx.application.Application;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootifulFxApplication {

    public static void main(String[] args) {
        Application.launch(JavaFxApplication.class, args);
    }
}
