module com.example.pik {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pik to javafx.fxml;
    exports com.example.pik;
}