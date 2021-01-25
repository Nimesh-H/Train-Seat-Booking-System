package TrainBooking;



import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;
import sun.plugin.dom.html.HTMLBodyElement;


import java.io.*;
import java.util.*;

public class Main extends Application {
    static final int SEATING_CAPACITY = 42;

    public static void main(String[] args) {
        launch();
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        HashMap<String, Integer> train_seatsColomboToBadulla= new HashMap<String, Integer>(); //create a hashmap object called train_seats
        HashMap<String, Integer> train_seatsBadullaToColombo= new HashMap<String, Integer>();
        ArrayList<String> name =new ArrayList<String>();
        File details = new File("File(Train Booking Details).txt");

        Scanner sc = new Scanner(System.in);

        menu:
        while (true) {
            System.out.println("--------Welcome To Denuwara Manike Train Seats Booking System--------");
            System.out.println("---------------------------------------------");
            System.out.println("-----PLease Follow The Below Instructions-----");
            System.out.println("---------------------------------------------");
            System.out.println("01) Enter \"A\" To Add A Customer");
            System.out.println();
            System.out.println("02) Enter \"V\" To View All The Seats");
            System.out.println();
            System.out.println("03) Enter \"E\" To View Empty Seats");
            System.out.println();
            System.out.println("04) Enter \"D\" To Delete A Booked Seat");
            System.out.println();
            System.out.println("05) Enter \"F\" To Find A Seat By Customer Name");
            System.out.println();
            System.out.println("06) Enter \"S\" To Store Details");
            System.out.println();
            System.out.println("07) Enter \"L\" To Load Details");
            System.out.println();
            System.out.println("08) Enter \"O\" To View All Seats In Customer's Name's Alphabetical Order");
            System.out.println();
            System.out.println("09) Enter \"Q\" To Exit The Programme");
            System.out.println();

            System.out.print("Enter your choice : ");
            String choice= sc.next();

            switch (choice) {
                case "A":
                case "a":
                    System.out.println("Press 1 to book a seat from Route Colombo to Badulla..............\n Press 2 to book a seat from Route Badulla to Colombo..............");
                    System.out.println("enter your number:");
                    int x=sc.nextInt();
                    if (x==1){
                        addCustomer(train_seatsColomboToBadulla,name);
                    }
                    else if (x==2){
                        addCustomer(train_seatsBadullaToColombo,name);
                    }else{
                        System.out.println("Invalid Input");
                    }
                    break;
                case "V":
                case "v":
                    System.out.println("Press 1 to book a seat from Route Colombo to Badulla..............\n Press 2 to book a seat from Route Badulla to Colombo..............");
                    System.out.println("enter your number:");
                    int y=sc.nextInt();
                    if (y==1){
                        viewAll(train_seatsColomboToBadulla,name);
                    }
                    else if (y==2){
                        viewAll(train_seatsBadullaToColombo,name);
                    }else{
                        System.out.println("Invalid Input");
                    }

                    break;
                case "E":
                case "e":
                    System.out.println("Press 1 to book a seat from Route Colombo to Badulla..............\n Press 2 to book a seat from Route Badulla to Colombo..............");
                    System.out.println("enter your number:");
                    int c=sc.nextInt();
                    if (c==1){
                        viewEmptySeats(train_seatsColomboToBadulla,name);
                    }
                    else if (c==2){
                        viewEmptySeats(train_seatsBadullaToColombo,name);
                    }else{
                        System.out.println("Invalid Input");
                    }

                    break;
                case "D":
                case "d":
                    System.out.println("Press 1 to book a seat from Route Colombo to Badulla..............\n Press 2 to book a seat from Route Badulla to Colombo..............");
                    System.out.println("enter your number:");
                    int v=sc.nextInt();
                    if (v==1){
                        deleteBooked(train_seatsColomboToBadulla,name);
                    }
                    else if (v==2){
                        deleteBooked(train_seatsBadullaToColombo,name);
                    }else{
                        System.out.println("Invalid Input");
                    }

                    break;
                case "F":
                case "f":
                    System.out.println("Press 1 to book a seat from Route Colombo to Badulla..............\n Press 2 to book a seat from Route Badulla to Colombo..............");
                    System.out.println("enter your number:");
                    int l=sc.nextInt();
                    if (l==1){
                        findSeats(train_seatsColomboToBadulla,name);
                    }
                    else if (l==2){
                        findSeats(train_seatsBadullaToColombo,name);
                    }else{
                        System.out.println("Invalid Input");
                    }
                    break;
                case "O":
                case "o":
                    System.out.println("Press 1 to book a seat from Route Colombo to Badulla..............\n Press 2 to book a seat from Route Badulla to Colombo..............");
                    System.out.println("enter your number:");
                    int b=sc.nextInt();
                    if (b==1){
                        sortAlphabeticallybyName(train_seatsColomboToBadulla);
                    }
                    else if (b==2){
                        sortAlphabeticallybyName(train_seatsBadullaToColombo);
                    }else{
                        System.out.println("Invalid Input");
                    }

                    break;

                case "S":
                case "s":
                    System.out.println("Press 1 to book a seat from Route Colombo to Badulla..............\n Press 2 to book a seat from Route Badulla to Colombo..............");
                    System.out.println("enter your number:");
                    int z=sc.nextInt();
                    if (z==1){
                        storeData(train_seatsColomboToBadulla,name,details);
                    }
                    else if (z==2){
                        storeData(train_seatsBadullaToColombo,name,details);
                    }else{
                        System.out.println("Invalid Input");
                    }
                    break;
                case "L":
                case "l":
                    System.out.println("Press 1 to book a seat from Route Colombo to Badulla..............\n Press 2 to book a seat from Route Badulla to Colombo..............");
                    System.out.println("Enter Your Number:");
                    int W=sc.nextInt();
                    if (W==1){

                        loadData(train_seatsColomboToBadulla,name,details);
                    }
                    else if (W==2){
                        loadData(train_seatsBadullaToColombo,name,details);
                    }else{
                        System.out.println("Invalid nput");
                    }
                    break;
                case "Q":
                case "q":
                    System.out.println("You Are Exiting.....Have A Nice Day.......");
                    break menu;
            }
        }//end of menu
    }
    //load data method..............................................................................
    private void loadData(HashMap<String, Integer> train_seatsColomboToBadulla , ArrayList<String> name, File filename) {
        BufferedReader reader=null;
        try{
            reader=new BufferedReader(new FileReader(filename));
            String line=null;
            while ((line=reader.readLine())!=null){
                String[] parts=line.split(":");
                String nameC=parts[0].trim();
                Integer seat= Integer.parseInt( parts[1].trim() );


                if(!name.equals("") && !seat.equals("")){
                    train_seatsColomboToBadulla.put(nameC,seat);
                }

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(reader!=null){
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    //store data method..............................................................................
    private void storeData(HashMap<String, Integer> train_seatsColomboToBadulla, ArrayList<String> name, File filename) {
        BufferedWriter writer= null;
        try{
            writer=new BufferedWriter(new FileWriter(filename));
            for(Map.Entry<String,Integer> entry: train_seatsColomboToBadulla.entrySet() ){
                writer.write(entry.getKey()+":"+entry.getValue());
                writer.newLine();
            }
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                writer.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }




    //find seat method...............................................................................
    private void findSeats(HashMap<String, Integer> train_seats,ArrayList<String> name) {
        Scanner sc3=new Scanner(System.in);
        System.out.println("Enter Your Name ");
        String oneName=sc3.nextLine();
        if(train_seats.containsKey(oneName)){       //checking the seat by customer name and find from hashmap
            System.out.println("Dear Sir/Madam " +oneName+" "+"your seat is "+ train_seats.get(oneName));
        }else{
            System.out.println("Customer Not Found");
        }


    }

    //add a new customer method.......................................................................
    private void addCustomer(HashMap<String, Integer> train_seats,ArrayList<String> name) {
        Stage Stage = new Stage();
        Stage.setTitle("Add A New Customer");

        FlowPane flowPane = new FlowPane();
        flowPane.setHgap(35);
        flowPane.setVgap(35);       
        flowPane.setOrientation(Orientation.VERTICAL);

        for (int x = 1; x <= SEATING_CAPACITY; x++) {
            Button btn1 = new Button("Seat " + x);
            btn1.setId( Integer.toString(x));
            flowPane.getChildren().add(btn1);//add buttons to the flow pane

            if (train_seats.containsValue(Integer.parseInt(btn1.getId()))) {
                btn1.setDisable(false);
                btn1.setStyle("-fx-background-color: red; -fx-text-fill: black");
            } else {
                btn1.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent e) {
                        btn1.setStyle("-fx-background-color: green; -fx-text-fill: black");

                        //confirm pop up box
                        Stage dialogStage = new Stage();
                        dialogStage.setTitle("Details Of The Customer");
                        dialogStage.initModality(Modality.WINDOW_MODAL);

                        Button enter = new Button("Confirm Booking");
                        Label label=new Label("FirstName");
                        TextField name_ = new TextField();
                        Label label1=new Label("Surname");
                        TextField Surname_ = new TextField();

                        VBox vbox = new VBox(label, name_,label1,Surname_, enter);

                        vbox.setSpacing(20);
                        vbox.setAlignment(Pos.CENTER);

                        vbox.setPadding(new Insets(15));

                        enter.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent e) {

                                String Name_= name_.getText()+" "+Surname_.getText();
                                train_seats.put(Name_, Integer.parseInt(btn1.getId()));
                                System.out.println("Sir/Madam, "+Name_+" You Have Successfully Booked Seat " + btn1.getId());
                                dialogStage.close();
                                Stage.close();
                            }
                        });

                        dialogStage.setScene(new Scene(vbox, 300, 300));
                        dialogStage.showAndWait();
                    }
                });
            }
        }

