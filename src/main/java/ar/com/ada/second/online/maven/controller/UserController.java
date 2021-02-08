package ar.com.ada.second.online.maven.controller;

import ar.com.ada.second.online.maven.model.dto.UserDTO;
import ar.com.ada.second.online.maven.view.MainView;
import ar.com.ada.second.online.maven.view.UserView;
import sun.applet.Main;

import java.util.HashMap;

public class UserController {

    //Atributo estatico y privado de la clase
    private static UserController userController;
    private UserView userView = UserView.getInstance();
    private MainView mainView = MainView.getInstance();


    //Constructor privado
    private UserController() {
    }

    //metodo publico y statico que valida la existnencia de la instancia
    public static UserController getInstance() {
        if (userController == null) userController = new UserController();
        return userController;
    }

    //init: showTitleUserModule -> while -> userMenuSelectOption,   1 createNewUser, 5 showTitleReturnMenu

    public void init() {
        boolean shouldIStay = true;
        userView.showTitleUserModule();
        while (shouldIStay) {
            Integer option = userView.userMenuSelectOption();
            switch (option) {
                case 1:
                    createNewUser();
                    break;
                case 5:
                    shouldIStay = false;
                    break;
                default:
                    mainView.invalidOption();
            }
        }

    }

    //CreateNewUser: getDataNewUser --> new UserDTO
    public void createNewUser() {
        //control + alt + v : crea un dato para recibir variable
        HashMap<String, String> dataNewUser = userView.getDataNewUser();
        //1ra.
        String nickname = dataNewUser.get("nickname");
        String email = dataNewUser.get("email");
        UserDTO userDTO = new UserDTO(nickname, email);

//        //2da A.
//        UserDTO userDTO2 = new UserDTO();
//        String nickname2 = dataNewUser.get("nickname");
//        String email2 = dataNewUser.get("email");
//        userDTO2.setNickName(dataNewUser.get(nickname2));
//        userDTO2.setEmail(dataNewUser.get(email2));
//
//        //2da B.
//        UserDTO userDTO1 = new UserDTO();
//        userDTO1.setNickName(dataNewUser.get("nickname"));
//        userDTO1.setEmail(dataNewUser.get("email"));

        System.out.println( userDTO.toString());
        //se procede a guardar en la base de datos

    }


}
