package inventorysystem;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class InventorySystem extends Application {

    @Override
    public void start(Stage primaryStage) {
        BorderPane root = new BorderPane();

        HBox hbox = new HBox();
        hbox.setSpacing(25);
        hbox.setId("hBox");

        root.setTop(hbox);

        GridPane mainGrid = new GridPane();
        mainGrid.setId("mainGrid");
        mainGrid.setHgap(10);
        mainGrid.setVgap(10);
        mainGrid.setHgap(10);
        mainGrid.setVgap(10);

        root.setCenter(mainGrid);

        Scene scene = new Scene(root, 1000, 500);
        scene.getStylesheets().add("/Assets/styleSheet.css");

        //Buttons
        Button partsSearchBtn = new Button("Search");
        //Button addPartsBtn = new Button("Add");
        //Button modPartsBtn = new Button("Modify");
        //Button delPartsBtn = new Button("Delete");
        Button productsSearchBtn = new Button("Search");
        //Button addproductsBtn = new Button("Add");
        //Button modproductsBtn = new Button("Modify");
        //Button delproductsBtn = new Button("Delete");
        //Button exitMainFormBtn = new Button("Exit");

        //Labels
        Label frmHeaderLabel = new Label("Inventory Management System");
        frmHeaderLabel.setId("frmHeaderLabel");
        Label partsHeaderLabel = new Label("Parts");
        partsHeaderLabel.setId("partsHeaderLabel");
        Label productsHeaderLabel = new Label("Products");
        productsHeaderLabel.setId("productsHeaderLabel");

        //Text boxes
        TextField partsSearchTextField = new TextField();
        TextField productsSearchTextField = new TextField();       

        hbox.getChildren().add(frmHeaderLabel);
        
        mainGrid.add(partsHeaderLabel,0,0,1,1);
        mainGrid.add(partsSearchBtn,6,0,3,1);
        mainGrid.add(partsSearchTextField,10,0);

        mainGrid.add(productsHeaderLabel,25,0,1,1);
        mainGrid.add(productsSearchBtn,31,0,3,1);
        mainGrid.add(productsSearchTextField,35,0);

        mainGrid.setGridLinesVisible(true);
        
        partsSearchBtn.setOnAction(event->
               partsHeaderLabel.setText("Changed!"));      
                               
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
        //primaryStage.setScene(screenFunction);
    }

    public static void main(String[] args) {
        launch(args);
    }
}