package ar.com.ada.second.online.maven.controller;

import ar.com.ada.second.online.maven.view.MainView;
import sun.applet.Main;

public class MainController {
    private static MainController mainController;
    private MainView  mainView = MainView.getInstance();

    private MainController(){
    }

    public static MainController getInstance(){
        if (mainController==null){
            mainController = new MainController();
        }
        return mainController;
    }

    public void init() {
        boolean shouldIStay = true;
        mainView.showTitleApp();
        while (shouldIStay) {
            Integer option = mainView.mainMenuSelectOption();
            switch (option) {
                case 1:
                    //Call the user controller
                    System.out.println("User Controller\n");
                    break;
                case 5:
                    shouldIStay=false;
                    break;
                default:
                    mainView.invalidOption();
            }
        }

    }


}
