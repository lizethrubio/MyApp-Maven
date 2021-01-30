package ar.com.ada.second.online.maven.view;

public class UserView {

    //Atributo estatico y pricado
    private static UserView userView;

    //constructor privado
    private UserView(){
    }

    //Metodo publico y privado que valida la existencia de la instancia
    public static UserView getInstance() {
        if (userView== null){
            userView= new UserView();
        }
        return userView;
    }
}
