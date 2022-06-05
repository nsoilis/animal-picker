package com.example.animalpicker;

import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import java.util.*;

import static javafx.scene.text.Font.font;


public  class Application extends javafx.application.Application  {


    Stage window;
    Scene startingScene, habitatScene, flyingScene, onLandScene, inWaterScene, inForestScene, neighborhoodScene, mountainsScene, heightScene,
            weightScene, tailLengthScene, tailKindScene, coatColorScene, timeOfDayScene, thankYouScene, winningScene;
    Button button1, buttonFlying, buttonOnLand, buttonSwimming, buttonForest, buttonNeighborhood, buttonMountains, buttonMeadow, buttonRiverSide,
            buttonRiver, buttonLakePond, buttonStream, buttonMarsh, buttonClimbingTree, buttonOnGround, buttonUnderLeaves, buttonTrash, buttonBackyard,
            buttonOnWire, buttonDen, buttonOutInOpen, buttonDigging, buttonBat, buttonNotBat, buttonTiny, buttonSmall, buttonMedium, buttonLarge,
            buttonVeryLarge,buttonWTiny, buttonWSmall, buttonWMedium, buttonWLarge, buttonWVeryLarge, buttonNotSure, buttonLongTail, buttonShortTail,
            buttonBaldTail, buttonHairyTail, buttonWhite, buttonGray, buttonBrown, buttonBlack, buttonOrange, buttonDiurnal, buttonNocturnal, buttonThankYou, buttonGoodBye;




    public static void main(String[] args) {
        launch(args);
    }


    public Map<String, Double> animalCount = FXCollections.observableMap(new LinkedHashMap<>());
    public Map<String, Double> animalCount2 = FXCollections.observableMap(new LinkedHashMap<>());

    {{
        Double STARTING_COUNT =(0.0);
        animalCount.put("Opossum", STARTING_COUNT);
        animalCount.put("Shrew", STARTING_COUNT);
        animalCount.put("Mole", STARTING_COUNT);
        animalCount.put("Bat", STARTING_COUNT);
        animalCount.put("Rabbit", STARTING_COUNT);
        animalCount.put("Hare", STARTING_COUNT);
        animalCount.put("Beaver", STARTING_COUNT);
        animalCount.put("Porcupine", STARTING_COUNT);
        animalCount.put("Muskrat", STARTING_COUNT);
        animalCount.put("Mouse", STARTING_COUNT);
        animalCount.put("Vole", STARTING_COUNT);
        animalCount.put("Rat", STARTING_COUNT);
        animalCount.put("Squirrel", STARTING_COUNT);
        animalCount.put("Chipmunk", STARTING_COUNT);
        animalCount.put("Flying Squirrel", STARTING_COUNT);
        animalCount.put("Bobcat", STARTING_COUNT);
        animalCount.put("Coyote", STARTING_COUNT);
        animalCount.put("Gray Fox", STARTING_COUNT);
        animalCount.put("Red Fox", STARTING_COUNT);
        animalCount.put("Black Bear", STARTING_COUNT);
        animalCount.put("Skunk", STARTING_COUNT);
        animalCount.put("Otter", STARTING_COUNT);
        animalCount.put("Weasel", STARTING_COUNT);
        animalCount.put("Badger", STARTING_COUNT);
        animalCount.put("Raccoon", STARTING_COUNT);
        animalCount.put("Elk", STARTING_COUNT);
        animalCount.put("Deer", STARTING_COUNT);
    }};
    public void increaseCount(String key, double value){
                this.animalCount.merge(key, value, Double::sum);

    }



