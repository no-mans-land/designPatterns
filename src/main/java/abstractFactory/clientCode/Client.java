package abstractFactory.clientCode;

import abstractFactory.factory.GUIFactory;
import abstractFactory.factory.MacFactory;
import abstractFactory.factory.WindowsFactory;

public class Client {

    public static void main(String[] args) {

        GUIFactory factory = null;

        String os = "win";

        if(os.equals("win")){
            factory = new WindowsFactory();
        }
        if(os.equals("mac")){
            factory = new MacFactory();
        }

        Application app = new Application(factory);
        app.renderUI();

    }

}