        Scene scene_ = new Scene(flowPane, 600, 600);
        Stage.setScene(scene_);
        Stage.showAndWait();
    }
    //view empty seat method.........................................................................
    private void viewEmptySeats(HashMap<String, Integer> train_seats,ArrayList<String> name) {
        Stage Stage = new Stage();
        Stage.setTitle(" View Empty Seats");

        FlowPane flowPane = new FlowPane();
        flowPane.setHgap(35);
        flowPane.setVgap(35);
        flowPane.setOrientation(Orientation.VERTICAL);

        for (int x = 1; x <= SEATING_CAPACITY; x++) {
            Button btn1 = new Button("Seat " + x);
            btn1.setId(Integer.toString(x));
            flowPane.getChildren().add(btn1);//add buttons to the flow pane

            if (train_seats.containsValue(Integer.parseInt(btn1.getId()))) {
                btn1.setVisible(false);
            }
        }

        Scene scene_ = new Scene(flowPane, 600, 600);
        Stage.setScene(scene_);
        Stage.showAndWait();
    }
    //view all method.................................................................
    private void viewAll(HashMap<String, Integer> train_seats,ArrayList<String> name) {
        Stage Stage = new Stage();
        Stage.setTitle("View All Seats");

        FlowPane flowPane = new FlowPane();
        flowPane.setHgap(35);
        flowPane.setVgap(35);
        flowPane.setOrientation(Orientation.VERTICAL);

        for (int x = 1; x <= SEATING_CAPACITY; x++) {
            Button btn1 = new Button("Seat " + x);
            btn1.setId(Integer.toString(x));
            btn1.setStyle("-fx-background-color:  green; -fx-text-fill:black");
            flowPane.getChildren().add(btn1);//add buttons to the flow pane

            if (train_seats.containsValue(Integer.parseInt(btn1.getId()))) {
                btn1.setDisable(true);
                btn1.setText("Booked");
                btn1.setStyle("-fx-background-color: red; -fx-text-fill:black");
            }
        }
        Scene scene_ = new Scene(flowPane, 600, 600);
        Stage.setScene(scene_);
        Stage.showAndWait();
    }
    //seat deleting method...................................................................
    private void deleteBooked(HashMap<String,Integer> train_seats,ArrayList<String> name) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name1 = sc.next();
        if (train_seats.containsKey(name1)) {       //checking the seat by customer name and remove from hashmap
            train_seats.remove(name1);
            System.out.println("Successfully removed The Record");
        } else {
            System.out.println(" There is no customer having name"+" " + name1);
        }
    }
    //view seats alphabetically by name method..........................................................................................
    private void sortAlphabeticallybyName(HashMap<String, Integer> train_seats) {
        List<String> name = new ArrayList<>();
        for (String k : train_seats.keySet()) {
            name.add(k);

        }

        String Ex;
        for (int j = 0; j < name.size(); j++) {
            for (int x = j + 1; x < name.size(); x++) {
                // comparing adjacent strings
                if (name.get(x).compareToIgnoreCase(name.get(j)) < 0) {
                    Ex= name.get(j);
                    name.set(j, name.get(x));
                    name.set(x, Ex);
                }
            }
            System.out.println(name.get(j));
        }
    }






}
