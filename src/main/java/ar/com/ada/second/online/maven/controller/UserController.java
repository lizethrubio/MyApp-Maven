package ar.com.ada.second.online.maven.controller;

import ar.com.ada.second.online.maven.view.MainView;
import sun.applet.Main;

public class UserController {

    //Atributo estatico y privado de la clase
    private static UserController userController;
    private MainView mainView = MainView.getInstance();

    //Constructor privado
    private UserController(){
    }

    //metodo publico y statico que valida la existnencia de la instancia
    public static UserController getInstance(){
        if (userController==null){
            userController = new UserController();
        }
        return userController;
    }


}
