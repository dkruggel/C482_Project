package inventorysystem;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
//import javafx.scene.control.Button;
import javafx.scene.control.Label;
//import javafx.scene.control.TextField;
import javafx.scene.text.Font;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;

public class InventorySystem extends Application {

    @Override
    public void start(Stage primaryStage) {
        GridPane mainGrid = new GridPane();
        mainGrid.setAlignment(Pos.CENTER);
        mainGrid.setHgap(10);
        mainGrid.setVgap(10);
        mainGrid.setPadding(new Insets(25,25,25,25));

        BorderPane bPane = new BorderPane();

        mainGrid.add(bPane,1,1);
        
        Scene scene = new Scene(mainGrid, 1000, 500);
        scene.getStylesheets().add("/Assets/styleSheet.css");

        //Buttons
        //Button partsSearchBtn = new Button("Search");
        //Button addPartsBtn = new Button("Add");
        //Button modPartsBtn = new Button("Modify");
        //Button delPartsBtn = new Button("Delete");
        //Button productsSearchBtn = new Button("Search");
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
        //extField partsSearchTextField = new TextField();
        //TextField productsSearchTextField = new TextField();

        mainGrid.add(frmHeaderLabel,0,0,2,1);
        
        mainGrid.add(partsHeaderLabel,1,4,3,1);
        //mainGrid.add(partsSearchBtn,5,4,3,1);
        //mainGrid.add(partsSearchTextField,7,4);

        mainGrid.add(productsHeaderLabel,10,4);
        //mainGrid.add(productsSearchBtn,16,4);
        //mainGrid.add(productsSearchTextField,18,4);

        mainGrid.setGridLinesVisible(false);
        
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