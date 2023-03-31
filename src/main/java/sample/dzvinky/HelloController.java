package sample.dzvinky;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.time.LocalTime;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class HelloController {

    @FXML
    private Button quit;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button loginButton;

    @FXML
    private TreeTableColumn<?, ?> PochatokUrok1;

    @FXML
    private TreeTableColumn<?, ?> pochatokUrok2;

    @FXML
    private TreeTableColumn<?, ?> pochatokUrok3;

    @FXML
    private TreeTableColumn<?, ?> pochatokUrok4;

    @FXML
    private TreeTableColumn<?, ?> pochatokUrok5;

    @FXML
    private TreeTableColumn<?, ?> pochatokUrok6;

    @FXML
    private TreeTableColumn<?, ?> pochatokUrok7;

    @FXML
    private TreeTableColumn<?, ?> pochatokUrok8;

    @FXML
    private TreeTableColumn<?, ?> kinecUrok1;

    @FXML
    private TreeTableColumn<?, ?> kinecUrok2;

    @FXML
    private TreeTableColumn<?, ?> kinecUrok3;

    @FXML
    private TreeTableColumn<?, ?> kinecUrok4;

    @FXML
    private TreeTableColumn<?, ?> kinecUrok5;

    @FXML
    private TreeTableColumn<?, ?> kinecUrok6;

    @FXML
    private TreeTableColumn<?, ?> kinecUrok7;

    @FXML
    private TreeTableColumn<?, ?> kinecUrok8;

    @FXML
    private TreeTableColumn<?, ?> pochatokPererva;

    @FXML
    private TreeTableColumn<?, ?> KinecPererva;

    @FXML
    private TreeTableColumn<?, ?> chasKinec;

    @FXML
    private TreeTableColumn<?, ?> chasPochatok;

    @FXML
    void initialize()throws Exception {

        loginButton.setOnAction(event -> {
           loginButton.getScene().getWindow().hide();

            FXMLLoader fxmlLoader = new FXMLLoader(LoginController.class.getResource("login-view.fxml"));
            Scene scene = null;
            try {
                scene = new Scene(fxmlLoader.load(), 700, 400);
            } catch (IOException e) {
                e.printStackTrace();
            }
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
        });
        File f = new File("D:\\UCH\\KN-56\\Koval\\dzvinky-kursova-main\\src\\main\\resources\\sample\\dzvinky\\assets\\bd\\dzvinky.txt");
        FileReader fr = new FileReader(f);
        Scanner scan = new Scanner(fr);

// Зчитування даних з файлу
        int startGod = scan.nextInt();
        String StartGod = String.valueOf(startGod);
        int startMin = scan.nextInt();
        String startHv = String.valueOf(startMin);
        int startPerervaSmall = scan.nextInt();
        String startPerervaMala = String.valueOf(startMin);
        int startPerervaLong = scan.nextInt();
        String startPerervaVelyka = String.valueOf(startMin);
        int NomerUrokaVelykaPererva = scan.nextInt();
        String startUrokaVelykaPererva = String.valueOf(startMin);
        int TryvUrokuHv = scan.nextInt();
        String TryvUrokHV = String.valueOf(startMin);
//        Автоматичне вираховування часу до дзвінка
        LocalTime start = LocalTime.of(startGod, startMin);
        LocalTime end = start.plusMinutes(TryvUrokuHv);
        LocalTime startUrok2 = end.plusMinutes(startPerervaSmall);
        LocalTime endUrok2 = startUrok2.plusMinutes(TryvUrokuHv);
        LocalTime startUrok3 = endUrok2.plusMinutes(startPerervaSmall);
        LocalTime endUrok3 = startUrok3.plusMinutes(TryvUrokuHv);
        LocalTime startUrok4 = endUrok3.plusMinutes(startPerervaSmall);
        LocalTime endUrok4 = startUrok4.plusMinutes(TryvUrokuHv);
        LocalTime startUrok5 = endUrok4.plusMinutes(startPerervaSmall);
        LocalTime endUrok5 = startUrok5.plusMinutes(TryvUrokuHv);
        LocalTime startUrok6 = endUrok5.plusMinutes(startPerervaSmall);
        LocalTime endUrok6 = startUrok6.plusMinutes(TryvUrokuHv);
        LocalTime startUrok7 = endUrok6.plusMinutes(startPerervaSmall);
        LocalTime endUrok7 = startUrok7.plusMinutes(TryvUrokuHv);
        LocalTime startUrok8 = endUrok7.plusMinutes(startPerervaSmall);
        LocalTime endUrok8 = startUrok8.plusMinutes(TryvUrokuHv);
//        Зміна типу з Інтового в Стрінгове
        String startDzvinok2 = String.valueOf(startUrok2);
        String startDzvinok3 = String.valueOf(startUrok3);
        String startDzvinok4 = String.valueOf(startUrok4);
        String startDzvinok5 = String.valueOf(startUrok5);
        String startDzvinok6 = String.valueOf(startUrok6);
        String startDzvinok7 = String.valueOf(startUrok7);
        String startDzvinok8 = String.valueOf(startUrok8);
        String endUrok1 = String.valueOf(end);
        String endDzvinok2 = String.valueOf(endUrok2);
        String endDzvinok3 = String.valueOf(endUrok3);
        String endDzvinok4 = String.valueOf(endUrok4);
        String endDzvinok5 = String.valueOf(endUrok5);
        String endDzvinok6 = String.valueOf(endUrok6);
        String endDzvinok7 = String.valueOf(endUrok7);
        String endDzvinok8 = String.valueOf(endUrok8);
        fr.close();
//        Вивід тексту в колонку
        PochatokUrok1.setText(StartGod + ":" + startHv);
        kinecUrok1.setText(endUrok1);
        pochatokUrok2.setText(startDzvinok2);
        kinecUrok2.setText(endDzvinok2);
        pochatokUrok3.setText(startDzvinok3);
        kinecUrok3.setText(endDzvinok3);
        pochatokUrok4.setText(startDzvinok4);
        kinecUrok4.setText(endDzvinok4);
        pochatokUrok5.setText(startDzvinok5);
        kinecUrok5.setText(endDzvinok5);
        pochatokUrok6.setText(startDzvinok6);
        kinecUrok6.setText(endDzvinok6);
        pochatokUrok7.setText(startDzvinok7);
        kinecUrok7.setText(endDzvinok7);
        pochatokUrok8.setText(startDzvinok8);
        kinecUrok8.setText(endDzvinok8);
        //        Перевірка на час початку уроку та кінця

        scheduler = Executors.newSingleThreadScheduledExecutor();
        scheduler.scheduleAtFixedRate(new MyTimerTask(), 0, 1, TimeUnit.MINUTES);
    }
    ScheduledExecutorService scheduler;

    public void onClick_exit(ActionEvent actionEvent) {
        quit.setOnAction(event -> {
            try {
                new MyTimerTask().musicPererva.close();
                new MyTimerTask().muzicDzvinok.close();
                new MyTimerTask().DzvinoknaUrok.close();
                new MyTimerTask().playerPererva.close();
                scheduler.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Stage stage = (Stage) quit.getScene().getWindow();
            stage.close();
        } );
    }
}
