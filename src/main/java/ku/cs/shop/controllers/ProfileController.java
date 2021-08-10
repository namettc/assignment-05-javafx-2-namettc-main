package ku.cs.shop.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.IOException;

public class ProfileController {
    @FXML private ImageView image;

    @FXML
    public void initialize() {
        String path = getClass().getResource("/images/picProfile.jpg").toExternalForm();
        image.setImage(new Image(path));
    }

    public void handleMainPageButton(ActionEvent event){
        try {
            com.github.saacsos.FXRouter.goTo("home");
        } catch (IOException e) {
            System.err.println("ไปที่หน้า home ไม่ได้");
            System.err.println("ให้ตรวจสอบการกำหนด route");
        }

    }

}
