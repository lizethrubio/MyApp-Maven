package ar.com.ada.second.online.maven.utils;

public class Singletone {

    private static Singletone singletone;
    public String name = "Hello World :) ";

    private Singletone(){

    }

    public static Singletone getInstance(){
        if (singletone==null){
            singletone = new Singletone();
        }
        return singletone;
    }

    public String getName() {
        return name;
    }
}
