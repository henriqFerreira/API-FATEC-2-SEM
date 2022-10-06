package view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class Main extends Application {
    private static Stage stage;
    private static Scene loginFormScreen;

    @Override
    public void start(Stage primaryStage) throws IOException {
        stage = primaryStage;
        primaryStage.setResizable(false);
        Image stageIcon = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/icon.png")));
        primaryStage.getIcons().add(stageIcon);
        AnchorPane fxmlLoginFormScreen = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/fxmlLoginForm.fxml")));
        loginFormScreen = new Scene(fxmlLoginFormScreen);
        primaryStage.setScene(loginFormScreen);
        primaryStage.show();
    }

    public static void changeScene(String scene) throws IOException {
        switch (scene) {
            case "userChannelConfig" -> {
                AnchorPane fxmlUserChannelConfigScreen = FXMLLoader.load(Objects.requireNonNull(Main.class.getResource("/fxmlUserChannelConfig.fxml")));
                Scene userChannelConfigScreen = new Scene(fxmlUserChannelConfigScreen);
                stage.setScene(userChannelConfigScreen);
            }
            case "userActiveConfig" -> {
                AnchorPane fxmlUserActiveConfigScreen = FXMLLoader.load(Objects.requireNonNull(Main.class.getResource("/fxmlUserActiveConfig.fxml")));
                Scene userActiveConfigScreen = new Scene(fxmlUserActiveConfigScreen);
                stage.setScene(userActiveConfigScreen);
            }
            case "admDefaultChannelRegister" -> {
                AnchorPane fxmlAdmDefaultChannelRegister = FXMLLoader.load(Objects.requireNonNull(Main.class.getResource("/fxmlAdmDefaultChannelRegister.fxml")));
                Scene admDefaultChannelRegisterScreen = new Scene(fxmlAdmDefaultChannelRegister);
                stage.setScene(admDefaultChannelRegisterScreen);
            }
            case "admDefaultChannel" -> {
                AnchorPane fxmlAdmDefaultChannels = FXMLLoader.load(Objects.requireNonNull(Main.class.getResource("/fxmlAdmDefaultChannels.fxml")));
                Scene admDefaultChannelsScreen = new Scene(fxmlAdmDefaultChannels);
                stage.setScene(admDefaultChannelsScreen);
            }
            case "userRegisterUser" -> {
                AnchorPane fxmlUserRegisterUser = FXMLLoader.load(Objects.requireNonNull(Main.class.getResource("/fxmlUserRegister.fxml")));
                Scene userRegisterUserScreen = new Scene(fxmlUserRegisterUser);
                stage.setScene(userRegisterUserScreen);
            }
            case "forgotPassword" -> {
                AnchorPane fxmlForgotPassword = FXMLLoader.load(Objects.requireNonNull(Main.class.getResource("/fxmlForgotPassword.fxml")));
                Scene forgotPasswordScreen = new Scene(fxmlForgotPassword);
                stage.setScene(forgotPasswordScreen);
            }
            case "loginForm" -> {
                stage.setScene(loginFormScreen);
            }
        }
    }

    public static void main(String[] args) { launch(args); }
}