    public String highestCount() {
        return this.animalCount2.entrySet().stream().max((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 : -1).get().getKey();
    }


        @Override
    public void start(Stage primaryStage) throws Exception {


        window = primaryStage;
        window.setTitle("The Pennsylvania Animal Identifier");


        Label welcomeText = new Label("Welcome to the Pennsylvania \n           Mammal Identifier");
        welcomeText.setFont(font("Arial", 24));
        Label questionHabitat = new Label("Where did you see your animal?");
        questionHabitat.setFont(font("Arial", 24));
        Label wasItABatQuestion = new Label(("Was it a bat?"));
        wasItABatQuestion.setFont(font("Arial", 24));
        Label whereOnLandQuestion = new Label(("Where on land was it?"));
        whereOnLandQuestion.setFont(font("Arial", 24));
        Label whereInWaterQuestion = new Label(("Where was it swimming?"));
        whereInWaterQuestion.setFont(font("Arial", 24));
        Label whereInForestQuestion = new Label(("Where in the Forest was it?"));
        whereInForestQuestion.setFont(font("Arial", 24));
        Label whereInNeighborhoodQuestion = new Label(("Where in the Neighborhood was it?"));
        whereInNeighborhoodQuestion.setFont(font("Arial", 24));
        Label whereInMountainsQuestion = new Label(("Where in the Mountains was it?"));
        whereInMountainsQuestion.setFont(font("Arial", 24));
        Label whatHeightQuestion = new Label(("How tall/long was this animal?"));
        whatHeightQuestion.setFont(font("Arial", 24));
        Label heightQuestionDetails = new Label(("\n\t\t\t\t\t\t\t\t Height Guide:\n\t\t\t  Tiny: < 6 inches, Small: 6 - 20 Inches, Medium: 20 - 30 Inches \n\t\t\t\t\t Large: 30 - 40 Inches, Very Large: > 40 Inches"));
        heightQuestionDetails.relocate(500, 500);
        heightQuestionDetails.setFont(font("Arial", 14));
        Label whatWeightQuestion = new Label(("How heavy (approx) was this animal?"));
        whatWeightQuestion.setFont(font("Arial", 24));
        Label weightQuestionDetails = new Label(("\n\t\t\t\t\t\t\t\t Weight Guide:\n\t\t\t  Tiny: < 1 Pound, Small: 1 - 5 pounds, Medium: 5 - 20 Pounds \n\t\t\t\t\t Large: 20 - 40 Pounds, Very Large: > 40 Pounds"));
        weightQuestionDetails.relocate(500, 500);
        weightQuestionDetails.setFont(font("Arial", 14));
        Label tailLengthQuestion = new Label(("Did this animal have a Long or Short Tail?"));
        tailLengthQuestion.setFont(font("Arial", 24));
        Label tailKindQuestion = new Label(("Did this animal have a Bald or Hairy Tail?"));
        tailKindQuestion.setFont(font("Arial", 24));
        Label colorQuestion = new Label(("What color was this animal, primarily?"));
        colorQuestion.setFont(font("Arial", 24));
        Label timeQuestion = new Label(("Did you see the animal during the Day or Night?"));
        timeQuestion.setFont(font("Arial", 24));
        Label thankYouMessage = new Label(("Thank you, we should have enough\n\t to tell you your animal."));
        thankYouMessage.setFont(font("Arial", 24));
        Label winningAnimalMessage = new Label(("Check the Console for your animal!" ));
        winningAnimalMessage.setFont(font("Arial", 24));



        button1 = new Button("Click to Start");
        HBox welcomeMenu = new HBox();

        welcomeMenu.setPadding(new Insets(10,120,20,120));
        welcomeMenu.getChildren().addAll(button1);

        button1.setMaxWidth(Double.MAX_VALUE);
        HBox.setHgrow(button1, Priority.ALWAYS);
        button1.setAlignment(Pos.CENTER);
        button1.setFocusTraversable(false);

        button1.setOnAction(e -> {
            window.setScene(habitatScene);
          // increaseCount("Beaver", 3.0);

        });



        HBox bottomMenu = new HBox();
        bottomMenu.setPadding(new Insets(10,20,20,20));
        bottomMenu.setSpacing(40);
        buttonFlying = new Button ("It was Flying");
        buttonOnLand = new Button ("It was on Land");
        buttonSwimming = new Button ("It was Swimming");
        bottomMenu.getChildren().addAll(buttonFlying, buttonOnLand, buttonSwimming);
        buttonFlying.setMaxWidth(Double.MAX_VALUE);
        buttonFlying.setFocusTraversable(false);
        buttonOnLand.setFocusTraversable(false);
        buttonSwimming.setFocusTraversable(false);
        HBox.setHgrow(buttonFlying, Priority.ALWAYS);
            buttonFlying.setOnAction(e -> {
                window.setScene(flyingScene);
              increaseCount("Bat", 1.0);
              increaseCount("Flying Squirrel", 1.0);
            });
        buttonOnLand.setMaxWidth(Double.MAX_VALUE);
        HBox.setHgrow(buttonOnLand, Priority.ALWAYS);
            buttonOnLand.setOnAction(e -> window.setScene(onLandScene));
        buttonSwimming.setMaxWidth(Double.MAX_VALUE);
        HBox.setHgrow(buttonSwimming, Priority.ALWAYS);
            buttonSwimming.setOnAction(e -> {
                window.setScene(inWaterScene);
            });



        HBox bottomMenuFlying = new HBox();
        bottomMenuFlying.setPadding(new Insets(10,40,20,40));
        bottomMenuFlying.setSpacing(120);
        buttonBat = new Button ("It was a bat");
            buttonBat.setOnAction(e ->{
               increaseCount("Bat", 6.0);
                window.setScene(thankYouScene);
            });
        buttonNotBat = new Button ("It was not a bat");
            buttonNotBat.setOnAction(e ->{
                increaseCount("Flying Squirrel", 6.0);
                window.setScene(thankYouScene);
            });
        bottomMenuFlying.getChildren().addAll(buttonBat, buttonNotBat);
        buttonBat.setFocusTraversable(false);
        buttonNotBat.setFocusTraversable(false);
        buttonBat.setMaxWidth(Double.MAX_VALUE);
        HBox.setHgrow(buttonBat, Priority.ALWAYS);
        buttonNotBat.setMaxWidth(Double.MAX_VALUE);
        HBox.setHgrow(buttonNotBat, Priority.ALWAYS);

        HBox bottomMenuLand = new HBox();
        bottomMenuLand.setPadding(new Insets(10,20,20,20));
        bottomMenuLand.setSpacing(10);
        buttonForest = new Button ("Forest");
        buttonNeighborhood = new Button ("Neighborhood");
        buttonMountains = new Button ("Mountains");
        buttonMeadow = new Button ("Meadow");
        buttonRiverSide = new Button ("Near River");
        bottomMenuLand.getChildren().addAll(buttonForest, buttonNeighborhood, buttonMountains, buttonMeadow, buttonRiverSide);
        buttonForest.setFocusTraversable(false);
        buttonNeighborhood.setFocusTraversable(false);
        buttonMountains.setFocusTraversable(false);
        buttonMeadow.setFocusTraversable(false);
        buttonRiverSide.setFocusTraversable(false);
        buttonForest.setMaxWidth(Double.MAX_VALUE);
        HBox.setHgrow(buttonForest, Priority.ALWAYS);
            buttonForest.setOnAction(e -> {
                window.setScene(inForestScene);
            });
        buttonNeighborhood.setMaxWidth(Double.MAX_VALUE);
        HBox.setHgrow(buttonNeighborhood, Priority.ALWAYS);
            buttonNeighborhood.setOnAction(e -> {
                window.setScene(neighborhoodScene);
            });
        buttonMountains.setMaxWidth(Double.MAX_VALUE);
        HBox.setHgrow(buttonMountains, Priority.ALWAYS);
            buttonMountains.setOnAction(e -> {
                window.setScene(mountainsScene);
            });
        buttonMeadow.setMaxWidth(Double.MAX_VALUE);
        HBox.setHgrow(buttonMeadow, Priority.ALWAYS);
            buttonMeadow.setOnAction(e -> {
                window.setScene(heightScene);
                increaseCount("Opossum", 1.0);
                increaseCount("Shrew", 1.0);
                increaseCount("Mole", 1.0);
                increaseCount("Rabbit", 1.0);
                increaseCount("Hare", 1.0);
                increaseCount("Mouse", 1.0);
                increaseCount("Vole", 1.0);
                increaseCount("Squirrel", 1.0);
                increaseCount("Chipmunk", 1.0);
                increaseCount("Flying Squirrel", 1.0);
                increaseCount("Bobcat", 1.0);
                increaseCount("Coyote", 1.0);
                increaseCount("Gray Fox", 1.0);
                increaseCount("Red Fox", 1.0);
                increaseCount("Black Bear", 1.0);
                increaseCount("Skunk", 1.0);
                increaseCount("Weasel", 1.0);
                increaseCount("Deer", 1.0);
                increaseCount("Elk", 1.0);
                increaseCount("Deer", 1.0);
            });
        buttonRiverSide.setMaxWidth(Double.MAX_VALUE);
        HBox.setHgrow(buttonRiverSide, Priority.ALWAYS);
            buttonRiverSide.setOnAction(e -> {
                window.setScene(heightScene);
                increaseCount("Opossum", 1.0);
                increaseCount("Rabbit", 1.0);
                increaseCount("Hare", 1.0);
                increaseCount("Beaver", 1.0);
                increaseCount("Muskrat", 1.0);
                increaseCount("Coyote", 1.0);
                increaseCount("Gray Fox", 1.0);
                increaseCount("Black Bear", 1.0);
                increaseCount("Raccoon", 1.0);
                increaseCount("Elk", 1.0);
                increaseCount("Deer", 1.0);
            });

        HBox bottomMenuForest = new HBox();
        bottomMenuForest.setPadding(new Insets(10,20,20,20));
        bottomMenuForest.setSpacing(10);
        buttonClimbingTree = new Button("Climbing Tree");
        buttonOnGround = new Button("On the Ground");
        buttonUnderLeaves = new Button("Under Leaves");
        bottomMenuForest.getChildren().addAll(buttonClimbingTree, buttonOnGround, buttonUnderLeaves);
        buttonClimbingTree.setFocusTraversable(false);
        buttonOnGround.setFocusTraversable(false);
        buttonUnderLeaves.setFocusTraversable(false);
        buttonClimbingTree.setMaxWidth(Double.MAX_VALUE);
        HBox.setHgrow(buttonClimbingTree, Priority.ALWAYS);
            buttonClimbingTree.setOnAction(e ->{
                window.setScene(heightScene);
                increaseCount("Opossum", 1.0);
                increaseCount("Shrew", 1.0);
                increaseCount("Squirrel", 1.0);
                increaseCount("Chipmunk", 1.0);
                increaseCount("Bobcat", 1.0);
                increaseCount("Black Bear", 1.0);
                increaseCount("Weasel", 1.0);
            });
        buttonOnGround.setMaxWidth(Double.MAX_VALUE);
        HBox.setHgrow(buttonOnGround, Priority.ALWAYS);
            buttonOnGround.setOnAction(e -> {
                window.setScene(heightScene);
                increaseCount("Opossum", 1.0);
                increaseCount("Shrew", 1.0);
                increaseCount("Mole", 1.0);
                increaseCount("Rabbit", 1.0);
                increaseCount("Hare", 1.0);
                increaseCount("Porcupine", 1.0);
                increaseCount("Muskrat", 1.0);
                increaseCount("Mouse", 1.0);
                increaseCount("Vole", 1.0);
                increaseCount("Squirrel", 1.0);
                increaseCount("Chipmunk", 1.0);
                increaseCount("Flying Squirrel", 1.0);
                increaseCount("Bobcat", 1.0);
                increaseCount("Coyote", 1.0);
                increaseCount("Gray Fox", 1.0);
                increaseCount("Red Fox", 1.0);
                increaseCount("Black Bear", 1.0);
                increaseCount("Skunk", 1.0);
                increaseCount("Weasel", 1.0);
                increaseCount("Deer", 1.0);
            });
        buttonUnderLeaves.setMaxWidth(Double.MAX_VALUE);
        HBox.setHgrow(buttonUnderLeaves, Priority.ALWAYS);
            buttonUnderLeaves.setOnAction(e -> {
                window.setScene(heightScene);
                increaseCount("Shrew", 1.0);
                increaseCount("Mole", 1.0);
                increaseCount("Mouse", 1.0);
                increaseCount("Vole", 1.0);
                increaseCount("Squirrel", 1.0);
                increaseCount("Chipmunk", 1.0);
                increaseCount("Flying Squirrel", 1.0);
            });

        HBox bottomMenuNeighborhood = new HBox();
        bottomMenuNeighborhood.setPadding(new Insets(10,20,20,20));
        bottomMenuNeighborhood.setSpacing(10);
        buttonTrash = new Button("In some Trash");
        buttonBackyard = new Button("In a Backyard/Street");
        buttonOnWire = new Button("On a Wire");
        bottomMenuNeighborhood.getChildren().addAll(buttonTrash, buttonBackyard, buttonOnWire);
        buttonTrash.setFocusTraversable(false);
        buttonBackyard.setFocusTraversable(false);
        buttonOnWire.setFocusTraversable(false);
        buttonTrash.setMaxWidth(Double.MAX_VALUE);
        HBox.setHgrow(buttonTrash, Priority.ALWAYS);
            buttonTrash.setOnAction(e -> {
                window.setScene(heightScene);
                increaseCount("Opossum", 1.0);
                increaseCount("Mouse", 1.0);
                increaseCount("Vole", 1.0);
                increaseCount("Rat", 1.0);
                increaseCount("Squirrel", 1.0);
                increaseCount("Chipmunk", 1.0);
                increaseCount("Flying Squirrel", 1.0);
                increaseCount("Black Bear", 1.0);
                increaseCount("Skunk", 1.0);
                increaseCount("Raccoon", 1.0);
            });
        buttonBackyard.setMaxWidth(Double.MAX_VALUE);
        HBox.setHgrow(buttonBackyard, Priority.ALWAYS);
            buttonBackyard.setOnAction(e -> {
                window.setScene(heightScene);
                increaseCount("Opossum", 1.0);
                increaseCount("Shrew", 1.0);
                increaseCount("Mole", 1.0);
                increaseCount("Rabbit", 1.0);
                increaseCount("Hare", 1.0);
                increaseCount("Mouse", 1.0);
                increaseCount("Vole", 1.0);
                increaseCount("Rat", 1.0);
                increaseCount("Squirrel", 1.0);
                increaseCount("Chipmunk", 1.0);
                increaseCount("Flying Squirrel", 1.0);
                increaseCount("Black Bear", 1.0);
                increaseCount("Skunk", 1.0);
                increaseCount("Raccoon", 1.0);
                increaseCount("Deer", 1.0);
            });
        buttonOnWire.setMaxWidth(Double.MAX_VALUE);
        HBox.setHgrow(buttonOnWire, Priority.ALWAYS);
            buttonOnWire.setOnAction(e -> {
                window.setScene(heightScene);
                increaseCount("Opossum", 1.0);
                increaseCount("Squirrel", 1.0);
                increaseCount("Flying Squirrel", 1.0);
            });

        HBox bottomMenuMountains = new HBox();
        bottomMenuMountains.setPadding(new Insets(10,20,20,20));
        bottomMenuMountains.setSpacing(10);
        buttonDen = new Button("In a Den");
        buttonOutInOpen = new Button("Out in the Open");
        buttonDigging = new Button("Digging");
        bottomMenuMountains.getChildren().addAll(buttonDen, buttonOutInOpen, buttonDigging);
        buttonDen.setFocusTraversable(false);
        buttonOutInOpen.setFocusTraversable(false);
        buttonDigging.setFocusTraversable(false);
        buttonDen.setMaxWidth(Double.MAX_VALUE);
        HBox.setHgrow(buttonDen, Priority.ALWAYS);
            buttonDen.setOnAction(e -> {
                window.setScene(heightScene);
                increaseCount("Opossum", 1.0);
                increaseCount("Rabbit", 1.0);
                increaseCount("Hare", 1.0);
                increaseCount("Coyote", 1.0);
                increaseCount("Gray Fox", 1.0);
                increaseCount("Black Bear", 1.0);
            });
        buttonOutInOpen.setMaxWidth(Double.MAX_VALUE);
        HBox.setHgrow(buttonOutInOpen, Priority.ALWAYS);
            buttonOutInOpen.setOnAction(e -> {
                window.setScene(heightScene);
                increaseCount("Opossum", 1.0);
                increaseCount("Rabbit", 1.0);
                increaseCount("Hare", 1.0);
                increaseCount("Mouse", 1.0);
                increaseCount("Vole", 1.0);
                increaseCount("Coyote", 1.0);
                increaseCount("Gray Fox", 1.0);
                increaseCount("Black Bear", 1.0);
            });
        buttonDigging.setMaxWidth(Double.MAX_VALUE);
        HBox.setHgrow(buttonDigging, Priority.ALWAYS);
            buttonDigging.setOnAction(e -> {
                window.setScene(heightScene);
                increaseCount("Opossum", 1.0);
                increaseCount("Rabbit", 1.0);
                increaseCount("Hare", 1.0);
                increaseCount("Mouse", 1.0);
                increaseCount("Vole", 1.0);
                increaseCount("Coyote", 1.0);
            });


        HBox bottomMenuWater = new HBox();
        bottomMenuWater.setPadding(new Insets(10,20,20,20));
        bottomMenuWater.setSpacing(20);
        buttonRiver = new Button ("River");
        buttonLakePond = new Button ("Lake/Pond");
        buttonStream = new Button ("Stream");
        buttonMarsh = new Button ("Marsh");
        bottomMenuWater.getChildren().addAll(buttonRiver, buttonLakePond, buttonStream, buttonMarsh);
        buttonRiver.setFocusTraversable(false);
        buttonLakePond.setFocusTraversable(false);
        buttonStream.setFocusTraversable(false);
        buttonMarsh.setFocusTraversable(false);
        buttonRiver.setMaxWidth(Double.MAX_VALUE);
        HBox.setHgrow(buttonRiver, Priority.ALWAYS);
            buttonRiver.setOnAction(e -> {
                window.setScene(heightScene);
                increaseCount("Beaver", 1.0);
                increaseCount("Muskrat", 1.0);
                increaseCount("Black Bear", 1.0);
                increaseCount("Otter", 1.0);
            });
        buttonLakePond.setMaxWidth(Double.MAX_VALUE);
        HBox.setHgrow(buttonLakePond, Priority.ALWAYS);
            buttonLakePond.setOnAction(e -> {
                window.setScene(heightScene);
                increaseCount("Beaver", 1.0);
                increaseCount("Muskrat", 1.0);
                increaseCount("Otter", 1.0);
            });
        buttonStream.setMaxWidth(Double.MAX_VALUE);
        HBox.setHgrow(buttonStream, Priority.ALWAYS);
            buttonStream.setOnAction(e -> {

            });
        buttonMarsh.setMaxWidth(Double.MAX_VALUE);
        HBox.setHgrow(buttonMarsh, Priority.ALWAYS);
        buttonMarsh.setOnAction(e -> {
            window.setScene(heightScene);
            increaseCount("Opossum", 1.0);
            increaseCount("Rabbit", 1.0);
            increaseCount("Hare", 1.0);
            increaseCount("Beaver", 1.0);
            increaseCount("Muskrat", 1.0);
            increaseCount("Mouse", 1.0);
            increaseCount("Vole", 1.0);
            increaseCount("Bobcat", 1.0);
            increaseCount("Gray Fox", 1.0);
            increaseCount("Red Fox", 1.0);
            increaseCount("Otter", 1.0);
            increaseCount("Badger", 1.0);
                });


        /*

         */

        HBox bottomMenuHeight = new HBox();
        bottomMenuHeight.setPadding(new Insets(10,20,20,20));
        bottomMenuHeight.setSpacing(20);
        buttonTiny = new Button ("Tiny");
        buttonSmall = new Button ("Small");
        buttonMedium = new Button ("Medium");
        buttonLarge = new Button ("Large");
        buttonVeryLarge = new Button("Very Large");
        bottomMenuHeight.getChildren().addAll(buttonTiny, buttonSmall, buttonMedium, buttonLarge, buttonVeryLarge);
        buttonTiny.setFocusTraversable(false);
        buttonSmall.setFocusTraversable(false);
        buttonMedium.setFocusTraversable(false);
        buttonLarge.setFocusTraversable(false);
        buttonVeryLarge.setFocusTraversable(false);
        buttonTiny.setMaxWidth(Double.MAX_VALUE);
        HBox.setHgrow(buttonTiny, Priority.ALWAYS);
            buttonTiny.setOnAction(e -> {
                window.setScene(weightScene);
                increaseCount("Shrew", 1.0);
                increaseCount("Mole", 0.5);
                increaseCount("Mouse", 1.0);
                increaseCount("Vole", 0.5);
                increaseCount("Chipmunk", 0.5);
                increaseCount("Flying Squirrel", 0.5);
            });
        buttonSmall.setMaxWidth(Double.MAX_VALUE);
        HBox.setHgrow(buttonSmall, Priority.ALWAYS);
            buttonSmall.setOnAction(e -> {
                window.setScene(weightScene);
                increaseCount("Mole", 1.0);
                increaseCount("Rabbit", 0.5);
                increaseCount("Hare", 0.5);
                increaseCount("Muskrat", 0.5);
                increaseCount("Vole", 1.0);
                increaseCount("Rat", 1.0);
                increaseCount("Chipmunk", 1.0);
                increaseCount("Flying Squirrel", 1.0);
                increaseCount("Gray Fox", 0.5);
                increaseCount("Skunk", 0.5);
                increaseCount("Otter", 0.5);
                increaseCount("Badger", 0.5);
                increaseCount("Raccoon", 0.5);
            });
        buttonMedium.setMaxWidth(Double.MAX_VALUE);
        HBox.setHgrow(buttonMedium, Priority.ALWAYS);
            buttonMedium.setOnAction(e -> {
                window.setScene(weightScene);
                increaseCount("Opossum", 1.0);
                increaseCount("Rabbit", 1.0);
                increaseCount("Hare", 1.0);
                increaseCount("Beaver", 0.5);
                increaseCount("Porcupine", 0.5);
                increaseCount("Squirrel", 1.0);
                increaseCount("Bobcat", 0.5);
                increaseCount("Coyote", 0.5);
                increaseCount("Gray Fox", 1.0);
                increaseCount("Red Fox", 0.5);
                increaseCount("Skunk", 1.0);
                increaseCount("Otter", 1.0);
                increaseCount("Badger", 1.0);
                increaseCount("Badger", 1.0);
                increaseCount("Raccoon", 1.0);
            });
        buttonLarge.setMaxWidth(Double.MAX_VALUE);
        HBox.setHgrow(buttonLarge, Priority.ALWAYS);
            buttonLarge.setOnAction(e -> {
                window.setScene(weightScene);
                increaseCount("Beaver", 1.0);
                increaseCount("Porcupine", 1.0);
                increaseCount("Bobcat", 1.0);
                increaseCount("Coyote", 1.0);
                increaseCount("Red Fox", 1.0);
            });
        buttonVeryLarge.setMaxWidth(Double.MAX_VALUE);
        HBox.setHgrow(buttonVeryLarge, Priority.ALWAYS);
            buttonVeryLarge.setOnAction(e -> {
                window.setScene(weightScene);
                increaseCount("Black Bear", 1.0);
                increaseCount("Elk", 1.0);
                increaseCount("Deer", 1.0);
            });

        HBox bottomMenuWeight = new HBox();
        bottomMenuWeight.setPadding(new Insets(10,20,20,20));
        bottomMenuWeight.setSpacing(20);
        buttonWTiny = new Button ("Tiny");
        buttonWSmall = new Button ("Small");
        buttonWMedium = new Button ("Medium");
        buttonWLarge = new Button ("Large");
        buttonWVeryLarge = new Button("Very Large");
        bottomMenuWeight.getChildren().addAll(buttonWTiny, buttonWSmall, buttonWMedium, buttonWLarge, buttonWVeryLarge);
        buttonWTiny.setFocusTraversable(false);
        buttonWSmall.setFocusTraversable(false);
        buttonWMedium.setFocusTraversable(false);
        buttonWLarge.setFocusTraversable(false);
        buttonWVeryLarge.setFocusTraversable(false);
        buttonWTiny.setMaxWidth(Double.MAX_VALUE);
        HBox.setHgrow(buttonWTiny, Priority.ALWAYS);
            buttonWTiny.setOnAction(e -> {
                window.setScene(tailLengthScene);
                increaseCount("Shrew", 0.5);
                increaseCount("Mole", 1.0);
                increaseCount("Mouse", 1.0);
                increaseCount("Vole", 1.0);
                increaseCount("Rat", 0.5);
                increaseCount("Squirrel", 1.0);
                increaseCount("Chipmunk", 0.5);
                increaseCount("Flying Squirrel", 0.5);
                increaseCount("Weasel", 0.5);;
            });
        buttonWSmall.setMaxWidth(Double.MAX_VALUE);
        HBox.setHgrow(buttonWSmall, Priority.ALWAYS);
            buttonWSmall.setOnAction(e -> {
                window.setScene(tailLengthScene);
                increaseCount("Opossum", 1.0);
                increaseCount("Rabbit", 1.0);
                increaseCount("Hare", 0.5);
                increaseCount("Rat", 0.5);
                increaseCount("Squirrel", 0.5);
                increaseCount("Chipmunk", 0.5);
                increaseCount("Flying Squirrel", 0.5);
                increaseCount("Gray Fox", 0.5);
                increaseCount("Skunk", 0.5);
                increaseCount("Otter", 0.5);
                increaseCount("Weasel", 0.5);
            });
        buttonWMedium.setMaxWidth(Double.MAX_VALUE);
        HBox.setHgrow(buttonWMedium, Priority.ALWAYS);
            buttonWMedium.setOnAction(e -> {
                window.setScene(tailLengthScene);
                increaseCount("Opossum", 1.0);
                increaseCount("Hare", 1.0);
                increaseCount("Porcupine", 0.5);
                increaseCount("Bobcat", 0.5);
                increaseCount("Gray Fox", 1.0);
                increaseCount("Skunk", 1.0);
                increaseCount("Otter", 1.0);
                increaseCount("Badger", 1.0);
                increaseCount("Raccoon", 1.0);
            });


        buttonWLarge.setMaxWidth(Double.MAX_VALUE);
        HBox.setHgrow(buttonWLarge, Priority.ALWAYS);
            buttonWLarge.setOnAction(e -> {
                window.setScene(tailLengthScene);
                increaseCount("Beaver", 0.5);
                increaseCount("Porcupine", 0.5);
                increaseCount("Squirrel", 1.0);
                increaseCount("Bobcat", 0.5);
                increaseCount("Coyote", 0.5);
                increaseCount("Red Fox", 1.0);
            });
        buttonWVeryLarge.setMaxWidth(Double.MAX_VALUE);
        HBox.setHgrow(buttonWVeryLarge, Priority.ALWAYS);
            buttonWVeryLarge.setOnAction(e -> {
                window.setScene(tailLengthScene);
                increaseCount("Black Bear", 1.0);
                increaseCount("Elk", 1.0);
                increaseCount("Deer", 1.0);
            });

        HBox bottomMenuTailLength = new HBox();
        bottomMenuTailLength.setPadding(new Insets(10,40,20,40));
        bottomMenuTailLength.setSpacing(60);
        buttonLongTail = new Button ("It had a Long Tail");
        buttonShortTail = new Button ("It had a Short Tail");
        buttonNotSure = new Button ("I'm not sure");
        bottomMenuTailLength.getChildren().addAll(buttonLongTail, buttonShortTail, buttonNotSure);
        buttonLongTail.setFocusTraversable(false);
        buttonShortTail.setFocusTraversable(false);
        buttonNotSure.setFocusTraversable(false);
        buttonLongTail.setMaxWidth(Double.MAX_VALUE);
        HBox.setHgrow(buttonLongTail, Priority.ALWAYS);
            buttonLongTail.setOnAction(e -> {
                window.setScene(tailKindScene);
                increaseCount("Opossum", 1.0);
                increaseCount("Shrew", 1.0);
                increaseCount("Mole", 1.0);
                increaseCount("Beaver", 1.0);
                increaseCount("Porcupine", 1.0);
                increaseCount("Muskrat", 1.0);
                increaseCount("Mouse", 1.0);
                increaseCount("Vole", 1.0);
                increaseCount("Rat", 1.0);
                increaseCount("Squirrel", 1.0);
                increaseCount("Chipmunk", 1.0);
                increaseCount("Flying Squirrel", 1.0);
                increaseCount("Coyote", 1.0);
                increaseCount("Gray Fox", 1.0);
                increaseCount("Red Fox", 1.0);
                increaseCount("Skunk", 1.0);
                increaseCount("Otter", 1.0);
                increaseCount("Weasel", 1.0);
                increaseCount("Badger", 1.0);
                increaseCount("Raccoon", 1.0);
            });
        buttonShortTail.setMaxWidth(Double.MAX_VALUE);
        HBox.setHgrow(buttonShortTail, Priority.ALWAYS);
            buttonShortTail.setOnAction(e -> {
                increaseCount("Rabbit", 1.0);
                increaseCount("Hare", 1.0);
                increaseCount("Bobcat", 1.0);
                increaseCount("Black Bear", 1.0);
                increaseCount("Elk", 1.0);
                increaseCount("Deer", 1.0);
                window.setScene(tailKindScene);
            });
        buttonNotSure.setMaxWidth(Double.MAX_VALUE);
        HBox.setHgrow(buttonNotSure, Priority.ALWAYS);
            buttonNotSure.setOnAction(e -> {
                window.setScene(tailKindScene);
            });


        HBox bottomMenuTailKind = new HBox();
        bottomMenuTailKind.setPadding(new Insets(10,40,20,40));
        bottomMenuTailKind.setSpacing(60);
        buttonBaldTail = new Button ("It had a Bald Tail");
        buttonHairyTail = new Button ("It had a Hairy Tail");
        buttonNotSure = new Button ("I'm not sure");
        bottomMenuTailKind.getChildren().addAll(buttonBaldTail, buttonHairyTail, buttonNotSure);
        buttonBaldTail.setFocusTraversable(false);
        buttonHairyTail.setFocusTraversable(false);
        buttonNotSure.setFocusTraversable(false);
        buttonBaldTail.setMaxWidth(Double.MAX_VALUE);
        HBox.setHgrow(buttonBaldTail, Priority.ALWAYS);
            buttonBaldTail.setOnAction(e -> {
                window.setScene(coatColorScene);
                increaseCount("Opossum", 1.0);
                increaseCount("Shrew", 1.0);
                increaseCount("Muskrat", 1.0);
                increaseCount("Beaver", 1.0);
                increaseCount("Mouse", 1.0);
                increaseCount("Vole", 1.0);
                increaseCount("Rat", 1.0);
            });
        buttonHairyTail.setMaxWidth(Double.MAX_VALUE);
        HBox.setHgrow(buttonHairyTail, Priority.ALWAYS);
            buttonHairyTail.setOnAction(e -> {
                window.setScene(coatColorScene);
                increaseCount("Mole", 1.0);
                increaseCount("Rabbit", 1.0);
                increaseCount("Hare", 1.0);
                increaseCount("Porcupine", 1.0);
                increaseCount("Squirrel", 1.0);
                increaseCount("Chipmunk", 1.0);
                increaseCount("Flying Squirrel", 1.0);
                increaseCount("Bobcat", 1.0);
                increaseCount("Gray Fox", 1.0);
                increaseCount("Red Fox", 1.0);
                increaseCount("Black Bear", 1.0);
                increaseCount("Skunk", 1.0);
                increaseCount("Otter", 1.0);
                increaseCount("Weasel", 1.0);
                increaseCount("Badger", 1.0);
                increaseCount("Raccoon", 1.0);
                increaseCount("Elk", 1.0);
                increaseCount("Deer", 1.0);
            });
        buttonNotSure.setMaxWidth(Double.MAX_VALUE);
        HBox.setHgrow(buttonNotSure, Priority.ALWAYS);
            buttonNotSure.setOnAction(e -> {
                window.setScene(coatColorScene);
            });
        HBox bottomMenuCoat = new HBox();
        bottomMenuCoat.setPadding(new Insets(10,20,20,20));
        bottomMenuCoat.setSpacing(20);
        buttonWhite = new Button ("White");
        buttonGray = new Button ("Gray");
        buttonBrown = new Button ("Brown");
        buttonBlack = new Button ("Black");
        buttonOrange = new Button("Orange");
        bottomMenuCoat.getChildren().addAll(buttonWhite, buttonGray, buttonBrown, buttonBlack, buttonOrange);
        buttonWhite.setFocusTraversable(false);
        buttonGray.setFocusTraversable(false);
        buttonBrown.setFocusTraversable(false);
        buttonBlack.setFocusTraversable(false);
        buttonOrange.setFocusTraversable(false);
        buttonWhite.setMaxWidth(Double.MAX_VALUE);
        HBox.setHgrow(buttonWhite, Priority.ALWAYS);
            buttonWhite.setOnAction(e -> {
                window.setScene(timeOfDayScene);
                increaseCount("Opossum", 1.0);
                increaseCount("Rabbit", 0.5);
                increaseCount("Hare", 0.5);
                increaseCount("Chipmunk" , 0.5);
                increaseCount("Red Fox", 0.5);
                increaseCount("Skunk", 1.0);
                increaseCount("Otter", 0.5);
                increaseCount("Weasel", 0.5);
                increaseCount("Badger", 0.5);
                increaseCount("Raccoon", 1.0);
                increaseCount("Deer", 0.5);
            });
        buttonGray.setMaxWidth(Double.MAX_VALUE);
        HBox.setHgrow(buttonGray, Priority.ALWAYS);
            buttonGray.setOnAction(e -> {
                window.setScene(timeOfDayScene);
                increaseCount("Opossum", 0.5);
                increaseCount("Mouse", 0.5);
                increaseCount("Squirrel", 1.0);
                increaseCount("Flying Squirrel", 1.0);
                increaseCount("Bobcat", 1.0);
                increaseCount("Coyote", 1.0);
                increaseCount("Gray Fox", 1.0);
            });
        buttonBrown.setMaxWidth(Double.MAX_VALUE);
        HBox.setHgrow(buttonBrown, Priority.ALWAYS);
            buttonBrown.setOnAction(e-> {
                window.setScene(timeOfDayScene);
                increaseCount("Shrew", 1.0);
                increaseCount("Mole", 1.0);
                increaseCount("Rabbit", 1.0);
                increaseCount("Hare", 1.0);
                increaseCount("Beaver", 1.0);
                increaseCount("Porcupine", 1.0);
                increaseCount("Muskrat", 1.0);
                increaseCount("Mouse", 1.0);
                increaseCount("Vole", 1.0);
                increaseCount("Rat", 1.0);
                increaseCount("Squirrel", 0.5);
                increaseCount("Chipmunk", 1.0);
                increaseCount("Flying Squirrel", 0.5);
                increaseCount("Otter", 1.0);
                increaseCount("Weasel", 1.0);
                increaseCount("Badger", 1.0);
                increaseCount("Black Bear", 0.5);
                increaseCount("Elk", 1.0);
                increaseCount("Deer", 1.0);
            });
        buttonBlack.setMaxWidth(Double.MAX_VALUE);
        HBox.setHgrow(buttonBlack, Priority.ALWAYS);
            buttonBlack.setOnAction(e -> {
                window.setScene(timeOfDayScene);
                increaseCount("Shrew", 0.5);
                increaseCount("Mole", 0.5);
                increaseCount("Vole", 0.5);
                increaseCount("Rat", 0.5);
                increaseCount("Skunk", 1.0);
                increaseCount("Black Bear", 1.0);
            });
        buttonOrange.setMaxWidth(Double.MAX_VALUE);
        HBox.setHgrow(buttonOrange, Priority.ALWAYS);
            buttonOrange.setOnAction(e -> {
                window.setScene(timeOfDayScene);
                increaseCount("Bobcat", 0.5);
                increaseCount("Gray Fox", 0.5);
                increaseCount("Red Fox", 1.0);
                increaseCount("Coyote", 0.5);
            });

        HBox bottomMenuTime = new HBox();
        bottomMenuTime.setPadding(new Insets(10,40,20,40));
        bottomMenuTime.setSpacing(120);
        buttonDiurnal = new Button ("It was during the Day");
        buttonNocturnal = new Button ("It was during the Night");
        bottomMenuTime.getChildren().addAll(buttonDiurnal, buttonNocturnal);
        buttonDiurnal.setFocusTraversable(false);
        buttonNocturnal.setFocusTraversable(false);
        buttonDiurnal.setMaxWidth(Double.MAX_VALUE);
        HBox.setHgrow(buttonDiurnal, Priority.ALWAYS);
            buttonDiurnal.setOnAction(e -> {
                window.setScene(thankYouScene);
                increaseCount("Shrew", 1.0);
                increaseCount("Rabbit", 1.0);
                increaseCount("Hare", 1.0);
                increaseCount("Beaver", 1.0);
                increaseCount("Muskrat", 1.0);
                increaseCount("Mouse", 1.0);
                increaseCount("Vole", 1.0);
                increaseCount("Squirrel", 1.0);
                increaseCount("Chipmunk", 1.0);
                increaseCount("Bobcat", 1.0);
                increaseCount("Gray Fox", 1.0);
                increaseCount("Red Fox", 1.0);
                increaseCount("Black Bear", 1.0);
                increaseCount("Skunk", 1.0);
                increaseCount("Otter", 1.0);
                increaseCount("Weasel", 1.0);
                increaseCount("Elk", 1.0);
                increaseCount("Deer", 1.0);
            });
        buttonNocturnal.setMaxWidth(Double.MAX_VALUE);
        HBox.setHgrow(buttonNocturnal, Priority.ALWAYS);
            buttonNocturnal.setOnAction(e -> {
                window.setScene(thankYouScene);
                increaseCount("Mole", 1.0);
                increaseCount("Opossum", 1.0);
                increaseCount("Porcupine", 1.0);
                increaseCount("Rat", 1.0);
                increaseCount("Flying Squirrel", 1.0);
                increaseCount("Coyote", 1.0);
                increaseCount("Badger", 1.0);
                increaseCount("Raccoon", 1.0);
            });

        HBox bottomMenuThankYou = new HBox();
        bottomMenuThankYou.setPadding(new Insets(10,40,20,40));
        bottomMenuThankYou.setSpacing(120);
        buttonThankYou = new Button ("Tell me my animal!");
            buttonThankYou = new Button ("Tell me my animal!");
        bottomMenuThankYou.getChildren().addAll(buttonThankYou);
        buttonThankYou.setFocusTraversable(false);
        buttonThankYou.setMaxWidth(Double.MAX_VALUE);
        HBox.setHgrow(buttonThankYou, Priority.ALWAYS);
        buttonThankYou.setOnAction(e -> {
            window.setScene(winningScene);
            double d = (this.animalCount.entrySet().stream().max((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 : -1).get().getValue()/7)*100;
            Formatter formatter = new Formatter();
            formatter.format("%.2f",d);

            System.out.println("I am  " + formatter.toString() + "% sure your animal is a " + this.animalCount.entrySet().stream().max((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 : -1).get().getKey() + "!");
        });

            HBox bottomMenuGoodBye = new HBox();
            bottomMenuGoodBye.setPadding(new Insets(10,40,20,40));
            bottomMenuGoodBye.setSpacing(120);
            buttonGoodBye = new Button ("End Program");
            bottomMenuGoodBye.getChildren().addAll(buttonGoodBye);
            buttonGoodBye.setFocusTraversable(false);
            buttonGoodBye.setMaxWidth(Double.MAX_VALUE);
            HBox.setHgrow(buttonGoodBye, Priority.ALWAYS);
            buttonGoodBye.setOnAction(e -> {
                primaryStage.hide();
            });



        BorderPane welcomePane = new BorderPane();
        welcomePane.setBottom(welcomeMenu);
        welcomePane.setCenter(welcomeText);

        BorderPane borderPane = new BorderPane();
        borderPane.setBottom(bottomMenu);
        borderPane.setCenter(questionHabitat);

        BorderPane flyingPane = new BorderPane();
        flyingPane.setBottom(bottomMenuFlying);
        flyingPane.setCenter(wasItABatQuestion);

        BorderPane landBorderPane = new BorderPane();
        landBorderPane.setBottom(bottomMenuLand);
        landBorderPane.setCenter(whereOnLandQuestion);

        BorderPane forestBorderPane = new BorderPane();
        forestBorderPane.setBottom(bottomMenuForest);
        forestBorderPane.setCenter(whereInForestQuestion);

        BorderPane NeighborhoodBorderPane = new BorderPane();
        NeighborhoodBorderPane.setBottom(bottomMenuNeighborhood);
        NeighborhoodBorderPane.setCenter(whereInNeighborhoodQuestion);

        BorderPane MountainsBorderPane = new BorderPane();
        MountainsBorderPane.setBottom(bottomMenuMountains);
        MountainsBorderPane.setCenter(whereInMountainsQuestion);

        BorderPane waterBorderPane = new BorderPane();
        waterBorderPane.setBottom(bottomMenuWater);
        waterBorderPane.setCenter(whereInWaterQuestion);

        BorderPane heightBorderPane = new BorderPane();
        heightBorderPane.setBottom(bottomMenuHeight);
        heightBorderPane.setCenter(whatHeightQuestion);
        heightBorderPane.setTop(heightQuestionDetails);

        BorderPane weightBorderPane = new BorderPane();
        weightBorderPane.setBottom(bottomMenuWeight);
        weightBorderPane.setCenter(whatWeightQuestion);
        weightBorderPane.setTop(weightQuestionDetails);

        BorderPane tailLengthBorderPane = new BorderPane();
        tailLengthBorderPane.setBottom(bottomMenuTailLength);
        tailLengthBorderPane.setCenter(tailLengthQuestion);

        BorderPane tailKindBorderPane = new BorderPane();
        tailKindBorderPane.setBottom(bottomMenuTailKind);
        tailKindBorderPane.setCenter(tailKindQuestion);

        BorderPane colorBorderPane = new BorderPane();
        colorBorderPane.setBottom(bottomMenuCoat);
        colorBorderPane.setCenter(colorQuestion);

        BorderPane timeBorderPane = new BorderPane();
        timeBorderPane.setBottom(bottomMenuTime);
        timeBorderPane.setCenter(timeQuestion);

        BorderPane thankYouBorderPane = new BorderPane();
        thankYouBorderPane.setBottom(bottomMenuThankYou);
        thankYouBorderPane.setCenter(thankYouMessage);

        BorderPane winningAnimalPane = new BorderPane();
        winningAnimalPane.setBottom(bottomMenuGoodBye);
        winningAnimalPane.setCenter(winningAnimalMessage);


        startingScene = new Scene(welcomePane, 600, 300);
        habitatScene = new Scene(borderPane, 600,300);
        flyingScene = new Scene(flyingPane, 600,300);
        onLandScene = new Scene(landBorderPane, 600,300);
        inForestScene = new Scene(forestBorderPane, 600, 300);
        neighborhoodScene = new Scene(NeighborhoodBorderPane, 600,300);
        mountainsScene = new Scene(MountainsBorderPane, 600,300);
        inWaterScene = new Scene(waterBorderPane, 600,300);
        heightScene = new Scene(heightBorderPane, 600,300);
        weightScene = new Scene(weightBorderPane, 600,300);
        tailLengthScene = new Scene(tailLengthBorderPane, 600,300);
        tailKindScene = new Scene(tailKindBorderPane, 600,300);
        coatColorScene = new Scene(colorBorderPane, 600,300);
        timeOfDayScene = new Scene(timeBorderPane, 600,300);
        thankYouScene = new Scene(thankYouBorderPane, 600,300);
        winningScene = new Scene(winningAnimalPane, 600, 300);


        window.setScene(startingScene);
        window.show();



    }

    

}
