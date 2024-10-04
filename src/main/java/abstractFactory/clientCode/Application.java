package abstractFactory.clientCode;

import abstractFactory.factory.GUIFactory;
import abstractFactory.product.Button;
import abstractFactory.product.Checkbox;

public class Application {

    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory){
        this.button = factory.createButton();
        this.checkbox = factory.createCheckbox();
    }

    public void renderUI(){
        button.render();
        checkbox.select();
    }

}
