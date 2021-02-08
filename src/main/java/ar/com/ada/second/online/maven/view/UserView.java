package ar.com.ada.second.online.maven.view;

import ar.com.ada.second.online.maven.utils.Keyboard;

import java.util.HashMap;

public class UserView {

    //Atributo estatico y pricado
    private static UserView userView;

    //constructor privado
    private UserView(){
    }

    //Metodo publico y privado que valida la existencia de la instancia
    public static UserView getInstance() {
        if (userView== null)userView= new UserView();
        return userView;
    }

    //Ada Social Network: Users -> showTitleUserModule

    public void showTitleUserModule(){
        System.out.println("\n################################################");
        System.out.println("#       ADA Social Network: Users     #");
        System.out.println("################################################\n");
    }

    //userMenuSelectOption: Que desea realizar, 1 create user 2. Return principal menu
    public Integer userMenuSelectOption(){
        System.out.println("What do you want to do?: ");
        System.out.println("| 1 | Create User ");
        System.out.println("| 5 | Return principal menu ");
        return Keyboard.getInputInteger();
    }

    //HashMap<String, String> getDataNewUser
    public HashMap<String, String> getDataNewUser(){
        System.out.println("\n################################################");
        System.out.println("#       ADA Social Network: New Users     #");
        System.out.println("################################################\n");

        HashMap<String, String> data = new HashMap<>();
        System.out.println("Enter the new nickname");
//      String nickname = Keyboard.getInputString();
//      data.put("nickname", nickname);
        data.put("nickname", Keyboard.getInputString());

        System.out.println("Enter the new email");
//      String email = Keyboard.getInputString();
//      data.put("email", nickname);
        data.put("email", Keyboard.getInputString());

        return data;
    }

}
