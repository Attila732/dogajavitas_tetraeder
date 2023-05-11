/*
* File: App.java
* Author: Kovács Attila
* Date: 2023.05.08,Kovács Attila
* Group: Szoft 1
* Licenc: GNU GPL
*/
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import javafx.scene.layout.HBox;

import javafx.scene.layout.VBox;

import javafx.stage.Stage;

public class App extends Application{
    TextField asideField;
    TextField areaField;
    TextField bsideField;
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        VBox vbox1 = new VBox();
        HBox titlehbox = new HBox();
        HBox asidehbox = new HBox();
        HBox bsidehbox=new HBox();
        HBox buttonbox = new HBox();
        HBox areabox = new HBox();
        HBox abouthbox = new HBox();
        //fejléc
        Label titlelabel=new Label("Tetraéder térfogata");
        titlehbox.getChildren().add(titlelabel);
        titlehbox.setPadding(new Insets(10,10,10,10));
        titlehbox.setAlignment(Pos.CENTER);

        // alap bekérés
        Label asideLabel=new Label("Tetraéder alapjának területe:");
        asideField = new TextField();
        asidehbox.getChildren().addAll(asideLabel, asideField);
        asidehbox.setPadding(new Insets(0, 0, 0, 0));
        HBox.setMargin(asideLabel, new Insets(10,0,10,0));
        HBox.setMargin(asideField, new Insets(10,0,10,0));
        asideLabel.setMinWidth(100);
        asideLabel.setAlignment(Pos.CENTER_RIGHT);

        //magasság bekérés
        Label bsideLabel=new Label("Tetraéder magassága:");
        bsideField = new TextField();
        bsidehbox.getChildren().addAll(bsideLabel, bsideField);
        bsidehbox.setPadding(new Insets(10, 10, 10, 10));
        HBox.setMargin(bsideLabel, new Insets(0,10,0,10));
        HBox.setMargin(bsideField, new Insets(0,10,0,10));
        asideLabel.setMinWidth(100);
        asideLabel.setAlignment(Pos.CENTER_RIGHT);


    

        //kalkulátor
        Button calcButton = new Button("számít");
        buttonbox.getChildren().add(calcButton);
        buttonbox.setAlignment(Pos.CENTER);
        buttonbox.setPadding(new Insets(10,10,10,10));
        calcButton.setOnAction(e -> {
            startCalcarea();
        });

        
        Label areLabel=new Label("Térfogat");
        areaField=new TextField();
        areabox.getChildren().addAll(areLabel,areaField);
        areabox.setPadding(new Insets(10,10,10,10));
        areLabel.setMinWidth(100);
        areLabel.setAlignment(Pos.CENTER);
       
        

        //névjegy
        Label aboutLabel=new Label("Kovács Attila , szoft 1-n, 2023-05-08");
        abouthbox.getChildren().add(aboutLabel);
       
       
        
        
        vbox1.getChildren().add(titlehbox);
        vbox1.getChildren().add(asidehbox);
        vbox1.getChildren().add(bsidehbox);
        vbox1.getChildren().add(buttonbox);
        vbox1.getChildren().add(areabox);
        vbox1.getChildren().add(abouthbox);

      
        
        
     


        Scene scene = new Scene(vbox1, 400,300);
        stage.setScene(scene);
        stage.show();

       
        
        
    }
    private void startCalcarea(){
            
            String asideString=asideField.getText();
            String bsideString=bsideField.getText();
            double aside=Double.parseDouble(asideString);
            double bside=Double.parseDouble(bsideString);

            
            Double area=calcArea(aside,bside);
            
            areaField.setText(area.toString());
    }
    private double calcArea(double aside, double bside){
        double area= (aside*bside)/3;
        return area;
    }
}

