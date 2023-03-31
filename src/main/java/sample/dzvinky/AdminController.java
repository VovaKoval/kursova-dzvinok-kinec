package sample.dzvinky;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.ResourceBundle;

public class AdminController extends HelloApplication {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button AdminAddDzvinok;

    @FXML
    private TextField AdminDuratioinMinuteSmall;

    @FXML
    private TextField AdminDurationDodatokPererva;

    @FXML
    private TextField AdminDurationMinuteLong;

    @FXML
    private TextField AdminDurationUrok;

    @FXML
    private TextField AdminOneUrok;

    @FXML
    private TextField AdminOneUrokHv;

    @FXML
    private Text DaniUspix;

    @FXML
    private RadioButton AlertOffRadionButton;

    @FXML
    private RadioButton AlertOnRadioButton;

    @FXML
    private TextField UrokNomerVelykaPererva;

    @FXML
    private Button adminGolovnaButton;

    @FXML
    private Button saveAdmin;


    @FXML
    private TextField TryvalistUrokuHv;

    @FXML
    void initialize() {
        File f = new File("D:\\UCH\\KN-56\\Koval\\dzvinky-kursova-main\\src\\main\\resources\\sample\\dzvinky\\assets\\bd\\dzvinky.txt");
        try {
            if (f.createNewFile())
                System.out.println("файл створено");
            else
                System.out.println("файл не створено");
        } catch (IOException e) {
            e.printStackTrace();
        }

        adminGolovnaButton.setOnAction(event -> {
            adminGolovnaButton.getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader(HelloController.class.getResource("hello-view.fxml"));
            Scene scene = null;
            try{
                scene = new Scene(loader.load(), 700, 400);
            }catch (IOException e){
                e.printStackTrace();
            }
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
        });
        saveAdmin.setOnAction(event -> {
            String startOneUrokGod = AdminOneUrok.getText().toString();
            int startGod = Integer.parseInt(startOneUrokGod);
            String startOneUrokMin = AdminOneUrokHv.getText().toString();
            int startMin = Integer.parseInt(startOneUrokMin);
            String startPerervaSmall = AdminDuratioinMinuteSmall.getText().toString();
            int startPerervaMala = Integer.parseInt(startPerervaSmall);
            String startPerervaLong = AdminDurationMinuteLong.getText().toString();
            int startPerervaVelyka = Integer.parseInt(startPerervaLong);
            String NomerUrokaVelykaPererva = UrokNomerVelykaPererva.getText().toString();
            int startUrokVelykaPererva = Integer.parseInt(NomerUrokaVelykaPererva);
            String TryvUrokuHv = TryvalistUrokuHv.getText().toString();
            int TryvUrokHV = Integer.parseInt(TryvUrokuHv);
            try {
                PrintWriter pw = new PrintWriter(f);
                pw.println(startGod);
                pw.println(startMin);
                pw.println(startPerervaMala);
                pw.println(startPerervaVelyka);
                pw.println(startUrokVelykaPererva);
                pw.println(TryvUrokHV);
                pw.close();
                DaniUspix.setText("Дані успішно записані");
                new java.util.Timer().schedule(
                        new java.util.TimerTask() {
                            @Override
                            public void run() {
                                DaniUspix.setText("");
                            }
                        }, 3000
                );
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        });
    }

}

