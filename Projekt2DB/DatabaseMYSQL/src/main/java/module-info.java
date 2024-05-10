module app.databasemysql {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens app.databasemysql to javafx.fxml;
    exports app.databasemysql;
}