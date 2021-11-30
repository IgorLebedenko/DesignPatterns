package com.github.ilebedenko.abstract_factory.factory;

import com.github.ilebedenko.abstract_factory.button.Button;
import com.github.ilebedenko.abstract_factory.button.WinButton;
import com.github.ilebedenko.abstract_factory.checkbox.Checkbox;
import com.github.ilebedenko.abstract_factory.checkbox.WinCheckbox;

public class WinFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WinCheckbox();
    }
}
