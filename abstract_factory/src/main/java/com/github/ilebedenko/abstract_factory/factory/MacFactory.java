package com.github.ilebedenko.abstract_factory.factory;

import com.github.ilebedenko.abstract_factory.button.Button;
import com.github.ilebedenko.abstract_factory.button.MacButton;
import com.github.ilebedenko.abstract_factory.checkbox.Checkbox;
import com.github.ilebedenko.abstract_factory.checkbox.MacCheckbox;

public class MacFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}
