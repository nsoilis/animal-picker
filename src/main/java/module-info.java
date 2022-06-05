module com.example.animalpicker {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;

    opens com.example.animalpicker to javafx.fxml;
    exports com.example.animalpicker;
}