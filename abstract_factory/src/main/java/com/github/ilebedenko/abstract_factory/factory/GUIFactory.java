package com.github.ilebedenko.abstract_factory.factory;

import com.github.ilebedenko.abstract_factory.button.Button;
import com.github.ilebedenko.abstract_factory.checkbox.Checkbox;

public interface GUIFactory {
    Button createButton();

    Checkbox createCheckbox();
}
