package inventorysystem;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
//import javafx.scene.control.TextField;
//import javafx.scene.text.Font;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
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

        GridPane partsGrid = new GridPane();
        partsGrid.setId("partsGrid");
        partsGrid.setHgap(10);
        partsGrid.setVgap(10);
        GridPane productsGrid = new GridPane();
        productsGrid.setId("productsGrid");
        productsGrid.setHgap(10);
        productsGrid.setVgap(10);
        
        root.setLeft(partsGrid);
        root.setRight(productsGrid);

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
        //TextField partsSearchTextField = new TextField();
        //TextField productsSearchTextField = new TextField();       

        hbox.getChildren().add(frmHeaderLabel);
        
        partsGrid.add(partsHeaderLabel,1,4,3,1);
        partsGrid.add(partsSearchBtn,5,4,3,1);
        //mainGrid.add(partsSearchTextField,7,4);

        productsGrid.add(productsHeaderLabel,10,4);
        productsGrid.add(productsSearchBtn,16,4);
        //mainGrid.add(productsSearchTextField,18,4);

        partsGrid.setGridLinesVisible(true);
        productsGrid.setGridLinesVisible(true);
        
        //partsSearchBtn.setOnAction(event->
        //       System.out.println("Hello World"));      
                               
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
        //primaryStage.setScene(screenFunction);
    }

    public static void main(String[] args) {
        launch(args);
    }
}