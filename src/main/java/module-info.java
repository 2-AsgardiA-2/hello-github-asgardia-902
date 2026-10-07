module edu.utsa.cs3443.hellogithub {
    requires javafx.controls;
    requires javafx.fxml;


    opens edu.utsa.cs3443.hellogithub to javafx.fxml;
    exports edu.utsa.cs3443.hellogithub;
}