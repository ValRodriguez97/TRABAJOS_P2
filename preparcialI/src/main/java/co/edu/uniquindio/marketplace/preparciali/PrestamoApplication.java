package co.edu.uniquindio.marketplace.preparciali;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class PrestamoApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(PrestamoApplication.class.getResource("ViewPrestamosUQ.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 370, 237);
        stage.setTitle("Prestamos UQ");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
