module com.genspark.pyramidacademyteamscheduleproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.genspark.pyramidacademyteamscheduleproject to javafx.fxml;
    exports com.genspark.pyramidacademyteamscheduleproject;
}