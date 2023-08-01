module me.lightluke.beatorajaii {
    requires javafx.controls;
    requires javafx.fxml;


    opens me.lightluke.beatorajaii to javafx.fxml;
    exports me.lightluke.beatorajaii;
}