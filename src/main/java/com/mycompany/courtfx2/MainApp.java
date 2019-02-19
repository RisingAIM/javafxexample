package com.mycompany.courtfx2;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableView;
import javafx.stage.Stage;


public class MainApp extends Application {

    @Override
    public void start(Stage stage) throws Exception {
//        Parent root = FXMLLoader.load(getClass().getResource("/fxml/Scene.fxml"));
        FXMLLoader root_l = new FXMLLoader(getClass().getResource("/fxml/Scene.fxml"));
        
        Parent root = root_l.load();        
        
        Scene scene = new Scene(root);
        scene.getStylesheets().add("/styles/Styles.css");
        TableView<row> table = (TableView<row>) root.lookup("#table");
        ((FXMLController)root_l.getController()).setSelf(stage);
        ObservableList<row> items = table.getItems();        
        items.add(new row(1, "Ник Админ Рутович"));
        
        stage.setTitle("JavaFX and Maven");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
