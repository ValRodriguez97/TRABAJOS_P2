module co.edu.uniquindio.marketplace.preparciali {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens co.edu.uniquindio.marketplace.preparciali to javafx.fxml;
    exports co.edu.uniquindio.marketplace.preparciali;
}