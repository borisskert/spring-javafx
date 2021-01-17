package de.borisskert.examples.springjavafx;

import javafx.application.HostServices;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import org.springframework.stereotype.Controller;

@Controller
public class SimpleUiController {

    private final HostServices hostServices;

    @FXML
    public Label label;

    @FXML
    public Button button;

    public SimpleUiController(HostServices hostServices) {
        this.hostServices = hostServices;
    }

    @FXML
    public void initialize() {
        this.button.setOnAction(actionEvent -> {
            this.label.setText(hostServices.getDocumentBase());
        });
    }
}