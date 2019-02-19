package com.mycompany.courtfx2;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class FXMLController implements Initializable {
    
    private Stage self;

    public void setSelf(Stage self) {
        this.self = self;
    }
    
    @FXML
    private TableView<row> table;

    @FXML
    private TableColumn<row, Integer> id;

    @FXML
    private TableColumn<row, String> name;

    @FXML
    private void add(ActionEvent ev) throws IOException {
        try {
            
            FXMLLoader root_l = new FXMLLoader(getClass().getResource("/fxml/createdialog.fxml"));                
            Parent createdialog = root_l.load();
            
            Scene createdialog_s = new Scene(createdialog);
            Stage createdialog_st = new Stage();
            createdialog_st.setScene(createdialog_s);
            createdialog_st.setTitle("Second Stage");
            createdialog_st.initModality(Modality.APPLICATION_MODAL);
            createdialog_st.initOwner(self);
            createdialog_st.showAndWait();
            String text = ((CreatedialogController)root_l.getController()).getText();            
            table.getItems().add(new row(table.getItems().size() + 1, text));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO        
        id.setCellValueFactory(new PropertyValueFactory<row, Integer>("id"));
        name.setCellValueFactory(new PropertyValueFactory<row, String>("name"));
    }
}
