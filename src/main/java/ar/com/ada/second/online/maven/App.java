package ar.com.ada.second.online.maven;

import ar.com.ada.second.online.maven.controller.MainController;
import ar.com.ada.second.online.maven.utils.Keyboard;
import ar.com.ada.second.online.maven.utils.Singletone;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        MainController mainController = MainController.getInstance();
        mainController.init();


//        Scanner keyboard = Keyboard.getInstance();
//        Scanner keyboard2 = Keyboard.getInstance();
//
//        Singletone singletone = Singletone.getInstance();
//        System.out.println(singletone.getName());
//
//        System.out.println("Hello World!");
    }
}
