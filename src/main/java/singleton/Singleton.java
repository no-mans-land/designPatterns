package singleton;

public class Singleton {

    private static Singleton objectInstance;

    private Singleton(){
    }

    public static Singleton getInstance(){

        if(objectInstance == null){

            synchronized (Singleton.class){
                objectInstance = new Singleton();
            }
        }
        return objectInstance;
    }

    public void getMessage(){
        System.out.println("it is a singleton class");
    }
}
