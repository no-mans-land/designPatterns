package abstractFactory.factory;

import abstractFactory.product.Button;
import abstractFactory.product.Checkbox;

public interface GUIFactory {

    Button createButton();
    Checkbox createCheckbox();

}
