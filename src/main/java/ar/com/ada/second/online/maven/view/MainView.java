package ar.com.ada.second.online.maven.view;

import ar.com.ada.second.online.maven.utils.Keyboard;

public class MainView {

    //caracteristicas de un singletone:
    //Atributo privado y estatico de la clase

    private static MainView mainView;


    //Constructor privador
    private MainView(){
    }

    //Metodo static
    public static MainView getInstance(){
        if (mainView==null) mainView = new MainView();
        return mainView;
    }

    public void invalidOption(){
        System.out.println("ERROR:: please enter a valid option\n");
    }

    public void showTitleApp(){
        System.out.println("\n################################################");
        System.out.println("#       Welcome to ADA Social Network       #");
        System.out.println("################################################\n");
    }

    public void showTitleReturnMenu(){
        System.out.println("\n################################################");
        System.out.println("#               DA Social Network             #");
        System.out.println("################################################\n");
    }

    public Integer mainMenuSelectOption(){
        System.out.println("Select the module that you want to work: ");
        System.out.println("| 1 | Users ");
        System.out.println("| 5 | End App ");
        return Keyboard.getInputIntiger();
    }

}
