module sample.dzvinky {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires jlayer;


    opens sample.dzvinky to javafx.fxml;
    exports sample.dzvinky;
}