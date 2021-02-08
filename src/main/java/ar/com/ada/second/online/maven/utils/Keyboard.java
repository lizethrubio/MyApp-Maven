package ar.com.ada.second.online.maven.utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Keyboard {
    //1. Crear atributo privado estatico de la instancia que queremos que sea unica

    private static Scanner scanner;

    //2. El constructor debe ser privado, por lo cual nadie puede instanciar la clase, no hay new clase
    private Keyboard(){
    }

    //3. Debe haber un metodo estatico y publico llamado getIstance()

    public static Scanner getInstance(){
        if (scanner ==null){
            scanner = new Scanner (System.in);
        }
        return scanner;

    }

    //press enter to continue
    public static void pressEnterToContinue(){
        System.out.println("Press Enter key to continue");
        try {
            System.in.read();
        }catch (Exception e){
        }
    }

    //invalid data
    public static void  invalidData(){
        System.out.println("ERROR: The data type is not valid. Try again");
    }

    //getInputString
    public static String getInputString(){
        Scanner keyboard = getInstance();
        boolean aux = true;
        String txt = null;
        while(aux) {
            try {
                System.out.println("?");
                txt = keyboard.nextLine().trim();
                //trim limpia espacios en blanco de una cadena
                while (!txt.isEmpty() && !txt.matches("^[A-Za-zåé@íú\\.\\s]+$")) {
                    invalidData();
                    txt = keyboard.nextLine().trim();
                }
                aux = false;
            }catch (InputMismatchException e    ){
                invalidData();
                keyboard.next();
            }
        }
        return txt;
    }

    //getInput Integer
    public static Integer getInputInteger(){
        Scanner keyboard = getInstance();
        boolean aux = true;
        String txt = null;
        while(aux) {
            try {
                System.out.println("?");
                txt = keyboard.nextLine().trim();
                //trim limpia espacios en blanco de una cadena
                while (!txt.isEmpty() && !txt.matches("^[0-9]+$")) {
                    invalidData();
                    txt = keyboard.nextLine().trim();
                }
                aux = false;
            }catch (InputMismatchException e    ){
                invalidData();
                keyboard.next();
            }
        }



        //"123" --> 123
        return Integer.parseInt(txt);
    }

    //getInput Double
    public static Double getInputDouble(){
        Scanner keyboard = getInstance();
        boolean aux = true;
        String txt = null;
        while(aux){
            //The try catch is used because Scanner bug of a line break
            try {
                System.out.println("?");
                txt = keyboard.nextLine().trim();
                //trim limpia espacios en blanco de una cadena
                while (!txt.isEmpty() && !txt.matches("-?[0-9]{1,13}(\\.[0-9]*)?")) {
                    invalidData();
                    txt = keyboard.nextLine().trim();
                }
                aux = false;
            }catch (InputMismatchException e    ){
                invalidData();
                keyboard.next();
            }
        }
        //"123" --> 123
        return Double.parseDouble(txt);
    }





}
