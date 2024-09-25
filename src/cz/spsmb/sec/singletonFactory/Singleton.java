package cz.spsmb.sec.singletonFactory;

import java.util.ArrayList;
import java.util.List;

public class Singleton {
     String someText;
     List<String> someList;

    //static volatile Singleton singleton;
    static Singleton singleton;

    private Singleton(){

    }

    private Singleton(String someText){
        this.someText = someText;
    }

    public static Singleton getInstance(){
        if (singleton == null){
            synchronized (Singleton.class) {
                singleton = new Singleton();
                System.out.println("Singleton created.");
                singleton.setSomeList(new ArrayList<>());
            }
        }
        return singleton;
    }

    public static Singleton getInstance(String text){
        if (singleton == null){
            singleton = new Singleton(text);
            System.out.println("Singleton created.");
            singleton.setSomeList(new ArrayList<>());
        }
        singleton.setSomeText(text);
        return singleton;
    }


    public List<String> getSomeList() {
        return someList;
    }

    public void setSomeList(List<String> someList) {
        this.someList = someList;
    }

    public String getSomeText() {
        return someText;
    }

    public void setSomeText(String someText) {
        this.someText = someText;
    }


}
