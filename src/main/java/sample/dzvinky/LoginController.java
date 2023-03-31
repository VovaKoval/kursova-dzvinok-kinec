package sample.dzvinky;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import java.sql.ResultSet;

public class LoginController {

    @FXML
    private Button backButton;

    @FXML
    private Button loginButton;

    @FXML
    private Text TextProperty;

    @FXML
    private TextField login_field;

    @FXML
    private PasswordField password_field;

    @FXML
    void initialize() {
        backButton.setOnAction(event -> {
            backButton.getScene().getWindow().hide();

            FXMLLoader loader = new FXMLLoader(HelloController.class.getResource("hello-view.fxml"));
            Scene scene = null;

            try {
                scene = new Scene(loader.load(), 700, 400);
            } catch (IOException e){
                e.printStackTrace();
            }
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
        });
        loginButton.setOnAction(event -> {
            String loginText = login_field.getText().trim();
            String passwordText = password_field.getText().trim();

            if (!loginText.equals("") && !passwordText.equals("")){
                if (loginText.equals("vpu") && passwordText.equals("vpu21")){
                    loginButton.getScene().getWindow().hide();

                    FXMLLoader loginloader = new FXMLLoader(AdminController.class.getResource("admin.fxml"));
                    Scene loginscene = null;

                    try{
                        loginscene = new Scene(loginloader.load(), 700, 400);
                    }catch (IOException e){
                        e.printStackTrace();
                    }
                    Stage loginstage = new Stage();
                    loginstage.setScene(loginscene);
                    loginstage.show();
                }else {
                    TextProperty.setText("Неправильно введені дані для входу адміністратора.");
                }
            }else {
                TextProperty.setText("Ви нічого не ввели.");
            }
        });
    }

}


