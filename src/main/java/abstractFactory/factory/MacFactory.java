package abstractFactory.factory;

import abstractFactory.mac.MacButton;
import abstractFactory.product.Button;
import abstractFactory.product.Checkbox;
import abstractFactory.windows.WindowsCheckbox;

public class MacFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
